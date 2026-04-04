package JavaPractise;

public class StringToInteger {
    public static void main(String[] args) {
        String nums = "1,3,4,5,6,12,23,54,55,32,6,3,2,1";
        String[] numc = nums.split(",");
        String pos = " ";
        for(int i=0;i<numc.length;i++)
        {
            if((Integer.parseInt(numc[i])<10)){
                pos += Integer.parseInt(numc[i]) + " ";
            }
        }
        System.out.println(pos);
    }
}
