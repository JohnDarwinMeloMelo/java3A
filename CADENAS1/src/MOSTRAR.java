/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MELO
 */
public class MOSTRAR extends javax.swing.JFrame {

    /**
     * Creates new form MOSTRAR
     */
    String n;
    char letra;
    public MOSTRAR() {
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

        jPanel1 = new javax.swing.JPanel();
        nn = new javax.swing.JLabel();
        ingreso = new javax.swing.JTextField();
        español = new javax.swing.JButton();
        ingles = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        mostrar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        informacion = new javax.swing.JPanel();
        mnombre = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        mmayuscula = new javax.swing.JLabel();
        mminusculas = new javax.swing.JLabel();
        nletras = new javax.swing.JLabel();
        inicial = new javax.swing.JLabel();
        tbuscador = new javax.swing.JPanel();
        numeroletra = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        mostrarletra = new javax.swing.JLabel();
        btnmayuscula = new javax.swing.JButton();
        btnminuscula = new javax.swing.JButton();
        tipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MOSTRAR");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));

        nn.setFont(new java.awt.Font("Bauhaus 93", 0, 36)); // NOI18N
        nn.setText("your name :");

        ingreso.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoActionPerformed(evt);
            }
        });

        español.setBackground(new java.awt.Color(204, 0, 204));
        español.setText("ESPAÑOL");
        español.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                españolActionPerformed(evt);
            }
        });

        ingles.setBackground(new java.awt.Color(255, 255, 0));
        ingles.setText("INGLES");
        ingles.setEnabled(false);
        ingles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inglesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(nn, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(español))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingles)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(español)
                        .addComponent(ingles))
                    .addComponent(nn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        mostrar.setBackground(new java.awt.Color(255, 102, 0));
        mostrar.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        mostrar.setText("SHOWER");
        mostrar.setEnabled(false);
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        borrar.setBackground(new java.awt.Color(0, 0, 255));
        borrar.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        borrar.setText("RESET");
        borrar.setEnabled(false);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        informacion.setBackground(new java.awt.Color(51, 51, 255));
        informacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMATION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Bauhaus 93", 0, 24))); // NOI18N

        mnombre.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        mnombre.setForeground(new java.awt.Color(255, 255, 255));
        mnombre.setText("____________");
        mnombre.setToolTipText("");

        c.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        c.setText("YOU NAME IN (MIN) =");
        c.setToolTipText("");

        a.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        a.setText("YOU NAME IS =");
        a.setToolTipText("");

        b.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        b.setText("YOU NAME IN (MAY) =");
        b.setToolTipText("");

        d.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        d.setText("TOTAL CHARACTERS =");
        d.setToolTipText("");

        e.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        e.setText("INITIAL CAPITAL LETTERS =");
        e.setToolTipText("");

        mmayuscula.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        mmayuscula.setForeground(new java.awt.Color(255, 255, 255));
        mmayuscula.setText("____________");
        mmayuscula.setToolTipText("");

        mminusculas.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        mminusculas.setForeground(new java.awt.Color(255, 255, 255));
        mminusculas.setText("____________");
        mminusculas.setToolTipText("");

        nletras.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        nletras.setForeground(new java.awt.Color(255, 255, 255));
        nletras.setText("____________");
        nletras.setToolTipText("");

        inicial.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        inicial.setForeground(new java.awt.Color(255, 255, 255));
        inicial.setText("____________");
        inicial.setToolTipText("");

        tbuscador.setBackground(new java.awt.Color(255, 102, 0));
        tbuscador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LETTER FINDER ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bauhaus 93", 0, 18))); // NOI18N
        tbuscador.setForeground(new java.awt.Color(255, 102, 0));

        btnbuscar.setBackground(new java.awt.Color(204, 0, 204));
        btnbuscar.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        btnbuscar.setText("SEARCH");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        mostrarletra.setFont(new java.awt.Font("Bauhaus 93", 0, 48)); // NOI18N
        mostrarletra.setText("?");

        btnmayuscula.setBackground(new java.awt.Color(0, 255, 51));
        btnmayuscula.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        btnmayuscula.setText("MAY");
        btnmayuscula.setEnabled(false);
        btnmayuscula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmayusculaActionPerformed(evt);
            }
        });

        btnminuscula.setBackground(new java.awt.Color(51, 255, 51));
        btnminuscula.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        btnminuscula.setText("MIN");
        btnminuscula.setEnabled(false);
        btnminuscula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminusculaActionPerformed(evt);
            }
        });

        tipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tipo.setText("TYPE A NUMBER");

        javax.swing.GroupLayout tbuscadorLayout = new javax.swing.GroupLayout(tbuscador);
        tbuscador.setLayout(tbuscadorLayout);
        tbuscadorLayout.setHorizontalGroup(
            tbuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbuscadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tbuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tbuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                        .addComponent(numeroletra, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(mostrarletra, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addGroup(tbuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnminuscula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmayuscula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );
        tbuscadorLayout.setVerticalGroup(
            tbuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbuscadorLayout.createSequentialGroup()
                .addGroup(tbuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tbuscadorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tbuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tbuscadorLayout.createSequentialGroup()
                                .addComponent(btnmayuscula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnminuscula, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tbuscadorLayout.createSequentialGroup()
                                .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numeroletra, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))))
                    .addComponent(mostrarletra, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout informacionLayout = new javax.swing.GroupLayout(informacion);
        informacion.setLayout(informacionLayout);
        informacionLayout.setHorizontalGroup(
            informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionLayout.createSequentialGroup()
                        .addGroup(informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(d, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(e, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nletras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mminusculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionLayout.createSequentialGroup()
                        .addGroup(informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mmayuscula, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                            .addComponent(mnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(informacionLayout.createSequentialGroup()
                        .addComponent(tbuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        informacionLayout.setVerticalGroup(
            informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mmayuscula))
                .addGap(1, 1, 1)
                .addGroup(informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mminusculas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d)
                    .addComponent(nletras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e)
                    .addComponent(inicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        mnombre.getAccessibleContext().setAccessibleName("fff");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(informacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoActionPerformed
        // TODO add your handling code here:
        n = ingreso.getText();
        if(n.equals("")){
            System.out.println("No hay texto");
            mostrar.setEnabled(false);
            borrar.setEnabled(false);
        }else{
            mostrar.setEnabled(true);
            borrar.setEnabled(true);
        }
        
        
        
        
    }//GEN-LAST:event_ingresoActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        // TODO add your handling code here:
        String pinicial;
        n=ingreso.getText();
        System.out.println("El nombre es :"+n);
         
        mnombre.setText(n);
        mmayuscula.setText(n.toUpperCase());
        mminusculas.setText(n.toLowerCase());
        nletras.setText(""+n.length());
        pinicial=n;
        char primeraLetra=pinicial.charAt(0);
        String sobra = pinicial.substring(1, pinicial.length());
        pinicial= Character.toUpperCase(primeraLetra) + sobra.toLowerCase();
        //inicial.setText(pinicial);
        inicial.setText(pinicial);
        
    }//GEN-LAST:event_mostrarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        // TODO add your handling code here:
        ingreso.setText(""); //null=>nulo  || ""=>caraxteren espacio 
        n=ingreso.getText();
        if(n.equals("")){
            System.out.println("No hay texto");
            mostrar.setEnabled(false);
            borrar.setEnabled(false);
        }else{
            mostrar.setEnabled(true);
            borrar.setEnabled(true);
        }
        
    }//GEN-LAST:event_borrarActionPerformed

    private void españolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_españolActionPerformed
        // TODO add your handling code here:
        nn.setText("Tu nombre: "); 
        mostrar.setText("MOSTRAR");
        borrar.setText("BORRAR"); 
        informacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Bauhaus 93", 0, 24))); 
        ingles.setEnabled(true);
        español.setEnabled(false);
        a.setText("TU NOMBRE ES="); 
        b.setText("TU NOMBRE EN(MAY)="); 
        c.setText("TU NOMBRE EN(MIN)="); 
        d.setText("TOTAL DE CARACTERES="); 
        e.setText("INICIAL MAYUSCULA=");
        tbuscador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCADOR DE LETRAS ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bauhaus 93", 0, 18)));
        tipo.setText("DIGITE UN NUMERO");
        btnbuscar.setText("BUSCAR");
    }//GEN-LAST:event_españolActionPerformed

    private void inglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inglesActionPerformed
        // TODO add your handling code here:
        nn.setText("Your name: "); 
        mostrar.setText("SHOWER");
        borrar.setText("RESET"); 
        informacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMATION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Bauhaus 93", 0, 24)));
        ingles.setEnabled(false);
        español.setEnabled(true);  
        a.setText("YOU NAME IS="); 
        b.setText("YOU NAME IN(MAY)="); 
        c.setText("YOU NAME IN(MIN)="); 
        d.setText("TOTAL CARACTERS="); 
        e.setText("INITIAL CAPITAL LETTERS=:"); 
        
        tbuscador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LETTER FINDER ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bauhaus 93", 0, 18)));
        tipo.setText("TYPE A NUMBER");
        btnbuscar.setText("SEARCH");
        
        
        
    }//GEN-LAST:event_inglesActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        int nbl;
        nbl = Integer.parseInt(numeroletra.getText());
         //num1= Integer.parseInt(n1.getText());
        letra= n.charAt(nbl-1);
        mostrarletra.setText(""+letra);
        if (Character.isLowerCase(letra)){
            btnmayuscula.setEnabled(true);
            btnminuscula.setEnabled(false);
        }else if (Character.isUpperCase(letra)){
            btnmayuscula.setEnabled(false);
            btnminuscula.setEnabled(true);
        }else {
        
            btnmayuscula.setEnabled(false);
            btnminuscula.setEnabled(false);
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnminusculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminusculaActionPerformed
        // TODO add your handling code here:
        
        mostrarletra.setText(""+Character.toLowerCase(letra));
        btnmayuscula.setEnabled(true);
        btnminuscula.setEnabled(false);
        
    }//GEN-LAST:event_btnminusculaActionPerformed

    private void btnmayusculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmayusculaActionPerformed
        // TODO add your handling code here:
        mostrarletra.setText(""+Character.toUpperCase(letra));
        btnmayuscula.setEnabled(false);
        btnminuscula.setEnabled(true);
        
    }//GEN-LAST:event_btnmayusculaActionPerformed

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
            java.util.logging.Logger.getLogger(MOSTRAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MOSTRAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MOSTRAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MOSTRAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MOSTRAR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JButton borrar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnmayuscula;
    private javax.swing.JButton btnminuscula;
    private javax.swing.JLabel c;
    private javax.swing.JLabel d;
    private javax.swing.JLabel e;
    private javax.swing.JButton español;
    private javax.swing.JPanel informacion;
    private javax.swing.JButton ingles;
    private javax.swing.JTextField ingreso;
    private javax.swing.JLabel inicial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mmayuscula;
    private javax.swing.JLabel mminusculas;
    private javax.swing.JLabel mnombre;
    private javax.swing.JButton mostrar;
    private javax.swing.JLabel mostrarletra;
    private javax.swing.JLabel nletras;
    private javax.swing.JLabel nn;
    private javax.swing.JTextField numeroletra;
    private javax.swing.JPanel tbuscador;
    private javax.swing.JLabel tipo;
    // End of variables declaration//GEN-END:variables
}