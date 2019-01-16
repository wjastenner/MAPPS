package albumInfoProgram;

public class Track{
    
    protected String name;
    protected Duration duration;

    // 2 parameter constructor (duration object, string object)
    public Track(Duration duration, String name) {
        this.name = name;
        this.duration = duration;
    }

    // 2 parameter constructor (both strings)
    public Track(String duration, String name) {
        Duration strDuration = new Duration(duration);
        this.duration = strDuration;
        this.name = name;
    }

    // constructor taking in imported line from album collection
    public Track(String importedLine) {
        String[] albumDetails = importedLine.split(" - ");
        this.duration = new Duration(albumDetails[0]);
        this.name = albumDetails[1];
    }

    // return name of track
    public String getName() {
        return name;
    }

    // return Duration of track
    public Duration getDuration() {
        return duration;
    }

    // return duration of track in seconds
    public int toSeconds() {
        return duration.toSeconds();
    }
    
    // override the equals method. Compares the toString method of two tracks
    @Override
    public boolean equals(Object other){
        if (!(other instanceof Track)) {
            return false;
        }
        Track otherTrack = (Track) other;
        return this.toString().equals(otherTrack.toString());
    }

    // return track object as string
    @Override
    public String toString() {             
        return (this.duration + " - " + this.name).toUpperCase();
    }
}
