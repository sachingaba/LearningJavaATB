package JavaPractise.AA_InterviewQuestions;

public class ArrayAlternatePlacement {

    public static void main(String[] args) {
        String[] arr1 = {"a","b","c","g","f","r" };
        String[] arr2 = {"d","e","f","a","b","c","g","hh"};

int i=0;
StringBuilder sb = new StringBuilder();
        while( i<arr1.length && i<arr2.length){

            sb.append(arr1[i]+ " ");
            sb.append(arr2[i] + " ");

            i++;

        }
        while(i<arr1.length){
            sb.append(arr1[i]+ " ");
            i++;
        }
        while(i<arr2.length){
            sb.append(arr2[i]+" ");
            i++;
        }
        System.out.println(sb);
    }
}
