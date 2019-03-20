public class Merge{
  public static void mergesort(int[]data){

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
    int temp = 0;
    int counter = 0;
    int i = 0;
    while(i < median - lo + 1) {
      if( data[lo] <= data[counter + median]) {
        data[i + counter + lo] = data[lo];
        i += 1;
      }
      else {
        data[i + counter + lo] = data[median + counter];
        counter += 1;
      }
    }
    while(counter + median < high - median) {
      data[i + counter + lo] = data[median + counter];
      counter += 1;
    }
  return data;
  }
}
