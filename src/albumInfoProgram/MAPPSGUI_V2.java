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

    private AlbumCollection ac;
    private HashMap<String, String> playlists;
    private String albumCoverDirectory;
    private String mp3AlbumDirectory;
    private Playlist playlist;
    private MP3Player mp3Player;
    private String playerStatus;

    public MAPPSGUI_V2() {
        initComponents();
        ac = new AlbumCollection();
        playlists = new HashMap<>();
        albumCoverDirectory = System.getProperty("user.dir") + File.separator + "data" + File.separator + "album_covers";
        mp3AlbumDirectory = System.getProperty("user.dir") + File.separator + "data" + File.separator + "mp3_files";
        playlist = new Playlist(ac);
        mp3Player = new MP3Player();
        playerStatus = "deactivated";
        System.out.println(albumCoverDirectory);
        System.out.println(mp3AlbumDirectory);
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
        tracksList = new javax.swing.JList<>();
        PLPanel = new javax.swing.JPanel();
        PLTitle = new javax.swing.JLabel();
        PLNameCB = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        PLTList = new javax.swing.JList<>();
        PLTDurationLBL = new javax.swing.JLabel();
        removeTrackBTN = new javax.swing.JButton();
        savePLBTN = new javax.swing.JButton();
        playerPanel = new javax.swing.JPanel();
        playBTN = new javax.swing.JLabel();
        pauseBTN = new javax.swing.JLabel();
        stopBTN = new javax.swing.JLabel();
        playerLBL2 = new javax.swing.JLabel(new javax.swing.ImageIcon(getClass().getResource("/albumInfoProgram/displayLBLImg2.png")));
        playerLBL1 = new javax.swing.JLabel(new javax.swing.ImageIcon(getClass().getResource("/albumInfoProgram/displayLBLImg1.png")));
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loadMenu = new javax.swing.JMenu();
        loadACMI = new javax.swing.JMenuItem();
        loadPLMI = new javax.swing.JMenuItem();
        createPLMI = new javax.swing.JMenuItem();
        savePLMI = new javax.swing.JMenuItem();
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
        albumsTitle.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        albumsTitle.setForeground(new java.awt.Color(255, 255, 255));
        albumsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        albumsTitle.setText("ALBUMS");
        albumsTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        albumDurationLBL.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        albumDurationLBL.setForeground(new java.awt.Color(255, 255, 255));
        albumDurationLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        albumDurationLBL.setText("TRACKS : 00 | DURATION : 00:00:00");
        albumDurationLBL.setEnabled(false);
        albumDurationLBL.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        albumNameCB.setBackground(new java.awt.Color(204, 204, 204));
        albumNameCB.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
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

        addTrackBTN.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        addTrackBTN.setForeground(new java.awt.Color(51, 51, 51));
        addTrackBTN.setText("ADD TRACK TO PLAYLIST");
        addTrackBTN.setEnabled(false);
        addTrackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTrackBTNActionPerformed(evt);
            }
        });

        jScrollPane5.setBorder(null);
        jScrollPane5.setPreferredSize(new java.awt.Dimension(200, 132));

        tracksList.setBackground(new java.awt.Color(51, 51, 51));
        tracksList.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        tracksList.setForeground(new java.awt.Color(255, 255, 255));
        tracksList.setEnabled(false);
        tracksList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tracksListMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(tracksList);

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
                .addGroup(albumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(albumPanelLayout.createSequentialGroup()
                        .addComponent(albumNameCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(albumDurationLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(addTrackBTN))
                    .addComponent(albumCoverImgLBL))
                .addGap(14, 14, 14))
        );

        PLPanel.setBackground(new java.awt.Color(51, 51, 51));

        PLTitle.setBackground(new java.awt.Color(70, 50, 70));
        PLTitle.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        PLTitle.setForeground(new java.awt.Color(255, 255, 255));
        PLTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PLTitle.setText("PLAYLISTS");
        PLTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        PLNameCB.setBackground(new java.awt.Color(204, 204, 204));
        PLNameCB.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        PLNameCB.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PLNameCB.setEnabled(false);
        PLNameCB.setPreferredSize(new java.awt.Dimension(361, 26));
        PLNameCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLNameCBActionPerformed(evt);
            }
        });

        jScrollPane7.setBorder(null);
        jScrollPane7.setPreferredSize(new java.awt.Dimension(200, 132));

        PLTList.setBackground(new java.awt.Color(51, 51, 51));
        PLTList.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        PLTList.setForeground(new java.awt.Color(255, 255, 255));
        PLTList.setEnabled(false);
        PLTList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PLTListMousePressed(evt);
            }
        });
        jScrollPane7.setViewportView(PLTList);

        PLTDurationLBL.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        PLTDurationLBL.setForeground(new java.awt.Color(255, 255, 255));
        PLTDurationLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PLTDurationLBL.setText("TRACKS : 00 | DURATION : 00:00:00");
        PLTDurationLBL.setEnabled(false);
        PLTDurationLBL.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        removeTrackBTN.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        removeTrackBTN.setForeground(new java.awt.Color(51, 51, 51));
        removeTrackBTN.setText("REMOVE TRACK");
        removeTrackBTN.setEnabled(false);
        removeTrackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTrackBTNActionPerformed(evt);
            }
        });

        savePLBTN.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
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
                        .addComponent(PLTDurationLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PLNameCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(PLNameCB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PLTDurationLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(PLPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeTrackBTN)
                    .addComponent(savePLBTN))
                .addGap(14, 14, 14))
        );

        playerPanel.setBackground(new java.awt.Color(51, 51, 51));

        playBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/albumInfoProgram/play_btn.png"))); // NOI18N
        playBTN.setEnabled(false);
        playBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                playBTNMouseReleased(evt);
            }
        });

        pauseBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pauseBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/albumInfoProgram/pause_btn.png"))); // NOI18N
        pauseBTN.setEnabled(false);
        pauseBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pauseBTNMouseReleased(evt);
            }
        });

        stopBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stopBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/albumInfoProgram/stop_btn.png"))); // NOI18N
        stopBTN.setEnabled(false);
        stopBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                stopBTNMouseReleased(evt);
            }
        });

        playerLBL2.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        playerLBL2.setForeground(new java.awt.Color(102, 102, 102));
        playerLBL2.setHorizontalTextPosition(JLabel.CENTER); playerLBL2.setVerticalTextPosition(JLabel.CENTER);

        playerLBL1.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        playerLBL1.setForeground(new java.awt.Color(102, 102, 102));
        playerLBL1.setHorizontalTextPosition(JLabel.CENTER); playerLBL1.setVerticalTextPosition(JLabel.CENTER);

        javax.swing.GroupLayout playerPanelLayout = new javax.swing.GroupLayout(playerPanel);
        playerPanel.setLayout(playerPanelLayout);
        playerPanelLayout.setHorizontalGroup(
            playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(playerLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(stopBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(playBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pauseBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(playerLBL2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanelLayout.setVerticalGroup(
            playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pauseBTN)
                    .addComponent(stopBTN)
                    .addComponent(playBTN)
                    .addComponent(playerLBL2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(playerPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addComponent(albumPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(PLPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(albumPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PLPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addComponent(playerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                albumNameCB.setEnabled(true);
                tracksList.setEnabled(true);
                albumDurationLBL.setEnabled(true);
                result = 1;
            } else {
                JOptionPane.showMessageDialog(mainPanel, "The album collection is empty or not in the correct format.");
                result = 2;
            }
            if (!playlists.isEmpty()) {
                displayPLDetails();
            }
        }
        return result;
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

            Album selectedAlbum = (Album) albumNameCB.getSelectedItem();

            DefaultListModel tracksListGUI = new DefaultListModel();
            tracksList.setModel(tracksListGUI);
            List<Track> tracks = selectedAlbum.getTracks();
            for (Track track : tracks) {
                tracksListGUI.addElement(track);
            }

            String albumDuration = selectedAlbum.getDuration().toString();
            albumDurationLBL.setText("TRACKS : " + selectedAlbum.getSize() + " | DURATION : " + selectedAlbum.getDuration());

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
                                "The playlist contains some tracks that can not be found in the album collection.\n"
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
                                addPLName(name, path);
                                break;
                            } else {
                                break;
                            }
                        } else if (input == JOptionPane.NO_OPTION) {
                            addPLName(name, path);
                        }
                        break;
                    case 0:
                        addPLName(name, path);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(mainPanel, "The playlist is not in the correct format.");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(mainPanel, "This playlist can not be loaded because none of\nthe tracks can be found in the album collection.");
                        break;
                    case 4:
                        input = JOptionPane.showConfirmDialog(mainPanel, "The playlist does not contain any tracks.\n"
                                + "Would you like to load it anyway?", "Empty playlist", JOptionPane.YES_NO_OPTION);
                        if (input == JOptionPane.YES_OPTION) {
                            addPLName(name, path);
                        } else {
                            break;
                        }
                }
            }
        }
        checkPLFunctions();
    }

    public void checkPLFunctions() {

        if (!playlists.isEmpty()) {
            savePLMI.setEnabled(true);
            addTrackBTN.setEnabled(true);
            editMenuPL.setEnabled(true);
            renamePLMI.setEnabled(true);
            removePLMI.setEnabled(true);
            savePLBTN.setEnabled(true);
        } else {
            savePLMI.setEnabled(false);
            addTrackBTN.setEnabled(false);
            editMenuPL.setEnabled(false);
            renamePLMI.setEnabled(false);
            removePLMI.setEnabled(false);
            savePLBTN.setEnabled(false);
        }

        if (PLTList.getModel().getSize() > 0) {
            clearPLMI.setEnabled(true);
            removeTrackBTN.setEnabled(true);
            PLTList.setEnabled(true);
            PLTDurationLBL.setEnabled(true);
        } else {
            clearPLMI.setEnabled(false);
            removeTrackBTN.setEnabled(false);
            PLTList.setEnabled(false);
            PLTDurationLBL.setEnabled(false);
        }

        if (playlists.size() <= 1) {
            PLNameCB.setEnabled(false);
        } else if (playlists.size() > 1) {
            PLNameCB.setEnabled(true);
        }
    }

    public void addPLName(String playlistName, String playlistPath) {

        playlists.put(playlistName, playlistPath);
        playlistName = playlistName.substring(0, (playlistName.length() - 4));

        ArrayList<String> PLNameCBContents = new ArrayList<>();

        int size = PLNameCB.getItemCount();
        for (int i = 0; i < size; i++) {
            String item = PLNameCB.getItemAt(i);
            PLNameCBContents.add(item);
        }

        if (!PLNameCBContents.contains(playlistName)) {
            PLNameCB.addItem(playlistName);
            PLNameCB.setSelectedItem(playlistName);
        }

        displayPLDetails();

    }

    private void displayPLDetails() {
        List<PlaylistTrack> tracks = playlist.getTracks();
        DefaultListModel tracksListGUI = new DefaultListModel();
        PLTList.setModel(tracksListGUI);
        for (PlaylistTrack track : tracks) {
            tracksListGUI.addElement(track);
        }
        String playlistDuration = playlist.getDuration().toString();

        PLTDurationLBL.setText("TRACKS : " + playlist.getSize() + " | DURATION : " + playlistDuration);

        checkPLFunctions();

    }

    private void renamePL() {
        String newPL = JOptionPane.showInputDialog(mainPanel, "What would you like to rename the playlist?");
        if (newPL != null && !newPL.isEmpty()) {
            newPL = newPL.replaceAll("[^a-zA-Z0-9- ]", "");
            String newPLEdit = newPL + ".txt";
            String oldPL = PLNameCB.getSelectedItem().toString();
            String oldPLEdit = oldPL + ".txt";
            String oldPlaylistPath = playlists.get(oldPLEdit);
            String newPath = oldPlaylistPath.substring(0, oldPlaylistPath.length() - oldPLEdit.length()) + newPLEdit;
            if (!oldPlaylistPath.equals(newPath)) {
                File oldFile = new File(oldPlaylistPath);
                File newFile = new File(newPath);
                oldFile.renameTo(newFile);
                playlists.put(newPLEdit, newPath);
                playlists.remove(oldPLEdit);
                PLNameCB.addItem(newPL);
                PLNameCB.removeItem(oldPL);
                PLNameCB.setSelectedItem(newPL);
            }
        }
    }

    private void removeTracksPL() {
        int[] trackNumber = PLTList.getSelectedIndices();
        playlist.remove(trackNumber);
        savePL();
        displayPLDetails();
        checkPLFunctions();
    }

    private void savePL() {
        String selectedPlaylist = PLNameCB.getSelectedItem() + ".txt";
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
        List<Track> selectedTracks = tracksList.getSelectedValuesList();
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
                        savePL();
                    }
                } else {
                    playlist.add(playlistTrack);
                    savePL();
                }
            }
        } else if (duplicates > 1) {
            int input = JOptionPane.showConfirmDialog(mainPanel, "Several of the tracks already exist in the playlist.\n"
                    + "Would you like to add them anyway?\n"
                    + "(Non-duplicates will still be added)", "Duplicate tracks found", JOptionPane.YES_NO_OPTION);
            if (input == 0) {
                for (PlaylistTrack playlistTrack : playlistTracks) {
                    playlist.add(playlistTrack);
                    savePL();
                }
            } else {
                for (PlaylistTrack playlistTrack : playlistTracks) {
                    if (!playlist.trackExists(playlistTrack)) {
                        playlist.add(playlistTrack);
                        savePL();
                    }
                }
            }
        } else {
            for (PlaylistTrack playlistTrack : playlistTracks) {
                playlist.add(playlistTrack);
                savePL();
            }
        }
        displayPLDetails();
        checkPLFunctions();
    }

    private void createPL() {

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
                        "Playlist already exists", JOptionPane.YES_NO_OPTION);
                if (input == JOptionPane.YES_OPTION) {
                    try {
                        FileWriter finalFile = new FileWriter(path);
                        finalFile.close();
                        playlists.remove(newFile.getName());
                        addPLName(newFile.getName(), newFile.getAbsolutePath());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            } else {
                try {
                    FileWriter finalFile = new FileWriter(path);
                    finalFile.close();
                    addPLName(newFile.getName(), newFile.getAbsolutePath());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

        checkPLFunctions();
    }

    private String getMP3Directory() {
        List<Track> tracksSelected = tracksList.getSelectedValuesList();
        List<PlaylistTrack> PLTSelected = PLTList.getSelectedValuesList();
        String albumFolderDirectory = "";
        String trackNumber;
        Album selectedAlbum;
        String mp3Directory = "unknown";
        Track selectedTrack = null;
        PlaylistTrack selectedPLT = null;

        if (tracksSelected.size() == 1) {
            selectedAlbum = (Album) albumNameCB.getSelectedItem();
            selectedTrack = tracksList.getSelectedValue();
            trackNumber = ac.getTrackNumber(selectedAlbum, selectedTrack.getName());

            if (!getAlbumFolderDirectory(selectedAlbum).equals("unknown")) {
                albumFolderDirectory = getAlbumFolderDirectory(selectedAlbum);
                mp3Directory = getTrackDirectory(albumFolderDirectory, selectedAlbum.getArtist(), trackNumber, selectedTrack.getName());
            } else {
                JOptionPane.showMessageDialog(mainPanel, "An mp3 for the selected track could not be found.");
            }

        } else if (PLTSelected.size() == 1) {
            selectedPLT = PLTList.getSelectedValue();
            selectedAlbum = selectedPLT.getAlbum();
            trackNumber = ac.getTrackNumber(selectedAlbum, selectedPLT.getName());

            if (!getAlbumFolderDirectory(selectedAlbum).equals("unknown")) {
                albumFolderDirectory = getAlbumFolderDirectory(selectedAlbum);
                mp3Directory = getTrackDirectory(albumFolderDirectory, selectedAlbum.getArtist(), trackNumber, selectedPLT.getName());
            } else {
                JOptionPane.showMessageDialog(mainPanel, "An mp3 for the selected track could not be found.");
            }
        }

        if (ac.toString().isEmpty()) {
            JOptionPane.showMessageDialog(mainPanel, "Please load in an album collection.");
        } else if (selectedTrack == null && selectedPLT == null && playerStatus.equals("deactivated")) {
            JOptionPane.showMessageDialog(mainPanel, "Please select a track.");
        }

        return mp3Directory;
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
        if (matchedFiles.size() == 1) {
            albumFolderDirectory = matchedFiles.get(0).getAbsolutePath();
        } else if (matchedFiles.size() > 1) {
            String selectedAlbumArtist = album.getArtist().replaceAll("&", "");
            selectedAlbumArtist = selectedAlbumArtist.replace("The ", "").replace(" ", "_");
            for (File matchedFile : matchedFiles) {
                if (matchedFile.getName().startsWith(selectedAlbumArtist)) {
                    albumFolderDirectory = matchedFile.getAbsolutePath();
                }
            }
        } else {
            return "unknown";
        }
        return albumFolderDirectory;
    }

    private String getTrackDirectory(String directory, String artist, String trackNumber, String trackTitle) {
        artist = artist.replaceAll("'", "").replaceAll("&", "__").replaceAll(" ", "_");
        trackNumber = "_-_" + trackNumber + "_-_";
        trackTitle = trackTitle.trim().replaceAll(" ", "_") + ".mp3";
        String selectedTrackEdit = (artist + trackNumber + trackTitle).toUpperCase();
        File[] mp3Files = new File(directory).listFiles();
        for (File mp3File : mp3Files) {
            String mp3FileEdit = mp3File.getName().toUpperCase();
            if (mp3File.getName().toUpperCase().equals(selectedTrackEdit)) {
                return mp3File.getAbsolutePath();
            }
        }
        return "no match found";
    }

    private String[] getPlayingDetails() {
        Album selectedAlbum = (Album) albumNameCB.getSelectedItem();
        Track selectedTrack = tracksList.getSelectedValue();
        PlaylistTrack selectedPLT = PLTList.getSelectedValue();
        String albumInfo = "";
        String trackInfo = "";
        if (selectedTrack != null && selectedAlbum != null) {
            albumInfo = selectedAlbum.getArtist().toUpperCase();
            trackInfo = selectedTrack.getName().toUpperCase();
        } else if (selectedPLT != null && selectedPLT.getAlbumDetails() != null) {
            albumInfo = selectedPLT.getAlbum().getArtist().toUpperCase();
            trackInfo = selectedPLT.getName().toUpperCase();
        }
        return new String[]{albumInfo, trackInfo};
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
        renamePL();
    }//GEN-LAST:event_renamePLMIActionPerformed

    private void tracksListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tracksListMousePressed
        PLTList.clearSelection();
        checkPLFunctions();
    }//GEN-LAST:event_tracksListMousePressed

    private void savePLMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePLMIActionPerformed
        savePL();
    }//GEN-LAST:event_savePLMIActionPerformed

    private void addTrackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTrackBTNActionPerformed
        addTracksPL();
    }//GEN-LAST:event_addTrackBTNActionPerformed

    private void clearPLMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearPLMIActionPerformed
        playlist.clear();
        savePL();
        displayPLDetails();
        checkPLFunctions();
    }//GEN-LAST:event_clearPLMIActionPerformed

    private void createPLMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPLMIActionPerformed
        createPL();
    }//GEN-LAST:event_createPLMIActionPerformed

    private void removePLMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePLMIActionPerformed

        String selectedPlaylist = (String) PLNameCB.getSelectedItem();
        String selectedPlaylistEdit = PLNameCB.getSelectedItem() + ".txt";
        String selectedPlaylistPath = playlists.get(selectedPlaylist);

        PLNameCB.removeItem(selectedPlaylist);
        playlists.remove(selectedPlaylistEdit);

        if (playlists.isEmpty()) {
            playlist.clear();
            displayPLDetails();
        }

        checkPLFunctions();

    }//GEN-LAST:event_removePLMIActionPerformed

    private void removeTrackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTrackBTNActionPerformed
        removeTracksPL();
    }//GEN-LAST:event_removeTrackBTNActionPerformed

    private void PLTListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PLTListMousePressed
        tracksList.clearSelection();
    }//GEN-LAST:event_PLTListMousePressed

    private void PLNameCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLNameCBActionPerformed
        if (PLNameCB.getSelectedItem() != null) {
            String selectedPlaylistName = PLNameCB.getSelectedItem() + ".txt";
            String selectedPlaylistPath = playlists.get(selectedPlaylistName);
            File playlistFile = new File(selectedPlaylistPath);
            playlist.clear();
            playlist.read(playlistFile);
            displayPLDetails();
            checkPLFunctions();
        }
    }//GEN-LAST:event_PLNameCBActionPerformed

    private void savePLBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePLBTNActionPerformed
        savePL();
        displayPLDetails();
    }//GEN-LAST:event_savePLBTNActionPerformed

    private void playBTNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playBTNMouseReleased
        String[] playingDetails = getPlayingDetails();
        if (tracksList.getSelectedIndices().length > 1 || PLTList.getSelectedIndices().length > 1) {
            JOptionPane.showMessageDialog(mainPanel, "Please select one track.");
        } else {
            try {
                String mp3Directory = getMP3Directory();
                switch (playerStatus) {
                    case "deactivated":
                        if (!mp3Directory.equals("unknown")) {
                            mp3Player.play(getMP3Directory());
                            playerStatus = "playing";
                            playerLBL1.setText(playingDetails[0]);
                            playerLBL2.setText(playingDetails[1]);
                        }
                        break;
                    case "playing":
                        if (!mp3Player.getPath().equals(mp3Directory) && !mp3Directory.equals("unknown")) {
                            mp3Player.stop();
                            mp3Player.play(getMP3Directory());
                            playerLBL1.setText(playingDetails[0]);
                            playerLBL2.setText(playingDetails[1]);
                        } else if (mp3Player.getPath().equals(mp3Directory) && !mp3Directory.equals("unknown")) {
                            mp3Player.stop();
                            mp3Player.play(getMP3Directory());
                        }
                        break;
                    case "paused":
                        mp3Player.resume();
                        playerStatus = "playing";
                        break;
                    case "stopped":
                        if (!mp3Directory.equals("unknown")) {
                            mp3Player.play(mp3Directory);
                            playerStatus = "playing";
                            playerLBL1.setText(playingDetails[0]);
                            playerLBL2.setText(playingDetails[1]);
                        }
                        break;
                }
            } catch (Exception e) {
            }
            System.out.println(playerStatus);
        }
    }//GEN-LAST:event_playBTNMouseReleased

    private void stopBTNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopBTNMouseReleased
        switch (playerStatus) {
            case "deactivated":
                break;
            case "playing":
                mp3Player.stop();
                playerStatus = "stopped";
                playerLBL1.setText("");
                playerLBL2.setText("");
                break;
            case "paused":
                mp3Player.stop();
                playerStatus = "stopped";
                playerLBL1.setText("");
                playerLBL2.setText("");
                break;
            case "stopped":
                break;
        }
    }//GEN-LAST:event_stopBTNMouseReleased

    private void pauseBTNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pauseBTNMouseReleased
        switch (playerStatus) {
            case "playing":
                mp3Player.pause();
                playerStatus = "paused";
                tracksList.clearSelection();
                PLTList.clearSelection();
                break;
        }
    }//GEN-LAST:event_pauseBTNMouseReleased

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
            java.util.logging.Logger.getLogger(MAPPSGUI_V2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAPPSGUI_V2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAPPSGUI_V2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAPPSGUI_V2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JComboBox<String> PLNameCB;
    private javax.swing.JPanel PLPanel;
    private javax.swing.JLabel PLTDurationLBL;
    private javax.swing.JList<PlaylistTrack> PLTList;
    private javax.swing.JLabel PLTitle;
    private javax.swing.JMenuItem SortByAlbumMI;
    private javax.swing.JMenuItem SortByArtistMI;
    private javax.swing.JButton addTrackBTN;
    private javax.swing.JLabel albumCoverImgLBL;
    private javax.swing.JMenuItem albumCoverLocationMI;
    private javax.swing.JLabel albumDurationLBL;
    private javax.swing.JComboBox<Album> albumNameCB;
    private javax.swing.JPanel albumPanel;
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
    private javax.swing.JLabel pauseBTN;
    private javax.swing.JLabel playBTN;
    private javax.swing.JLabel playerLBL1;
    private javax.swing.JLabel playerLBL2;
    private javax.swing.JPanel playerPanel;
    private javax.swing.JMenuItem removePLMI;
    private javax.swing.JButton removeTrackBTN;
    private javax.swing.JMenuItem renamePLMI;
    private javax.swing.JButton savePLBTN;
    private javax.swing.JMenuItem savePLMI;
    private javax.swing.JMenu settings;
    private javax.swing.JLabel stopBTN;
    private javax.swing.JList<Track> tracksList;
    // End of variables declaration//GEN-END:variables

}
