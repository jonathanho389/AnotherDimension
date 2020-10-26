public class ArrayOps{
  public static int sum(int[] arr){
    int length = arr.length;
    int sum = 0;
    for(int i = 0;i < length;i++){
      sum += arr[i];
    }
    return sum;
  }
  public static int largest(int[] arr){
    int length = arr.length;
    int max = 0;
    for(int i = 0;i < length;i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }
    return max;
  }
  public static int[] sumRows(int[][] matrix){
    int length =  matrix.length;
    int sum = 0;
    int[] sumarr = new int[length];
    for(int i = 0;i < length;i++){
      for(int j = 0;j < matrix[0].length;j++){
        sum += matrix[i][j];
      }
      sumarr[i] = sum;
      sum = 0;
    }
  return sumarr;
  }
  public static int[] largestInRows(int[][] matrix){
    int length = matrix.length;
    int max = 0;
    int[] maxarr = new int[length];
    for(int i = 0;i < length;i++){
      for(int j = 0;j < length;j++){
        if(matrix[i][j] > max){
          max = matrix[i][j];
        }
      }
      maxarr[i] = max;
      max = 0;
    }
    return maxarr;
  }
  public static int sum(int[][] matrix){
    int length = matrix.length;
    int sum = 0;
    for(int i = 0;i < length;i++){
      for(int j = 0;j <= length;j++){
        sum += matrix[i][j];
      }
    }
    return sum;
  }
}
