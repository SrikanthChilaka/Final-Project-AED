/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Transportation;

import Model.Account;
import Model.EcoSystem;
import Model.Organization.Organization;
import Model.WorkQueue.TransportationWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author venkat
 */
public class ProcessRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessRequestJPanel
     */
    JPanel upperContainer;
    TransportationWorkRequest request;
private Account acc;
private Organization oga;
private EcoSystem eco;

    public ProcessRequestJPanel(JPanel upperContainer, TransportationWorkRequest request) {
        initComponents();
        this.upperContainer = upperContainer;
 this.request = request;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        explabel1 = new javax.swing.JLabel();
        timebox = new javax.swing.JComboBox<>();
        sreachbutton = new javax.swing.JComboBox<>();
        vehiclenumber1 = new javax.swing.JLabel();
        jtext2 = new javax.swing.JTextField();
        buttonback = new javax.swing.JButton();
        notifybutton = new javax.swing.JButton();
        transportlabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));

        explabel1.setText("Expected Time Of Delivery :");

        timebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1:00", "2:00", "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00", "12:00" }));
        timebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeboxActionPerformed(evt);
            }
        });

        sreachbutton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));

        vehiclenumber1.setText("Vehicle Number:");

        jtext2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext2ActionPerformed(evt);
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

        notifybutton.setBackground(new java.awt.Color(0, 51, 153));
        notifybutton.setForeground(new java.awt.Color(255, 255, 255));
        notifybutton.setText("Intimate Hospital through Mail");
        notifybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifybuttonActionPerformed(evt);
            }
        });

        transportlabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        transportlabel.setForeground(new java.awt.Color(0, 51, 153));
        transportlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/transport.png"))); // NOI18N
        transportlabel.setText("TRANSPORT REQUEST PROCESS AREA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vehiclenumber1)
                            .addComponent(explabel1)
                            .addComponent(buttonback))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notifybutton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(timebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sreachbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jtext2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(transportlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(transportlabel)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(explabel1)
                    .addComponent(timebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sreachbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehiclenumber1)
                    .addComponent(jtext2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(buttonback))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(notifybutton)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void timeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeboxActionPerformed

    private void jtext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtext2ActionPerformed

    private void buttonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbackActionPerformed
        upperContainer.remove(this);
        Component[] componentArray = upperContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TransportationWorkAreaJPanel twjp = (TransportationWorkAreaJPanel) component;
        twjp.populateTable();
        CardLayout layout = (CardLayout) upperContainer.getLayout();
        layout.previous(upperContainer);

    }//GEN-LAST:event_buttonbackActionPerformed

    private void notifybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifybuttonActionPerformed
        request.setTime(timebox.getSelectedItem().toString() +" "+ sreachbutton.getSelectedItem().toString()+" "+"VehicleNumber" +jtext2.getText());
        String[] to = {"harshinichandrikaaran6118@gmail.com"};
        sendMailToCommunityMember(to,
            "Alert from Transportation department",
            "The delivery details are for the equipment "+request.getEquipmentinfo()+" are" +request.getTime(),
            "doctortesting.test@gmail.com",
            "doctororganization");
        JOptionPane.showMessageDialog(null,"Email sent successfully");

    }//GEN-LAST:event_notifybuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonback;
    private javax.swing.JLabel explabel1;
    private javax.swing.JTextField jtext2;
    private javax.swing.JButton notifybutton;
    private javax.swing.JComboBox<String> sreachbutton;
    private javax.swing.JComboBox<String> timebox;
    private javax.swing.JLabel transportlabel;
    private javax.swing.JLabel vehiclenumber1;
    // End of variables declaration//GEN-END:variables

    private void sendMailToCommunityMember(String[] to, String Matter, String texts, String from, String pwd) {
       // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           String [] host = {"smtp@gmail.com"};
            Properties props = System.getProperties();
            props.put("mail.smtp.user", from);
            props.put("mail.smtp.port", 674);
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.startttls.enable", "true");
JOptionPane.showMessageDialog(this, "New notification from Transport Department");
     
    }
}
