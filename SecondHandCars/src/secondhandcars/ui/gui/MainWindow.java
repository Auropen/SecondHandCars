/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.ui.gui;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import secondhandcars.application.Controller;
import secondhandcars.application.IController;
import secondhandcars.domain.Car;

/**
 *
 * @author Kristian
 */
public class MainWindow extends javax.swing.JFrame {
    IController ctr;
    Object [][] tableDate = {
        {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
    };
    String[] tableColumnName = {
        "Year", "Mark", "Model", "Version", "Volume of engine", "Fuel", "Odometer", "Price of purchase", "Selling price", "Type", "Description", "License plate", "Date of purchase", "In stock"
    };
    DefaultTableModel dtm = new DefaultTableModel(tableDate, tableColumnName);
    
    public MainWindow(IController ctr) {
        this.ctr = ctr;
        initComponents();
        MainFrame.setModel(dtm);
        MainFrame.getColumnModel().getColumn(0).setPreferredWidth(70);
        MainFrame.getColumnModel().getColumn(1).setPreferredWidth(90);
        MainFrame.getColumnModel().getColumn(2).setPreferredWidth(90);
        MainFrame.getColumnModel().getColumn(3).setPreferredWidth(90);
        MainFrame.getColumnModel().getColumn(4).setPreferredWidth(110);
        MainFrame.getColumnModel().getColumn(5).setPreferredWidth(90);
        MainFrame.getColumnModel().getColumn(6).setPreferredWidth(70);
        MainFrame.getColumnModel().getColumn(7).setPreferredWidth(110);
        MainFrame.getColumnModel().getColumn(8).setPreferredWidth(90);
        MainFrame.getColumnModel().getColumn(9).setPreferredWidth(90);
        MainFrame.getColumnModel().getColumn(10).setPreferredWidth(110);
        MainFrame.getColumnModel().getColumn(11).setPreferredWidth(90);
        MainFrame.getColumnModel().getColumn(12).setPreferredWidth(110);
        MainFrame.getColumnModel().getColumn(13).setPreferredWidth(60);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        MainFrame = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnAllCars = new javax.swing.JButton();
        ErrorText = new javax.swing.JTextField();
        btnSeachCar = new javax.swing.JButton();
        btnViewAllSoldCars = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        MainFrame.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Year", "Mark", "Model", "Version", "Volume of engine", "Fuel", "Odometer", "Price of purchase", "Selling price", "Type", "Description", "License plate", "Date of purchase", "In stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MainFrame.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(MainFrame);
        if (MainFrame.getColumnModel().getColumnCount() > 0) {
            MainFrame.getColumnModel().getColumn(0).setPreferredWidth(70);
            MainFrame.getColumnModel().getColumn(1).setPreferredWidth(90);
            MainFrame.getColumnModel().getColumn(2).setPreferredWidth(90);
            MainFrame.getColumnModel().getColumn(3).setPreferredWidth(90);
            MainFrame.getColumnModel().getColumn(4).setPreferredWidth(130);
            MainFrame.getColumnModel().getColumn(5).setPreferredWidth(90);
            MainFrame.getColumnModel().getColumn(6).setPreferredWidth(70);
            MainFrame.getColumnModel().getColumn(7).setPreferredWidth(130);
            MainFrame.getColumnModel().getColumn(8).setPreferredWidth(90);
            MainFrame.getColumnModel().getColumn(9).setPreferredWidth(90);
            MainFrame.getColumnModel().getColumn(10).setPreferredWidth(110);
            MainFrame.getColumnModel().getColumn(11).setPreferredWidth(90);
            MainFrame.getColumnModel().getColumn(12).setPreferredWidth(110);
            MainFrame.getColumnModel().getColumn(13).setPreferredWidth(60);
        }

        btnAllCars.setText("View all available cars");
        btnAllCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllCarsActionPerformed(evt);
            }
        });

        btnSeachCar.setText("Search cars");
        btnSeachCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeachCarActionPerformed(evt);
            }
        });

        btnViewAllSoldCars.setText("Sold cars");
        btnViewAllSoldCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllSoldCarsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ErrorText)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAllCars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeachCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewAllSoldCars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAllCars)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSeachCar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewAllSoldCars)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(ErrorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeachCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeachCarActionPerformed
        JFrame servicesMenu = new SearchASpecificCar(ctr, this);
        
        
        servicesMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        servicesMenu.setResizable(false);
        servicesMenu.setTitle("Services Menu");
        servicesMenu.setVisible(true);
        servicesMenu.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSeachCarActionPerformed

    private void btnViewAllSoldCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllSoldCarsActionPerformed
        
        JFrame soldCars = new SoldCars();
        
        
        soldCars.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        soldCars.setResizable(false);
        soldCars.setTitle("Services Menu");
        soldCars.setVisible(true);
        soldCars.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnViewAllSoldCarsActionPerformed

    private void btnAllCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllCarsActionPerformed
        List<Car> cars = ctr.getAllCars();
        displayCars(cars);
    }//GEN-LAST:event_btnAllCarsActionPerformed

    public void displayCars(List<Car> cars) {
        if (dtm.getRowCount() > 0) {
            for (int i = dtm.getRowCount() - 1; i > -1; i--) {
                dtm.removeRow(i);
            }
        }
        for (int i = 0; i < cars.size(); i++) {
            Object[] data = new Object[14];
            data[0] = cars.get(i).getYear();
            data[1] = cars.get(i).getMark();
            data[2] = cars.get(i).getModel();
            data[3] = cars.get(i).getVersion();
            data[4] = cars.get(i).getVolumeOfEngine();
            data[5] = cars.get(i).getFuelType();
            data[6] = cars.get(i).getOdometer();
            data[7] = cars.get(i).getPriceOfPurchase();
            data[8] = cars.get(i).getSellingPrice();
            data[9] = cars.get(i).getType();
            data[10] = cars.get(i).getDescription();
            data[11] = cars.get(i).getLicensePlate();
            data[12] = cars.get(i).getDateOfPurchase();
            data[13] = cars.get(i).getStockStatus();
            dtm.addRow(data);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ErrorText;
    private javax.swing.JTable MainFrame;
    private javax.swing.JButton btnAllCars;
    private javax.swing.JButton btnSeachCar;
    private javax.swing.JButton btnViewAllSoldCars;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
