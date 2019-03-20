public class Merge{
  public static void mergesort(int[]data){
    mergesort(data,0,data.length - 1);
  }
  public static void mergesort(int[] data,int lo,int hi) {
    if(lo >= hi) {
      return;
    }
    int median = (lo + hi) / 2;
    int[] left = new int[median - lo + 1];
    for(int i = 0; i < left.length; i++) {
      left[i] = data[lo + i];
    }
    mergesort(left,0, left.length - 1);
    int[] right = new int[hi - median];
    for(int i = 0; i < right.length;i++ ){
      right[i] = data[median + i + 1];
    }
    mergesort(right, 0, right.length - 1);
    merge(data,left, right);
  }




  // merge 2 already sorted list
  public static void merge(int[] data, int[] list1, int[] list2) {
    int leftc = 0;
    int rightc = 0;
    int i = 0;
      while(leftc < list1.length && rightc < list2.length) {
        if (list1[leftc] <= list2[rightc]) {
          data[i] = list1[leftc];
          leftc += 1;
        }
        else {
          data[i] = list2[rightc];
          rightc += 1;
        }
        i += 1;
      }
      while (leftc < list1.length) {
        data[i] = list1[leftc];
        i += 1;
        leftc += 1;
      }
      while (rightc < list2.length) {
        data[i] = list2[rightc];
        i += 1;
        rightc += 1;
      }

    }


  public static String print(int nums[]) {
    String output = "";
    for (int i = 0; i < nums.length; i++) {
        output += nums[i] + " ";
      }
    System.out.println(output);
    return output;
  }
}
