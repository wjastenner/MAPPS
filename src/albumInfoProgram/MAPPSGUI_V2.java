package albumInfoProgram;

import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

@SuppressWarnings("unchecked")

public class MAPPSGUI_V2 extends javax.swing.JFrame {

    AlbumCollection ac;
    HashMap<String, String> playlists = new HashMap<>();
    String albumCoverDirectory;

    public MAPPSGUI_V2() {
        initComponents();
        ac = new AlbumCollection();
        albumCoverDirectory = System.getProperty("user.dir");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        albumDurationLBL = new javax.swing.JLabel();
        albumNameCB = new javax.swing.JComboBox<>();
        albumCoverImgLBL = new javax.swing.JLabel();
        addTrackBTN = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        albumTracksList = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        playlistNameCB = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        playlistTracksList = new javax.swing.JList<>();
        playlistDurationLBL = new javax.swing.JLabel();
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
        Settings = new javax.swing.JMenu();
        albumCoverLocationMI = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MAPPS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 18))); // NOI18N

        albumDurationLBL.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        albumDurationLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        albumDurationLBL.setText("Duration: 00:00:00");
        albumDurationLBL.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        albumNameCB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        albumNameCB.setMaximumSize(new java.awt.Dimension(361, 30));
        albumNameCB.setMinimumSize(new java.awt.Dimension(361, 30));
        albumNameCB.setName(""); // NOI18N
        albumNameCB.setPreferredSize(new java.awt.Dimension(361, 30));
        albumNameCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                albumNameCBItemStateChanged(evt);
            }
        });

        albumCoverImgLBL.setBackground(new java.awt.Color(0, 0, 0));
        albumCoverImgLBL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        albumCoverImgLBL.setPreferredSize(new java.awt.Dimension(300, 300));

        addTrackBTN.setText("Add Track to Playlist");

        jScrollPane5.setPreferredSize(new java.awt.Dimension(200, 132));

        albumTracksList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        albumTracksList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(albumTracksList);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        jButton10.setText("Remove Track from Playlist");

        playlistNameCB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        playlistNameCB.setPreferredSize(new java.awt.Dimension(361, 26));
        playlistNameCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playlistNameCBActionPerformed(evt);
            }
        });

        jScrollPane7.setPreferredSize(new java.awt.Dimension(200, 132));

        playlistTracksList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        playlistTracksList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane7.setViewportView(playlistTracksList);

        playlistDurationLBL.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        playlistDurationLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playlistDurationLBL.setText("Duration: 00:00:00");
        playlistDurationLBL.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(albumNameCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(albumDurationLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addTrackBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(albumCoverImgLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(playlistDurationLBL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(playlistNameCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playlistNameCB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playlistDurationLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(albumNameCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(albumDurationLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addTrackBTN))
                    .addComponent(albumCoverImgLBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
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
        loadPLMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadPLMIActionPerformed(evt);
            }
        });
        loadMenu.add(loadPLMI);

        fileMenu.add(loadMenu);

        saveAsMenu.setMnemonic('o');
        saveAsMenu.setText("Save Playlist As");
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

        Settings.setText("Settings");

        albumCoverLocationMI.setText("Set Album Cover Location");
        albumCoverLocationMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumCoverLocationMIActionPerformed(evt);
            }
        });
        Settings.add(albumCoverLocationMI);

        menuBar.add(Settings);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadAC() {
        String openLocation = System.getProperty("user.dir");
        JFileChooser fc = new JFileChooser(openLocation);
        fc.setFileFilter(new FileNameExtensionFilter("Text files", "txt"));
        fc.setMultiSelectionEnabled(false);
        fc.setAcceptAllFileFilterUsed(false);
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            boolean acValid = ac.read(file);
            if (acValid) {
                displayAlbumNames();
            } else {
                JOptionPane.showMessageDialog(null, "The album collection is not in the correct format.");
            }
            if (!playlists.isEmpty()) {
                displayPlaylistDetails();
            }
        }
    }

    private void displayAlbumNames() {
        albumNameCB.removeAllItems();
        List<Album> albums = ac.getAlbums();
        for (Album album : albums) {
            albumNameCB.addItem(album);
        }
    }

    public void displayAlbumDetails() {
        if (albumNameCB.getItemCount() > 0) {
            int selectedAlbumIndex = albumNameCB.getSelectedIndex();
            Album selectedAlbum = albumNameCB.getItemAt(selectedAlbumIndex);
            DefaultListModel tracksListGUI = new DefaultListModel();
            albumTracksList.setModel(tracksListGUI);
            List<Track> tracks = selectedAlbum.getTracks();
            for (Track track : tracks) {
                tracksListGUI.addElement(track);
            }
            String selectedAlbumTitle = selectedAlbum.getTitle();
            String selectedAlbumTitleUpperCase = selectedAlbumTitle.toUpperCase();
            String selectedAlbumTitleUpperCaseStripped = selectedAlbumTitleUpperCase.replaceAll("[^A-Za-z]+", "");
            File[] albumCovers = new File(albumCoverDirectory).listFiles();
            String path = null;
            for (File file : albumCovers) {
                String fileName = file.getName();
                if (fileName.contains("jpg")) {
                    String[] parts = fileName.split("[_.]+");
                    fileName = parts[1].toUpperCase();
                    if (fileName.equals(selectedAlbumTitleUpperCaseStripped)) {
                        path = file.getAbsolutePath();
                    }
                }
            }
            ImageIcon albumCover = new ImageIcon(path);
            Image albumCoverImg = albumCover.getImage();
            Image albumCoverImgEdit = albumCoverImg.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            albumCoverImgLBL.setHorizontalAlignment(JLabel.CENTER);
            albumCoverImgLBL.setVerticalAlignment(JLabel.CENTER);
            albumCoverImgLBL.setIcon(new ImageIcon(albumCoverImgEdit));

            String albumDuration = selectedAlbum.getDuration().toString();
            albumDurationLBL.setText("Duration: " + albumDuration);
        }
    }

    public void loadPL() {
        String openLocation = System.getProperty("user.dir");
        JFileChooser fc = new JFileChooser(openLocation);
        fc.setFileFilter(new FileNameExtensionFilter("Text files", "txt"));
        fc.setMultiSelectionEnabled(false);
        fc.setAcceptAllFileFilterUsed(false);
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            String path = file.getAbsolutePath();
            String name = file.getName();
            if (ac.toString().isEmpty()) {
                JOptionPane.showMessageDialog(null, "An album collection has not been loaded.\nPlease load an album collection before loading a playlist.");
            } else if (playlists.containsKey(name)) {
                JOptionPane.showMessageDialog(null, "A playlist with this name has already been loaded.");
            } else {
                Playlist playlist = new Playlist(ac);
                boolean playlistValid = playlist.read(file);
                if (playlistValid) {
                    playlists.put(name, path);
                    displayPlaylistNames();
                    displayPlaylistDetails();
                } else {
                    JOptionPane.showMessageDialog(null, "The playlist is not in the correct format.");
                }
            }
        }
    }

    public void displayPlaylistNames() {       
        if (!playlists.isEmpty()) {
            playlistNameCB.removeAllItems();
            for (HashMap.Entry<String, String> playlist : playlists.entrySet()) {
                String playlistName = playlist.getKey();
                String playlistNameEdit = playlistName.substring(0, (playlistName.length() - 4));
                playlistNameCB.addItem(playlistNameEdit);
            }
        }
    }

    private void displayPlaylistDetails() {

        int CBPlaylistIndex = playlistNameCB.getSelectedIndex();
        String CBPlaylist = playlistNameCB.getItemAt(CBPlaylistIndex) + ".txt";

        String playlistDirectory = playlists.get(CBPlaylist);
        File playlistFile = new File(playlistDirectory);

        Playlist playlist = new Playlist(ac);
        boolean playlistValid = playlist.read(playlistFile);

        if (playlistValid) {
            List<PlaylistTrack> tracks = playlist.getTracks();
            DefaultListModel tracksListGUI = new DefaultListModel();
            playlistTracksList.setModel(tracksListGUI);
            for (PlaylistTrack track : tracks) {
                tracksListGUI.addElement(track);
            }
            String playlistDuration = playlist.getDuration().toString();
            playlistDurationLBL.setText("Duration: " + playlistDuration);
        }
    }

    private void renamePlaylist() {

    }

    private void createPlaylist() {

    }

    private void playStopTracks() {

    }


    private void loadACMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadACMIActionPerformed
        loadAC();
    }//GEN-LAST:event_loadACMIActionPerformed

    private void SortByAlbumMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortByAlbumMIActionPerformed
        ac.sort();
        displayAlbumNames();
    }//GEN-LAST:event_SortByAlbumMIActionPerformed

    private void SortByArtistMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortByArtistMIActionPerformed
        ac.sortByAlbum();
        displayAlbumNames();
    }//GEN-LAST:event_SortByArtistMIActionPerformed

    private void albumCoverLocationMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_albumCoverLocationMIActionPerformed

        String openLocation = System.getProperty("user.dir");
        JFileChooser fc = new JFileChooser(openLocation);
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setAcceptAllFileFilterUsed(false);
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            albumCoverDirectory = file.getAbsolutePath();
            displayAlbumDetails();
        }
    }//GEN-LAST:event_albumCoverLocationMIActionPerformed

    private void albumNameCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_albumNameCBItemStateChanged
        displayAlbumDetails();
    }//GEN-LAST:event_albumNameCBItemStateChanged

    private void loadPLMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadPLMIActionPerformed
        loadPL();
    }//GEN-LAST:event_loadPLMIActionPerformed

    private void playlistNameCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playlistNameCBActionPerformed
        displayPlaylistDetails();
    }//GEN-LAST:event_playlistNameCBActionPerformed

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
    private javax.swing.JMenu Settings;
    private javax.swing.JMenuItem SortByAlbumMI;
    private javax.swing.JMenuItem SortByArtistMI;
    private javax.swing.JButton addTrackBTN;
    private javax.swing.JLabel albumCoverImgLBL;
    private javax.swing.JMenuItem albumCoverLocationMI;
    private javax.swing.JLabel albumDurationLBL;
    private javax.swing.JComboBox<Album> albumNameCB;
    private javax.swing.JList<Album> albumTracksList;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu editMenuAC;
    private javax.swing.JMenu editMenuPL;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jButton10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JMenuItem loadACMI;
    private javax.swing.JMenu loadMenu;
    private javax.swing.JMenuItem loadPLMI;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel playlistDurationLBL;
    private javax.swing.JComboBox<String> playlistNameCB;
    private javax.swing.JList<PlaylistTrack> playlistTracksList;
    private javax.swing.JMenuItem saveAsMenu;
    // End of variables declaration//GEN-END:variables

}
