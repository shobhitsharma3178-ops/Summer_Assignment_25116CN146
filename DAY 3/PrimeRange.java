class PrimeRange {
    public static void main(String args[])
    {
        int a =10;
        int b =30;
        for(int i =0; i<=b; i++){
            int c=0;
            for(int j=1; j<=i; j++){
                if(i%j==0)
                    c++;
            }
            if (c==2)
                System.out.println(i + "");

            
            }
        }
    }
