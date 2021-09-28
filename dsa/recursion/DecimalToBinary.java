class DecimalToBinary {
  public static void main(String[] args) {
    DecimalToBinary main = new DecimalToBinary();
    var result = main.decimalToBinary(5);
    System.out.println(result);
  }

  // Question 4 - Decimal to Binary

  public int decimalToBinary(int n) {
    if (n==0) {
      return 0;
    }
    return n%2 + 10*decimalToBinary(n/2);
  }


}
