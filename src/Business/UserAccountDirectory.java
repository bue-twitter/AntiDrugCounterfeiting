/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Karan Mankodi
 */
public class UserAccountDirectory {
    
    ArrayList<UserAccount> userAccountList;
    ArrayList<UserAccount> disabledUserAccountList;
    
    public UserAccountDirectory(){
        userAccountList = new ArrayList<>();
        disabledUserAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }

    public ArrayList<UserAccount> getDisabledUserAccountList() {
        return disabledUserAccountList;
    }

    public void setDisabledUserAccountList(ArrayList<UserAccount> disabledUserAccountList) {
        this.disabledUserAccountList = disabledUserAccountList;
    }
    
    
    
    public UserAccount newUserAccount(){
        UserAccount userAcc = new UserAccount();
        userAccountList.add(userAcc);
        return userAcc;
    }
    
    public void disableUserAccount(UserAccount ua){
        userAccountList.remove(ua);
        disabledUserAccountList.add(ua);
    }
    
    public void enableUserAccount(UserAccount userAccount){
        for(UserAccount user : disabledUserAccountList){
            if(user.equals(userAccount)){
                userAccountList.add(user);
                disabledUserAccountList.remove(user);
            }
        }
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : getUserAccountList()) {
            if ((ua.getUsername().equalsIgnoreCase(username)) && (ua.getPassword().equalsIgnoreCase(String.valueOf(password)))) {
                return ua;
            }

        }
        return null;
    }
    
    public Boolean isUserExist(UserAccount userAccount) {
        for (UserAccount ua : userAccountList) {
            if(ua == userAccount) {
                return true;
            }
        }
        return false;
    }
}
