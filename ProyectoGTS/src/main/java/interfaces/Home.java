package interfaces;


public class Home extends javax.swing.JFrame {


    public Home() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fd = new javax.swing.JPanel();
        Ilustracion = new javax.swing.JLabel();
        Ingresar = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Flechas = new javax.swing.JLabel();
        Frase = new javax.swing.JLabel();
        Inicio = new javax.swing.JLabel();
        Monitoreo = new javax.swing.JLabel();
        Recursos = new javax.swing.JLabel();
        sombra = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ilustracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/forma fondo.png"))); // NOI18N
        fd.add(Ilustracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        Ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Boton inicio.png"))); // NOI18N
        fd.add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 40, -1));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Logo.png"))); // NOI18N
        fd.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        Flechas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Flechas.png"))); // NOI18N
        fd.add(Flechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        Frase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Texto.png"))); // NOI18N
        fd.add(Frase, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        Inicio.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        Inicio.setForeground(new java.awt.Color(255, 255, 255));
        Inicio.setText("Inicio");
        fd.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        Monitoreo.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        Monitoreo.setForeground(new java.awt.Color(255, 255, 255));
        Monitoreo.setText("Monitoreo de Salud Mental");
        fd.add(Monitoreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        Recursos.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        Recursos.setForeground(new java.awt.Color(255, 255, 255));
        Recursos.setText(" Recursos y Apoyo");
        fd.add(Recursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        sombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/cenefa.png"))); // NOI18N
        fd.add(sombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 590, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fondo_1.jpg"))); // NOI18N
        Fondo.setText("Monitoreo de Salud Menta");
        fd.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fd, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Flechas;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Frase;
    private javax.swing.JLabel Ilustracion;
    private javax.swing.JLabel Ingresar;
    private javax.swing.JLabel Inicio;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Monitoreo;
    private javax.swing.JLabel Recursos;
    private javax.swing.JPanel fd;
    private javax.swing.JLabel sombra;
    // End of variables declaration//GEN-END:variables
}
