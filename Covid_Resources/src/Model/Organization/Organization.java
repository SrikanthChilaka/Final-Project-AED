/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.AccountDirectory;
import Model.Directory_Employee;
import Model.Role.Role;
import java.util.ArrayList;
import Model.Doctor;
import Model.DocPrescription;
import Model.WorkQueue.HealthcareEquipmentWorkRequest;
import Model.WorkQueue.WorkQueue;
/**
 *
 * @author srikanthchilaka
 */
public abstract class Organization {

    private String orgName;
    private WorkQueue wq;
    private Directory_Employee empDir;
    private AccountDirectory userAccDir;
    private int orgId;
    private static int c;

    private HealthcareEquipmentWorkRequest eqReq;
    public ArrayList<DocPrescription> prescriptions;

    public enum OrganizationType {
        Admin("Admin Organization"), Doctor("Doctor Organization"), Operations("Operations Organization"),
        Pharmacy("Pharmacy Organization"), Supplier("Supplier Organization"), MedicalEquipment("Equipment Organization"),
        Transport("Transportation Organization"), Staff ("Staff Role"), MedicalWaste("Waste Organization");

        private String v;

        private OrganizationType(String v) {
            this.v = v;
        }

        public String getValue() {
            return v;
        }

    }
    public Organization(String orgName) {
        this.orgName = orgName;
        wq = new WorkQueue();
        empDir = new Directory_Employee();
        userAccDir = new AccountDirectory();
        orgId = c;
        prescriptions = new ArrayList<DocPrescription>();
        ++c;
    }


    public abstract ArrayList<Role> getRole();

    public AccountDirectory getUserAccDir() {
        return userAccDir;
    }

    public int getOrgId() {
        return orgId;
    }

    public Directory_Employee getEmpDir() {
        return empDir;
    }
    
    public void setEmpDir(Directory_Employee empDir) {
        this.empDir = empDir;
    }
    
    public String getOrgName() {
        return orgName;
    }
    public WorkQueue getWQ() {
        return wq;
    }
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    public void setWQ(WorkQueue wq) {
        this.wq = wq;
    }


    @Override
    public String toString() {
        return orgName;
    }
}
