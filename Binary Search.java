//Binary Search can search a data in log(n) time but the data structure must be sorted.
public static int binarySearchRecursively(int[] array, int key) {
  return binarySearchRecursively(array, 0, array.length, key);
}

public static int binarySearchRecursively(
    int[] array, int fromIndex, int toIndex, int key) {
  if (toIndex <= fromIndex) return -1;

  int mid = (fromIndex + toIndex) >>> 1;
  int midVal = array[mid];

  if (key == midVal) {
    return mid;
  } else if (key < midVal) {
    return binarySearchRecursively(array, fromIndex, mid, key);
  } else {
    return binarySearchRecursively(array, mid + 1, toIndex, key);
  }
}
