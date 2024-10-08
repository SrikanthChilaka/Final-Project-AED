/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Role_Administration;

import Model.Employee;
import Model.Organization.RepositoryOrganization;
import Model.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author srikanthchilaka
 */
public class ManagePanel_Employee extends javax.swing.JPanel {
    
    private RepositoryOrganization od;
    private JPanel panel;

    /**
     * Creates new form ManagePanel_Employee
     */
    public ManagePanel_Employee() {
        initComponents();
        fillOrgCmb();
        fillOrgEmpCmb();
    }
    
    public void fillOrgCmb() {
        cmbBoxOrg.removeAllItems();

        for (Organization organization : od.getOrganizations()) {
            cmbBoxOrg.addItem(organization);
        }
    }

    public void fillOrgEmpCmb() {
        cmbBoxOrg2.removeAllItems();

        for (Organization organization : od.getOrganizations()) {
            cmbBoxOrg2.addItem(organization);
        }
    }
    
    private void fillTable(Organization o){
        DefaultTableModel m = (DefaultTableModel) tblEmployee.getModel();
        m.setRowCount(0);
        for (Employee employee : o.getEmpRepo().getE_Repo()){
            Object[] r = new Object[2];
            r[0] = employee.getEId();
            r[1] = employee.getEName();
            m.addRow(r);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelOrganization = new javax.swing.JLabel();
        cmbBoxOrg = new javax.swing.JComboBox();
        labelOrganization2 = new javax.swing.JLabel();
        cmbBoxOrg2 = new javax.swing.JComboBox();
        labelName = new javax.swing.JLabel();
        txtfieldName = new javax.swing.JTextField();
        scrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        labelHeading = new javax.swing.JLabel();
        buttonBack = new javax.swing.JButton();
        buttonCreate = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelOrganization.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelOrganization.setText("Organization:");
        add(labelOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 151, -1));

        cmbBoxOrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbBoxOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBoxOrgActionPerformed(evt);
            }
        });
        add(cmbBoxOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 112, 168, 29));

        labelOrganization2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelOrganization2.setText("Organization");
        add(labelOrganization2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        cmbBoxOrg2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbBoxOrg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBoxOrg2ActionPerformed(evt);
            }
        });
        add(cmbBoxOrg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 440, 140, 29));

        labelName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelName.setText("Name:");
        add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 143, -1));
        add(txtfieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 110, 29));

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPane1.setViewportView(tblEmployee);

        add(scrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 170, 600, 206));

        labelHeading.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelHeading.setForeground(new java.awt.Color(0, 51, 153));
        labelHeading.setText("Manage Employee");
        add(labelHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 9, -1, -1));

        buttonBack.setBackground(new java.awt.Color(0, 51, 153));
        buttonBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonBack.setForeground(new java.awt.Color(255, 255, 255));
        buttonBack.setText("<< Back");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });
        add(buttonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 581, 143, 70));

        buttonCreate.setBackground(new java.awt.Color(0, 51, 153));
        buttonCreate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonCreate.setForeground(new java.awt.Color(255, 255, 255));
        buttonCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        buttonCreate.setText("Create Employee");
        buttonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateActionPerformed(evt);
            }
        });
        add(buttonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 581, 239, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbBoxOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBoxOrgActionPerformed
        Organization organization = (Organization) cmbBoxOrg.getSelectedItem();
        if (organization != null){
            fillTable(organization);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBoxOrgActionPerformed

    private void cmbBoxOrg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBoxOrg2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBoxOrg2ActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        panel.remove(this);
        CardLayout l = (CardLayout) panel.getLayout();
        l.previous(panel);        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateActionPerformed
        Organization org = (Organization) cmbBoxOrg2.getSelectedItem();
        String name = txtfieldName.getText();

        org.getEmpRepo().AddEmployee(name);        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonCreate;
    private javax.swing.JComboBox cmbBoxOrg;
    private javax.swing.JComboBox cmbBoxOrg2;
    private javax.swing.JLabel labelHeading;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelOrganization;
    private javax.swing.JLabel labelOrganization2;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtfieldName;
    // End of variables declaration//GEN-END:variables
}
