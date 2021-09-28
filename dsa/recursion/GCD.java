class GCD{
  public static void main(String args[]) {
    GCD gcd = new GCD();
    int result = gcd.gcdOfTwoNumbers(9,3);
    System.out.println(result);
  }
  //First Method
  // public int gcdOfTwoNumbers(int num1, int num2) {
  //   if(num1 == 0) return num2;
  //   else if(num2 == 0) return num1;
  //   else if(num1 == num2) return num1;
  //   if(num1 > num2) return gcdOfTwoNumbers(num1-num2, num2);
  //   else return gcdOfTwoNumbers(num1, num2-num1);
  // }
  //Second Method
  public int gcdOfTwoNumbers(int num1, int num2) {
    if(num1<0 || num2<0) return -1;
    if(num1 == 0) return num2;
    else if(num2 == 0) return num1;
    return gcdOfTwoNumbers(num2, num1%num2);
  }
}