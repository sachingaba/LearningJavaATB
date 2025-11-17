package ex_19_OOps_Part2.OOPs_01_Inheritance.Hierarchical.Practise;

public class E5Home extends Society {
    @Override
    public String toString() {
        return "E5Home{" +
                "H_No='" + H_No + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public E5Home(String name, String h_No) {
        super(name, h_No);
    }
    void Street(){
        System.out.println("Street " + this.H_No);

    }
}
