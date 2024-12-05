/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package climateapp;

import java.util.ArrayList;

/**
 * I edited mt GUI design and added arraylist
 *
 * @author Linru Wang
 */
public class ClimateGUI extends javax.swing.JFrame {

    private ArrayList<String> userList;

    /**
     * Creates new form ClimateGUI
     */
    public ClimateGUI() {
        initComponents();
        userList = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        pnTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageTA = new javax.swing.JTextArea();
        clearBtn = new javax.swing.JButton();
        benBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pnLB = new javax.swing.JLabel();
        activityCB = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        displayBtn = new javax.swing.JButton();
        calculateBtn = new javax.swing.JButton();
        nameLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(700, 400));
        setSize(new java.awt.Dimension(725, 450));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel1.setText("Climate Action");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Track your emissions, reduce your impact!");

        nameTF.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });

        pnTF.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        pnTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnTFActionPerformed(evt);
            }
        });

        messageTA.setColumns(20);
        messageTA.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        messageTA.setRows(5);
        jScrollPane1.setViewportView(messageTA);

        clearBtn.setBackground(new java.awt.Color(255, 204, 204));
        clearBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        benBtn.setBackground(new java.awt.Color(255, 204, 204));
        benBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        benBtn.setText("Benefits");
        benBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                benBtnActionPerformed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 204, 204));
        exitBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        pnLB.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        pnLB.setText("Phone Number :");

        activityCB.setBackground(new java.awt.Color(255, 204, 204));
        activityCB.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        activityCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1 (Low Activity)", "2", "3", "4", "5 (Moderate Activity)", "6", "7", "8", "9", "10 (High Activity)" }));
        activityCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityCBActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(255, 204, 204));
        addBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        displayBtn.setBackground(new java.awt.Color(255, 204, 204));
        displayBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        displayBtn.setText("Display");
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });

        calculateBtn.setBackground(new java.awt.Color(255, 204, 204));
        calculateBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        calculateBtn.setText("Calculate");
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });

        nameLB.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        nameLB.setText("Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(nameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pnLB, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(activityCB, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(calculateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(displayBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(nameLB)
                .addGap(18, 18, 18)
                .addComponent(pnLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(activityCB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addBtn)
                .addGap(18, 18, 18)
                .addComponent(displayBtn)
                .addGap(18, 18, 18)
                .addComponent(calculateBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnTF, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(benBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBtn)
                    .addComponent(benBtn)
                    .addComponent(exitBtn))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void activityCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activityCBActionPerformed

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void pnTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnTFActionPerformed
        // TODO add your handling code here:
        String phoneNumber = pnTF.getText();
    }//GEN-LAST:event_pnTFActionPerformed

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        // TODO add your handling code here:
        try {
            // Extract activity level from the combo box
            String activityString = (String) activityCB.getSelectedItem();
            int activityLevel = Integer.parseInt(activityString.split(" ")[0].trim());

            CarbonTracker carbonTracker = new CarbonTracker("Climate Action Message", "User Name", "0000000000", activityLevel);
            double totalEmissions = carbonTracker.calculateEmissions(activityLevel);
            
            // Display result in the text area
            messageTA.append("Estimated Emissions: " + totalEmissions + " kg CO2\n");
        } catch (NumberFormatException e) {
            messageTA.append("Invalid input for activity level. Please select a valid option.\n");
        } catch (Exception e) {
            messageTA.append("An error occurred. Please try again.\n");
        }
    }//GEN-LAST:event_calculateBtnActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        // TODO add your handling code here:
        messageTA.setText("All Users:\n");
        for (String user : userList) {
            messageTA.append(user + "\n");
        }
    }//GEN-LAST:event_displayBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        nameTF.setText("");              // Clear name field
        pnTF.setText("");                
        activityCB.setSelectedIndex(0);  
        messageTA.setText("");          
    }//GEN-LAST:event_clearBtnActionPerformed

    private void benBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_benBtnActionPerformed
        // TODO add your handling code here:
        // Hide the current ClimateGUI
        this.setVisible(false);

        // Create and show the BenefitsGUI
        BenefitsGUI myGUI = new BenefitsGUI();
        myGUI.setVisible(true);
    }//GEN-LAST:event_benBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        // Collect input from GUI components
        String name = nameTF.getText().trim();
        String phoneNumber = pnTF.getText().trim();
        String activityLevel = (String) activityCB.getSelectedItem();

        if (name.isEmpty() || phoneNumber.isEmpty()) {
            messageTA.append("Please enter both name and phone number.\n");
            return;
        }

        // Format user data and add to the ArrayList
        String userData = " Name: " + name + ", \n Phone: " + phoneNumber + ", \n Activity: " + activityLevel;
        userList.add(userData);
        // Provide feedback to the user
        messageTA.append("Added: \n" + userData + "\n");

        // Clear the input fields
        nameTF.setText("");
        pnTF.setText("");
        activityCB.setSelectedIndex(0);
    }//GEN-LAST:event_addBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ClimateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClimateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClimateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClimateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClimateGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> activityCB;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton benBtn;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton displayBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea messageTA;
    private javax.swing.JLabel nameLB;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel pnLB;
    private javax.swing.JTextField pnTF;
    // End of variables declaration//GEN-END:variables
}
