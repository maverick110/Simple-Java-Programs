package passion;

public class Pattern {
   void pattern1()
   {
       int k=5,l=1;
       for(int i=1;i<=5;i++)
       {  for(int j=1;j<=k;j++)
               System.out.print("*");
               System.out.println();
               k--;
       }
    }
   void pattern2()
   {
       int k=1;
       for(int i=1;i<=5;i++)
       {  for(int j=1;j<=k;j++)
               System.out.print("*");
               System.out.println();
               k++;
       }
   }
   void pattern3()
   {    
       int k=1,y=3;
       for(int i=1;i<=4;i++)
       {
            for(int x=1;x<=y;x++)
            System.out.print(" ");
           for(int j=1;j<=k;j++)
                System.out.print("*");
                k+=2;
                System.out.println();
                y--;
       }   
       
   }
   void pattern4()
   {
        int k=1,y=2;
       for(int i=1;i<=3;i++)
       {
            for(int x=1;x<=y;x++)
            System.out.print(" ");
           for(int j=1;j<=k;j++)
                System.out.print("*");
                k+=2;
                System.out.println();
                y--;
       } 
       int z=1;k=3;
       for(int i=1;i<=2;i++)
       {
           for(int s=1;s<=z;s++)
               System.out.print(" ");
               for(int j=1;j<=k;j++)
                   System.out.print("*");
                   System.out.println();
                   k=k-2;
                   z++;
       }
       
       
       
       
   }
    
    
    
    public static void main(String as[])
    {
        System.out.println("pattern 1");
        new Pattern().pattern1();
        System.out.println("pattern 2");
        new Pattern().pattern2();
        System.out.println("pattern 3");
        new Pattern().pattern3();
        System.out.println("pattern 4");
        new Pattern().pattern4();
    }
}
/*
OUTPUT:

pattern 1
*****
****
***
**
*
pattern 2
*
**
***
****
*****
pattern 3
   *
  ***
 *****
*******
pattern 4
  *
 ***
*****
 ***
  *
  
*/
