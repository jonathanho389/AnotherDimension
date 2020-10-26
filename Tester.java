import java.util.*;
public class Tester{
  public static void main(String[] args) {
    int[] newarr =  {1, 3, 5};
    int[][] newarr2 =  { {  1,  0, 12, -1 },
                          {  7, -2,  2,  1 },
                          { -5, -2,  2, -9 }
                      };
    int[][] newarr3 = { {  1,  2, 3, 4 },
                        {  2, 3,  4,  1 },
                        { 3, 4,  1, 2 }
                      };
    int[][] newarr4 = { {  1,  1, 1 },
                        {  2, 2, 2 },
                        { 3,  3, 3 }
                      };
    int[][] newarr5 = { {  2,  2, 2 },
                        {  2, 2, 2 }
                      };
    System.out.println(ArrayOps.sum(newarr));
    System.out.println(ArrayOps.largest(newarr));
    System.out.println(Arrays.toString(ArrayOps.sumRows(newarr2)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(newarr2)));
    System.out.println(ArrayOps.sum(newarr2));
    System.out.println(Arrays.toString(ArrayOps.sumCols(newarr2)));
    System.out.println(ArrayOps.isRowMagic(newarr3));
    System.out.println(ArrayOps.isColMagic(newarr4));
    System.out.println(ArrayOps.isRowMagic(newarr5));
    System.out.println(ArrayOps.isColMagic(newarr5));
  }
}
