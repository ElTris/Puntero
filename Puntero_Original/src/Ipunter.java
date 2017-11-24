
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PREDATOR
 */
public class Ipunter extends javax.swing.JFrame {

    public Graphics dibujo,cuadros;
    public int x, y, m = 300, n = 300, cx = 250, cy = 250;

    /**
     * Creates new form Ipunter
     */
    public Ipunter() {

        initComponents();
        getContentPane().setBackground(new java.awt.Color(0,153,255));
        dibujo = Background.getGraphics();
        cuadros=Background.getGraphics();
        this.setResizable(false);
        this.setTitle("PUNTERO_PROYECTO");
        this.setLocationRelativeTo(null);
        Background.setBackground(Color.WHITE);
        Importante();

    }

    public void Importante() {
        Background.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent evt) {
                x = evt.getX() - 50;
                y = evt.getY() - 50;

//                x=evt.getXOnScreen()/2;
//                y=evt.getXOnScreen()/2;
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                
                  if (Cuadrado.isSelected()) {
                    if (x < 0) {
                        x = 0;
                        Background.update(cuadros);
                        Cuadro();
                    } else {
                        Background.update(cuadros);
                        Cuadro();
                    }

                    ///
                    if (y < 0) {
                        y = 0;
                        Background.update(cuadros);
                        Cuadro();
                    } else {
                        Background.update(cuadros);
                        Cuadro();
                    }

                    ///
                    if (x > 631) {
                        x = 631;
                        Background.update(cuadros);
                        Cuadro();
                    } else {
                        Background.update(cuadros);
                        Cuadro();
                    }

                    ///
                    if (y > 468) {
                        y = 468;
                        Background.update(cuadros);
                        Cuadro();
                    } else {
                        Background.update(cuadros);
                        Cuadro();
                    }

                    while (x < m) {
                        m--;
                        m = x;
                        Background.update(cuadros);
                        Cuadro();

                    }

                    while (x > m) {
                        m++;
                        m = x;
                        Background.update(cuadros);
                        Cuadro();

                    }

                    while (y < n) {
                        n--;
                        n = y;
                        Background.update(cuadros);
                        Cuadro();

                    }

                    while (y > n) {
                        n++;
                        n = y;
                        Background.update(cuadros);
                        Cuadro();

                    }

                }///FIN DEL IF DEL CUADRADO

                //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                if (Circulo.isSelected()) {
                    Circulo();
                        if(cx<0){
                        cx=25;
                        Circulo();
                        }
                        else{
                        Circulo();
                        }

                        if(cx>660){
                        cx=640;
                        
                        Circulo();
                        }
                        else{
                        Circulo();
                        }
                        
                        if(cy>481){
                        cy=460;
                        Circulo();
                        }
                        else{
                        Circulo();
                        }
                        
                        if(cy<0){
                        cy=25;
                        Circulo();
                        }
                        else{
                        Circulo();
                        }
                
                    
                    
                    ///INICIO DE AVANCE HACIA DERECHA EN EJE X
                    if ((y >= cy - 25 && y <= cy + 25) && (x >= cx - 70 && x <= cx -25)) {
                            cx = cx + 15;
                            Circulo();
                    }
                    ///FIN DE AVANCE EN EJE X
//-----------------------------------------------------------------------------------------------------------------------



                    ///INICIO DE AVANCE HACIA IZQUIERDA EN EJE X
                    if ((y >= cy - 25 && y <= cy + 25) && (x >= cx + 25 && x <= cx +70)) {
                            cx = cx - 15;
                            Circulo();
                    }
                    ///FIN DE AVANCE EN EJE X
                    
                    
//-----------------------------------------------------------------------------------------------------------------------
                    ///INICIO DE AVANCE EN EJE Y VERTICAL (ABAJO)
                    if ((x >= cx - 25 && x <= cx + 25) && (y >= cy - 50 && y <= cy -25)) {

                            cy = cy + 15;
                            Circulo();
                        
                    }
                    ///FIN DEL AVANCE EN EJE Y
//-----------------------------------------------------------------------------------------------------------------------

///INICIO DE AVANCE EN EJE Y VERTICAL (ARRIBA)

                    if ((x >= cx - 25 && x <= cx +25) && (y >= cy + 25 && y <= cy +60)) {

                            cy = cy - 15;
                            Circulo();
                        
                    }
                    ///FIN DEL AVANCE EN EJE Y
//-----------------------------------------------------------------------------------------------------------------------



                    //INICIO DE LA DIAGONAL SUROESTE
                    if ((x >= cx - 70 && x <= cx - 30) && (y >= cy - 50 && y <= cy -25)) {
                    
                    cx = cx + 15;
                    cy = cy + 15;
                    Circulo();
      
                    }
                    //FIN DE LA DIAGONAL SUROESTE
                    
//-----------------------------------------------------------------------------------------------------------------------

               //INICIO DE LA DIAGONAL NORESTE
                    if ((x >= cx - 70 && x <= cx - 30) && (y >= cy +25 && y <= cy +50)) {
                    
                    cx = cx + 15;
                    cy = cy - 15;
                    Circulo();
      
                    }
                    //FIN DE LA DIAGONAL NORESTE
                    
//-----------------------------------------------------------------------------------------------------------------------

               //INICIO DE LA DIAGONAL NOROESTE
                    if ((x >= cx +25 && x <= cx +70) && (y >= cy +25 && y <= cy +50)) {
                    
                    cx = cx - 15;
                    cy = cy - 15;
                    Circulo();
      
                    }
                    //FIN DE LA DIAGONAL NOROESTE
                    
//-----------------------------------------------------------------------------------------------------------------------


               //INICIO DE LA DIAGONAL NORESTE
                    if ((x >= cx +25 && x <= cx +70) && (y >= cy -50 && y <= cy -25)) {
                    
                    cx = cx - 15;
                    cy = cy + 15;
                    Circulo();
      
                    }
                    //FIN DE LA DIAGONAL NORESTE
                    
//-----------------------------------------------------------------------------------------------------------------------

                    




                }
                //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                if(Ambos.isSelected()){
                       if(cx<0){
                        cx=25;
                        Circulo();
                        }
                        else{
                        Circulo();
                        }

