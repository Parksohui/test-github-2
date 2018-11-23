public class Calculator(){

  public int sum(int a, int b){
    return a+b;
  }

  public int minus(int a, int b){
    return a-b;
  }
  public int multiple(int a, int b){
    return a*b;
  }

  public static void main(String [] args){
    int a = 4;
    int b = 2;
    System.out.println(sum(a,b));

    System.out.println(minus(a,b));
  }

}
