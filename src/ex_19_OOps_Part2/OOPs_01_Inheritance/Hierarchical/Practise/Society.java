package ex_19_OOps_Part2.OOPs_01_Inheritance.Hierarchical.Practise;

public class Society extends Electricity{

    String name;
    String H_No;

    public Society(String name, String h_No) {
        this.name = name;
       this.H_No = h_No;
    }

    void ClubHouse() {
        System.out.println("Club House for the Society");

    }

    public String toString() {
        return "Access To" +
                "name='" + name + '\'' +
                ", H_No='" + H_No + '\'';

    }



}
