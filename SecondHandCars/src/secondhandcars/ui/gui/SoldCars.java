/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.ui.gui;

import secondhandcars.application.IController;

/**
 *
 * @author Cornel
 */
public class SoldCars extends javax.swing.JFrame {
    CarWindow carWindow;
    IController ctr;

    /**
     * Creates new form SoldCars
     */
    public SoldCars(IController ctr, CarWindow carWindow) {
        this.ctr = ctr;
        this.carWindow = carWindow;
        initComponents();
        removeGetCarsPanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGetSoldCars = new javax.swing.JButton();
        btnGetCars = new javax.swing.JButton();
        panelGetCars = new javax.swing.JPanel();
        labelFromDay = new javax.swing.JLabel();
        labelFromMonth = new javax.swing.JLabel();
        labelFromYear = new javax.swing.JLabel();
        labelFromDate = new javax.swing.JLabel();
        labelToTheDate = new javax.swing.JLabel();
        fieldFromDay = new javax.swing.JTextField();
        fieldFromMonth = new javax.swing.JTextField();
        fieldFromYear = new javax.swing.JTextField();
        labelToDay = new javax.swing.JLabel();
        labelToMonth = new javax.swing.JLabel();
        labelToYear = new javax.swing.JLabel();
        fieldToDay = new javax.swing.JTextField();
        fieldToMonth = new javax.swing.JTextField();
        fieldToYear = new javax.swing.JTextField();
        btnSearchGetCars = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGetSoldCars.setText("Get sold cars");
        btnGetSoldCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetSoldCarsActionPerformed(evt);
            }
        });

        btnGetCars.setText("Get cars");
        btnGetCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetCarsActionPerformed(evt);
            }
        });

        labelFromDay.setText("Day");

        labelFromMonth.setText("Month");

        labelFromYear.setText("Year");

        labelFromDate.setText("From Date");

        labelToTheDate.setText("To Date");

        labelToDay.setText("Day");

        labelToMonth.setText("Month");

        labelToYear.setText("Year");

        btnSearchGetCars.setText("Search");
        btnSearchGetCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchGetCarsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGetCarsLayout = new javax.swing.GroupLayout(panelGetCars);
        panelGetCars.setLayout(panelGetCarsLayout);
        panelGetCarsLayout.setHorizontalGroup(
            panelGetCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGetCarsLayout.createSequentialGroup()
                .addGroup(panelGetCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGetCarsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelGetCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFromDay)
                            .addComponent(labelFromMonth)
                            .addComponent(labelFromYear)
                            .addComponent(labelToDay)
                            .addComponent(labelToMonth)
                            .addComponent(labelToYear))
                        .addGap(54, 54, 54)
                        .addGroup(panelGetCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldToYear, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldToMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldToDay, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldFromYear, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldFromMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldFromDay, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelGetCarsLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(labelToTheDate))
                    .addGroup(panelGetCarsLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(labelFromDate))
                    .addGroup(panelGetCarsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSearchGetCars)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        panelGetCarsLayout.setVerticalGroup(
            panelGetCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGetCarsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFromDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGetCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldFromDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFromDay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGetCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldFromMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFromMonth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGetCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldFromYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFromYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelToTheDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGetCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldToDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelToDay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGetCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldToMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelToMonth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGetCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldToYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelToYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnSearchGetCars))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGetSoldCars)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGetCars, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelGetCars, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGetSoldCars)
                    .addComponent(btnGetCars))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelGetCars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetCarsActionPerformed
        panelGetCars.setVisible(true);
    }//GEN-LAST:event_btnGetCarsActionPerformed

    private void btnSearchGetCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchGetCarsActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSearchGetCarsActionPerformed

    private void btnGetSoldCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetSoldCarsActionPerformed
        carWindow.displayCars(ctr.getSoldCars());
        this.dispose();
    }//GEN-LAST:event_btnGetSoldCarsActionPerformed

    public void removeGetCarsPanel(){
        panelGetCars.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetCars;
    private javax.swing.JButton btnGetSoldCars;
    private javax.swing.JButton btnSearchGetCars;
    private javax.swing.JTextField fieldFromDay;
    private javax.swing.JTextField fieldFromMonth;
    private javax.swing.JTextField fieldFromYear;
    private javax.swing.JTextField fieldToDay;
    private javax.swing.JTextField fieldToMonth;
    private javax.swing.JTextField fieldToYear;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFromDate;
    private javax.swing.JLabel labelFromDay;
    private javax.swing.JLabel labelFromMonth;
    private javax.swing.JLabel labelFromYear;
    private javax.swing.JLabel labelToDay;
    private javax.swing.JLabel labelToMonth;
    private javax.swing.JLabel labelToTheDate;
    private javax.swing.JLabel labelToYear;
    private javax.swing.JPanel panelGetCars;
    // End of variables declaration//GEN-END:variables
}
