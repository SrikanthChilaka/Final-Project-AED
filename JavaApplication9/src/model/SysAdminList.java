/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author srikanthchilaka
 */
public class SysAdminList {
    ArrayList<SystemAdmin> SAdmin=new ArrayList<SystemAdmin>();

    public ArrayList<SystemAdmin> getSAdmin() {
        return SAdmin;
    }

    public void setSAdmin(ArrayList<SystemAdmin> SAdmin) {
        this.SAdmin = SAdmin;
    }
    public SystemAdmin addNewSysA(){
        SystemAdmin newsys = new SystemAdmin();
        this.SAdmin.add(newsys);
        return newsys;
    }
    
    public void deleteSysA(SystemAdmin selectedSysA){
        this.SAdmin.remove(selectedSysA);
    }
}
