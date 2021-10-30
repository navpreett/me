import java.util.ArrayList;

class FreeMember extends Member {
    public static final int FREE_LIMITED_VDOs = 3;
    public String password;
    public ArrayList<Object> vdoList;
    public String email;
    private int numberLimitedVDOs;

    public FreeMember(String email, String password) {
        super(email, password);
        numberLimitedVDOs = 0;
    }

    @Override
    public boolean downloadVideo(Video vdo) {
        if (numberLimitedVDOs >= FREE_LIMITED_VDOs) {
            System.out.println("Too many videos downloaded!");
            return false;
        }

        super.downloadVideo(vdo);
        numberLimitedVDOs = numberLimitedVDOs + 1;
        return true;
    }

    @Override
    public boolean removeVideo(Video vdo) {
        boolean removed = vdoList.remove(vdo);
        if (removed == true)
            numberLimitedVDOs = numberLimitedVDOs - 1;

        return removed;
    }

    @Override
    public void printMemberInfo() {
        System.out.println("---- FREE MEMBER ----");
        super.printMemberInfo();
    }

    public int getNumberLimitedVideo() {
        return numberLimitedVDOs;
    }

    public int numDownloadedVDO() {
        return 0;
    }
}
