public class sumDigitsInput {
    
    public static void main(String[] args) {
        int n = 123123;

        int sum = 0;
        while(n!=0)
        {
            sum+=n%10;
            n/=sum;
        }
        System.out.println(sum);
    }
}
