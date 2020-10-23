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
}
