package albumInfoProgram;

import java.text.DecimalFormat;

public class Duration implements Comparable<Duration> {

    private int seconds;
    private int minutes;
    private int hours;
    private static DecimalFormat df = new DecimalFormat("00");

    // default constructor
    public Duration() {
        this.seconds = 0;
        this.minutes = 0;
        this.hours = 0;
    }

    // 3 parameter constructor not used in this project so far (all ints)
    public Duration(int hours, int minutes, int seconds) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
        normalise();
    }

    // constructor taking in a duration as a string
    public Duration(String strDuration) {
        String[] splitDuration = strDuration.split(":");
        this.seconds = Integer.parseInt(splitDuration[2]);
        this.minutes = Integer.parseInt(splitDuration[1]);
        this.hours = Integer.parseInt(splitDuration[0]);
        normalise();
    }

    // return seconds
    public int getSeconds() {
        return seconds;
    }

    // return minutes
    public int getMinutes() {
        return minutes;
    }

    // return hours
    public int getHours() {
        return hours;
    }

    // add one duration to another
    public void add(Duration other) {
        int totalSeconds = this.toSeconds() + other.toSeconds();        
        hours = totalSeconds / 3600;
        minutes = (totalSeconds % 3600) / 60;
        seconds = totalSeconds % 60;
    }

    // return duration in seconds
    public int toSeconds() {
        return seconds + (minutes * 60) + (hours * 60 * 60);
    }

    // normalise
    private void normalise() {
        int totalSeconds = toSeconds();
        hours = totalSeconds / 3600;
        minutes = (totalSeconds % 3600) / 60;
        seconds = totalSeconds % 60;
    }
    
    public boolean equals(Duration other){
        return this.toSeconds() == other.toSeconds();
    }
      
    // override the equals method. Compares the toString method of two durations
    @Override
    public boolean equals(Object other){
        if (!(other instanceof Duration)) {
            return false;
        }
        Duration otherDuration = (Duration) other;
        return this.toString().equals(otherDuration.toString());
    }

    // return duration object as string
    @Override
    public String toString() {
        return df.format(hours) + ":" + df.format(minutes) + ":" + df.format(seconds);
    }

    // returns -1 if this.toSeconds is < other.toSeconds
    // returns 0 if they are equal
    // returns 1 if this.toSeconds is > other.toSeconds
    @Override
    public int compareTo(Duration other) {
        return Integer.compare(this.toSeconds(), other.toSeconds());
    }
    
//    public static void main(String args[]) {
//        
//        // default duration
//        Duration duration1 = new Duration();
//        System.out.println(duration1);
//        
//        // three integer duration
//        Duration duration2 = new Duration(1,2,3);
//        System.out.println(duration2);
//        
//        // string duration
//        Duration duration3 = new Duration("5:6:7");
//        
//        // toSeconds
//        System.out.println(duration3.toSeconds());
//        
//        // add two durations
//        duration2.add(duration3);
//        System.out.println(duration2);
//        
//        // compare two durations
//        System.out.println(duration2.equals(duration3));     
//    
//    }
    
}
