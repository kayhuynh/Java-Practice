public class BinarySearch {

    /* Implementation of iterative Binary Search using Bounded Paramter Type */


    /* No need to instantiate this class since it's only meant for providing a 
     * binary search implementation 
     */
    private BinarySearch() {
    }

    /*
     *  Do a binary search on any type that implements the Comparable interface. 
     *  @params:
     *      lst: SORTED list to be searched.
     *      target: The item we are looking for.
     *
     *  @ret: the index of the target.
    */
    public static <T extends Comparable<T>> int indexOf(T[] lst, T target) {
        int mid;
        int start = 0;
        int end = lst.length - 1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            int cmp = target.compareTo(lst[mid]);
            if (cmp == 0) { 
                return mid; 
            }
            else if (cmp < 0) { 
                end = mid - 1; 
            }
            else { 
                start = mid + 1; 
            }
        }
        return -1;  // If the target is not in the list.
    }




    public static void main(String[] args) {
        int size = 5;
        Integer[] arr = new Integer[size];
        int num = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = new Integer(num);
            num += 2;
        }

        int index = BinarySearch.indexOf(arr, 100);
        System.out.println("Result should be -1: " + index);

        index = BinarySearch.indexOf(arr, 6);
        System.out.println("Result should be 3: " + index);
    }
}
