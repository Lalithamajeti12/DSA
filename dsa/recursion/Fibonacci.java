class Fibonacci {
  //First method
  // public static void main(String args[]) {
  //   int first = 0;
  //   int second = 1;
  //   System.out.print(first+" , "+second);
  //   Fibonacci f = new Fibonacci();
  //   f.fibonacciSeries(first, second, 15);
  // }

  // public void fibonacciSeries(int first, int second, int n) {
  //   if((n-1)>1) {
  //     System.out.print( " , " + (first+second));
  //     fibonacciSeries(second, first+second, n-1);
  //   }
  // }

  //Second method f(n) = f(n-1) + f(n-2)
  public static void main(String args[]) {
    Fibonacci f = new Fibonacci();
    int n = f.fibonacciSeries(10);
    System.out.print(n);
  }

  public int fibonacciSeries(int n) {
    if(n<0) return 0;
    else if(n==0 || n==1) return n;
    else return fibonacciSeries(n-1) + fibonacciSeries(n-2);
  } 
}