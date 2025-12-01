package JavaPractise.Access_Modifier.Cop;

public class copmain {
    int bullet;

    public copmain(int bullet) {
        this.bullet = bullet;
    }
    private void jail(){
        System.out.println("jail time");
    }

    public void canIShoot(){
        jail();
        System.out.println("YES you can!!");
    }

   protected void uniform(){
        System.out.println("here is your uniform");
    }
}
