/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkAreas;

import Business.Enterprise;
import Business.Network;
import Business.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public abstract class WorkArea {
 //   View view;

    public WorkArea() {
    }

 //   public View getView() {
 //       return view;
 //   }

//    public void setView(View view) {
//        this.view = view;
//    }
    
    public abstract JPanel createView(JPanel upcJPanel, Network network, Enterprise enterprise, UserAccount ua);
    
}
