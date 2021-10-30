import java.util.ArrayList;
import java.util.List;

public class Member implements IMusic {
    public String email;
    public String password;
    public ArrayList<Video> vdoList;
    public double fee;
    List<Music> musicList;
    List<List<Music>> playList;

    public Member(String email, String password) {
        super();
        this.fee = fee;
        musicList = new ArrayList<Music>();
        //playList = new ArrayList<List<Music>>();
    }

    public boolean downloadVideo(Video vdo) {
        return false;
    }

    public boolean removeVideo(Video vdo) {
        return false;
    }

    public void printMemberInfo() {
        System.out.println("---- PREMIUM MEMBER ----");
        System.out.println("Member fee" + this.fee);
    }

    public boolean downloadMusic(Music song) {
        if(song != null) {
            musicList.add(song);
            return true;
        }

        return false;
    }


    public boolean removeMusic(Music song) {
        boolean removed = musicList.remove(song);
        if(removed)
        {System.out.println("Song successfully removed!");}

        return removed;
    }

    public boolean addToPlaylist(Music song) {
        if(song == null)
            return false;

        //no need for else since branching here skips return

        ArrayList<Music> newList = new ArrayList<Music>();
        newList.add(song);
        playList.add(newList);
        return true;
    }

    public void setFee(double fee)
    {
        this.fee = fee;
    }

    public double getFee()
    {
        return fee;
    }

    public int getNumLimitedVDO() {
        return 0;
    }

    public int numDownloadedVDO() {
        return 0;
    }
}
