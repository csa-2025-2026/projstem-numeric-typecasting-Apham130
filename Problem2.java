public class Problem2
{
  public static void main(String[] args)
  {
    double x = 56.123891471;
    double y = 78.123917469671;
    int xi, yi;
    System.out.println("Two original numbers:\n" + x + "\n" + y);
    xi = (int) (x + 0.5);
    yi = (int) (y + 0.5);
    int sum  = xi + yi;
    System.out.println("Answer: " + sum);

  }
}

