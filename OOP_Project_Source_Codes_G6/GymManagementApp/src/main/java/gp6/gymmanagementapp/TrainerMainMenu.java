package gp6.gymmanagementapp;

import javax.swing.JOptionPane;

public class TrainerMainMenu extends javax.swing.JFrame {

    // Variable used to store the Administrator object that is logging in to the system
    public static Trainer loggedInTrainer;
    
    /**
     * Creates new form TrainerMainMenu
     */
    public TrainerMainMenu() {
        initComponents();
        // Set the menu to be visible on the screen
        this.setVisible(true);
        // Change the greeting target by using the login credential from the admin login menu
        trainerName.setText("trainer " + loggedInTrainer.getFirstName() + " " + loggedInTrainer.getLastName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutButton = new javax.swing.JButton();
        welcomeText = new javax.swing.JLabel();
        trainerName = new javax.swing.JLabel();
        promptLabel = new javax.swing.JLabel();
        manageExercisePlanButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(497, 295));
        setResizable(false);

        logoutButton.setForeground(new java.awt.Color(255, 0, 0));
        logoutButton.setText("Logout");
        logoutButton.setToolTipText("");
        logoutButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logoutButton.setContentAreaFilled(false);
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        welcomeText.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        welcomeText.setText("Welcome,");

        trainerName.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N

        promptLabel.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        promptLabel.setText("What would you like to do today?");

        manageExercisePlanButton.setText("<html><center>Manage<br>Exercise Plans");
        manageExercisePlanButton.setToolTipText("");
        manageExercisePlanButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageExercisePlanButton.setContentAreaFilled(false);
        manageExercisePlanButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageExercisePlanButton.setFocusPainted(false);
        manageExercisePlanButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        manageExercisePlanButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageExercisePlanButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(promptLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(welcomeText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trainerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(logoutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageExercisePlanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(welcomeText, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(trainerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(promptLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(manageExercisePlanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // Initialize a logout warning message to confirm users want to logout the system or not
        int answer = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout the system?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (answer == JOptionPane.YES_OPTION)
            GymManagementApp.writeFiles();// Write all current data to files and exit the application
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void manageExercisePlanButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageExercisePlanButtonMouseClicked
        new TrainerManageExercisePlanMenu();
        this.dispose();
    }//GEN-LAST:event_manageExercisePlanButtonMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton manageExercisePlanButton;
    private javax.swing.JLabel promptLabel;
    private javax.swing.JLabel trainerName;
    private javax.swing.JLabel welcomeText;
    // End of variables declaration//GEN-END:variables
}