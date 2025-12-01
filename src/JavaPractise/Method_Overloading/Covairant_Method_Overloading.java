package JavaPractise.Method_Overloading;

public class Covairant_Method_Overloading {
    public static void main(String[] args) {
publisher p1 = new publisher();

Document d = p1.publish();
d.printme();

        System.out.println("-----");
 invoices i1 = new invoices();

 Invoice i2 = i1.publish();
 i2.printme();
    }
}
class Document{
    void printme(){
        System.out.println("Printing general Document");
    }
}
class Invoice extends Document{
    void printme(){
        System.out.println("Invoice is Printing");
    }
}
class publisher{
    Document publish(){
        System.out.println("Published Doc");
        return new Document();
    }
}
class invoices extends publisher{
    Invoice publish(){
        System.out.println("Invoice printing publishing");
        return new Invoice();
    }
}
