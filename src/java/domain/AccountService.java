/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;


/**
 *
 * @author 831892
 */
public class AccountService {
    private String username;
    private String password;
    
    public void AccountService() {
        username = "";
        password = "";
    }
    
    public User login(String username, String password) {
        if(username.equals("adam") || username.equals("betty")) {
            if(password.equals("password")) {
                return new User(username, null);
            } else {
                return null;
            }
            
        } else {
            return null;
        }
    }

    private static class User {
            private String username;
            private String password;
        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
        
        public String getUsername() {
            return username;
        }
    }
}
