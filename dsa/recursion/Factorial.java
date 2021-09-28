class Factorial {
  public static void main(String args[]) {
    Factorial f = new Factorial();
    System.out.println("Factorial::" + f.factorial(2));
  }

  public int factorial(int n) {
    if(n<0) return -1;
    else if(n==0 || n==1) return 1;
    else return n*factorial(n-1);
  }
}