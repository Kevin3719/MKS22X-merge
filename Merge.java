public class Merge{
  public static void mergesort(int[]data){
  }
  public static int[] merge(int[] list1, int[] list2) {
    int temp = 0;
    int counter = 0;
    int[] output = new int[list1.length + list2.length];
    int i = 0;
    while(i < list1.length) {
      if( list1[i] <= list2[counter]) {
        output[i + counter] = list1[i];
        i += 1;
      }
      else {
        output[i + counter] = list2[counter];
        counter += 1;
      }
    }
    while(counter < list2.length) {
      output[i + counter] = list2[counter];
      counter += 1;
    }
  return output;
  }
}