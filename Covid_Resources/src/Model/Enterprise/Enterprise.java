/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import Model.Organization.Organization;
import Model.Organization.OrganizationDirectory;
/**
 *
 * @author srikanthchilaka
 */
public abstract class Enterprise extends Organization {
private EnterpriseType enterpriseType;
private OrganizationDirectory organizationDirectory;
private String zipcode;

public Enterprise(String name, EnterpriseType type) {
super(name);
this.enterpriseType = type;
organizationDirectory = new OrganizationDirectory();
}

public enum EnterpriseType{
Hospital("Hospital"),
Supplier("Supplier"),
Logistics("Logistics"),
Pharmacy("Pharmacy"),
MedicalEquipmentWareHouse("MedicalEquipmentWareHouse");

private String value;

private EnterpriseType(String value) {
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

public EnterpriseType getEnterpriseType() {
return enterpriseType;
}

public OrganizationDirectory getOrganizationDirectory() {
return organizationDirectory;
}

public String getZipcode() {
return zipcode;
}

public void setZipcode(String zipcode) {
this.zipcode = zipcode;
}

}