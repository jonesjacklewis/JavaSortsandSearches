import java.util.Scanner;

public class Searches {
    private static String printArray(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i: arr){
            sb.append(i + " ");
        }

        return sb.toString();
    }

    public static void linearSearch(int[] arr){
        System.out.println(printArray(arr));

        int n = arr.length;
        int i = 0;
        Boolean found = false;
        Scanner in = new Scanner(System.in);
        System.out.println("What integer would you like to find? ");
        int toFind = Integer.parseInt(in.next());
        in.close();
        while(i < n && !found){
            if(found){
                break;
            }
            if(arr[i] == toFind){
                found = true;
                break;
            }else{
                i++;
            }
        }

        if(found == false){
            System.out.println(toFind + " is not in the array.");
        }else{
            System.out.println(toFind + " was found at index " + (i) + ".");
        }



    }


    public static void binarySearch(int[] arr){
        System.out.println(printArray(arr));

        int n = arr.length;
        int i = 0;
        boolean found = false;

        int[] sorted = new Sorts().bubbleSort(arr);

        Scanner in = new Scanner(System.in);
        System.out.println("What integer would you like to find? ");
        int toFind = Integer.parseInt(in.next());
        in.close();

        int high, mid, low;

        high = arr.length - 1;
        low = 0;
        mid = (high + low) / 2;


        while(found == false && high>low){
            if(sorted[mid] == toFind){
                found = true;
            }else{
                if(sorted[mid] < toFind){
                    low = mid + 1;
                    mid = (high + low) / 2;
                }else{
                    high =  mid -1;
                    mid = (high + low) / 2;
                }
            }
        }

        if(found){
            System.out.println(toFind + " was found at index " + mid);
        }else{
            System.out.println(toFind + " is not in the array.");
        }




    }



}