                        if(cx>660){
                        cx=640;
                        
                        Circulo();
                        }
                        else{
                        Circulo();
                        }
                        
                        if(cy>481){
                        cy=460;
                        Circulo();
                        }
                        else{
                        Circulo();
                        }
                        
                        if(cy<0){
                        cy=25;
                        Circulo();
                        }
                        else{
                        Circulo();
                        }
                
                    
                    
                    ///INICIO DE AVANCE HACIA DERECHA EN EJE X
                    if ((y >= cy - 25 && y <= cy + 25) && (x >= cx - 120 && x <= cx -25)) {
                            cx = cx + 15;
                            Circulo();
                    }
                    ///FIN DE AVANCE EN EJE X
//-----------------------------------------------------------------------------------------------------------------------



                    ///INICIO DE AVANCE HACIA IZQUIERDA EN EJE X
                    if ((y >= cy - 25 && y <= cy + 25) && (x >= cx + 25 && x <= cx +120)) {
                            cx = cx - 15;
                            Circulo();
                    }
                    ///FIN DE AVANCE EN EJE X
                    
                    
//-----------------------------------------------------------------------------------------------------------------------
                    ///INICIO DE AVANCE EN EJE Y VERTICAL (ABAJO)
                    if ((x >= cx - 25 && x <= cx + 25) && (y >= cy - 120 && y <= cy -25)) {

                            cy = cy + 15;
                            Circulo();
                        
                    }
                    ///FIN DEL AVANCE EN EJE Y
//-----------------------------------------------------------------------------------------------------------------------

///INICIO DE AVANCE EN EJE Y VERTICAL (ARRIBA)

                    if ((x >= cx - 25 && x <= cx +25) && (y >= cy + 25 && y <= cy + 120)) {

                            cy = cy - 15;
                            Circulo();
                        
                    }
                    ///FIN DEL AVANCE EN EJE Y
//-----------------------------------------------------------------------------------------------------------------------



                    //INICIO DE LA DIAGONAL SUROESTE
                    if ((x >= cx - 120 && x <= cx - 30) && (y >= cy - 120 && y <= cy -25)) {
                    
                    cx = cx + 15;
                    cy = cy + 15;
                    Circulo();
      
                    }
                    //FIN DE LA DIAGONAL SUROESTE
                    
//-----------------------------------------------------------------------------------------------------------------------

