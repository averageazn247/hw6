/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hw6;

import java.awt.Color;
import java.awt.*;
import java.awt.Graphics;
import java.util.Collections;
import java.util.Vector;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;

/**
 *
 * @author Khoa
 */
public class GUI extends javax.swing.JFrame {
    JButton btnOne = new JButton();
    Boolean run =false; 
    Boolean bubble=false;
    Boolean insert=false;
    Boolean shell =false;
    Dosorts bubbleplot;
    static int[] unsort1,unsort2,unsort3,unsort4,unsort5;
    
    
    
   static int length=0;
    
    /**
     * Creates new form GUI
     */
    public GUI( ) {
        
     
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

        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lenghtext = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sorts");

        jCheckBox1.setText("Bubble Sort");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("insertion sort");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("jCheckBox3");

        jCheckBox4.setText("jCheckBox4");

        jCheckBox5.setText("jCheckBox5");

        jCheckBox6.setText("jCheckBox6");

        jToggleButton1.setText("Run");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Length Input");
        jLabel2.setToolTipText("");

        lenghtext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lenghtext.setText("length not entered");
        lenghtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lenghtextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(lenghtext)
                            .addComponent(jTextField1))))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox4)
                .addGap(3, 3, 3)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lenghtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected())
        {
             bubble=true;
             System.out.print("bubble on \n");
       }
        else   {    // if check box unchecked 
                 bubble=false;
                 System.out.print("bubble off \n");
        }                                          
    
    }//GEN-LAST:event_jCheckBox1ActionPerformed
public void paintComponent (Graphics g)
{
    
    super.paintComponents(g);
    g.setColor(Color.black);
    g.drawString("Bubble Sort", 20, 300 );
    
    drawBarGraphic(g);
    
    
}
private void drawBarGraphic(Graphics g) {

    int width = (int) (200.0/(double)length);
    int height = (int) (200.0/(double)length);
    g.setColor(Color.black);
    g.drawRect (20, 300, width*length, height*length);
    

    g.setColor(Color.blue);
    System.out.println("in bar \n");
    for(int i=0; i<length; i++) {
      g.fill3DRect(20+i*width, 300, width,
          unsort1[i]*height + 1, false);
      
      
    }
    
    System.out.println("in end bar \n");
  }
//
class Dosorts extends JComponent{
    public Dosorts(int type)
    {
         System.out.println("in bubble sort \n");
        if(type==1)
        {
            
            while( GUI.BubbleSort.step()==true)
            {
                
                
            }
                
            
            
        }
         System.out.println("in dor sort \n");
    }
    
   
    
}
class Makeframe extends JFrame{
    public Makeframe(){
    //setDefaultCloseOperation(TextFrame.EXIT_ON_CLOSE);
    setBounds(10,10,400,200);
    setBackground(Color.blue);
    
    
    JPanel bubblepanel = new JPanel();
 
    JPanel p2 = new JPanel();
    
         System.out.println("bubble is true \n");
        Dosorts bubbleplot= new Dosorts(1);
   
    if(run==true)
    {
         
        System.out.println("run is true \n");
       
       // bubblepanel.setLayout(new GridLayout(2,2));
        bubblepanel.setSize(300, 300);
         bubblepanel.add(bubbleplot);
         JLabel title =new JLabel("Bubble Plot" );
         title.setLocation(50,10);
         bubblepanel.add(title);
         
         
         
        bubblepanel.validate();
        
        
    }
   add(bubblepanel);
  // pack();
   setVisible(true);
   
    
    
    
    
    
    
    
}
    
    
    
}
    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed

                if(jCheckBox2.isSelected())
        {
            insert=true;
             System.out.print("insert on \n");
       }
        else   {    // if check box unchecked 
                 insert=false;
                 System.out.print("insert off \n");
        }    
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        if(jToggleButton1.isSelected())
        {
           run=true;
             System.out.print("run on \n");
             Makeframe sort= new Makeframe();
            
        }
        else{
            run=false;
             System.out.print("run off \n");
            
        };
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        Vector<Integer> number1;
        try{
            //gets input length
            length= Integer.parseInt(this.jTextField1.getText());
            
            this.lenghtext.setText(  String.valueOf(length) );
            number1=makerandom();//creates the vector containing the values and randomizes it
            //converts into arrary for faster handling
            unsort1=unsort2=unsort3=unsort4=unsort5= new int[number1.size()];
            for(int i=0;i<number1.size();i++){
                unsort1[i]=unsort2[i]=unsort3[i]=unsort4[i]=unsort5[i]=number1.elementAt(i);
            
            }
            
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Bad length input only enter integers  \n"
                    + "reenter int \n");
            
            return;
        }
        
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void lenghtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lenghtextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lenghtextActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    public Vector<Integer> makerandom() 
    {
        Vector<Integer> temp= new Vector<Integer>();
        for(int i=0; i<length; i++) { 
             temp.add(i); 
        
        
        }
        Collections.shuffle(temp);
        return temp;
    }
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

   public class BubbleSort{
    int pos1=0;// current number to sort
    int pos2 =0;// number of sorted
    
    BubbleSort(){
      }
        
        public  Boolean step(){
        if (pos1 == length-1)
        {
          //reset pos1 once it reaches the top 
            pos1=0; 
            pos2++;
        }
        if(pos2 == length)
        {
            // entire array is sorted
            
           return false; 
        
        }
        if(unsort1[pos1]>unsort1[pos1+1])
        {
            //swaping the positions
            int temp=unsort1[pos1];
            unsort1[pos1]=unsort1[pos1+1];
            unsort1[pos1+1]=temp;
            
            
        }
        pos1++;
        return true;
        
        
    }
     
}
    public static  int getlength(){
        return length;
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField lenghtext;
    // End of variables declaration//GEN-END:variables
}
