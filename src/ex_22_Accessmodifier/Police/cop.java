package ex_22_Accessmodifier.Police;

public class cop {
    public int gun;
    public  String id;

    public cop(int bullet) {
        this.gun = bullet;
    }
    // Method and behav
    // public to protected -- if public any body can use it.
    protected void canIShoot(){
        System.out.println("Yes you can");

    }

    // Default - access .. as nothing mentioned  public or private or protected
    void thisdefaultf1(){
        System.out.println("Hi Cop");
    }



}
