package GUI;

import java.awt.Color;
import threads.nodoBase;
import java.applet.*;
import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame 
{
    private int speed = 2500, cantidad_nodos = 1, i, state = 0;
    private String aux_string;
    private nodoBase Base;
    private boolean andando = false;
    AudioClip sonido;
        
    public GUI() 
    {
        modelo = new DefaultTableModel();
        
        initComponents();
        
        botonPause.setEnabled(false);
        botonRestart.setEnabled(false);
        Gif.setVisible(false);
        sped1.setBackground(Color.red);
        jLabel1.setVisible(false);
        
        this.LATABLA.setModel(modelo);
        
        modelo.addColumn("Mensaje");
        modelo.addColumn("Nodo");
        modelo.addColumn("Tiempo");
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        analytics = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        LATABLA = new javax.swing.JTable();
        txtEmulator = new javax.swing.JTextField();
        Gif = new javax.swing.JLabel();
        botonStart = new javax.swing.JButton();
        botonPause = new javax.swing.JButton();
        botonRestart = new javax.swing.JButton();
        botonClose = new javax.swing.JButton();
        botonShowAnalytics = new javax.swing.JButton();
        comboSecundaryNodes = new javax.swing.JComboBox<>();
        txtOptions = new javax.swing.JTextField();
        comboSpeed = new javax.swing.JComboBox<>();
        txtRecords = new javax.swing.JTextField();
        node4 = new javax.swing.JButton();
        node3 = new javax.swing.JButton();
        node2 = new javax.swing.JButton();
        node5 = new javax.swing.JButton();
        node1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtMasterNode1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textMostrarTexto = new javax.swing.JTextArea();
        jLabelFondo = new javax.swing.JLabel();
        jLabelFondo1 = new javax.swing.JLabel();
        jLabelFondo3 = new javax.swing.JLabel();
        txtMasterNode = new javax.swing.JLabel();
        jLabelFondo6 = new javax.swing.JLabel();
        jLabelFondo7 = new javax.swing.JLabel();
        sped1 = new javax.swing.JPanel();
        sped2 = new javax.swing.JPanel();
        sped3 = new javax.swing.JPanel();
        sped4 = new javax.swing.JPanel();
        jLabelFondo4 = new javax.swing.JLabel();
        jLabelFondo5 = new javax.swing.JLabel();

        analytics.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                analyticsWindowClosing(evt);
            }
        });

        LATABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(LATABLA);

        javax.swing.GroupLayout analyticsLayout = new javax.swing.GroupLayout(analytics.getContentPane());
        analytics.getContentPane().setLayout(analyticsLayout);
        analyticsLayout.setHorizontalGroup(
            analyticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(analyticsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        analyticsLayout.setVerticalGroup(
            analyticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(analyticsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmulator.setEditable(false);
        txtEmulator.setBackground(new java.awt.Color(255, 255, 255));
        txtEmulator.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtEmulator.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmulator.setText("Emulator");
        getContentPane().add(txtEmulator, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 220, -1));

        Gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/isaac-dance.gif"))); // NOI18N
        getContentPane().add(Gif, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 120, 110));

        botonStart.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        botonStart.setText("Start");
        botonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonStartActionPerformed(evt);
            }
        });
        getContentPane().add(botonStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, -1));

        botonPause.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        botonPause.setText("Pause");
        botonPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPauseActionPerformed(evt);
            }
        });
        getContentPane().add(botonPause, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 220, -1));

        botonRestart.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        botonRestart.setText("Restart");
        botonRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestartActionPerformed(evt);
            }
        });
        getContentPane().add(botonRestart, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 220, -1));

        botonClose.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        botonClose.setText("Close");
        botonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCloseActionPerformed(evt);
            }
        });
        getContentPane().add(botonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 220, -1));

        botonShowAnalytics.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        botonShowAnalytics.setText("Show Analytics");
        botonShowAnalytics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonShowAnalyticsActionPerformed(evt);
            }
        });
        getContentPane().add(botonShowAnalytics, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 220, -1));

        comboSecundaryNodes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        comboSecundaryNodes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "One", "Two", "Three", "Four", "Five" }));
        comboSecundaryNodes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSecundaryNodesActionPerformed(evt);
            }
        });
        getContentPane().add(comboSecundaryNodes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 219, -1));

        txtOptions.setEditable(false);
        txtOptions.setBackground(new java.awt.Color(255, 255, 255));
        txtOptions.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtOptions.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOptions.setText("Options");
        getContentPane().add(txtOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 219, -1));

        comboSpeed.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        comboSpeed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Very Slow", "Slow", "Fast", "Very Fast" }));
        comboSpeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSpeedActionPerformed(evt);
            }
        });
        getContentPane().add(comboSpeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 219, -1));

        txtRecords.setEditable(false);
        txtRecords.setBackground(new java.awt.Color(255, 255, 255));
        txtRecords.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtRecords.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRecords.setText("Records");
        getContentPane().add(txtRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 220, -1));

        node4.setBackground(new java.awt.Color(153, 153, 153));
        node4.setBorder(null);
        getContentPane().add(node4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 40, 34));

        node3.setBackground(new java.awt.Color(153, 153, 153));
        node3.setBorder(null);
        getContentPane().add(node3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 40, 34));

        node2.setBackground(new java.awt.Color(153, 153, 153));
        node2.setBorder(null);
        getContentPane().add(node2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 40, 34));

        node5.setBackground(new java.awt.Color(153, 153, 153));
        node5.setBorder(null);
        getContentPane().add(node5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 40, 34));

        node1.setBackground(java.awt.Color.green);
        node1.setBorder(null);
        getContentPane().add(node1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 40, 34));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 760, 30));

        txtMasterNode1.setBackground(new java.awt.Color(237, 245, 225));
        txtMasterNode1.setFont(new java.awt.Font("Dialog", 0, 32)); // NOI18N
        txtMasterNode1.setForeground(new java.awt.Color(237, 245, 225));
        txtMasterNode1.setText("Nodos Activos");
        getContentPane().add(txtMasterNode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 213, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 245, 225));
        jLabel1.setText("(...)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Node 1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Node 2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Node 3");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Node 4");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Node 5");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, -1, -1));

        textMostrarTexto.setEditable(false);
        textMostrarTexto.setColumns(20);
        textMostrarTexto.setRows(5);
        jScrollPane1.setViewportView(textMostrarTexto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 300, 150));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/red-color-gradient-background-free-photo.jpg"))); // NOI18N
        jLabelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 300, 110));

        jLabelFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/red-color-gradient-background-free-photo.jpg"))); // NOI18N
        jLabelFondo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabelFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 240, 90));

        jLabelFondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/red-color-gradient-background-free-photo.jpg"))); // NOI18N
        jLabelFondo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabelFondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 17, 240, 210));

        txtMasterNode.setBackground(new java.awt.Color(255, 255, 255));
        txtMasterNode.setFont(new java.awt.Font("Dialog", 0, 32)); // NOI18N
        txtMasterNode.setForeground(new java.awt.Color(237, 245, 225));
        txtMasterNode.setText("Speed");
        getContentPane().add(txtMasterNode, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 100, -1));

        jLabelFondo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/red-color-gradient-background-free-photo.jpg"))); // NOI18N
        jLabelFondo6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabelFondo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 320, 170));

        jLabelFondo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/red-color-gradient-background-free-photo.jpg"))); // NOI18N
        jLabelFondo7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabelFondo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 240, 120));

        sped1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout sped1Layout = new javax.swing.GroupLayout(sped1);
        sped1.setLayout(sped1Layout);
        sped1Layout.setHorizontalGroup(
            sped1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );
        sped1Layout.setVerticalGroup(
            sped1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(sped1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, -1, -1));

        sped2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout sped2Layout = new javax.swing.GroupLayout(sped2);
        sped2.setLayout(sped2Layout);
        sped2Layout.setHorizontalGroup(
            sped2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );
        sped2Layout.setVerticalGroup(
            sped2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(sped2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, -1, -1));

        sped3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout sped3Layout = new javax.swing.GroupLayout(sped3);
        sped3.setLayout(sped3Layout);
        sped3Layout.setHorizontalGroup(
            sped3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );
        sped3Layout.setVerticalGroup(
            sped3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(sped3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, -1, -1));

        sped4.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout sped4Layout = new javax.swing.GroupLayout(sped4);
        sped4.setLayout(sped4Layout);
        sped4Layout.setHorizontalGroup(
            sped4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );
        sped4Layout.setVerticalGroup(
            sped4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(sped4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, -1, -1));

        jLabelFondo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/red-color-gradient-background-free-photo.jpg"))); // NOI18N
        jLabelFondo4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabelFondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 300, 90));

        jLabelFondo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/dfgdfgdfgdfgdfg.png"))); // NOI18N
        jLabelFondo5.setPreferredSize(new java.awt.Dimension(780, 640));
        getContentPane().add(jLabelFondo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 0, 960, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCloseActionPerformed
        jLabel1.setText("Closing...");

        System.exit(WIDTH);
    }//GEN-LAST:event_botonCloseActionPerformed

    private void botonRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestartActionPerformed
        jLabel1.setVisible(true);
        modelo.setRowCount(0);
        Base.DramaticoBorradorIntergalacticoDeArrayListV0_0_999();
        textMostrarTexto.setText("");
        jLabel1.setText("Restarting...");
        comboSpeed.setEnabled(true);
        comboSecundaryNodes.setEnabled(true);
        if(state != 2 && state != 0)
        {
            Base.eliminador_nodos();
            state = 2;
        }
    }//GEN-LAST:event_botonRestartActionPerformed

    private void botonPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPauseActionPerformed
        jLabel1.setVisible(true);
        jLabel1.setText("Pause...");
        
        sonido.stop();
        botonRestart.setEnabled(true);
        botonPause.setEnabled(false);
        botonStart.setEnabled(true);
        Gif.setVisible(false);
        if(state == 3)
        {
            Base.parador_nodos();
            state = 1;
        }
    }//GEN-LAST:event_botonPauseActionPerformed

    private void botonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonStartActionPerformed
        Gif.setVisible(true);
        jLabel1.setVisible(true);

        
        
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/multimedia/isaac music.wav"));
        sonido.play();
        
        
        jLabel1.setText("Running...");
        botonPause.setEnabled(true);
        botonRestart.setEnabled(false);
        comboSpeed.setEnabled(false);
        comboSecundaryNodes.setEnabled(false);
        botonStart.setEnabled(false);
        
        if(state == 0)
        {
            Base = new nodoBase(cantidad_nodos,speed,this);
            
            state = 3;

        }
        else if(state == 1)
        {
            Base.reanudador_nodos();
            state = 3;
        }
        else if(state == 2)
        {
            Base.creador_nodos();
            state = 3;
        }

    }//GEN-LAST:event_botonStartActionPerformed

    private void comboSpeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSpeedActionPerformed
        aux_string = comboSpeed.getSelectedItem().toString();

        if(aux_string.equals("Very Slow"))
        {
            speed = 2500;
            if(state != 0)
            {
                Base.setSpeed(speed);
            }
            sped1.setBackground(Color.red);
            sped2.setBackground(Color.gray);
            sped3.setBackground(Color.gray);
            sped4.setBackground(Color.gray);
        }
        else if(aux_string.equals("Slow"))
        {
            speed = 2000;
            if(state != 0)
            {
                Base.setSpeed(speed);
            }
            sped1.setBackground(Color.orange);
            sped2.setBackground(Color.orange);
            sped3.setBackground(Color.gray);
            sped4.setBackground(Color.gray);
        }
        else if(aux_string.equals("Fast"))
        {
            speed = 1500;
            if(state != 0)
            {
                Base.setSpeed(speed);
            }
            sped1.setBackground(Color.yellow);
            sped2.setBackground(Color.yellow);
            sped3.setBackground(Color.yellow);
            sped4.setBackground(Color.gray);
        }
        else if(aux_string.equals("Very Fast"))
        {
            speed = 1000;
            if(state != 0)
            {
                Base.setSpeed(speed);
            }
            sped1.setBackground(Color.green);
            sped2.setBackground(Color.green);
            sped3.setBackground(Color.green);
            sped4.setBackground(Color.green);
        }
    }//GEN-LAST:event_comboSpeedActionPerformed

    private void comboSecundaryNodesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSecundaryNodesActionPerformed
        aux_string = comboSecundaryNodes.getSelectedItem().toString();

        if(aux_string.equals("One"))
        {
            cantidad_nodos = 1;
            if(state != 0)
            {
                Base.setNumero_nodos(cantidad_nodos);
            }
            node1.setBackground(Color.green);
            node5.setBackground(Color.LIGHT_GRAY);
            node2.setBackground(Color.LIGHT_GRAY);
            node3.setBackground(Color.LIGHT_GRAY);
            node4.setBackground(Color.LIGHT_GRAY);

        }
        else if(aux_string.equals("Two"))
        {
            cantidad_nodos = 2;
            if(state != 0)
            {
                Base.setNumero_nodos(cantidad_nodos);
            }
            node1.setBackground(Color.green);
            node5.setBackground(Color.green);
            node2.setBackground(Color.LIGHT_GRAY);
            node3.setBackground(Color.LIGHT_GRAY);
            node4.setBackground(Color.LIGHT_GRAY);
        }
        else if(aux_string.equals("Three"))
        {
            cantidad_nodos = 3;
            if(state != 0)
            {
                Base.setNumero_nodos(cantidad_nodos);
            }
            node1.setBackground(Color.green);
            node5.setBackground(Color.green);
            node2.setBackground(Color.green);
            node3.setBackground(Color.LIGHT_GRAY);
            node4.setBackground(Color.LIGHT_GRAY);
        }
        else if(aux_string.equals("Four"))
        {
            cantidad_nodos = 4;
            if(state != 0)
            {
                Base.setNumero_nodos(cantidad_nodos);
            }
            node1.setBackground(Color.green);
            node5.setBackground(Color.green);
            node2.setBackground(Color.green);
            node3.setBackground(Color.green);
            node4.setBackground(Color.LIGHT_GRAY);

        }
        else
        {
            cantidad_nodos = 5;
            if(state != 0)
            {
                Base.setNumero_nodos(cantidad_nodos);
            }
            node1.setBackground(Color.green);
            node5.setBackground(Color.green);
            node2.setBackground(Color.green);
            node3.setBackground(Color.green);
            node4.setBackground(Color.green);
        }
    }//GEN-LAST:event_comboSecundaryNodesActionPerformed

    private void botonShowAnalyticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonShowAnalyticsActionPerformed
        
        if(state != 0 && state != 2)
        {
            jLabel1.setVisible(true);
            jLabel1.setText("Pause...");
            
            sonido.stop();
            botonRestart.setEnabled(true);
            botonPause.setEnabled(false);
            botonStart.setEnabled(true);
            Gif.setVisible(false);
            Base.parador_nodos();
            state = 1;
            
            Base.actualizar_tabla();
            analytics.setVisible(true);
            analytics.setSize(420,320);
            analytics.setLocationRelativeTo(null);
            analytics.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_botonShowAnalyticsActionPerformed

    private void analyticsWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_analyticsWindowClosing
            this.setVisible(true);
    }//GEN-LAST:event_analyticsWindowClosing
    public static void main(String[] args) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                new GUI().setVisible(true);
            }
        });
        
    }
    
    public void textMostrarTexto(String msg)
    {
        textMostrarTexto.append(msg+"\n");
    }

    public static DefaultTableModel getModelo() {
        return modelo;
    }
    

    private static DefaultTableModel modelo;     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gif;
    private javax.swing.JTable LATABLA;
    private javax.swing.JDialog analytics;
    private javax.swing.JButton botonClose;
    private javax.swing.JButton botonPause;
    private javax.swing.JButton botonRestart;
    private javax.swing.JButton botonShowAnalytics;
    private javax.swing.JButton botonStart;
    private javax.swing.JComboBox<String> comboSecundaryNodes;
    private javax.swing.JComboBox<String> comboSpeed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFondo1;
    private javax.swing.JLabel jLabelFondo3;
    private javax.swing.JLabel jLabelFondo4;
    private javax.swing.JLabel jLabelFondo5;
    private javax.swing.JLabel jLabelFondo6;
    private javax.swing.JLabel jLabelFondo7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton node1;
    private javax.swing.JButton node2;
    private javax.swing.JButton node3;
    private javax.swing.JButton node4;
    private javax.swing.JButton node5;
    private javax.swing.JPanel sped1;
    private javax.swing.JPanel sped2;
    private javax.swing.JPanel sped3;
    private javax.swing.JPanel sped4;
    private javax.swing.JTextArea textMostrarTexto;
    private javax.swing.JTextField txtEmulator;
    private javax.swing.JLabel txtMasterNode;
    private javax.swing.JLabel txtMasterNode1;
    private javax.swing.JTextField txtOptions;
    private javax.swing.JTextField txtRecords;
    // End of variables declaration//GEN-END:variables
}
