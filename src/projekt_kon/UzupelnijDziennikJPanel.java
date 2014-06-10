/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projekt_kon;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;

/**
 *
 * @author Konrad
 */
public class UzupelnijDziennikJPanel extends javax.swing.JPanel {

    private Date dataTreningu;
    /**
     * Creates new form UzupelnijDziennikJPanel
     */
    public UzupelnijDziennikJPanel() 
    {
        initComponents();
        
        dataTreningu = Calendar.getInstance().getTime();
        String ActualDate = new SimpleDateFormat("dd-MM-yyyy  HH:mm").format(dataTreningu);
        jLabDataTreningu.setText(ActualDate);
        
        jLabIncValue1.setVisible(false);
        jLabIncValue2.setVisible(false);
    }

    public void SetNazwa(String A_Nazwa, String A_LabPierwszy, String A_LabDrugi)
    {
        jLabNazwaCwiczenia.setText(A_Nazwa);
        jLabPierwszy.setText(A_LabPierwszy);
        jLabDrugi.setText(A_LabDrugi);
    }
    
    public String GetNazwaCwiczenia()
    {
        return jLabNazwaCwiczenia.getText();
    }
    
    public Date GetDataTreningu()
    {
        return dataTreningu;
    }
    
    public String GetText1()
    {
        return jTextField1.getText();
    }
    
    public String GetText2()
    {
        return jTextField2.getText();
    }
    
    public JButton GetButtonZapisz()
    {
        return jButton1;
    }
    
    public JButton GetButtonWstecz()
    {
        return jBtnWstecz;
    }
    
    public void SetIncVal1Visible(boolean val)
    {
        jLabIncValue1.setVisible(val);
    }
    
    public void SetIncVal2Visible(boolean val)
    {
        jLabIncValue2.setVisible(val);
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabNazwaCwiczenia = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBtnWstecz = new javax.swing.JButton();
        jLabPierwszy = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabDrugi = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabDataTreningu = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabIncValue1 = new javax.swing.JLabel();
        jLabIncValue2 = new javax.swing.JLabel();

        panel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabNazwaCwiczenia.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabNazwaCwiczenia.setForeground(new java.awt.Color(255, 255, 255));
        jLabNazwaCwiczenia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabNazwaCwiczenia.setText("Bieg");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Uzupełnienie dziennika");
        jLabel2.setToolTipText("");

        jBtnWstecz.setText("Wstecz");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabNazwaCwiczenia, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jBtnWstecz))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabNazwaCwiczenia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jBtnWstecz))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabPierwszy.setText("Ilość przepłyniętych km:");

        jLabDrugi.setText("Czas w minutach:");

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabDataTreningu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabDataTreningu.setForeground(new java.awt.Color(255, 255, 255));
        jLabDataTreningu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabDataTreningu.setText("24-06-2014  14:34");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabDataTreningu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabDataTreningu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("Zapisz");

        jLabIncValue1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabIncValue1.setForeground(new java.awt.Color(255, 0, 51));
        jLabIncValue1.setText("Błąd");

        jLabIncValue2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabIncValue2.setForeground(new java.awt.Color(255, 0, 51));
        jLabIncValue2.setText("Błąd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabDrugi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabPierwszy, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabIncValue1)
                    .addComponent(jLabIncValue2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabPierwszy)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabIncValue1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabDrugi)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabIncValue2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnWstecz;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabDataTreningu;
    private javax.swing.JLabel jLabDrugi;
    private javax.swing.JLabel jLabIncValue1;
    private javax.swing.JLabel jLabIncValue2;
    private javax.swing.JLabel jLabNazwaCwiczenia;
    private javax.swing.JLabel jLabPierwszy;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
