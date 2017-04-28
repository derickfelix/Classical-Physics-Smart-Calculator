/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temperatureconverter.view;

import com.temperatureconverter.controller.Converter;
import com.temperatureconverter.model.Scale;

/**
 *
 * @author derickfelix
 */
public class Screen extends javax.swing.JFrame {

    
    private Converter converter;
    /**
     * Creates new form Screen
     */
    public Screen() {
 
        instanceComponents();
        initComponents();
        configComponents();
    }
    private void instanceComponents(){
       this.converter = new Converter();        
    }
    private void configComponents(){
        
        this.lblCResult.setVisible(false);
        this.lblScaleName.setText(this.txtScaleName.getText());
        this.lblRScaleName.setText(this.cmbRScale.getSelectedItem().toString());
        
        // cmbBox
        cmbBoxAddItem();
    }
    private void cmbBoxAddItem(){
        
        Scale[] scales = this.converter.getScales();
        String name;
        for (Scale scale : scales) {
            name = scale.getName();
            name += " [";
            name += scale.getSymbol();
            name += "]";
            this.cmbFromValue.addItem(name);
            this.cmbToValue.addItem(name);
            this.cmbRScale.addItem(name);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        panelRelations = new javax.swing.JPanel();
        cmbRScale = new javax.swing.JComboBox<>();
        lblScaleNameInput = new javax.swing.JLabel();
        txtScaleName = new javax.swing.JTextField();
        panelScaleInput = new javax.swing.JPanel();
        lblScaleName = new javax.swing.JLabel();
        spnPAScale = new javax.swing.JSpinner();
        lblPAScale = new javax.swing.JLabel();
        lblPBScale = new javax.swing.JLabel();
        spnPBScale = new javax.swing.JSpinner();
        panelRScaleInput = new javax.swing.JPanel();
        lblRScaleName = new javax.swing.JLabel();
        lblRPAScale = new javax.swing.JLabel();
        spnRPAScaleName = new javax.swing.JSpinner();
        lblRPBScale = new javax.swing.JLabel();
        spnRSBScaleName = new javax.swing.JSpinner();
        panelConverter = new javax.swing.JPanel();
        cmbFromValue = new javax.swing.JComboBox<>();
        cmbToValue = new javax.swing.JComboBox<>();
        txtFromValue = new javax.swing.JTextField();
        txtToValue = new javax.swing.JTextField();
        lblCResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Termology - Basic Software");

        lblTitle.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        lblTitle.setText("Termodynamics");

        panelRelations.setBorder(javax.swing.BorderFactory.createTitledBorder("Relations"));

        cmbRScale.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Relational Scale" }));
        cmbRScale.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRScaleItemStateChanged(evt);
            }
        });

        lblScaleNameInput.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        lblScaleNameInput.setText("Scale Name");

        txtScaleName.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtScaleNameCaretUpdate(evt);
            }
        });

        panelScaleInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblScaleName.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lblScaleName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScaleName.setText("scale");

        spnPAScale.setModel(new javax.swing.SpinnerNumberModel());

        lblPAScale.setText("Point A");

        lblPBScale.setText("Point B");

        spnPBScale.setModel(new javax.swing.SpinnerNumberModel());

        javax.swing.GroupLayout panelScaleInputLayout = new javax.swing.GroupLayout(panelScaleInput);
        panelScaleInput.setLayout(panelScaleInputLayout);
        panelScaleInputLayout.setHorizontalGroup(
            panelScaleInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelScaleInputLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelScaleInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelScaleInputLayout.createSequentialGroup()
                        .addGroup(panelScaleInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelScaleInputLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblPBScale))
                            .addComponent(lblPAScale, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelScaleInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spnPAScale, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnPBScale, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblScaleName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelScaleInputLayout.setVerticalGroup(
            panelScaleInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelScaleInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblScaleName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelScaleInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPAScale)
                    .addComponent(spnPAScale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelScaleInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPBScale)
                    .addComponent(spnPBScale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panelRScaleInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblRScaleName.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lblRScaleName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRScaleName.setText("scale");

        lblRPAScale.setText("Point A");

        spnRPAScaleName.setModel(new javax.swing.SpinnerNumberModel());

        lblRPBScale.setText("Point B");

        spnRSBScaleName.setModel(new javax.swing.SpinnerNumberModel());

        javax.swing.GroupLayout panelRScaleInputLayout = new javax.swing.GroupLayout(panelRScaleInput);
        panelRScaleInput.setLayout(panelRScaleInputLayout);
        panelRScaleInputLayout.setHorizontalGroup(
            panelRScaleInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRScaleInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRScaleName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRScaleInputLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panelRScaleInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRPBScale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRPAScale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRScaleInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spnRSBScaleName)
                    .addComponent(spnRPAScaleName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        panelRScaleInputLayout.setVerticalGroup(
            panelRScaleInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRScaleInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRScaleName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRScaleInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRPAScale)
                    .addComponent(spnRPAScaleName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRScaleInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRPBScale)
                    .addComponent(spnRSBScaleName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelRelationsLayout = new javax.swing.GroupLayout(panelRelations);
        panelRelations.setLayout(panelRelationsLayout);
        panelRelationsLayout.setHorizontalGroup(
            panelRelationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRelationsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelRelationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblScaleNameInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelScaleInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtScaleName))
                .addGap(53, 53, 53)
                .addGroup(panelRelationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRScaleInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbRScale, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelRelationsLayout.setVerticalGroup(
            panelRelationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRelationsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblScaleNameInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRelationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRScale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtScaleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelRelationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelScaleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRScaleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        panelConverter.setBorder(javax.swing.BorderFactory.createTitledBorder("Converter"));

        txtFromValue.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFromValue.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtFromValueCaretUpdate(evt);
            }
        });

        txtToValue.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtToValue.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtToValueCaretUpdate(evt);
            }
        });
        txtToValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToValueActionPerformed(evt);
            }
        });

        lblCResult.setFont(new java.awt.Font("DejaVu Sans", 1, 20)); // NOI18N
        lblCResult.setForeground(new java.awt.Color(102, 0, 0));
        lblCResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCResult.setToolTipText("Result");
        lblCResult.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 4, true));

        javax.swing.GroupLayout panelConverterLayout = new javax.swing.GroupLayout(panelConverter);
        panelConverter.setLayout(panelConverterLayout);
        panelConverterLayout.setHorizontalGroup(
            panelConverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConverterLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelConverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelConverterLayout.createSequentialGroup()
                        .addGroup(panelConverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFromValue)
                            .addComponent(cmbFromValue, 0, 150, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(panelConverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtToValue)
                            .addComponent(cmbToValue, 0, 150, Short.MAX_VALUE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelConverterLayout.setVerticalGroup(
            panelConverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConverterLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelConverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbToValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFromValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFromValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtToValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(lblCResult, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(panelRelations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelConverter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRelations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelConverter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(944, 396));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtScaleNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtScaleNameCaretUpdate
        // TODO add your handling code here:
        
        String scaleName = this.txtScaleName.getText();
        
        this.lblScaleName.setText(scaleName);
       
    }//GEN-LAST:event_txtScaleNameCaretUpdate

    private void cmbRScaleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRScaleItemStateChanged
        // TODO add your handling code here:
       this.lblRScaleName.setText(this.cmbRScale.getSelectedItem().toString());
 
    }//GEN-LAST:event_cmbRScaleItemStateChanged

    private void txtToValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToValueActionPerformed

    private void txtFromValueCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFromValueCaretUpdate
        // From txt
        this.converter.caretUpdate(txtToValue, cmbFromValue, cmbToValue, txtFromValue, txtToValue);
    }//GEN-LAST:event_txtFromValueCaretUpdate

    private void txtToValueCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtToValueCaretUpdate
        // To txt
        this.converter.caretUpdate(txtToValue, cmbFromValue, cmbToValue, txtFromValue, txtToValue);
    }//GEN-LAST:event_txtToValueCaretUpdate

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
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbFromValue;
    private javax.swing.JComboBox<String> cmbRScale;
    private javax.swing.JComboBox<String> cmbToValue;
    private javax.swing.JLabel lblCResult;
    private javax.swing.JLabel lblPAScale;
    private javax.swing.JLabel lblPBScale;
    private javax.swing.JLabel lblRPAScale;
    private javax.swing.JLabel lblRPBScale;
    private javax.swing.JLabel lblRScaleName;
    private javax.swing.JLabel lblScaleName;
    private javax.swing.JLabel lblScaleNameInput;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelConverter;
    private javax.swing.JPanel panelRScaleInput;
    private javax.swing.JPanel panelRelations;
    private javax.swing.JPanel panelScaleInput;
    private javax.swing.JSpinner spnPAScale;
    private javax.swing.JSpinner spnPBScale;
    private javax.swing.JSpinner spnRPAScaleName;
    private javax.swing.JSpinner spnRSBScaleName;
    private javax.swing.JTextField txtFromValue;
    private javax.swing.JTextField txtScaleName;
    private javax.swing.JTextField txtToValue;
    // End of variables declaration//GEN-END:variables
}
