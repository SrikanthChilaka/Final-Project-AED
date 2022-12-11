/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Transportation;

import Model.Account;
import Model.EcoSystem;
import Model.Organization.Organization;
import Model.WorkQueue.TransportationWorkRequest;
import Model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author venkat
 */
public class TransportationWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TransportationWorkAreaJPanel
     */
 JPanel upperConatiner;
private Account acc;
private Organization org;
private EcoSystem eco;

    public TransportationWorkAreaJPanel(JPanel upperConatiner,Account acc, Organization org, EcoSystem eco) {
        initComponents();
      this.upperConatiner = upperConatiner;
      this.acc = acc;
     this.org = org;
     this.eco = eco;
   populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonrequestbutton = new javax.swing.JButton();
        mainlabel = new javax.swing.JLabel();
        jpanelscroll2 = new javax.swing.JScrollPane();
        workreqTble = new javax.swing.JTable();
        refreshbutton = new javax.swing.JButton();
        buttonback = new javax.swing.JButton();
        buttonassign = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));

        buttonrequestbutton.setBackground(new java.awt.Color(0, 51, 153));
        buttonrequestbutton.setForeground(new java.awt.Color(255, 255, 255));
        buttonrequestbutton.setText("Process request");
        buttonrequestbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonrequestbuttonActionPerformed(evt);
            }
        });

        mainlabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        mainlabel.setForeground(new java.awt.Color(0, 51, 153));
        mainlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/transport.png"))); // NOI18N
        mainlabel.setText("TRANSPORTATION WORK AREA");

        workreqTble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hospital Name", "Sender", "Status", "Message", "Haste"
            }
        ));
        jpanelscroll2.setViewportView(workreqTble);

        refreshbutton.setBackground(new java.awt.Color(0, 51, 153));
        refreshbutton.setForeground(new java.awt.Color(255, 255, 255));
        refreshbutton.setText("Refresh");
        refreshbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbuttonActionPerformed(evt);
            }
        });

        buttonback.setBackground(new java.awt.Color(0, 51, 153));
        buttonback.setForeground(new java.awt.Color(255, 255, 255));
        buttonback.setText("<< Back");
        buttonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonbackActionPerformed(evt);
            }
        });

        buttonassign.setBackground(new java.awt.Color(0, 51, 153));
        buttonassign.setForeground(new java.awt.Color(255, 255, 255));
        buttonassign.setText("Assign");
        buttonassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonassignActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpanelscroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(mainlabel))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(buttonback)
                        .addGap(43, 43, 43)
                        .addComponent(buttonassign)
                        .addGap(51, 51, 51)
                        .addComponent(refreshbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(buttonrequestbutton)))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jpanelscroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonback)
                    .addComponent(buttonassign)
                    .addComponent(refreshbutton)
                    .addComponent(buttonrequestbutton))
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonrequestbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonrequestbuttonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workreqTble.getSelectedRow();
        if (selectedRow < 0){JOptionPane.showMessageDialog(null, "Please select a row!");
}TransportationWorkRequest request = (TransportationWorkRequest)workreqTble.getValueAt(selectedRow, 0);
request.setStatus("Processing");
CardLayout layout = (CardLayout) upperConatiner.getLayout();
upperConatiner.add("ProcessRequest", new UI.Transportation.ProcessRequestJPanel(upperConatiner,request));
layout.next(upperConatiner);
    }//GEN-LAST:event_buttonrequestbuttonActionPerformed

    private void refreshbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbuttonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshbuttonActionPerformed

    private void buttonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbackActionPerformed
        upperConatiner.remove(this);
        CardLayout layout = (CardLayout) upperConatiner.getLayout();
        layout.previous(upperConatiner);
    }//GEN-LAST:event_buttonbackActionPerformed

    private void buttonassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonassignActionPerformed
        int selectedRow = workreqTble.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        TransportationWorkRequest request = (TransportationWorkRequest)workreqTble.getValueAt(selectedRow, 0);
        request.setReceiver(acc);
        request.setStatus("Assigned");
    }//GEN-LAST:event_buttonassignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonassign;
    private javax.swing.JButton buttonback;
    private javax.swing.JButton buttonrequestbutton;
    private javax.swing.JScrollPane jpanelscroll2;
    private javax.swing.JLabel mainlabel;
    private javax.swing.JButton refreshbutton;
    private javax.swing.JTable workreqTble;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
       // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      DefaultTableModel model = (DefaultTableModel)workreqTble.getModel();
        model.setRowCount(0);
        for(WorkRequest request : org.getWQ().getWorkRequestList()){
            Object[] row = new Object[7];
            row[0] = ((TransportationWorkRequest) request);
            row[1] = request.getSender().getEmp().getEName();
            row[2] = ((TransportationWorkRequest) request).getEquipmentinfo();
            row[3] = ((TransportationWorkRequest) request). getHospitalName();
            row[4] = ((TransportationWorkRequest) request). getUrgency();
            row[5] = request.getStatus();
            row[6] = request.getRequestDate();
            model.addRow(row);
        }
      
    }
}
