public class sizeInt {

    public static void main(String[] args) {
        
        int a = 1231231;
        int c = 0;

        while(a!=0)
        {
            a/=10;
            c++; 
        }
        System.out.println(c);
    }
}
