package JavaPractise;

class Example {
    static void m(int x) { System.out.print("int "); }
    static void m(int... x) { System.out.print("varargs "); }

    public static void main(String[] args) {
        Example.m(2);
    }
}
