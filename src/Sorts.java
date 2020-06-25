public class Sorts {

    public int[] bubbleSort(int[] arr){

        System.out.println(printArray(arr));

        int n = arr.length;
        int temp;

        for(int i = 0; i < n -1; i++){
            for(int j =0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(printArray(arr));
        return arr;
    }

    public int[] insertionSort(int[] arr){
        System.out.println(printArray(arr));

        int n = arr.length;

        for(int i = 1; i<n; i++){
            int val = arr[i];
            int j = i -1;

            while(j >= 0 && arr[j] > val){
                arr[j+1] = arr[j];
                j -= 1;
            }
            arr[j+1] = val;
        }
        System.out.println(printArray(arr));

        return arr;

    }

    private static String printArray(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i: arr){
            sb.append(i + " ");
        }

        return sb.toString();
    }


}
