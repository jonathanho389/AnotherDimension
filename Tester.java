import java.util.*;
public class Tester{
  public static void main(String[] args) {
    int[] newarr =  {1, 3, 5};
    int[][] newarr2 =  { {  1,  0, 12, -1 },
                          {  7, -2,  2,  1 },
                          { -5, -2,  2, -9 }
                      };
    System.out.println(ArrayOps.sum(newarr));
    System.out.println(ArrayOps.largest(newarr));
    System.out.println(Arrays.toString(ArrayOps.sumRows(newarr2)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(newarr2)));
    System.out.println(ArrayOps.sum(newarr2));
  }
}
