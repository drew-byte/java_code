public class SwapVal {
    
    public static void withThird()
    {
        int a = 1;
        int b = 0;
        int c;

        c = a;
        a = b;
        b = c;
        
        System.out.println("A is " + a +"\nB is " + b);
    }
    public static void noThird()
    {
        int a = 0;
        int b = 1;
        
        a +=b;
        b -=a;
        a -=b;
        System.out.println("A is " + a +"\nB is " + b);
        
    }
}
