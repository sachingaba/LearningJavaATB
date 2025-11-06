package ex_21_Encapsulation;

public class Lab138_Real_Bank {

    public static void main(String[] args) {
        ICICIBank user1 = new ICICIBank("Sachin", 1235565554L);
        System.out.println(user1.getBal());
        long bal = user1.getBal();
        System.out.println("here " + user1.getBal());

        user1.setName("Rahil");
        System.out.println(user1.getName());

        // set permission added -- cashier

        //user1.setBal(65464646L,false);
        user1.setBal(123566658L,true);

        ICICIBank cashier = new ICICIBank("amit" , 100);
        cashier.setBal(1000,true);
        System.out.println(cashier.getBal());



    }
}


class ICICIBank{
    private String name;
    private long bal;


    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean iscashier) {
        if(iscashier){
            this.bal = bal;
        }else
        {
            System.out.println("Not allowed");
        }

    }
}