public class Problem3
{
  public static void main(String[] args)
  {
    double x = 473.12312455;
    System.out.println(x);
    x %= 1;
    x *= 10;
    System.out.print("Answer: " + (int) x + " ");
    x %= 1;
    x *= 10;
    System.out.print((int) x + " ");
    x %= 1;
    x *= 10;
    System.out.println((int) x + " ");
  }
}