               //INICIO DE LA DIAGONAL NORESTE
                    if ((x >= cx - 120 && x <= cx - 30) && (y >= cy +25 && y <= cy +120)) {
                    
                    cx = cx + 15;
                    cy = cy - 15;
                    Circulo();
      
                    }
                    //FIN DE LA DIAGONAL NORESTE
                    
//-----------------------------------------------------------------------------------------------------------------------

               //INICIO DE LA DIAGONAL NOROESTE
                    if ((x >= cx +25 && x <= cx + 120) && (y >= cy +25 && y <= cy +120)) {
                    
                    cx = cx - 15;
                    cy = cy - 15;
                    Circulo();
      
                    }
                    //FIN DE LA DIAGONAL NOROESTE
                    
//-----------------------------------------------------------------------------------------------------------------------


               //INICIO DE LA DIAGONAL NORESTE
                    if ((x >= cx +25 && x <= cx +120) && (y >= cy -120 && y <= cy -25)) {
                    
                    cx = cx - 15;
                    cy = cy + 15;
                    Circulo();
      
                    }
                    
                    
                    
                    ///////////////////////////////////////
                                        if (x < 0) {
                        x = 0;
                        Cuadro();
                    } else {

                        Cuadro();
                    }

                    ///
                    if (y < 0) {
                        y = 0;
                        Cuadro();
                    } else {

                        Cuadro();
                    }

                    ///
                    if (x > 631) {
                        x = 631;
                        Cuadro();
                    } else {

                        Cuadro();
                    }

                    ///
                    if (y > 468) {
                        y = 468;
                        Cuadro();
                    } else {

                        Cuadro();
                    }

                    while (x < m) {
                        m--;
                        m = x;
                        Cuadro();

                    }

                    while (x > m) {
                        m++;
                        m = x;
                        Cuadro();

                    }

                    while (y < n) {
                        n--;
                        n = y;
                        Cuadro();

                    }

                    while (y > n) {
                        n++;
                        n = y;
                        Cuadro();

                    }
                    
                    
                    
                    
                
                    
                    
                }
                //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                
            }
        });
    }

    void Cuadro() {
        //Background.update(cuadros);
        cuadros.drawRect(m, n, 100, 100);

    }

    void Circulo() {

        Background.update(dibujo);
        dibujo.drawOval(cx, cy, 100, 100);

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Background = new javax.swing.JPanel();
        Cuadrado = new javax.swing.JRadioButton();
        Circulo = new javax.swing.JRadioButton();
        Ambos = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(0, 153, 255));
        Background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BackgroundMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Cuadrado.setBackground(new java.awt.Color(248, 248, 248));
        buttonGroup1.add(Cuadrado);
        Cuadrado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Cuadrado.setForeground(new java.awt.Color(255, 255, 255));
        Cuadrado.setText("Cuadrado");
        Cuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadradoActionPerformed(evt);
            }
        });

        Circulo.setBackground(new java.awt.Color(248, 248, 248));
        buttonGroup1.add(Circulo);
        Circulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Circulo.setForeground(new java.awt.Color(255, 255, 255));
        Circulo.setText("Circulo");

        Ambos.setBackground(new java.awt.Color(248, 248, 248));
        buttonGroup1.add(Ambos);
        Ambos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Ambos.setForeground(new java.awt.Color(255, 255, 255));
        Ambos.setText("Ambos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cuadrado)
                    .addComponent(Circulo)
                    .addComponent(Ambos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(Cuadrado)
                .addGap(42, 42, 42)
                .addComponent(Circulo)
                .addGap(46, 46, 46)
                .addComponent(Ambos)
                .addGap(28, 330, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackgroundMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseMoved


    }//GEN-LAST:event_BackgroundMouseMoved

    private void CuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadradoActionPerformed
        if (Cuadrado.isSelected()) {

            Cuadro();
        }
    }//GEN-LAST:event_CuadradoActionPerformed

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
            java.util.logging.Logger.getLogger(Ipunter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ipunter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ipunter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ipunter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ipunter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Ambos;
    private javax.swing.JPanel Background;
    private javax.swing.JRadioButton Circulo;
    private javax.swing.JRadioButton Cuadrado;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
