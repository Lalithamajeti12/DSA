//Calculate sum of the digits of a number using recursion
class SumOfDigitsOfANumber {
  public static void main(String args[]) {
    SumOfDigitsOfANumber sum = new SumOfDigitsOfANumber();
    int result = sum.sumOfDigits(9998, 0);
    System.out.println(result);
  }

  public int sumOfDigits(int number, int sum) {
    if(number <= 0 ) {
      return sum;
    }
    return sumOfDigits(number/10, sum+(number%10));
  }
}