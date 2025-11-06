package ex_22_Accessmodifier.Police;

public class JrCop {
    public static void main(String[] args) {
        cop jrCop = new cop(100);
        jrCop.canIShoot(); // cant use if private. can be used if protected because in same folder
    }
}
