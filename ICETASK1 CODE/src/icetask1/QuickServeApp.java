/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetask1;

import javax.swing.JOptionPane;


public class QuickServeApp {

 
    public static void main(String[] args) {
        
        Order order1 = new Order();
        String output = order1.toString();
        JOptionPane.showMessageDialog(null,output);
        
    }
    
}
