package albumInfoProgram;

import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
    HashMap<String, String> playlists;
    String albumCoverDirectory;
    Playlist playlist;

    public MAPPSGUI_V2() {
        initComponents();
        ac = new AlbumCollection();
        playlists = new HashMap<>();
        albumCoverDirectory = System.getProperty("user.dir") + File.separator + "data" + File.separator + "images";
        playlist = new Playlist(ac);
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
        removeTrackBTN = new javax.swing.JButton();
        playlistNameCB = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        playlistTracksList = new javax.swing.JList<>();
        playlistDurationLBL = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loadMenu = new javax.swing.JMenu();
        loadACMI = new javax.swing.JMenuItem();
        loadPLMI = new javax.swing.JMenuItem();
        savePLMI = new javax.swing.JMenuItem();
        savePLAsMI = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        editMenuAC = new javax.swing.JMenu();
        ACSortMI = new javax.swing.JMenu();
        SortByAlbumMI = new javax.swing.JMenuItem();
        SortByArtistMI = new javax.swing.JMenuItem();
        editMenuPL = new javax.swing.JMenu();
        renamePLMI = new javax.swing.JMenuItem();
        settings = new javax.swing.JMenu();
        albumCoverLocationMI = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MAPPS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 18))); // NOI18N

        albumDurationLBL.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        albumDurationLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        albumDurationLBL.setText("Duration: 00:00:00");
        albumDurationLBL.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        albumNameCB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        albumNameCB.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        albumNameCB.setEnabled(false);
        albumNameCB.setMaximumSize(new java.awt.Dimension(361, 30));
        albumNameCB.setMinimumSize(new java.awt.Dimension(361, 30));
        albumNameCB.setName(""); // NOI18N
        albumNameCB.setPreferredSize(new java.awt.Dimension(361, 30));
        albumNameCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumNameCBActionPerformed(evt);
            }
        });

        albumCoverImgLBL.setBackground(new java.awt.Color(0, 0, 0));
        albumCoverImgLBL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        albumCoverImgLBL.setPreferredSize(new java.awt.Dimension(300, 300));

        addTrackBTN.setText("Add Track to Playlist");
        addTrackBTN.setEnabled(false);
        addTrackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTrackBTNActionPerformed(evt);
            }
        });

        jScrollPane5.setPreferredSize(new java.awt.Dimension(200, 132));

        albumTracksList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        albumTracksList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                albumTracksListMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(albumTracksList);

        jPanel2.setBackground(new java.awt.Color(102, 0, 255));

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

        removeTrackBTN.setText("Remove Track from Playlist");
        removeTrackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTrackBTNActionPerformed(evt);
            }
        });

        playlistNameCB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        playlistNameCB.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        playlistNameCB.setEnabled(false);
        playlistNameCB.setPreferredSize(new java.awt.Dimension(361, 26));
        playlistNameCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playlistNameCBActionPerformed(evt);
            }
        });

        jScrollPane7.setPreferredSize(new java.awt.Dimension(200, 132));

        playlistTracksList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        playlistTracksList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playlistTracksListMousePressed(evt);
            }
        });
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
                            .addComponent(playlistNameCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeTrackBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
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
                        .addComponent(removeTrackBTN))
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

        menuBar.setBackground(new java.awt.Color(0, 0, 0));

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
        loadPLMI.setEnabled(false);
        loadPLMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadPLMIActionPerformed(evt);
            }
        });
        loadMenu.add(loadPLMI);

        fileMenu.add(loadMenu);

        savePLMI.setText("Save Playlist");
        savePLMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePLMIActionPerformed(evt);
            }
        });
        fileMenu.add(savePLMI);

        savePLAsMI.setMnemonic('o');
        savePLAsMI.setText("Save Playlist As");
        fileMenu.add(savePLAsMI);

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

        renamePLMI.setText("Rename");
        renamePLMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renamePLMIActionPerformed(evt);
            }
        });
        editMenuPL.add(renamePLMI);

        editMenu.add(editMenuPL);

        menuBar.add(editMenu);

        settings.setText("Settings");

        albumCoverLocationMI.setText("Set Album Cover Location");
        albumCoverLocationMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumCoverLocationMIActionPerformed(evt);
            }
        });
        settings.add(albumCoverLocationMI);

        menuBar.add(settings);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                loadPLMI.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "The album collection is not in the correct format.");
            }
            if (!playlists.isEmpty()) {
                displayPlaylistDetails();
            }
        }
    }

    private void displayAlbumNames() {
        albumNameCB.setEnabled(true);
        albumNameCB.removeAllItems();
        List<Album> albums = ac.getAlbums();
        for (Album album : albums) {
            albumNameCB.addItem(album);
        }
    }

    public void displayAlbumDetails() {
        if (albumNameCB.getItemCount() > 0) {

            Album selectedAlbum = (Album) albumNameCB.getSelectedItem();

            DefaultListModel tracksListGUI = new DefaultListModel();
            albumTracksList.setModel(tracksListGUI);
            List<Track> tracks = selectedAlbum.getTracks();
            for (Track track : tracks) {
                tracksListGUI.addElement(track);
            }

            String albumDuration = selectedAlbum.getDuration().toString();
            albumDurationLBL.setText("Duration: " + albumDuration);

            String selectedAlbumTitle = selectedAlbum.getTitle().toUpperCase();

            if (selectedAlbumTitle.startsWith("THE")) {
                selectedAlbumTitle = selectedAlbumTitle.substring(3, selectedAlbumTitle.length());
            }

            selectedAlbumTitle = selectedAlbumTitle.replaceAll("[^A-Za-z]+", "");
            File[] albumCovers = new File(albumCoverDirectory).listFiles();

            HashMap<String, String> albumCoverMatches = new HashMap<>();
            ArrayList<String> albumCoverMatchesAL = new ArrayList<>();

            for (File albumCover : albumCovers) {
                String albumCoverName = albumCover.getName().toUpperCase();
                if (albumCoverName.endsWith(".JPG")) {
                    String[] albumCoverNameParts = albumCoverName.split("[_.]");
                    if (albumCoverNameParts[1].equals(selectedAlbumTitle)) {
                        albumCoverMatches.put(albumCover.getName(), albumCover.getAbsolutePath());
                        albumCoverMatchesAL.add(albumCover.getName());
                    }
                }
            }

            String selectedAlbumArtist = selectedAlbum.getArtist();
            String selectedAlbumArtistEdit = "";
            if (selectedAlbumArtist.startsWith("The")) {
                selectedAlbumArtist = selectedAlbumArtist.substring(4, selectedAlbumArtist.length());
            }
            String[] words = selectedAlbumArtist.split(" ");
            if (words.length == 1) {
                selectedAlbumArtistEdit = words[0];
            } else {
                selectedAlbumArtist = "";
                for (String word : words) {
                    if (!word.contains("and")) {
                        selectedAlbumArtist += word;
                    }
                }
                for (char ch : selectedAlbumArtist.toCharArray()) {
                    if (Character.isUpperCase(ch)) {
                        selectedAlbumArtistEdit += ch;
                    }
                }
            }

            String albumCoverImgPath = "";

            int matches = albumCoverMatches.size();

            if (matches == 1) {
                albumCoverImgPath = albumCoverMatches.get(albumCoverMatchesAL.get(0));
            } else if (matches > 1) {
                for (File albumCover : albumCovers) {
                    String[] albumCoverNameParts = albumCover.getName().toUpperCase().split("_");
                    if (albumCoverNameParts[0].equals(selectedAlbumArtistEdit)) {
                        albumCoverImgPath = albumCover.getAbsolutePath();
                    }
                }
            } else if (matches == 0) {
                System.out.println("No album cover found");
                albumCoverImgPath = System.getProperty("user.dir") + File.separator + "unknown_album.jpg";
            }

            System.out.println(selectedAlbumTitle);

            System.out.println(albumCoverImgPath);

            ImageIcon albumCover = new ImageIcon(albumCoverImgPath);
            Image albumCoverImg = albumCover.getImage();
            Image albumCoverImgEdit = albumCoverImg.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            albumCoverImgLBL.setHorizontalAlignment(JLabel.CENTER);
            albumCoverImgLBL.setVerticalAlignment(JLabel.CENTER);
            albumCoverImgLBL.setIcon(new ImageIcon(albumCoverImgEdit));
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
                System.out.println(file);
                int playlistValid = playlist.read(file);
                if(playlistValid == 1){
                    JOptionPane.showMessageDialog(null, "The playlist contains tracks that can not be found in the album collection.\nThese tracks can not be displayed and will be lost if changes to the playlist are made.");
                }                              
                if (playlistValid == 0 || playlistValid == 1) {
                    playlistNameCB.setEnabled(true);
                    addTrackBTN.setEnabled(true);
                    addPlaylistName(name, path);
                } else {
                    JOptionPane.showMessageDialog(null, "The playlist is not in the correct format.");
                }
            }
        }
    }

    public void addPlaylistName(String playlistName, String playlistPath) {
        playlists.put(playlistName, playlistPath);
        playlistName = playlistName.substring(0, (playlistName.length() - 4));
        playlistNameCB.addItem(playlistName);
        playlistNameCB.setSelectedItem(playlistName);
    }

    private void displayPlaylistDetails() {
        List<PlaylistTrack> tracks = playlist.getTracks();
        DefaultListModel tracksListGUI = new DefaultListModel();
        playlistTracksList.setModel(tracksListGUI);
        for (PlaylistTrack track : tracks) {
            tracksListGUI.addElement(track);
        }
        String playlistDuration = playlist.getDuration().toString();
        playlistDurationLBL.setText("Duration: " + playlistDuration);
    }

    private void renamePlaylist() {

        String newPL = JOptionPane.showInputDialog(null, "What would you like to rename the playlist?");

        if (newPL != null && !newPL.isEmpty()) {
            newPL = newPL.replaceAll("[^a-zA-Z0-9-]", "");
            String newPLEdit = newPL + ".txt";
            String oldPL = playlistNameCB.getSelectedItem().toString();
            String oldPLEdit = oldPL + ".txt";
            String oldPlaylistPath = playlists.get(oldPLEdit);
            String newPath = oldPlaylistPath.substring(0, oldPlaylistPath.length() - oldPLEdit.length()) + newPLEdit;
            File oldFile = new File(oldPlaylistPath);
            File newFile = new File(newPath);
            oldFile.renameTo(newFile);
            playlists.put(newPLEdit, newPath);
            playlists.remove(oldPLEdit);
            playlistNameCB.addItem(newPL);
            playlistNameCB.removeItem(oldPL);
            playlistNameCB.setSelectedItem(newPL);

        }
    }

    private void removeTracksPL() {
        int[] trackNumber = playlistTracksList.getSelectedIndices();
        playlist.remove(trackNumber);
        savePlaylist();
        displayPlaylistDetails();
    }

    private void savePlaylist() {
        String selectedPlaylist = playlistNameCB.getSelectedItem() + ".txt";
        String selectedPlaylistPath = playlists.get(selectedPlaylist);
        File selectedPlaylistFile = new File(selectedPlaylistPath);
        FileWriter fw;
        try {
            fw = new FileWriter(selectedPlaylistPath);
            fw.write("");
            fw.append(playlist.toString());
            fw.close();
        } catch (IOException ex) {
        }
    }

    private void addTracksPL() {

        Album album = (Album) albumNameCB.getSelectedItem();

        List<Track> selectedTracks = albumTracksList.getSelectedValuesList();

        ArrayList<PlaylistTrack> playlistTracks = new ArrayList<>();

        for (Track track : selectedTracks) {
            playlistTracks.add(new PlaylistTrack(album, track.getDuration(), track.getName()));
        }

        int duplicates = 0;

        for (PlaylistTrack playlistTrack : playlistTracks) {
            if (playlist.trackExists(playlistTrack)) {
                duplicates++;
            }
        }

        if (duplicates == 1) {
            for (PlaylistTrack playlistTrack : playlistTracks) {
                if (playlist.trackExists(playlistTrack)) {
                    int input = JOptionPane.showConfirmDialog(null, playlistTrack.getName() + " already exists in the playlist. \n Would you like to add it anyway?", "Duplicate track found", JOptionPane.YES_NO_OPTION);
                    if (input == 0) {
                        playlist.add(playlistTrack);
                        savePlaylist();
                    }
                } else {
                    playlist.add(playlistTrack);
                    savePlaylist();
                }
            }
        } else if (duplicates > 1) {
            int input = JOptionPane.showConfirmDialog(null, " Several of the tracks already exist in the playlist \n Would you like to add them anyway? \n \\(Non-duplicates will still be added)", "Duplicate tracks found", JOptionPane.YES_NO_OPTION);
            if (input == 0) {
                for (PlaylistTrack playlistTrack : playlistTracks) {
                    playlist.add(playlistTrack);
                    savePlaylist();
                }
            } else {
                for (PlaylistTrack playlistTrack : playlistTracks) {
                    if (!playlist.trackExists(playlistTrack)) {
                        playlist.add(playlistTrack);
                        savePlaylist();
                    }
                }
            }
        } else {
            for (PlaylistTrack playlistTrack : playlistTracks) {
                playlist.add(playlistTrack);
                savePlaylist();
            }
        }

        displayPlaylistDetails();
    }
    
    private void clearPL(){
        
    }
    
    private void removePL(){
        
    }
    
    private void deletePL(){      
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

    private void loadPLMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadPLMIActionPerformed
        loadPL();
    }//GEN-LAST:event_loadPLMIActionPerformed

    private void playlistNameCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playlistNameCBActionPerformed
        String selectedPlaylistName = playlistNameCB.getSelectedItem() + ".txt";
        String selectedPlaylistPath = playlists.get(selectedPlaylistName);
        File playlistFile = new File(selectedPlaylistPath);
        playlist.clear();
        playlist.read(playlistFile);
        displayPlaylistDetails();
    }//GEN-LAST:event_playlistNameCBActionPerformed

    private void albumNameCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_albumNameCBActionPerformed
        displayAlbumDetails();
    }//GEN-LAST:event_albumNameCBActionPerformed

    private void renamePLMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renamePLMIActionPerformed
        renamePlaylist();
    }//GEN-LAST:event_renamePLMIActionPerformed

    private void albumTracksListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_albumTracksListMousePressed
        playlistTracksList.clearSelection();
    }//GEN-LAST:event_albumTracksListMousePressed

    private void playlistTracksListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playlistTracksListMousePressed
        albumTracksList.clearSelection();
    }//GEN-LAST:event_playlistTracksListMousePressed

    private void removeTrackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTrackBTNActionPerformed
        removeTracksPL();
    }//GEN-LAST:event_removeTrackBTNActionPerformed

    private void savePLMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePLMIActionPerformed
        savePlaylist();
    }//GEN-LAST:event_savePLMIActionPerformed

    private void addTrackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTrackBTNActionPerformed
        addTracksPL();
    }//GEN-LAST:event_addTrackBTNActionPerformed

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
    private javax.swing.JLabel albumCoverImgLBL;
    private javax.swing.JMenuItem albumCoverLocationMI;
    private javax.swing.JLabel albumDurationLBL;
    private javax.swing.JComboBox<Album> albumNameCB;
    private javax.swing.JList<Track> albumTracksList;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu editMenuAC;
    private javax.swing.JMenu editMenuPL;
    private javax.swing.JMenu fileMenu;
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
    private javax.swing.JButton removeTrackBTN;
    private javax.swing.JMenuItem renamePLMI;
    private javax.swing.JMenuItem savePLAsMI;
    private javax.swing.JMenuItem savePLMI;
    private javax.swing.JMenu settings;
    // End of variables declaration//GEN-END:variables

}
