/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;

import javax.swing.JPanel;

/**
 *
 * @author venkat
 */
public class DoctorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new DoctorWorkAreaJPanel(userProcessContainer,account,(DoctorOrganization)organization,enterprise,business,network);
    }
    
    
    
@Override
public String toString() {
    return "Doctor Role";
}
    
    
}

