/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author karanmankodi
 */
public class NetworkDirectory {
    private ArrayList<Network> networkList;

    public NetworkDirectory() {
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public Network newNetwork(Locale locale){
        Network network = new Network(locale.getDisplayCountry());
        networkList.add(network);
        return network;
    }
}
