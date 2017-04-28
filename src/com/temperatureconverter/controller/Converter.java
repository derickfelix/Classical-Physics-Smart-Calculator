/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temperatureconverter.controller;

import com.temperatureconverter.model.Scale;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Derick
 */
public class Converter {

    private Scale[] scales = null;

    public Converter() {
        this.scales = new Scale[3];
        this.scales[0] = new Scale("Celsius", "C", 0, 100);
        this.scales[1] = new Scale("Fahreinheit", "F", 32, 212);
        this.scales[2] = new Scale("Kelvin", "K", 273, 373);

    }

    public void caretUpdate(JTextField txt, JComboBox cmbFrom, JComboBox cmbTo, JTextField txtFrom, JTextField txtTo) {
        
        // Get index of both values
        int iFrom = cmbFrom.getSelectedIndex();
        int iTo = cmbTo.getSelectedIndex();
        // Find the scale using the index caught before
        Scale from = scales[iFrom];
        Scale to = scales[iTo];
        
        try {
            from.setValue(Double.parseDouble(txtFrom.getText()));
            
            findEachValue(from);
        } catch (NumberFormatException e) {
            System.out.println("Tente colocar um numero valido!");
        }
    }
    private void findEachValue(Scale from){
        for(int i = 0; i < scales.length; i++){
           if(scales[i] != from){
             Scale to = scales[i];
             /** 
             *   to - pA     from - pA
             *   -------  =  ------
             *   pB - pA     pA - pB
             * 
             * 
             *    part1     part3
             *    -----  = -------
             *    part2     part4
             * 
             */
             double part2 = to.getPointB() - to.getPointA();
             double part3 = from.getValue() - from.getPointA();
             double part4 = from.getPointA() - from.getPointB();
             // part1 / part2 = part3 / part4
             // part1 = (part3/ part4) * part2
             double part1 = (part3 / part4) * part2;
             // to = part1 - to.pointA
             to.setValue(part1 - to.getPointA());
             
           }
        }
    }

    public Scale[] getScales() {
        return scales;
    }

    public void setScales(Scale[] scales) {
        this.scales = scales;
    }

}
