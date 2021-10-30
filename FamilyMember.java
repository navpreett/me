public class FamilyMember extends PremiumMember {
    public String email;
    public String password;

    public FamilyMember(String email,String password,double fee) {
        super(email,password,fee);
        System.out.println("Family Member:" + "");
    }

    @Override
    public boolean removeVideo(Video vdo) {
        return false;
    }

    @Override
    public void printMemberInfo() {
        super.printMemberInfo();
    }

    @Override
    public int getNumLimitedVDO() {
        return 0;
    }

    public boolean checkFamily()
    {//TODO this shit
        return true;
    }

    public boolean addFamily(String s) {
        return true;
    }

    public boolean removeFamily(String s) {
        return true;
    }

    public int getMonthlyBill() {
        return 0;
    }
}
