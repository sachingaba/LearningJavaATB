package ex_19_OOps_Part2.OOPs_01_Inheritance.Hierarchical.Practise;

public class G1Home extends Society{

    public G1Home(String name, String h_No) {
        super(name, h_No);
    }

    void Street(){
        System.out.println("Street" + this.H_No);

    }

}
