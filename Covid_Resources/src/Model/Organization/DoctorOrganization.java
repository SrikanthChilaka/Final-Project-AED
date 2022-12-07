/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;
import Model.Doctor.DoctorPrescription;
import Model.Role.DoctorRole;
import Model.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author harshinichandrika
 */
public class DoctorOrganization {
    private ArrayList<DoctorPrescription> plist;
        public DoctorOrganization(){
        super(Organization.OrganizationType.Doctor.getValue());
        plist=new ArrayList<DoctorPrescription>();
    }
 
        @Override 
        public ArrayList<Role> getSupportedRole(){
            ArrayList<Role> roles = new ArrayList<>();
            roles.add(new DoctorRole());
            return roles;
    }

        
    public ArrayList<DoctorPrescription> getPlist() {
        return plist;
    }

    
    public void setPlist(ArrayList<DoctorPrescription> plist) {
        this.plist = plist;
    }
    
    
    public void addPrescription(DoctorPrescription prescription){
        plist.add(prescription);
    }
    
}
