package albumInfoProgram;

public class PlaylistTrack extends Track {

    private Album album;

    // 3 parameter constructor (Album object, Duration object, String object)
    public PlaylistTrack(Album album, Duration duration, String name) {
        super(duration, name);
        this.album = album;
    }

    public Album getAlbum() {
        return album;
    }

    // return album details
    public String getAlbumDetails() {
        return album.getDetails();
    }

    // return album title
    public String getAlbumName() {
        return album.getTitle();
    }

    // override the equals method. Compares the toString and getDuration methods of two PlayListTracks
    // this method is automatically called when calling the remove method on an ArrayList of PlaylistTracks
    // it is used to ensure two objects match
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PlaylistTrack)) {
            return false;
        }
        PlaylistTrack otherPLT = (PlaylistTrack) other;
        return this.toString().equals(otherPLT.toString()) && this.getDuration().equals(otherPLT.getDuration());
    }

    // return PlaylistTrack object as String
    @Override
    public String toString() {
        return this.name + " ("
                + this.album.getDetails() + ")";
    }

}
