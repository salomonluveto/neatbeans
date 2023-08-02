/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author salomon luveto
 */
public class Pn extends JPanel{
    @Override
    protected void paintComponent(Graphics e){
        Graphics2D g = (Graphics2D)e;
        g.setColor(Color.red);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.black);
        int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        String pt[]= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String k[]= {"u1","u2","u3","u4","u5","u6","u7","u8","u9","u10","u11","u12","u13","u14","u15","u16","u17","u18","u19","u20","u21","u22","u23","u24","u25","u26"};
        String b;
           g.fillOval(160, 10, 15, 15);
           g.drawString(pt[0], 160, 10);
           
           
       int j = 0; 
       for(int i = 0;i<7;i++){
           g.fillOval(10+j, 70, 15, 15);
           g.drawString(pt[i+1], 10+j, 70);
           g.drawString(k[i], 10+j, 100);
           
           g.drawLine(165, 15, 15+j, 75);
           g.drawString("v", 16+j, 117);
           g.setColor(Color.black);
           j+= 50;
       }
       j=0;
       int m = 0;
       int l = 0;
       for(int i = 0;i<7;i++){
           g.fillOval(10+j, 130, 15, 15);
           g.drawString(pt[i+8], 10+j, 130);
           g.drawString(k[i+7], 70+l, 170);
           g.drawLine(15+j, 75, 20+j, 135);
           g.drawString("v", 127+m, 185);
           g.fillOval(160, 190, 15, 15);
           g.drawString(pt[25], 160, 218);
           g.drawString(k[i+14], 70+l, 50);
           g.drawLine(15+j, 135, 165, 195);
           g.drawString("v", 127+m, 35);
             j+= 50;
             l+=30;
             m+=12;
       }
      
    }
    
}
