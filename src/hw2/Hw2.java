/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Hardik
 */
public class Hw2 extends javax.swing.JFrame {
    /* ------------------ GLOBAL VARIABLES START ----------------*/
    /* Query Types */
    public static final int WHOLE_REGION = 1;
    public static final int RANGE_QUERY = 2;
    public static final int POINT_QUERY = 3;
    public static final int AP_COVERED = 4;
    
    // Polygon X and Y co-ordinate lists
    ArrayList<Integer> pX = new ArrayList<Integer>();
    ArrayList<Integer> pY = new ArrayList<Integer>();
    
    // For Range Query, is this the first point?
    boolean isFirstPoint = true; 
    
    // query counter - as per requirement
    int numQueries = 0;
    
    // for query 4
    int xc,yc,radius; // x,y co-ordinates and radius
    
    /* ------------------ GLOBAL VARIABLES END ----------------*/
    
    /**
     * Creates new form Hw2
     */
    public Hw2() {
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
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hardik\\Documents\\NetBeansProjects\\hw2\\data\\map.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jCheckBox1.setText("Buildings");

        jCheckBox2.setText("People");

        jCheckBox3.setText("Access Points");

        jRadioButton1.setText("Whole Region");

        jRadioButton2.setText("Range Query");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Point Query");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("Find AP Covered People");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Query");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Active Feature Type");

        jButton1.setText("Submit Query");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addGap(0, 166, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jCheckBox1)
                        .addGap(26, 26, 26)
                        .addComponent(jCheckBox2)
                        .addGap(30, 30, 30)
                        .addComponent(jCheckBox3)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(jRadioButton1)
                        .addGap(26, 26, 26)
                        .addComponent(jRadioButton2)
                        .addGap(26, 26, 26)
                        .addComponent(jRadioButton3)
                        .addGap(29, 29, 29)
                        .addComponent(jRadioButton4)
                        .addGap(33, 33, 33)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public int getQueryType() {
        if (jRadioButton1.isSelected()) {
            return WHOLE_REGION;
        }
        if (jRadioButton2.isSelected()) {
            return RANGE_QUERY;
        }
        if (jRadioButton3.isSelected()) {
            return POINT_QUERY;
        }
        if (jRadioButton4.isSelected()) {
            return AP_COVERED;
        }
        return 0;
    }
    
    public ArrayList<String> getChecked() {
        ArrayList<String> checked = new ArrayList();
        if (jCheckBox1.isSelected()) {
            checked.add(jCheckBox1.getText());
        }
        if (jCheckBox2.isSelected()) {
            checked.add(jCheckBox2.getText());
        }
        if (jCheckBox3.isSelected()) {
            checked.add(jCheckBox3.getText());
        }
        return checked;
    }
    
    public void getNearestAP(int x, int y, Graphics g) {
        DBUtils db = new DBUtils();
        db.connect();
        String query = "select a.ap_position.SDO_POINT.X ,a.ap_position.SDO_POINT.Y,a.radius from ap a where SDO_NN(a.ap_position,SDO_GEOMETRY(2001,NULL,SDO_POINT_TYPE("+ x + "," + y + ",NULL),NULL,NULL),'SDO_NUM_RES = 1') = 'TRUE'"; 
        // update query text box
        numQueries++;
        jTextArea1.append("\nQuery "+numQueries+": "+query);
        // make actual query
        ResultSet rs = db.getResultSet(query);
        try {
            // JDBC code
            while(rs.next()) {
                xc = rs.getInt("ap_position.SDO_POINT.X");
                yc = rs.getInt("ap_position.SDO_POINT.Y");
                radius = rs.getInt("radius");
                // set nearest AP to blue
                g.setColor(Color.blue);
                g.fillRect(xc-15/2, yc-15/2, 15, 15);
                g.dispose();   
            }
            rs.close();
        }
        catch(Exception e) {
            System.out.println("ERROR: "+Errors.RESULT_SET_ERROR+" Exception: "+e.toString());
            System.exit(Errors.RESULT_SET_ERROR);
        }
    }
    
    public void showAllBuildings() {
        
    }
    
    public void showAllPersons() {
        
    }
    
    public void showAllAPs() {
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int queryType = getQueryType();
        ArrayList<String> checked = getChecked();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        // Does different things depending on which radio button is checked.
        // So first determine which query we have.
        // get graphics to set colors etc
        Graphics g = jLabel1.getGraphics();
        int queryType = getQueryType();
        System.out.println("QueryType: "+queryType);
        switch(queryType) {
            case WHOLE_REGION:  break;
            case RANGE_QUERY:   // left click to draw first n-1 sides of polygon                        
                                if(evt.getButton() == MouseEvent.BUTTON1) {
                                    // check if it was first point.
                                    if(isFirstPoint) {
                                        // reset
                                        pX.clear();
                                        pY.clear();
                                    }
                                    // add new point
                                    pX.add(evt.getX());
                                    pY.add(evt.getY());
                                    if(!isFirstPoint) {
                                        g.setColor(Color.red);
                                        // line from last to 2nd last point
                                        g.drawLine(pX.get(pX.size()-1), pY.get(pY.size()-1), pX.get(pX.size()-2), pY.get(pY.size()-2));
                                    }
                                    isFirstPoint = false;
                                }
                                // right click to end the polygon
                                else if(evt.getButton() == MouseEvent.BUTTON3) {
                                    // we need at least 3 points
                                    if(pX.size() >= 3) {
                                        g.setColor(Color.red);
                                        // line from last to first point
                                        g.drawLine(pX.get(pX.size()-1), pY.get(pY.size()-1), pX.get(0), pY.get(0));
                                    }
                                } 
                                break;
            case POINT_QUERY:   // respond only on left click
                                if(evt.getButton() == MouseEvent.BUTTON1) {
                                    g.setColor(Color.red);
                                    g.fillRect(evt.getX()-(5/2),evt.getY()-(5/2),5,5);
                                    g.drawOval(evt.getX()-70,evt.getY()-70,140,140);
                                }
                                break;
            case AP_COVERED:    // respond only on left click
                                if(evt.getButton() == MouseEvent.BUTTON1) {
                                    getNearestAP(evt.getX(), evt.getY(),g);
                                }
                                break;
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        jLabel1.repaint();
        pX.clear();
        pY.clear();
        isFirstPoint = true;
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        jLabel1.repaint();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        showAllBuildings();
        showAllPersons();
        showAllAPs();
    }//GEN-LAST:event_jRadioButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Hw2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hw2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hw2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hw2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hw2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
