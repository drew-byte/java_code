public class armstrongorNot {
    
    public static void main(String[] args) {
        
        int n = 153;
        int n1 = 0;
        int n2 = n;

        while(n!=0)
        {
            n1+=Math.pow(n%10, 3);
            n/=10;
        }
        
        String str = n1==n2 ? "Armstrong" : "Not Armstrong";
        System.out.println(str);
    }
}
