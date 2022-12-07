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
public class AdminRole extends Role {
@Override
public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
}

@Override
public String toString() {
    return "Admin Role";
}

}


