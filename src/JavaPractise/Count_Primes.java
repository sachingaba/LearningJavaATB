package JavaPractise;

public class Count_Primes {
    public static int countPrimes(int n) {
        int count = 0;

        for(int i=0;i<n;i++){
            if(isPrime(i)){
                count++;
                //    System.out.println(i);
            }
        }
        return count;
    }
    static boolean isPrime(int n){
        if (n == 0 || n == 1){
            //  System.out.println("No prime");
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(5000000));
    }
}
