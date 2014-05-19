/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db4o;

import Business.Business;
import Business.ConfigureABusiness;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.query.Query;
import com.db4o.ta.TransparentPersistenceSupport;
import javax.swing.JOptionPane;

/**
 *
 * @author karanmankodi
 */
public class Db4outil {

    private static final String FILENAME = "Test_db4.db4o";
    
    private static ObjectContainer _container  = null;

    public synchronized static ObjectContainer getObjectContainer() {
        if (_container == null ||
                _container.ext().isClosed() )
        {
            _container = getObjectContainerForFilename(FILENAME);
        }
        return _container;
    }
 
    public static ObjectContainer getObjectContainerForFilename(String filename){
        try{
            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //controls depth/level of updation of obj
            config.common().updateDepth(Integer.MAX_VALUE);
            
            //register yr top most class here
            
            config.common().objectClass(Business.class).cascadeOnUpdate(true);
            
            ObjectContainer db = Db4oEmbedded.openFile(config, filename);
            return db;
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }
    
    public static void storeObject(Object o){
        getObjectContainer().store(o);
        getObjectContainer().commit();
    }
    
    public static Business getBusiness(){
        Query queryCS = getObjectContainer().query();
        queryCS.constrain(Business.class);
        ObjectSet<Business> businessList = queryCS.execute();
        Business business = null;
        if(businessList.isEmpty()){
            business = ConfigureABusiness.Initialize();
            storeObject(business);
            return business;
        }
        business = businessList.get(0);
        return business;
    }
}
