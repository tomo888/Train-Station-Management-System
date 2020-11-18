/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userTypes;
/**
 *
 * @author User
 */
public abstract class GenericUser {
    private String firstName;
    private String surname;
    private String sex;
    private String address;
    private String userID;
    private String password;

    public GenericUser(String firstName, String surname, String sex, String address, String userID, String password) {
        this.firstName = firstName;
        this.surname = surname;
        this.sex = sex;
        this.address = address;
        this.userID = userID;
        this.password = password;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getUserID() {
        return userID;
    }

    public void setID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
