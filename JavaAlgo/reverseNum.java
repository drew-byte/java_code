public class reverseNum {
    

    public static void main(String[] args) {
        
        int n = 1434;
        while(n!=0)
        {
            int n2 = n%10;
            System.out.print(n2);
            n/=10;
        }
    }
}
