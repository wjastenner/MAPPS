package albumInfoProgram;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class MP3Player {

    FileInputStream FIS;
    BufferedInputStream BIS;
    public Player player;
    public long pausePoint;
    public long songLength;
    String path;

    public MP3Player()
    {
        pausePoint = 0;
    }

    public void stop() {
        if (player != null) {
            player.close();
            pausePoint = 0;
            songLength = 0;
        }
    }

    public void play(String mp3Path) {
        try {
            FIS = new FileInputStream(mp3Path);
            BIS = new BufferedInputStream(FIS);
            player = new Player(BIS);
            songLength = FIS.available();
            path = mp3Path;

        } catch (FileNotFoundException | JavaLayerException ex) {
        } catch (IOException ex) {
        }
        new Thread() {
            @Override
            public void run() {
                try {
                    player.play();
                } catch (JavaLayerException ex) {
                }
            }
        }.start();
    }

    public void pause() {
        if (player != null) {
            try {
                pausePoint = FIS.available();
                player.close();
            } catch (IOException ex) {

            }

        }
    }

    public void resume() {
        try {
            FIS = new FileInputStream(path);
            BIS = new BufferedInputStream(FIS);
            player = new Player(BIS);
            FIS.skip(songLength - pausePoint);
        } catch (JavaLayerException | FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        new Thread() {
            @Override
            public void run() {
                try {
                    player.play();
                } catch (JavaLayerException ex) {
                }
            }
        }.start();

    }

    public long getPausePoint() {
        return pausePoint;
    }

}
