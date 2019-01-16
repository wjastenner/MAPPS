package albumInfoProgram;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Comparator.comparing;
import java.util.List;
import static java.util.Comparator.comparing;

public class AlbumCollection {

    private ArrayList<Album> albums;

    public AlbumCollection() {
        this.albums = new ArrayList<>();
    }

    // read method
    public boolean read(File albumCollection) {

        try {

            // import, connect and read whole file in
            // Adapted from pg 454 Sierra and Bates, 2005
            FileReader albumCollectionReader = new FileReader(albumCollection);
            BufferedReader reader = new BufferedReader(albumCollectionReader);

            String line = null;

            Album album = null;

            boolean albumExists = false;
            
            boolean empty = true;

            // while the reader can read a line in decide whether that line is
            // an album or track
            // if it is an album create a new album
            // if it is a track add that track to the previously created album
            while ((line = reader.readLine()) != null) {
                empty = false;
                if (line.contains(" : ") && line.contains("(") && line.contains(")")) {
                    return false;
                } else if (line.contains(" : ")) {
                    album = new Album(line);
                    if (albums.contains(album)) {
                        albumExists = true;
                    } else {
                        albums.add(album);
                        albumExists = false;
                    }
                }
                else if(line.contains(" - ") && !albumExists){
                    Track track = new Track(line);
                    album.addTrack(track);
                }
            }
            
            if(empty){
                return false;
            }


            
            reader.close();
        } catch (Exception ex) {
            System.out.println("Album collection import was unsuccessful");
            return false;
        }
        return true;
    }

    // sorts the AlbumCollection by artist then by title
    public AlbumCollection sort() {
        Collections.sort(albums, comparing(Album::getDetails));
        return this;
    }

    // sorts the AlbumCollection by title
    public AlbumCollection sortByAlbum() {
        Collections.sort(albums, comparing(Album::getTitle));
        return this;
    }

    // return duration a particular artist
    public Duration getArtistDuration(String artist) {

        Duration duration = new Duration();

        for (Album album : albums) {
            if (artist.equals(album.getArtist())) {
                duration.add(album.getDuration());
            }
        }
        return duration;
    }

    // return the largest album in the album collection
    public String getLargestAlbum() {

        Album largestAlbum = null;
        int largestAlbumLength = 0;

        for (Album album : albums) {
            int albumLength = album.getNumberOfTracks();
            if (albumLength > largestAlbumLength) {
                largestAlbumLength = albumLength;
                largestAlbum = album;
            }
        }
        return largestAlbum.getDetails();
    }

    // return longest track in the album collection    
    public Track getLongestTrack() {

        Track longestTrack = null;
        int seconds = 0;

        for (Album album : albums) {
            Track track = album.getLongestTrack();
            int trackDuration = track.toSeconds();
            if (trackDuration > seconds) {
                seconds = trackDuration;
                longestTrack = track;
            }
        }
        return longestTrack;
    }

    // return duration of a track using an album and track name
    public Duration getTrackDuration(Album playlistAlbum, String playlistTrackName) {

        for (Album album : albums) {
            if (playlistAlbum.equals(album)) {
                return album.getDuration(playlistTrackName);
            }
        }
        return null;
    }

    // return unmodifiable list of albums
    public List<Album> getAlbums() {
        return Collections.unmodifiableList(albums);
    }

    // convert and return album collection as string
    @Override
    public String toString() {

        String albumCollectionStr = "";

        for (Album album : albums) {
            albumCollectionStr += album + "\n";
        }
        return albumCollectionStr;
    }
}
