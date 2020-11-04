import java.util.Arrays;

public class MergeSort {

    public int[] sort(int[] arr) {
        int length = arr.length;
        if (length <= 1) {
            return arr;
        }
        int mid = Math.floorDiv(length, 2);
        int[] leftArray = Arrays.copyOfRange(arr, 0, mid);
        int[] rightArray = Arrays.copyOfRange(arr, mid, length);
        return merge(sort(leftArray), sort(rightArray));
    }

    public int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int leftPos = 0;
        int rightPos = 0;
        int curIndex = 0;

        while (left.length > leftPos && right.length > rightPos) {
          if (left[leftPos] < right[rightPos]) {
            merged[curIndex] = left[leftPos];
            leftPos++;
          } else {
            merged[curIndex] = right[rightPos];
            rightPos++;
          }
           curIndex++;
        }
        System.arraycopy(left, leftPos, merged, curIndex, left.length - leftPos);
        System.arraycopy(right, rightPos, merged, curIndex, right.length - rightPos);
         return merged;
    }


    public static void main (String[] args) {
/*      MergeSort mergeTest = new MergeSort();
      int[] sortedLeft = {2, 3, 5};
      int[] sortedRight = {4, 7, 90};

      System.out.println(Arrays.toString(mergeTest.merge(sortedLeft, sortedRight)));
*/
    int[] inputArr = {3, 5, 2, 90, 4, 8};
      MergeSort sorter = new MergeSort();
      System.out.println(Arrays.toString(sorter.sort(inputArr)));
      
    }
}
