public class Merge{
  public static void mergesort(int[]data){
    mergesort(data,0,data.length - 1);
  }
  public static void mergesort(int[] data,int lo,int hi) {
    if(lo >= hi) {
      return;
    }
    int median = (lo + hi) / 2;
    mergesort(data,lo,median);
    mergesort(data, median + 1,hi);
    merge(data, lo, median, hi);
  }




  // merge 2 already sorted list
  public static int[] merge(int[] data,int lo,int median, int high) {
    int locounter = 0;
    int counter = 0;
    int i = 0;
    int[] temp = new int[high - lo + 1];
    while(median + counter <= high && i < temp.length && lo + locounter < median) {
      
      if(data[lo + locounter] > data[median + counter]) {
        temp[i] = data[median + counter];
        counter += 1;
      }
      else {
        temp[i] = data[lo +locounter];
        locounter += 1;
      }
      i += 1;
    }
    if (i > median) {
    while (i < temp.length) {
      temp[i] = data[i + counter];
      i += 1;
    }
  }
  print(temp);
  for (int j = 0; j < temp.length; j++) {

    data[lo + j] = temp[j];
  }
  return data;
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
