/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.ui.gui;

import java.awt.CardLayout;
import javax.swing.JFrame;
import secondhandcars.application.IController;

/**
 *
 * @author Cornel
 */
public class ServiceWindow extends javax.swing.JFrame {

    IController ctr;

    /**
     * Creates new form test
     */
    public ServiceWindow(IController ctr) {

        this.ctr = ctr;
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

        btnRepair = new javax.swing.JButton();
        btnChip = new javax.swing.JButton();
        btnTire = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        repairPanel = new javax.swing.JPanel();
        labelFromDate = new javax.swing.JLabel();
        dayOfPurchaseLabel2 = new javax.swing.JLabel();
        fieldStartDay2 = new javax.swing.JTextField();
        monthOfPurchaseLabel2 = new javax.swing.JLabel();
        fieldStartMonth2 = new javax.swing.JTextField();
        yearOfPurchaseLabel2 = new javax.swing.JLabel();
        fieldStartYear2 = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        descriptionTextField = new javax.swing.JTextField();
        hoursLabel = new javax.swing.JLabel();
        hoursTextField = new javax.swing.JTextField();
        btnCommit2 = new javax.swing.JButton();
        repairLabel = new javax.swing.JLabel();
        chipPanel = new javax.swing.JPanel();
        labelFromDate1 = new javax.swing.JLabel();
        dayOfPurchaseLabel1 = new javax.swing.JLabel();
        fieldStartDay1 = new javax.swing.JTextField();
        monthOfPurchaseLabel1 = new javax.swing.JLabel();
        fieldStartMonth1 = new javax.swing.JTextField();
        yearOfPurchaseLabel1 = new javax.swing.JLabel();
        fieldStartYear1 = new javax.swing.JTextField();
        descriptionLabel1 = new javax.swing.JLabel();
        descriptionTextField1 = new javax.swing.JTextField();
        hoursLabel1 = new javax.swing.JLabel();
        hoursTextField1 = new javax.swing.JTextField();
        btnCommit1 = new javax.swing.JButton();
        chipTuningLabel = new javax.swing.JLabel();
        tirePanel = new javax.swing.JPanel();
        labelFromDate3 = new javax.swing.JLabel();
        labelToTheDate = new javax.swing.JLabel();
        btnCommit = new javax.swing.JButton();
        fieldStartYear = new javax.swing.JTextField();
        fieldStartMonth = new javax.swing.JTextField();
        fieldStartDay = new javax.swing.JTextField();
        dayOfPurchaseLabel = new javax.swing.JLabel();
        monthOfPurchaseLabel = new javax.swing.JLabel();
        yearOfPurchaseLabel = new javax.swing.JLabel();
        fieldEndYear = new javax.swing.JTextField();
        fieldEndMonth = new javax.swing.JTextField();
        fieldEndDay = new javax.swing.JTextField();
        dayOfPurchaseLabel3 = new javax.swing.JLabel();
        monthOfPurchaseLabel3 = new javax.swing.JLabel();
        yearOfPurchaseLabel3 = new javax.swing.JLabel();
        descriptionLabel2 = new javax.swing.JLabel();
        descriptionTextField2 = new javax.swing.JTextField();
        hoursLabel2 = new javax.swing.JLabel();
        hoursTextField2 = new javax.swing.JTextField();
        tireLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRepair.setText("Repair");
        btnRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepairActionPerformed(evt);
            }
        });

        btnChip.setText("Chip Tuning");
        btnChip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChipActionPerformed(evt);
            }
        });

        btnTire.setText("Tire");
        btnTire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTireActionPerformed(evt);
            }
        });

        mainPanel.setLayout(new java.awt.CardLayout());

        labelFromDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelFromDate.setText("From Date");

        dayOfPurchaseLabel2.setText("day");
        dayOfPurchaseLabel2.setToolTipText("");

        monthOfPurchaseLabel2.setText("month");
        monthOfPurchaseLabel2.setToolTipText("");

        yearOfPurchaseLabel2.setText("year");
        yearOfPurchaseLabel2.setToolTipText("");

        descriptionLabel.setText("Description");

        hoursLabel.setText("Hours");

        btnCommit2.setText("Commit");
        btnCommit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommit2ActionPerformed(evt);
            }
        });

        repairLabel.setText("Repair");

        javax.swing.GroupLayout repairPanelLayout = new javax.swing.GroupLayout(repairPanel);
        repairPanel.setLayout(repairPanelLayout);
        repairPanelLayout.setHorizontalGroup(
            repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repairPanelLayout.createSequentialGroup()
                .addGroup(repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(repairPanelLayout.createSequentialGroup()
                        .addGroup(repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(repairPanelLayout.createSequentialGroup()
                                .addGroup(repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(repairPanelLayout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(fieldStartDay2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(repairPanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(repairLabel)))
                                .addGap(9, 9, 9)
                                .addGroup(repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelFromDate)
                                    .addGroup(repairPanelLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(fieldStartMonth2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fieldStartYear2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(repairPanelLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(dayOfPurchaseLabel2)
                                .addGap(47, 47, 47)
                                .addComponent(monthOfPurchaseLabel2)
                                .addGap(40, 40, 40)
                                .addComponent(yearOfPurchaseLabel2)))
                        .addGap(0, 143, Short.MAX_VALUE))
                    .addGroup(repairPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(repairPanelLayout.createSequentialGroup()
                                .addComponent(descriptionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descriptionTextField))
                            .addGroup(repairPanelLayout.createSequentialGroup()
                                .addComponent(hoursLabel)
                                .addGap(44, 44, 44)
                                .addComponent(hoursTextField)))))
                .addContainerGap())
            .addGroup(repairPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCommit2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        repairPanelLayout.setVerticalGroup(
            repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repairPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFromDate)
                    .addComponent(repairLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayOfPurchaseLabel2)
                    .addComponent(monthOfPurchaseLabel2)
                    .addComponent(yearOfPurchaseLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldStartDay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldStartMonth2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldStartYear2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionLabel)
                    .addComponent(descriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(repairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hoursLabel)
                    .addComponent(hoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(btnCommit2)
                .addContainerGap())
        );

        mainPanel.add(repairPanel, "repairPanel");

        labelFromDate1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelFromDate1.setText("From Date");

        dayOfPurchaseLabel1.setText("day");
        dayOfPurchaseLabel1.setToolTipText("");

        monthOfPurchaseLabel1.setText("month");
        monthOfPurchaseLabel1.setToolTipText("");

        yearOfPurchaseLabel1.setText("year");
        yearOfPurchaseLabel1.setToolTipText("");

        descriptionLabel1.setText("Description");

        hoursLabel1.setText("Hours");

        btnCommit1.setText("Commit");
        btnCommit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommit1ActionPerformed(evt);
            }
        });

        chipTuningLabel.setText("Chip tuning");

        javax.swing.GroupLayout chipPanelLayout = new javax.swing.GroupLayout(chipPanel);
        chipPanel.setLayout(chipPanelLayout);
        chipPanelLayout.setHorizontalGroup(
            chipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chipPanelLayout.createSequentialGroup()
                .addGroup(chipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chipPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(chipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(chipPanelLayout.createSequentialGroup()
                                .addComponent(descriptionLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descriptionTextField1))
                            .addGroup(chipPanelLayout.createSequentialGroup()
                                .addComponent(hoursLabel1)
                                .addGap(44, 44, 44)
                                .addComponent(hoursTextField1))))
                    .addGroup(chipPanelLayout.createSequentialGroup()
                        .addGroup(chipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(chipPanelLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(dayOfPurchaseLabel1)
                                .addGap(47, 47, 47)
                                .addComponent(monthOfPurchaseLabel1)
                                .addGap(40, 40, 40)
                                .addComponent(yearOfPurchaseLabel1))
                            .addGroup(chipPanelLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(fieldStartDay1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fieldStartMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldStartYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(chipPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnCommit1))
                            .addGroup(chipPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(chipTuningLabel)
                                .addGap(85, 85, 85)
                                .addComponent(labelFromDate1)))
                        .addGap(0, 143, Short.MAX_VALUE)))
                .addContainerGap())
        );
        chipPanelLayout.setVerticalGroup(
            chipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chipPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFromDate1)
                    .addComponent(chipTuningLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayOfPurchaseLabel1)
                    .addComponent(monthOfPurchaseLabel1)
                    .addComponent(yearOfPurchaseLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldStartDay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldStartMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldStartYear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(chipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionLabel1)
                    .addComponent(descriptionTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hoursLabel1)
                    .addComponent(hoursTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(btnCommit1)
                .addContainerGap())
        );

        mainPanel.add(chipPanel, "chipPanel");

        labelFromDate3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelFromDate3.setText("From Date");

        labelToTheDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelToTheDate.setText("To Date");

        btnCommit.setText("Commit");
        btnCommit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommitActionPerformed(evt);
            }
        });

        dayOfPurchaseLabel.setText("day");
        dayOfPurchaseLabel.setToolTipText("");

        monthOfPurchaseLabel.setText("month");
        monthOfPurchaseLabel.setToolTipText("");

        yearOfPurchaseLabel.setText("year");
        yearOfPurchaseLabel.setToolTipText("");

        dayOfPurchaseLabel3.setText("day");
        dayOfPurchaseLabel3.setToolTipText("");

        monthOfPurchaseLabel3.setText("month");
        monthOfPurchaseLabel3.setToolTipText("");

        yearOfPurchaseLabel3.setText("year");
        yearOfPurchaseLabel3.setToolTipText("");

        descriptionLabel2.setText("Description");

        hoursLabel2.setText("Hours");

        tireLabel.setText("Tire");

        javax.swing.GroupLayout tirePanelLayout = new javax.swing.GroupLayout(tirePanel);
        tirePanel.setLayout(tirePanelLayout);
        tirePanelLayout.setHorizontalGroup(
            tirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tirePanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(tirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tirePanelLayout.createSequentialGroup()
                        .addComponent(fieldEndDay, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fieldEndMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldEndYear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tirePanelLayout.createSequentialGroup()
                        .addGap(0, 85, Short.MAX_VALUE)
                        .addComponent(monthOfPurchaseLabel3)
                        .addGap(39, 39, 39)
                        .addComponent(yearOfPurchaseLabel3)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tirePanelLayout.createSequentialGroup()
                        .addGroup(tirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelToTheDate)
                            .addGroup(tirePanelLayout.createSequentialGroup()
                                .addComponent(fieldStartDay, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(fieldStartMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldStartYear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tirePanelLayout.createSequentialGroup()
                .addGroup(tirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tirePanelLayout.createSequentialGroup()
                        .addGroup(tirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tirePanelLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(dayOfPurchaseLabel)
                                .addGap(47, 47, 47)
                                .addComponent(monthOfPurchaseLabel)
                                .addGap(40, 40, 40)
                                .addComponent(yearOfPurchaseLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tirePanelLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(dayOfPurchaseLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tirePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tireLabel)
                                .addGap(121, 121, 121)
                                .addComponent(labelFromDate3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tirePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tirePanelLayout.createSequentialGroup()
                                .addComponent(hoursLabel2)
                                .addGap(44, 44, 44)
                                .addComponent(hoursTextField2))
                            .addComponent(btnCommit, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tirePanelLayout.createSequentialGroup()
                                .addComponent(descriptionLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descriptionTextField2)))))
                .addGap(16, 16, 16))
        );
        tirePanelLayout.setVerticalGroup(
            tirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tirePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFromDate3)
                    .addComponent(tireLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayOfPurchaseLabel)
                    .addComponent(monthOfPurchaseLabel)
                    .addComponent(yearOfPurchaseLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldStartYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldStartDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldStartMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelToTheDate)
                .addGap(10, 10, 10)
                .addGroup(tirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayOfPurchaseLabel3)
                    .addComponent(monthOfPurchaseLabel3)
                    .addComponent(yearOfPurchaseLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldEndMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldEndYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldEndDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(tirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionLabel2)
                    .addComponent(descriptionTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hoursLabel2)
                    .addComponent(hoursTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnCommit)
                .addContainerGap())
        );

        mainPanel.add(tirePanel, "tirePanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRepair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChip)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTire)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRepair)
                    .addComponent(btnChip)
                    .addComponent(btnTire))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepairActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "repairPanel");
    }//GEN-LAST:event_btnRepairActionPerformed

    private void btnChipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChipActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "chipPanel");
    }//GEN-LAST:event_btnChipActionPerformed

    private void btnTireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTireActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "tirePanel");
    }//GEN-LAST:event_btnTireActionPerformed

    private void btnCommitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommitActionPerformed
        //Creates the date
        int sD = ctr.stringToInt(fieldStartDay.getText());
        int sM = ctr.stringToInt(fieldStartMonth.getText());
        int sY = ctr.stringToInt(fieldStartYear.getText());
        int eD = ctr.stringToInt(fieldEndDay.getText());
        int eM = ctr.stringToInt(fieldEndMonth.getText());
        int eY = ctr.stringToInt(fieldEndYear.getText());
        
        MainMenu mainMenu = new MainMenu(ctr);
        
        mainMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainMenu.setResizable(false);
        mainMenu.setTitle("Sold Cars Menu");
        mainMenu.setVisible(true);
        mainMenu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCommitActionPerformed

    private void btnCommit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommit1ActionPerformed
        MainMenu mainMenu = new MainMenu(ctr);
        
        mainMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainMenu.setResizable(false);
        mainMenu.setTitle("Sold Cars Menu");
        mainMenu.setVisible(true);
        mainMenu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCommit1ActionPerformed

    private void btnCommit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommit2ActionPerformed
        MainMenu mainMenu = new MainMenu(ctr);
        
        mainMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainMenu.setResizable(false);
        mainMenu.setTitle("Sold Cars Menu");
        mainMenu.setVisible(true);
        mainMenu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCommit2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChip;
    private javax.swing.JButton btnCommit;
    private javax.swing.JButton btnCommit1;
    private javax.swing.JButton btnCommit2;
    private javax.swing.JButton btnRepair;
    private javax.swing.JButton btnTire;
    private javax.swing.JPanel chipPanel;
    private javax.swing.JLabel chipTuningLabel;
    private javax.swing.JLabel dayOfPurchaseLabel;
    private javax.swing.JLabel dayOfPurchaseLabel1;
    private javax.swing.JLabel dayOfPurchaseLabel2;
    private javax.swing.JLabel dayOfPurchaseLabel3;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel descriptionLabel1;
    private javax.swing.JLabel descriptionLabel2;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JTextField descriptionTextField1;
    private javax.swing.JTextField descriptionTextField2;
    private javax.swing.JTextField fieldEndDay;
    private javax.swing.JTextField fieldEndMonth;
    private javax.swing.JTextField fieldEndYear;
    private javax.swing.JTextField fieldStartDay;
    private javax.swing.JTextField fieldStartDay1;
    private javax.swing.JTextField fieldStartDay2;
    private javax.swing.JTextField fieldStartMonth;
    private javax.swing.JTextField fieldStartMonth1;
    private javax.swing.JTextField fieldStartMonth2;
    private javax.swing.JTextField fieldStartYear;
    private javax.swing.JTextField fieldStartYear1;
    private javax.swing.JTextField fieldStartYear2;
    private javax.swing.JLabel hoursLabel;
    private javax.swing.JLabel hoursLabel1;
    private javax.swing.JLabel hoursLabel2;
    private javax.swing.JTextField hoursTextField;
    private javax.swing.JTextField hoursTextField1;
    private javax.swing.JTextField hoursTextField2;
    private javax.swing.JLabel labelFromDate;
    private javax.swing.JLabel labelFromDate1;
    private javax.swing.JLabel labelFromDate3;
    private javax.swing.JLabel labelToTheDate;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel monthOfPurchaseLabel;
    private javax.swing.JLabel monthOfPurchaseLabel1;
    private javax.swing.JLabel monthOfPurchaseLabel2;
    private javax.swing.JLabel monthOfPurchaseLabel3;
    private javax.swing.JLabel repairLabel;
    private javax.swing.JPanel repairPanel;
    private javax.swing.JLabel tireLabel;
    private javax.swing.JPanel tirePanel;
    private javax.swing.JLabel yearOfPurchaseLabel;
    private javax.swing.JLabel yearOfPurchaseLabel1;
    private javax.swing.JLabel yearOfPurchaseLabel2;
    private javax.swing.JLabel yearOfPurchaseLabel3;
    // End of variables declaration//GEN-END:variables
}
