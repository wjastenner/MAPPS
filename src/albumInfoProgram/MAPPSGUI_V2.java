package albumInfoProgram;

import java.io.File;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

@SuppressWarnings("unchecked")

public class MAPPSGUI_V2 extends javax.swing.JFrame {

    AlbumCollection ac = new AlbumCollection();

    public MAPPSGUI_V2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        albumDurationLBL = new javax.swing.JLabel();
        albumNameCB = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addTrackBTN = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        albumTracksList = new javax.swing.JList<>();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loadMenu = new javax.swing.JMenu();
        loadACMI = new javax.swing.JMenuItem();
        loadPLMI = new javax.swing.JMenuItem();
        saveAsMenu = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        editMenuAC = new javax.swing.JMenu();
        ACSortMI = new javax.swing.JMenu();
        SortByAlbumMI = new javax.swing.JMenuItem();
        SortByArtistMI = new javax.swing.JMenuItem();
        editMenuPL = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MAPPS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 18))); // NOI18N

        albumDurationLBL.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        albumDurationLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        albumDurationLBL.setText("Duration: 00:00:00");
        albumDurationLBL.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        albumNameCB.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        albumNameCB.setMaximumSize(new java.awt.Dimension(200, 30));
        albumNameCB.setMinimumSize(new java.awt.Dimension(200, 30));
        albumNameCB.setPreferredSize(new java.awt.Dimension(200, 30));
        albumNameCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                albumNameCBItemStateChanged(evt);
            }
        });

        jList6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jList6.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jList6);

        jTextField1.setText("jTextField1");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        addTrackBTN.setText("Add Track to Playlist");

        jButton5.setText("Save");

        jButton10.setText("Remove Track from Playlist");

        jScrollPane5.setPreferredSize(new java.awt.Dimension(200, 132));

        albumTracksList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        albumTracksList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(albumTracksList);

        jButton6.setText("Clear");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(albumDurationLBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addTrackBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(albumNameCB, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6)
                    .addComponent(jTextField1)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton5)
                                    .addComponent(jButton6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(albumNameCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(albumDurationLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addTrackBTN)
                            .addComponent(jButton10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        loadMenu.setText("Load");

        loadACMI.setText("Album Collection");
        loadACMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadACMIActionPerformed(evt);
            }
        });
        loadMenu.add(loadACMI);

        loadPLMI.setText("Playlist");
        loadMenu.add(loadPLMI);

        fileMenu.add(loadMenu);

        saveAsMenu.setMnemonic('o');
        saveAsMenu.setText("Save As");
        fileMenu.add(saveAsMenu);

        menuBar.add(fileMenu);

        editMenu.setText("Edit");

        editMenuAC.setText("Album Collection");

        ACSortMI.setText("Sort");

        SortByAlbumMI.setText("By Artist Name");
        SortByAlbumMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortByAlbumMIActionPerformed(evt);
            }
        });
        ACSortMI.add(SortByAlbumMI);

        SortByArtistMI.setText("By Album Title");
        SortByArtistMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortByArtistMIActionPerformed(evt);
            }
        });
        ACSortMI.add(SortByArtistMI);

        editMenuAC.add(ACSortMI);

        editMenu.add(editMenuAC);

        editMenuPL.setText("Playlist");
        editMenu.add(editMenuPL);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addToAlbumNameCB() {
        albumNameCB.removeAllItems();
        List<Album> albums = ac.getAlbums();
        for (Album album : albums) {
            albumNameCB.addItem(album);
        }
    }

    private void albumNameCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_albumNameCBItemStateChanged
        if (albumNameCB.getItemCount() > 0) {
            int selectedAlbumIndex = albumNameCB.getSelectedIndex();
            Album selectedAlbum = albumNameCB.getItemAt(selectedAlbumIndex);
            DefaultListModel tracksListGUI = new DefaultListModel();
            albumTracksList.setModel(tracksListGUI);
            List<Track> tracks = selectedAlbum.getTracks();
            for (Track track : tracks) {
                tracksListGUI.addElement(track);
            }
            albumDurationLBL.setText("Duration: " + selectedAlbum.getDurationStr());
        }
    }//GEN-LAST:event_albumNameCBItemStateChanged

    private void loadACMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadACMIActionPerformed
        String openLocation = System.getProperty("user.dir");
        JFileChooser fc = new JFileChooser(openLocation);
        fc.setFileFilter(new FileNameExtensionFilter("Text files", "txt"));
        fc.setAcceptAllFileFilterUsed(false);
        fc.showOpenDialog(this);
        File file = fc.getSelectedFile();
        ac.read(file);
        addToAlbumNameCB();
    }//GEN-LAST:event_loadACMIActionPerformed

    private void SortByAlbumMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortByAlbumMIActionPerformed
        ac.sort();
        addToAlbumNameCB();
    }//GEN-LAST:event_SortByAlbumMIActionPerformed

    private void SortByArtistMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortByArtistMIActionPerformed
        ac.sortByAlbum();
        addToAlbumNameCB();
    }//GEN-LAST:event_SortByArtistMIActionPerformed

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
            java.util.logging.Logger.getLogger(MAPPSGUI_V2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAPPSGUI_V2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAPPSGUI_V2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAPPSGUI_V2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAPPSGUI_V2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ACSortMI;
    private javax.swing.JMenuItem SortByAlbumMI;
    private javax.swing.JMenuItem SortByArtistMI;
    private javax.swing.JButton addTrackBTN;
    private javax.swing.JLabel albumDurationLBL;
    private javax.swing.JComboBox<Album> albumNameCB;
    private javax.swing.JList<Album> albumTracksList;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu editMenuAC;
    private javax.swing.JMenu editMenuPL;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem loadACMI;
    private javax.swing.JMenu loadMenu;
    private javax.swing.JMenuItem loadPLMI;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem saveAsMenu;
    // End of variables declaration//GEN-END:variables

}
