/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public abstract class View {
    JPanel viewPanel;

    public View() {
    }

    public JPanel getViewPanel() {
        return viewPanel;
    }

    public void setViewPanel(JPanel viewPanel) {
        this.viewPanel = viewPanel;
    }
    
    
}
