class digitPerLine { 


    public static void main(String[] args) {
        
        int a = 5671923;

        while(a!=0)
        {
            System.out.println(a%10);
            a/=10;
        }
    }
}