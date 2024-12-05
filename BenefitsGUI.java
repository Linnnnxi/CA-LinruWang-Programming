/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package climateapp;

/**
 *I ceated a new GUI 
 * @author Linru Wang
 */
public class BenefitsGUI extends javax.swing.JFrame {

    /**
     * Creates new form BenefitsGUI
     */
    public BenefitsGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        titleLB = new javax.swing.JLabel();
        benefitsRb = new javax.swing.JRadioButton();
        tipsRb = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        updateTA = new javax.swing.JTextArea();
        backBtn = new javax.swing.JButton();
        generateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 400));
        setSize(new java.awt.Dimension(725, 450));

        titleLB.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        titleLB.setText("Climate Action Benefit");

        buttonGroup1.add(benefitsRb);
        benefitsRb.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 18)); // NOI18N
        benefitsRb.setText("Benefits");

        buttonGroup1.add(tipsRb);
        tipsRb.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 18)); // NOI18N
        tipsRb.setText("Tips");

        updateTA.setBackground(new java.awt.Color(255, 204, 204));
        updateTA.setColumns(20);
        updateTA.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        updateTA.setRows(5);
        jScrollPane1.setViewportView(updateTA);

        backBtn.setBackground(new java.awt.Color(255, 204, 204));
        backBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        generateBtn.setBackground(new java.awt.Color(255, 204, 204));
        generateBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        generateBtn.setText("Generate");
        generateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleLB)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(benefitsRb, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipsRb, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(225, 225, 225))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(titleLB)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(benefitsRb)
                        .addGap(18, 18, 18)
                        .addComponent(tipsRb))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(generateBtn)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(backBtn)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
        ClimateGUI myGUI = new ClimateGUI();
        myGUI.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void generateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateBtnActionPerformed
        // TODO add your handling code here:
        String userName = ""; 
        String phoneNumber = "";  
        int activityLevel = 0;  

        // Create an instance of the Benefits class
        Benefits benefit = new Benefits("Climate Action", userName, phoneNumber, activityLevel);

        // Check which radio button is selected
        if (benefitsRb.isSelected()) {
            // Get and display the general benefits of reducing carbon footprint
            String generalBenefits = benefit.getGeneralBenefits();
            updateTA.setText(generalBenefits);  // Display general benefits in the text area
        } else if (tipsRb.isSelected()) {
            String personalizedTips = benefit.getPersonalizedTips();
            updateTA.setText(personalizedTips); 
        } else {
            updateTA.setText("Please select either Benefits or Tips.");
        }
    }//GEN-LAST:event_generateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(BenefitsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BenefitsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BenefitsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BenefitsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BenefitsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JRadioButton benefitsRb;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton generateBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton tipsRb;
    private javax.swing.JLabel titleLB;
    private javax.swing.JTextArea updateTA;
    // End of variables declaration//GEN-END:variables
}
