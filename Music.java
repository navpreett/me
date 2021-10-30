
class Music{
    private String title;
    private String url;
    private double length;

    public Music(String aTitle, String aURL, double aLength){
        title = aTitle;
        url = aURL;
        length = aLength;
    }

    /*
     * Return the title of this music
     */
    public String getTitle(){
        return this.title;
    }

    /*
     * Return the url of this music
     */
    public String getURL(){
        return this.url;
    }

    /*
     * Return the url of this music
     */
    public double getLength(){
        return this.length;
    }

    /*
     * Check whether the given song is equal to this song or not.
     * Two songs will be equal if their title,  url, length are the same as well.
     */
    public boolean isEqual(Music song){
        return (this.title.equals(song.getTitle()) && this.url == song.getURL() && this.length == song.getLength());
    }

    /*
     * Return a string with music's name and url.
     */
    public String toString(){
        return "Title: " + this.title + " URL: "+this.url+ " Length: "+this.length;
    }

    protected void printMemberInfo() {
    }

    public int numDownloadedVDO() {
        return 0;
    }
}