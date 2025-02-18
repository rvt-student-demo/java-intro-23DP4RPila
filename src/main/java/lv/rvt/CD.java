package lv.rvt;
public class CD {
    String artist;
    String cdName;
    double publicationYear;
    public  CD(String artist, String cdName, int publicationYear) {
        artist = this.artist;
        cdName = this.cdName;
    }

    public String getArtist() {
        return artist;
    }
    
    public String getBook() {
        return cdName;
    }

    public double getPublicationYear() {
        return publicationYear;
    
    public String toString{
        return this.artist + ": " + this.cdName;
    }
}
}