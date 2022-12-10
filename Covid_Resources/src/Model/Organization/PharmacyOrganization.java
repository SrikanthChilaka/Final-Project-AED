/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.PharmaInventory.PharmaInventory;
import Model.Role.PharmacistRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author harshinichandrika
 */
public class PharmacyOrganization extends Organization{
private ArrayList<PharmaInventory> medList;
public PharmacyOrganization()
 {
super(Organization.OrganizationType.Pharmacy.getValue());
medList=new ArrayList<PharmaInventory>();
}


@Override
public ArrayList<Role> getSupportedRole()
 {
ArrayList<Role> roles = new ArrayList<>();
roles.add(new PharmacistRole());
return roles;
}
public ArrayList<PharmaInventory> getMedList()
 {
return medList;
}
public void setMedList(ArrayList<PharmaInventory> medList)
{
this.medList = medList;
}
public void addMedicine(PharmaInventory mi)
{
medList.add(mi);
}

}
