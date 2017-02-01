
package passion;
public class MainOverload {
  public static final void main(int a)
  {
      System.out.println("in Integer main" +a);
  }
  public static final void main(float x)
  {
      System.out.println("in Float main"+x);
      main(10);
  }
  public static final void main(float x,int h)
  {
      System.out.print(x+" overloaded main "+h);
  }
  public static final void main(String rofl[]) //When i run this, always this main method is called..
  {
      main(2);
      main(7.6f);
      main(3.3f,7);
  }
  


}
/*
OUTPUT:

in Integer main2
in Float main7.6
in Integer main10
3.3 overloaded main 7
*/
