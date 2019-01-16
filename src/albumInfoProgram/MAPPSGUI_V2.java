package albumInfoProgram;

import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    String mp3AlbumDirectory;
    Playlist playlist;

    public MAPPSGUI_V2() {
        initComponents();
        ac = new AlbumCollection();
        playlists = new HashMap<>();
        albumCoverDirectory = System.getProperty("user.dir") + File.separator + "data" + File.separator + "images";
        mp3AlbumDirectory = System.getProperty("user.dir") + File.separator + "data" + File.separator + "albums";
        playlist = new Playlist(ac);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        albumPanel = new javax.swing.JPanel();
        albumsTitle = new javax.swing.JLabel();
        albumDurationLBL = new javax.swing.JLabel();
        albumNameCB = new javax.swing.JComboBox<>();
        albumCoverImgLBL = new javax.swing.JLabel();
        addTrackBTN = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        albumTracksList = new javax.swing.JList<>();
        PLPanel = new javax.swing.JPanel();
        PLTitle = new javax.swing.JLabel();
        playlistNameCB = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        playlistTracksList = new javax.swing.JList<>();
        playlistDurationLBL = new javax.swing.JLabel();
        removeTrackBTN = new javax.swing.JButton();
        savePLBTN = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loadMenu = new javax.swing.JMenu();
        loadACMI = new javax.swing.JMenuItem();
        loadPLMI = new javax.swing.JMenuItem();
        createPLMI = new javax.swing.JMenuItem();
        savePLMI = new javax.swing.JMenuItem();
        savePLAsMI = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        editMenuAC = new javax.swing.JMenu();
        ACSortMI = new javax.swing.JMenu();
        SortByAlbumMI = new javax.swing.JMenuItem();
        SortByArtistMI = new javax.swing.JMenuItem();
        editMenuPL = new javax.swing.JMenu();
        renamePLMI = new javax.swing.JMenuItem();
        clearPLMI = new javax.swing.JMenuItem();
        removePLMI = new javax.swing.JMenuItem();
        settings = new javax.swing.JMenu();
        albumCoverLocationMI = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MAPPS");
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(204, 204, 204));

        albumPanel.setBackground(new java.awt.Color(51, 51, 51));

        albumsTitle.setBackground(new java.awt.Color(0, 0, 0));
        albumsTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        albumsTitle.setForeground(new java.awt.Color(255, 255, 255));
        albumsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        albumsTitle.setText("ALBUMS");
        albumsTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        albumDurationLBL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        albumDurationLBL.setForeground(new java.awt.Color(255, 255, 255));
        albumDurationLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        albumDurationLBL.setText("TRACKS: 00 | DURATION: 00:00:00");
        albumDurationLBL.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        albumNameCB.setBackground(new java.awt.Color(204, 204, 204));
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
        albumCoverImgLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/albumInfoProgram/unknown_album.jpg"))); // NOI18N

        addTrackBTN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addTrackBTN.setForeground(new java.awt.Color(51, 51, 51));
        addTrackBTN.setText("ADD TRACK TO PLAYLIST");
        addTrackBTN.setEnabled(false);
        addTrackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTrackBTNActionPerformed(evt);
            }
        });

        jScrollPane5.setPreferredSize(new java.awt.Dimension(200, 132));

        albumTracksList.setBackground(new java.awt.Color(204, 204, 204));
        albumTracksList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        albumTracksList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                albumTracksListMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(albumTracksList);

        javax.swing.GroupLayout albumPanelLayout = new javax.swing.GroupLayout(albumPanel);
        albumPanel.setLayout(albumPanelLayout);
        albumPanelLayout.setHorizontalGroup(
            albumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(albumPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(albumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(albumPanelLayout.createSequentialGroup()
                        .addGroup(albumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(albumNameCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(albumDurationLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addTrackBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addComponent(albumCoverImgLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(albumsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        albumPanelLayout.setVerticalGroup(
            albumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(albumPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(albumsTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(albumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(albumCoverImgLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(albumPanelLayout.createSequentialGroup()
                        .addComponent(albumNameCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(albumDurationLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(addTrackBTN)))
                .addGap(14, 14, 14))
        );

        PLPanel.setBackground(new java.awt.Color(51, 51, 51));

        PLTitle.setBackground(new java.awt.Color(70, 50, 70));
        PLTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PLTitle.setForeground(new java.awt.Color(255, 255, 255));
        PLTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PLTitle.setText("PLAYLISTS");
        PLTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        playlistNameCB.setBackground(new java.awt.Color(204, 204, 204));
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

        playlistTracksList.setBackground(new java.awt.Color(204, 204, 204));
        playlistTracksList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        playlistTracksList.setEnabled(false);
        playlistTracksList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playlistTracksListMousePressed(evt);
            }
        });
        jScrollPane7.setViewportView(playlistTracksList);

        playlistDurationLBL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        playlistDurationLBL.setForeground(new java.awt.Color(255, 255, 255));
        playlistDurationLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playlistDurationLBL.setText("TRACKS 00: | DURATION: 00:00:00");
        playlistDurationLBL.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        removeTrackBTN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        removeTrackBTN.setForeground(new java.awt.Color(51, 51, 51));
        removeTrackBTN.setText("REMOVE TRACK");
        removeTrackBTN.setEnabled(false);
        removeTrackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTrackBTNActionPerformed(evt);
            }
        });

        savePLBTN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        savePLBTN.setForeground(new java.awt.Color(51, 51, 51));
        savePLBTN.setText("SAVE");
        savePLBTN.setEnabled(false);
        savePLBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePLBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PLPanelLayout = new javax.swing.GroupLayout(PLPanel);
        PLPanel.setLayout(PLPanelLayout);
        PLPanelLayout.setHorizontalGroup(
            PLPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PLPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PLPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PLPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PLTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playlistDurationLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playlistNameCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PLPanelLayout.createSequentialGroup()
                        .addComponent(removeTrackBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(savePLBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        PLPanelLayout.setVerticalGroup(
            PLPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PLPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PLTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playlistNameCB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playlistDurationLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(PLPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeTrackBTN)
                    .addComponent(savePLBTN))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(albumPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(PLPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(albumPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PLPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        menuBar.setBackground(new java.awt.Color(0, 0, 0));
        menuBar.setToolTipText("");

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

        createPLMI.setText("Create Playlist");
        createPLMI.setEnabled(false);
        createPLMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPLMIActionPerformed(evt);
            }
        });
        fileMenu.add(createPLMI);

        savePLMI.setText("Save Playlist");
        savePLMI.setEnabled(false);
        savePLMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePLMIActionPerformed(evt);
            }
        });
        fileMenu.add(savePLMI);

        savePLAsMI.setText("Save Playlist As");
        savePLAsMI.setEnabled(false);
        fileMenu.add(savePLAsMI);

        menuBar.add(fileMenu);

        editMenu.setText("Edit");

        editMenuAC.setText("Album Collection");
        editMenuAC.setEnabled(false);

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
        editMenuPL.setEnabled(false);

        renamePLMI.setText("Rename");
        renamePLMI.setEnabled(false);
        renamePLMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renamePLMIActionPerformed(evt);
            }
        });
        editMenuPL.add(renamePLMI);

        clearPLMI.setText("Clear");
        clearPLMI.setEnabled(false);
        clearPLMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearPLMIActionPerformed(evt);
            }
        });
        editMenuPL.add(clearPLMI);

        removePLMI.setText("Remove");
        removePLMI.setEnabled(false);
        removePLMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePLMIActionPerformed(evt);
            }
        });
        editMenuPL.add(removePLMI);

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
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int loadAC() {
        int result = 0;
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
                createPLMI.setEnabled(true);
                editMenuAC.setEnabled(true);
                result = 1;
            } else {
                JOptionPane.showMessageDialog(mainPanel, "The album collection is empty or not in the correct format.");
                result = 2;
            }
            if (!playlists.isEmpty()) {
                displayPlaylistDetails();
            }
        }
        return result;
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
            albumDurationLBL.setText("TRACKS: " + selectedAlbum.getSize() + " | DURATION: " + selectedAlbum.getDuration());

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
            }

            if (!albumCoverImgPath.equals("")) {
                ImageIcon albumCover = new ImageIcon(albumCoverImgPath);
                Image albumCoverImg = albumCover.getImage();
                Image albumCoverImgEdit = albumCoverImg.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
                albumCoverImgLBL.setHorizontalAlignment(JLabel.CENTER);
                albumCoverImgLBL.setVerticalAlignment(JLabel.CENTER);
                albumCoverImgLBL.setIcon(new ImageIcon(albumCoverImgEdit));
            } else {
                albumCoverImgLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/albumInfoProgram/unknown_album.jpg")));
            }
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
                JOptionPane.showMessageDialog(mainPanel, "An album collection has not been loaded.\nPlease load an album collection before loading a playlist.");
            } else if (playlists.containsKey(name)) {
                JOptionPane.showMessageDialog(mainPanel, "A playlist with this name has already been loaded.");
            } else {
                int playlistValid = playlist.read(file);
                switch (playlistValid) {
                    case 1:
                        Object[] options = {"Load New Album Collection", "Proceed", "Cancel"};
                        int input = JOptionPane.showOptionDialog(mainPanel,
                                "The playlist contains tracks that can not be found in the album collection.\n"
                                + "These tracks can not be loaded and by proceeding will be removed permanently from the playlist.",
                                "Unable to find tracks",
                                JOptionPane.YES_NO_CANCEL_OPTION,
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                options,
                                options[1]);
                        if (input == JOptionPane.YES_OPTION) {
                            int result = loadAC();
                            if (result == 1) {
                                addPlaylistName(name, path);
                                break;
                            } else {
                                break;
                            }
                        } else if (input == JOptionPane.NO_OPTION) {
                            addPlaylistName(name, path);
                        }
                        break;
                    case 0:
                        addPlaylistName(name, path);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(mainPanel, "The playlist is not in the correct format.");
                        break;
                }
            }
        }
    }

    public void addPlaylistName(String playlistName, String playlistPath) {
        setPLComponents(true);
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

        playlistDurationLBL.setText("TRACKS: " + playlist.getSize() + " | DURATION: " + playlistDuration);

        if (tracksListGUI.size() < 1) {
            removeTrackBTN.setEnabled(false);
            savePLBTN.setEnabled(false);
            clearPLMI.setEnabled(false);
        } else {
            removeTrackBTN.setEnabled(true);
            savePLBTN.setEnabled(true);
            clearPLMI.setEnabled(true);
        }

        if (!playlists.isEmpty()) {
            renamePLMI.setEnabled(true);
            removePLMI.setEnabled(true);
        } else {
            renamePLMI.setEnabled(false);
            removePLMI.setEnabled(true);
        }
    }

    private void setPLComponents(boolean outcome) {

        savePLMI.setEnabled(outcome);
        savePLAsMI.setEnabled(outcome);
        editMenuPL.setEnabled(outcome);
        renamePLMI.setEnabled(outcome);

        playlistNameCB.setEnabled(outcome);
        playlistTracksList.setEnabled(outcome);
        removeTrackBTN.setEnabled(outcome);
        savePLBTN.setEnabled(outcome);
        renamePLMI.setEnabled(outcome);
        addTrackBTN.setEnabled(outcome);
    }

    private void renamePlaylist() {
        String newPL = JOptionPane.showInputDialog(mainPanel, "What would you like to rename the playlist?");
        if (newPL != null && !newPL.isEmpty()) {
            newPL = newPL.replaceAll("[^a-zA-Z0-9- ]", "");
            String newPLEdit = newPL + ".txt";
            String oldPL = playlistNameCB.getSelectedItem().toString();
            String oldPLEdit = oldPL + ".txt";
            String oldPlaylistPath = playlists.get(oldPLEdit);
            String newPath = oldPlaylistPath.substring(0, oldPlaylistPath.length() - oldPLEdit.length()) + newPLEdit;
            if (!oldPlaylistPath.equals(newPath)) {
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
                    int input = JOptionPane.showConfirmDialog(mainPanel, playlistTrack.getName() + " already exists in the playlist.\n"
                            + "Would you like to add it anyway?", "Duplicate track found", JOptionPane.YES_NO_OPTION);
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
            int input = JOptionPane.showConfirmDialog(mainPanel, "Several of the tracks already exist in the playlist.\n"
                    + "Would you like to add them anyway?\n"
                    + "(Non-duplicates will still be added)", "Duplicate tracks found", JOptionPane.YES_NO_OPTION);
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

    private void deletePL() {
    }

    private void createPlaylist() {

        int result = 0;
        String openLocation = System.getProperty("user.dir");
        JFileChooser fc = new JFileChooser(openLocation);
        fc.setFileFilter(new FileNameExtensionFilter("Text files", "txt"));
        fc.setMultiSelectionEnabled(false);
        fc.setAcceptAllFileFilterUsed(false);
        int returnVal = fc.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            String path = file.getAbsolutePath();
            path = path.replaceAll(".txt", "") + ".txt";
            File newFile = new File(path);
            if (file.exists()) {
                int input = JOptionPane.showConfirmDialog(mainPanel, "This playlist already exists. Would you like to overwrite it?",
                        "Duplicate tracks found", JOptionPane.YES_NO_OPTION);
                if (input == JOptionPane.YES_OPTION) {
                    try {
                        FileWriter finalFile = new FileWriter(path);
                        finalFile.close();
                        addPlaylistName(newFile.getName(), newFile.getAbsolutePath());

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            } else {
                try {
                    FileWriter finalFile = new FileWriter(path);
                    finalFile.close();
                    addPlaylistName(newFile.getName(), newFile.getAbsolutePath());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    private void playSelectedTrack() {

        List<Track> tracksSelected = albumTracksList.getSelectedValuesList();
        List<PlaylistTrack> PLTSelected = playlistTracksList.getSelectedValuesList();
        
        String albumFolderDirectory = "";
        String trackNumber;
        Album selectedAlbum;
        String mp3Directory;

        if (tracksSelected.size() == 1) {
            selectedAlbum = (Album) albumNameCB.getSelectedItem();
            Track selectedTrack = albumTracksList.getSelectedValue();
            trackNumber = ac.getTrackNumber(selectedAlbum, selectedTrack.getName());
            albumFolderDirectory = getAlbumFolderDirectory(selectedAlbum);  
            mp3Directory = getTrackDirectory(albumFolderDirectory, selectedAlbum.getArtist(), trackNumber, selectedTrack.getName());
            System.out.println(albumFolderDirectory);
            System.out.println(selectedAlbum.getArtist() + " " + trackNumber + " " + selectedTrack.getName());
            System.out.println(mp3Directory);
            
        } else if (PLTSelected.size() == 1) {
            PlaylistTrack selectedPLT = playlistTracksList.getSelectedValue();
            selectedAlbum = selectedPLT.getAlbum();
            trackNumber = ac.getTrackNumber(selectedAlbum, selectedPLT.getName());
            albumFolderDirectory = getAlbumFolderDirectory(selectedAlbum);          
            mp3Directory = getTrackDirectory(albumFolderDirectory, selectedAlbum.getArtist(), trackNumber, selectedPLT.getName());
            System.out.println(albumFolderDirectory);
            System.out.println(selectedAlbum.getArtist() + " " + trackNumber + " " + selectedPLT.getName());
            System.out.println(mp3Directory);           
        }
    }

    private String getAlbumFolderDirectory(Album album) {
        File[] albumFolders = new File(mp3AlbumDirectory).listFiles();
        String albumFolderDirectory = "";
        String selectedAlbumTitle = album.getTitle();       
        selectedAlbumTitle = selectedAlbumTitle.replaceAll(" ", "").toUpperCase().trim();              
        int matches = 0;      
        List<File> matchedFiles = new ArrayList<>();        
        for (File albumFolder : albumFolders) {
            String albumFolderName = albumFolder.getName().toUpperCase();
            if (albumFolderName.endsWith(selectedAlbumTitle)) {
                matches++;
                matchedFiles.add(albumFolder);
            }
        }       
        if(matchedFiles.size()==1){
            albumFolderDirectory = matchedFiles.get(0).getAbsolutePath();
        }
        else if(matchedFiles.size() > 1){
            String selectedAlbumArtist = album.getArtist().replaceAll("&", "");
            selectedAlbumArtist = selectedAlbumArtist.replace("The ", "").replace(" ", "_");
            for(File matchedFile : matchedFiles){
                if(matchedFile.getName().startsWith(selectedAlbumArtist)){
                    albumFolderDirectory = matchedFile.getAbsolutePath();
                }
            }
        }        
        return albumFolderDirectory;
    }
    
    private String getTrackDirectory(String directory, String artist, String trackNumber, String trackTitle){
        artist = artist.replaceAll("'", "").replaceAll("[& ]", "_");
        trackNumber = "_-_" + trackNumber + "_-_";
        trackTitle = trackTitle.replaceAll(" ", "_") + ".mp3";
        String selectedTrackEdit = artist + trackNumber + trackTitle;
        System.out.println(selectedTrackEdit);        
        File[] mp3Files = new File(directory).listFiles();
        for(File mp3File : mp3Files){
            if(mp3File.getName().equals(selectedTrackEdit)){
                return mp3File.getAbsolutePath();
            }
        }
        return "no match found";
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

    private void albumNameCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_albumNameCBActionPerformed
        displayAlbumDetails();
    }//GEN-LAST:event_albumNameCBActionPerformed

    private void renamePLMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renamePLMIActionPerformed
        renamePlaylist();
    }//GEN-LAST:event_renamePLMIActionPerformed

    private void albumTracksListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_albumTracksListMousePressed
        playlistTracksList.clearSelection();
        playSelectedTrack();
    }//GEN-LAST:event_albumTracksListMousePressed

    private void savePLMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePLMIActionPerformed
        savePlaylist();
    }//GEN-LAST:event_savePLMIActionPerformed

    private void addTrackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTrackBTNActionPerformed
        addTracksPL();
    }//GEN-LAST:event_addTrackBTNActionPerformed

    private void clearPLMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearPLMIActionPerformed
        playlist.clear();
        removeTrackBTN.setEnabled(false);
        savePLBTN.setEnabled(false);
        savePlaylist();
        displayPlaylistDetails();
    }//GEN-LAST:event_clearPLMIActionPerformed

    private void createPLMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPLMIActionPerformed
        createPlaylist();
    }//GEN-LAST:event_createPLMIActionPerformed

    private void removePLMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePLMIActionPerformed

        String selectedPlaylist = (String) playlistNameCB.getSelectedItem();
        String selectedPlaylistEdit = playlistNameCB.getSelectedItem() + ".txt";
        String selectedPlaylistPath = playlists.get(selectedPlaylist);

        playlistNameCB.removeItem(selectedPlaylist);
        playlists.remove(selectedPlaylistEdit);

        if (playlists.isEmpty()) {
            playlist.clear();
            displayPlaylistDetails();
            setPLComponents(false);
        }

    }//GEN-LAST:event_removePLMIActionPerformed

    private void removeTrackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTrackBTNActionPerformed
        removeTracksPL();
    }//GEN-LAST:event_removeTrackBTNActionPerformed

    private void playlistTracksListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playlistTracksListMousePressed
        albumTracksList.clearSelection();
        playSelectedTrack();
    }//GEN-LAST:event_playlistTracksListMousePressed

    private void playlistNameCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playlistNameCBActionPerformed
        if (playlistNameCB.getSelectedItem() != null) {
            String selectedPlaylistName = playlistNameCB.getSelectedItem() + ".txt";
            String selectedPlaylistPath = playlists.get(selectedPlaylistName);
            File playlistFile = new File(selectedPlaylistPath);
            playlist.clear();
            playlist.read(playlistFile);
            displayPlaylistDetails();
        }
    }//GEN-LAST:event_playlistNameCBActionPerformed

    private void savePLBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePLBTNActionPerformed
        savePlaylist();
    }//GEN-LAST:event_savePLBTNActionPerformed

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
    private javax.swing.JPanel PLPanel;
    private javax.swing.JLabel PLTitle;
    private javax.swing.JMenuItem SortByAlbumMI;
    private javax.swing.JMenuItem SortByArtistMI;
    private javax.swing.JButton addTrackBTN;
    private javax.swing.JLabel albumCoverImgLBL;
    private javax.swing.JMenuItem albumCoverLocationMI;
    private javax.swing.JLabel albumDurationLBL;
    private javax.swing.JComboBox<Album> albumNameCB;
    private javax.swing.JPanel albumPanel;
    private javax.swing.JList<Track> albumTracksList;
    private javax.swing.JLabel albumsTitle;
    private javax.swing.JMenuItem clearPLMI;
    private javax.swing.JMenuItem createPLMI;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu editMenuAC;
    private javax.swing.JMenu editMenuPL;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JMenuItem loadACMI;
    private javax.swing.JMenu loadMenu;
    private javax.swing.JMenuItem loadPLMI;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel playlistDurationLBL;
    private javax.swing.JComboBox<String> playlistNameCB;
    private javax.swing.JList<PlaylistTrack> playlistTracksList;
    private javax.swing.JMenuItem removePLMI;
    private javax.swing.JButton removeTrackBTN;
    private javax.swing.JMenuItem renamePLMI;
    private javax.swing.JMenuItem savePLAsMI;
    private javax.swing.JButton savePLBTN;
    private javax.swing.JMenuItem savePLMI;
    private javax.swing.JMenu settings;
    // End of variables declaration//GEN-END:variables

}
