package JavaPractise;

public class Drawble_Interface {
    public static void main(String[] args) {
        rectangle R1 = new rectangle();
      circles c1 = new circles();
      R1.draw();
      c1.draw();

    }
}
    interface drawable{
        void draw();
    }
    class rectangle implements drawable {

        @Override
        public void draw() {
            System.out.println("Drawing a Rectangle");
        }
    }
    class circles implements drawable {

            @Override
            public void draw() {
                System.out.println("Drawing a Circle");
            }
        }

