package JavaPractise.Strings;

public class Print_Duplicate_Characters {

    public static void main(String[] args) {
        String s1 = "Programming";

        String lC = s1.toLowerCase();

        for (int i = 0; i < lC.length(); i++) {


                int count = 1;
                for (int j = i + 1; j < lC.length(); j++) {

                    if (s1.charAt(i) == s1.charAt(j)) {
                        count++;

                    }

                }
                if (count > 1) {
                    System.out.println(s1.charAt(i) + " : " + count);
                }

            }


        }
    }