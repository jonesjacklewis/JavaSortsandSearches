public class App {
    public static void main(String[] args) {
        Sorts sorts = new Sorts();
        Searches searches = new Searches();

        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        // sorts.bubbleSort(arr);
       // sorts.insertionSort(arr);

        searches.binarySearch(arr);

    }
}
