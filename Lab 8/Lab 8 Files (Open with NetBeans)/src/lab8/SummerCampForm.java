/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package lab8;

import java.util.ArrayList;

/**
 *
 * @author markk
 */
public class SummerCampForm extends javax.swing.JFrame {

    /**
     * Creates new form SummerCampForm
     */
    public SummerCampForm() {
        initComponents();
        setSize(420,425);
        careerCbox.setVisible(false);
        mentorPanel.setVisible(false);
        mentorSeparator.setVisible(false);
        ageGroup1RButton.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ageButtonGroup = new javax.swing.ButtonGroup();
        bannerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        activitiesPanel = new javax.swing.JPanel();
        activitiesLabel = new javax.swing.JLabel();
        campusToursCBox = new javax.swing.JCheckBox();
        gameCbox = new javax.swing.JCheckBox();
        careerCbox = new javax.swing.JCheckBox();
        fieldTripsCBox = new javax.swing.JCheckBox();
        industryCBox = new javax.swing.JCheckBox();
        mentorPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        buttonPanel = new javax.swing.JPanel();
        registerButton = new javax.swing.JButton();
        clearFormButton = new javax.swing.JButton();
        activitesSeparator = new javax.swing.JSeparator();
        mentorSeparator = new javax.swing.JSeparator();
        buttonSeparator = new javax.swing.JSeparator();
        demographicPanel = new javax.swing.JPanel();
        fNameLabel = new javax.swing.JLabel();
        lNameLabel = new javax.swing.JLabel();
        fNameField = new javax.swing.JTextField();
        lNameField = new javax.swing.JTextField();
        campTypeLabel = new javax.swing.JLabel();
        campTypeCombo = new javax.swing.JComboBox<>();
        ageGroupLabel = new javax.swing.JLabel();
        ageGroup1RButton = new javax.swing.JRadioButton();
        ageGroup2RButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/banner.jpg"))); // NOI18N

        javax.swing.GroupLayout bannerPanelLayout = new javax.swing.GroupLayout(bannerPanel);
        bannerPanel.setLayout(bannerPanelLayout);
        bannerPanelLayout.setHorizontalGroup(
            bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bannerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(61, 61, 61))
        );
        bannerPanelLayout.setVerticalGroup(
            bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerPanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        activitiesLabel.setText("Activities");

        campusToursCBox.setText("Campus Tours");

        gameCbox.setText("Games");

        careerCbox.setText("Career Guidance");
        careerCbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                careerCboxMouseClicked(evt);
            }
        });

        fieldTripsCBox.setText("Field Trips");

        industryCBox.setText("Industry Visits");

        javax.swing.GroupLayout activitiesPanelLayout = new javax.swing.GroupLayout(activitiesPanel);
        activitiesPanel.setLayout(activitiesPanelLayout);
        activitiesPanelLayout.setHorizontalGroup(
            activitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activitiesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(activitiesLabel)
                .addGap(18, 18, 18)
                .addGroup(activitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(careerCbox)
                    .addComponent(gameCbox)
                    .addComponent(campusToursCBox))
                .addGap(18, 18, 18)
                .addGroup(activitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldTripsCBox)
                    .addComponent(industryCBox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        activitiesPanelLayout.setVerticalGroup(
            activitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activitiesPanelLayout.createSequentialGroup()
                .addComponent(activitiesLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(activitiesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(activitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campusToursCBox)
                    .addComponent(fieldTripsCBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(activitiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gameCbox)
                    .addComponent(industryCBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(careerCbox)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel2.setText("Select a Mentor");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Dr. Dorian Smith", "Dr. Lisa Rosenberg", "Prof. Carry Mitchel" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout mentorPanelLayout = new javax.swing.GroupLayout(mentorPanel);
        mentorPanel.setLayout(mentorPanelLayout);
        mentorPanelLayout.setHorizontalGroup(
            mentorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mentorPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mentorPanelLayout.setVerticalGroup(
            mentorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mentorPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mentorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        clearFormButton.setText("Clear Form");
        clearFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFormButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(registerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearFormButton)
                .addGap(145, 145, 145))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton)
                    .addComponent(clearFormButton))
                .addGap(18, 18, 18))
        );

        fNameLabel.setText("First Name");

        lNameLabel.setText("Last Name");

        fNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameFieldActionPerformed(evt);
            }
        });

        lNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameFieldActionPerformed(evt);
            }
        });

        campTypeLabel.setText("Camp Type");

        campTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Robotics Camp", "Web Design Camp", "Algorithms Camp" }));

        ageGroupLabel.setText("Age Group");

        ageButtonGroup.add(ageGroup1RButton);
        ageGroup1RButton.setText("9 - 12 years");
        ageGroup1RButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ageGroup1RButtonMouseClicked(evt);
            }
        });

        ageButtonGroup.add(ageGroup2RButton);
        ageGroup2RButton.setText("13 - 15 years");
        ageGroup2RButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ageGroup2RButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout demographicPanelLayout = new javax.swing.GroupLayout(demographicPanel);
        demographicPanel.setLayout(demographicPanelLayout);
        demographicPanelLayout.setHorizontalGroup(
            demographicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(demographicPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(demographicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(demographicPanelLayout.createSequentialGroup()
                        .addComponent(ageGroupLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ageGroup1RButton)
                        .addGap(37, 37, 37)
                        .addComponent(ageGroup2RButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(demographicPanelLayout.createSequentialGroup()
                        .addGroup(demographicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(demographicPanelLayout.createSequentialGroup()
                                .addComponent(campTypeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campTypeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(demographicPanelLayout.createSequentialGroup()
                                .addGroup(demographicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lNameLabel)
                                    .addComponent(fNameLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(demographicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        demographicPanelLayout.setVerticalGroup(
            demographicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(demographicPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(demographicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLabel)
                    .addComponent(fNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(demographicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNameLabel)
                    .addComponent(lNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(demographicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campTypeLabel)
                    .addComponent(campTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(demographicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageGroupLabel)
                    .addComponent(ageGroup1RButton)
                    .addComponent(ageGroup2RButton))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonSeparator, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mentorPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mentorSeparator, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(demographicPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(activitesSeparator, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(activitiesPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bannerPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bannerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(demographicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(activitesSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(activitiesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mentorSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mentorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameFieldActionPerformed

    private void lNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameFieldActionPerformed

    private void careerCboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_careerCboxMouseClicked
        // TODO add your handling code here:
        if (careerCbox.isSelected()){
            mentorPanel.setVisible(true);
            mentorSeparator.setVisible(true);
        }
        else{
            mentorPanel.setVisible(false);
            mentorSeparator.setVisible(false); 
        }
    }//GEN-LAST:event_careerCboxMouseClicked

    private void ageGroup2RButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageGroup2RButtonMouseClicked
        // TODO add your handling code here:
        if (ageGroup2RButton.isSelected())
            careerCbox.setVisible(true);
        else
            careerCbox.setVisible(false);
        
    }//GEN-LAST:event_ageGroup2RButtonMouseClicked

    private void ageGroup1RButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageGroup1RButtonMouseClicked
        // TODO add your handling code here:
        if (ageGroup1RButton.isSelected())
            careerCbox.setVisible(false);

    }//GEN-LAST:event_ageGroup1RButtonMouseClicked

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        String fName = fNameField.getText();
        String lName = lNameField.getText();
        String campType = (String) campTypeCombo.getSelectedItem();
        String ageGroup = ageGroup1RButton.isSelected() ? "9 - 12 years" : "13 - 15 years";
        
        //You can also do the below using an array list
        Boolean campusTour = campusToursCBox.isSelected();
        Boolean games = gameCbox.isSelected();
        Boolean careerGuidance = careerCbox.isSelected();
        Boolean fieldTrips = fieldTripsCBox.isSelected();
        Boolean industryVisits = industryCBox.isSelected();
        
        ArrayList<String> selectedMentors = new ArrayList<>(jList1.getSelectedValuesList());
        
    }//GEN-LAST:event_registerButtonActionPerformed

    private void clearFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFormButtonActionPerformed
        // TODO add your handling code here:
        // this(); //will not work 
        //initComponents(); //do not use this either!
        fNameField.setText("");
        lNameField.setText("");
        campTypeCombo.setSelectedIndex(0);
        ageGroup1RButton.setSelected(true);
        campusToursCBox.setSelected(false);
        gameCbox.setSelected(false);
        careerCbox.setSelected(false);
        fieldTripsCBox.setSelected(false);
        industryCBox.setSelected(false);
        jList1.clearSelection();
        mentorPanel.setVisible(false);
        mentorSeparator.setVisible(false);
    }//GEN-LAST:event_clearFormButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SummerCampForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SummerCampForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SummerCampForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SummerCampForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SummerCampForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator activitesSeparator;
    private javax.swing.JLabel activitiesLabel;
    private javax.swing.JPanel activitiesPanel;
    private javax.swing.ButtonGroup ageButtonGroup;
    private javax.swing.JRadioButton ageGroup1RButton;
    private javax.swing.JRadioButton ageGroup2RButton;
    private javax.swing.JLabel ageGroupLabel;
    private javax.swing.JPanel bannerPanel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JSeparator buttonSeparator;
    private javax.swing.JComboBox<String> campTypeCombo;
    private javax.swing.JLabel campTypeLabel;
    private javax.swing.JCheckBox campusToursCBox;
    private javax.swing.JCheckBox careerCbox;
    private javax.swing.JButton clearFormButton;
    private javax.swing.JPanel demographicPanel;
    private javax.swing.JTextField fNameField;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JCheckBox fieldTripsCBox;
    private javax.swing.JCheckBox gameCbox;
    private javax.swing.JCheckBox industryCBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lNameField;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JPanel mentorPanel;
    private javax.swing.JSeparator mentorSeparator;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
}