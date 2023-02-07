public class perfectInteger {

    public static void main(String[] args) {
        
        int n = 6;
        int n1 = 0 ;

        for (int i = 1; i < n; i++) {
            if(n%i==0)
            {
                n1+=i;
            }
            
        }

        String str = n == n1 ? "Perfect" : "Not Perfect";
        System.out.println(str);
    }
    
}
