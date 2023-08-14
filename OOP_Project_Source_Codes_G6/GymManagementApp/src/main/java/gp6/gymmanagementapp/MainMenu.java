/*
This class is used to instantiate a main menu for users to select their role
*/

package gp6.gymmanagementapp;

import javax.swing.JOptionPane;

public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() 
    {
        initComponents();
        this.setVisible(true);
        name.setText(GymManagementApp.GymName);
    }
    
    // This function is used to create login window and dispose the main menu window
    // Mode is used to pass which role the customer choose
    private void createLoginWindow(int mode)
    {
        // Instantiate new login window
        new Login(mode);
        // Dispose this main menu window
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        staff = new javax.swing.JButton();
        customer = new javax.swing.JButton();
        trainer = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        welcomeText = new javax.swing.JLabel();
        welcomeText1 = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        admin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gym Management System Main Menu");
        setResizable(false);

        staff.setText("Staff");
        staff.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        staff.setContentAreaFilled(false);
        staff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        staff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffMouseClicked(evt);
            }
        });

        customer.setText("Customer");
        customer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        customer.setContentAreaFilled(false);
        customer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerMouseClicked(evt);
            }
        });

        trainer.setText("Trainer");
        trainer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        trainer.setContentAreaFilled(false);
        trainer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trainer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trainerMouseClicked(evt);
            }
        });

        exit.setText("Exit");
        exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exit.setContentAreaFilled(false);
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        welcomeText.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        welcomeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeText.setText("Welcome to ");
        welcomeText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        welcomeText1.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        welcomeText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeText1.setText("Gym Management System");
        welcomeText1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        login.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("Login as...");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        name.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("jLabel");
        name.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        admin.setText("Admin");
        admin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        admin.setContentAreaFilled(false);
        admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(staff, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trainer, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(admin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(179, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcomeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(welcomeText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(welcomeText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staff, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(trainer, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void staffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffMouseClicked
        createLoginWindow(0);
    }//GEN-LAST:event_staffMouseClicked

    private void customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerMouseClicked
        createLoginWindow(1);
    }//GEN-LAST:event_customerMouseClicked

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        int answer = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit the system?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (answer == JOptionPane.YES_OPTION)
            GymManagementApp.writeFiles();  // Write all current data fo data files and exit the program
    }//GEN-LAST:event_exitActionPerformed

    private void trainerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trainerMouseClicked
        createLoginWindow(2);
    }//GEN-LAST:event_trainerMouseClicked

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        createLoginWindow(3);
    }//GEN-LAST:event_adminMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton admin;
    javax.swing.JButton customer;
    javax.swing.JButton exit;
    javax.swing.JLabel login;
    javax.swing.JLabel name;
    javax.swing.JButton staff;
    javax.swing.JButton trainer;
    javax.swing.JLabel welcomeText;
    javax.swing.JLabel welcomeText1;
    // End of variables declaration//GEN-END:variables
}