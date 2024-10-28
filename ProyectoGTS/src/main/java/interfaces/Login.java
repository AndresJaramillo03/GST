package interfaces;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Ingresar = new javax.swing.JLabel();
        Recursos = new javax.swing.JLabel();
        Monitoreo = new javax.swing.JLabel();
        Inicio = new javax.swing.JLabel();
        sombra = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Contraseña = new javax.swing.JLabel();
        NombreIniciarSesion1 = new javax.swing.JLabel();
        CampoUsuario = new javax.swing.JTextField();
        Usuario1 = new javax.swing.JLabel();
        CampoContraseña = new javax.swing.JPasswordField();
        Formas = new javax.swing.JLabel();
        INICIAR = new javax.swing.JButton();
        Recuadro = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Boton inicio.png"))); // NOI18N
        jPanel1.add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 40, -1));

        Recursos.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        Recursos.setForeground(new java.awt.Color(255, 255, 255));
        Recursos.setText(" Recursos y Apoyo");
        jPanel1.add(Recursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, -1, -1));

        Monitoreo.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        Monitoreo.setForeground(new java.awt.Color(255, 255, 255));
        Monitoreo.setText("Monitoreo de Salud Mental");
        jPanel1.add(Monitoreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        Inicio.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        Inicio.setForeground(new java.awt.Color(255, 255, 255));
        Inicio.setText("Inicio");
        jPanel1.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        sombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/cenefa.png"))); // NOI18N
        jPanel1.add(sombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 590, -1));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Logo.png"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        Contraseña.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(0, 119, 212));
        Contraseña.setText("Ingresar Contraseña");
        jPanel1.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 180, 30));

        NombreIniciarSesion1.setFont(new java.awt.Font("Montserrat Medium", 1, 18)); // NOI18N
        NombreIniciarSesion1.setForeground(new java.awt.Color(0, 119, 212));
        NombreIniciarSesion1.setText("Iniciar sesión");
        jPanel1.add(NombreIniciarSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 130, 30));

        CampoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(CampoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 200, 30));

        Usuario1.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        Usuario1.setForeground(new java.awt.Color(0, 119, 212));
        Usuario1.setText("Ingresar Usuario");
        jPanel1.add(Usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 180, 30));

        CampoContraseña.setText("jPasswordField1");
        CampoContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(CampoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 200, 40));

        Formas.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        Formas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/forma inicio de sesion_1.png"))); // NOI18N
        jPanel1.add(Formas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        INICIAR.setBackground(new java.awt.Color(0, 119, 212));
        INICIAR.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        INICIAR.setForeground(new java.awt.Color(255, 255, 255));
        INICIAR.setText("INICIAR");
        jPanel1.add(INICIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 90, -1));

        Recuadro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Recuadro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Recurso 16.png"))); // NOI18N
        jPanel1.add(Recuadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fondo_1.jpg"))); // NOI18N
        Fondo.setText("Monitoreo de Salud Menta");
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoUsuarioActionPerformed
        System.out.println("Escribir usuario");
    }//GEN-LAST:event_CampoUsuarioActionPerformed

    private void CampoContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoContraseñaActionPerformed
        System.out.println("Escribir contraseña");
    }//GEN-LAST:event_CampoContraseñaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CampoContraseña;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Formas;
    private javax.swing.JButton INICIAR;
    private javax.swing.JLabel Ingresar;
    private javax.swing.JLabel Inicio;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Monitoreo;
    private javax.swing.JLabel NombreIniciarSesion1;
    private javax.swing.JLabel Recuadro;
    private javax.swing.JLabel Recursos;
    private javax.swing.JLabel Usuario1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel sombra;
    // End of variables declaration//GEN-END:variables
}
