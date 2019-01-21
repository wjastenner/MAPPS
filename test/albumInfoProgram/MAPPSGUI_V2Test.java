/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albumInfoProgram;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author willstenner
 */
public class MAPPSGUI_V2Test {

    public MAPPSGUI_V2Test() {
    }

    /**
     * Test of getAlbumCoverDirectory method, of class MAPPSGUI_V2.
     */
    @Test
    public void albumCoverNameConversion() {
        String directoryName = "Kraftwerk_TransEuropeExpress";
        String selectedAlbumArtist = "Kraftwerk";
        String selectedAlbumTitle = "Trans Europe Express";
        String selectedAlbumConverted = selectedAlbumArtist + "_" + selectedAlbumTitle.replaceAll(" ", "");
        System.out.println(directoryName);
        System.out.println(selectedAlbumConverted);
        assertEquals(directoryName, selectedAlbumConverted);
    }

    @Test
    public void albumCoverNameConversion2() {
        String directoryName = "JSHXX_FoliasAndCanarios";
        String selectedAlbumArtist = "Jordi Savall and Hesperion XX";
        String selectedAlbumTitle = "Folias and Canarios";
        String selectedAlbumConverted = selectedAlbumArtist + "_" + selectedAlbumTitle.replaceAll(" ", "");
        System.out.println(directoryName);
        System.out.println(selectedAlbumConverted);
        assertEquals(directoryName, selectedAlbumConverted);
    }

    @Test
    public void albumCoverNameConversion3() {
        String directoryName = "JSHXX_FoliasAndCanarios";
        String selectedAlbumArtist = "Jordi Savall and Hesperion XX";
        String selectedAlbumTitle = "Folias and Canarios";
        String selectedAlbumArtistConverted = "";
        for (char ch : selectedAlbumArtist.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                selectedAlbumArtistConverted += ch;
            }
        }
        String selectedAlbumConverted = selectedAlbumArtistConverted + "_" + selectedAlbumTitle.replaceAll(" ", "");
        System.out.println(directoryName);
        System.out.println(selectedAlbumConverted);
        assertEquals(directoryName, selectedAlbumConverted);
    }

    @Test
    public void albumCoverNameConversion4() {
        String directoryName = "JSHXX_FoliasAndCanarios";
        String selectedAlbumArtist = "Jordi Savall and Hesperion XX";
        String selectedAlbumTitle = "Folias and Canarios";
        String selectedAlbumArtistConverted = "";
        for (char ch : selectedAlbumArtist.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                selectedAlbumArtistConverted += ch;
            }
        }
        directoryName = directoryName.toUpperCase();        
        String selectedAlbumConverted = (selectedAlbumArtistConverted + "_" + selectedAlbumTitle.replaceAll(" ", "")).toUpperCase();
        System.out.println(directoryName);
        System.out.println(selectedAlbumConverted);
        assertEquals(directoryName, selectedAlbumConverted);
    }

}
