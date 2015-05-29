/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.ui.gui;

import java.util.Date;
import javax.swing.JFrame;
import secondhandcars.application.IController;

/**
 *
 * @author Kristian
 */
public class SearchASpecificCar extends JFrame {
    MainWindow mainWindow;
    IController ctr;
    /**
     * Creates new form MainMenu
     */
    public SearchASpecificCar(IController ctr, MainWindow mainWindow) {
        this.ctr = ctr;
        this.mainWindow = mainWindow;
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

        jPanel1 = new javax.swing.JPanel();
        labelYear = new javax.swing.JLabel();
        fieldYear = new javax.swing.JTextField();
        labelMark = new javax.swing.JLabel();
        fieldMark = new javax.swing.JTextField();
        labelModel = new javax.swing.JLabel();
        fieldModel = new javax.swing.JTextField();
        fieldVersion = new javax.swing.JTextField();
        labelVersion = new javax.swing.JLabel();
        fieldVolumeOfEngine = new javax.swing.JTextField();
        labelVolumeOfEngine = new javax.swing.JLabel();
        labelFuel = new javax.swing.JLabel();
        labelOdometer = new javax.swing.JLabel();
        fieldFuel = new javax.swing.JTextField();
        fieldOdometer = new javax.swing.JTextField();
        labelPriceOfPurchase = new javax.swing.JLabel();
        fieldPriceOfPurchase = new javax.swing.JTextField();
        labelSellingPrice = new javax.swing.JLabel();
        fieldSellingPrice = new javax.swing.JTextField();
        fieldType = new javax.swing.JTextField();
        labelType = new javax.swing.JLabel();
        labelDescription = new javax.swing.JLabel();
        fieldDescription = new javax.swing.JTextField();
        labelLicensePlate = new javax.swing.JLabel();
        fieldLicensePlate = new javax.swing.JTextField();
        labelDateOfPurchase = new javax.swing.JLabel();
        fieldDayOfPurchase = new javax.swing.JTextField();
        dayOfPurchaseLabel = new javax.swing.JLabel();
        fieldMonthOfPurchase = new javax.swing.JTextField();
        yearOfPurchaseLabel = new javax.swing.JLabel();
        monthOfPurchaseLabel = new javax.swing.JLabel();
        fieldYearOfPurchase = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelYear.setText("Year:");

        labelMark.setText("Mark:");

        labelModel.setText("Model");

        labelVersion.setText("Version");

        labelVolumeOfEngine.setText("Volume of engine");

        labelFuel.setText("Fuel");

        labelOdometer.setText("Odometer");

        labelPriceOfPurchase.setText("Price of purchase");

        labelSellingPrice.setText("Selling price");

        labelType.setText("Type");

        labelDescription.setText("Description");

        labelLicensePlate.setText("License place");

        labelDateOfPurchase.setText("Date of purchase");

        fieldDayOfPurchase.setText("  ");

        dayOfPurchaseLabel.setText("day");
        dayOfPurchaseLabel.setToolTipText("");

        fieldMonthOfPurchase.setText("  ");

        yearOfPurchaseLabel.setText("year");
        yearOfPurchaseLabel.setToolTipText("");

        monthOfPurchaseLabel.setText("month");
        monthOfPurchaseLabel.setToolTipText("");

        fieldYearOfPurchase.setText("  ");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelLicensePlate)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(dayOfPurchaseLabel)
                                .addGap(43, 43, 43)
                                .addComponent(monthOfPurchaseLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(yearOfPurchaseLabel)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(fieldLicensePlate))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelDateOfPurchase)
                        .addGap(18, 18, 18)
                        .addComponent(fieldDayOfPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fieldMonthOfPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fieldYearOfPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSellingPrice)
                            .addComponent(labelType)
                            .addComponent(labelDescription))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldType)
                            .addComponent(fieldSellingPrice)
                            .addComponent(fieldDescription)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMark)
                            .addComponent(labelModel)
                            .addComponent(labelVersion)
                            .addComponent(labelYear)
                            .addComponent(labelVolumeOfEngine)
                            .addComponent(labelFuel)
                            .addComponent(labelOdometer)
                            .addComponent(labelPriceOfPurchase))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldPriceOfPurchase)
                            .addComponent(fieldOdometer)
                            .addComponent(fieldFuel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldModel, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(fieldVolumeOfEngine))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldVersion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldMark, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldMark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMark))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelModel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVersion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldVolumeOfEngine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVolumeOfEngine))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFuel)
                    .addComponent(fieldFuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldOdometer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOdometer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldPriceOfPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPriceOfPurchase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSellingPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDescription))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLicensePlate))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayOfPurchaseLabel)
                    .addComponent(monthOfPurchaseLabel)
                    .addComponent(yearOfPurchaseLabel))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDateOfPurchase)
                    .addComponent(fieldMonthOfPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldDayOfPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldYearOfPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mainWindow.displayCars(ctr.searchCars(fieldFuel.getText(), ctr.stringToDouble(fieldSellingPrice.getText()), fieldLicensePlate.getText(), 
                ctr.stringToInt(fieldYear.getText()), fieldMark.getText(), fieldModel.getText(), 
                fieldVersion.getText(), fieldVolumeOfEngine.getText(), ctr.stringToDouble(fieldOdometer.getText()), 
                ctr.stringToDouble(fieldPriceOfPurchase.getText()), fieldType.getText(), fieldDescription.getText(), null));
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dayOfPurchaseLabel;
    private javax.swing.JTextField fieldDayOfPurchase;
    private javax.swing.JTextField fieldDescription;
    private javax.swing.JTextField fieldFuel;
    private javax.swing.JTextField fieldLicensePlate;
    private javax.swing.JTextField fieldMark;
    private javax.swing.JTextField fieldModel;
    private javax.swing.JTextField fieldMonthOfPurchase;
    private javax.swing.JTextField fieldOdometer;
    private javax.swing.JTextField fieldPriceOfPurchase;
    private javax.swing.JTextField fieldSellingPrice;
    private javax.swing.JTextField fieldType;
    private javax.swing.JTextField fieldVersion;
    private javax.swing.JTextField fieldVolumeOfEngine;
    private javax.swing.JTextField fieldYear;
    private javax.swing.JTextField fieldYearOfPurchase;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDateOfPurchase;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JLabel labelFuel;
    private javax.swing.JLabel labelLicensePlate;
    private javax.swing.JLabel labelMark;
    private javax.swing.JLabel labelModel;
    private javax.swing.JLabel labelOdometer;
    private javax.swing.JLabel labelPriceOfPurchase;
    private javax.swing.JLabel labelSellingPrice;
    private javax.swing.JLabel labelType;
    private javax.swing.JLabel labelVersion;
    private javax.swing.JLabel labelVolumeOfEngine;
    private javax.swing.JLabel labelYear;
    private javax.swing.JLabel monthOfPurchaseLabel;
    private javax.swing.JLabel yearOfPurchaseLabel;
    // End of variables declaration//GEN-END:variables
}
