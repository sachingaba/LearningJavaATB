package JavaPractise;

class Outer { int x = 10; class Inner { void show() { System.out.println(x); } } }

public class Main1 { public static void main(String[] args) { Outer o = new Outer(); Outer.Inner i = o.new Inner(); i.show(); } }