package albumInfoProgram;

import java.awt.Component;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JFileChooser;
import javazoom.jl.player.Player;

public class MP3Player {

    private String filename;
    private Player player;

    // a default constructor
    public MP3Player() {
    }

    // Constructor takes a given file name 
    public MP3Player(String filename) {
        this.filename = filename;
    }

    public void close() {
        if (player != null) {
            player.close();
        }
    }

    // play the JLayerMP3 file to the sound card
    public void play() {
        try {
            FileInputStream fis = new FileInputStream(filename);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();
        } catch (Exception e) {
            System.out.println("\n Problem in playing: " + filename);
            System.out.println(e);
        }
    }

    public void play(String mp3filename) {
        try {
            FileInputStream fis = new FileInputStream(mp3filename);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
        } catch (Exception e) {
            System.out.println("Problem in playing: " + mp3filename);
            System.out.println(e);
        }

        // creata a thread to play music in background
        new Thread() {
            public void run() {
                try {
                    player.play();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }.start();
    }
}
