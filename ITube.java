public interface ITube {
    public boolean downloadVideo(Video vdo);
    public boolean removeVideo(Video vdo);
    public int numDownloadedVDO();
}