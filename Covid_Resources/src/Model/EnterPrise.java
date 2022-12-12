/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Organization.RepositoryOrganization;
import Model.Organization.Organization;

/**
 *
 * @author harshinichandrika
 */
public abstract class EnterPrise extends Organization {

    private EntType enterprise_type;
    private RepositoryOrganization orgaDirectory;
    private String Zip;

    public EnterPrise(String Name, EntType type) {

        super(Name);
        this.enterprise_type = type;
        orgaDirectory = new RepositoryOrganization();

    }

    public enum EntType {

        Hospital("Hospital"),
        Supplier("Supplier"),
        Logistics("Logistics"),
        Pharmacy("Pharmacy"),
        MedicalEquiPantry("MedicalEquipPantry");
        private String value;

        private EntType(String value) {

            this.value = value;

        }

        public String getValue() {
            return value;
        }

        @Override

        public String toString() {

            return value;
        }

    }

    public EntType getEnterprise_type() {
        return enterprise_type;
    }

    /* public void setEnterprise_type(EntType enterprise_type) {
        this.enterprise_type = enterprise_type;
    }*/
    public RepositoryOrganization getOrgaDirectory() {
        return orgaDirectory;
    }

    /*public void setOrgaDirectory(Directory_Organization orgaDirectory) {
        this.orgaDirectory = orgaDirectory;
    }*/
    public String getZip() {
        return Zip;
    }

    public void setZip(String Zip) {
        this.Zip = Zip;
    }

}
