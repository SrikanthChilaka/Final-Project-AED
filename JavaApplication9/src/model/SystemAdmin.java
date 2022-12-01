/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author srikanthchilaka
 */
public class SystemAdmin {
    private String sysID;
    private String sysName;
    private String sysUsername;
    private String sysPassword;

    public SystemAdmin(String sysID, String sysName, String sysUsername, String sysPassword) {
        this.sysID = sysID;
        this.sysName = sysName;
        this.sysUsername = sysUsername;
        this.sysPassword = sysPassword;
    }

    SystemAdmin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public String getSysID() {
        return sysID;
    }

    public void setSysID(String sysID) {
        this.sysID = sysID;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public String getSysUsername() {
        return sysUsername;
    }

    public void setSysUsername(String sysUsername) {
        this.sysUsername = sysUsername;
    }

    public String getSysPassword() {
        return sysPassword;
    }

    public void setSysPassword(String sysPassword) {
        this.sysPassword = sysPassword;
    }
    @Override
    public String toString(){
        return sysID;
    } 
}
