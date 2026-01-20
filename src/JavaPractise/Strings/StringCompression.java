package JavaPractise.Strings;

public class StringCompression {
    public static void main(String[] args) {
        String s1 = "aaabcccdddeelnulcthtkan.tccn.gdm";
        System.out.println(s1.length());


       char[] ch = s1.toCharArray();
        System.out.println(ch.length);

        for (int i = 0; i < ch.length; i++)
        {

            if (ch[i] != '-')
            {
                int count = 1;

                for (int j = i + 1; j < ch.length; j++)
                {

                    if (ch[i] == ch[j])
                    {
                        count++;
                        ch[j] = '-';


                    }
                }

                System.out.print(s1.charAt(i) + "" + count);
            }

        }
        }

    }

