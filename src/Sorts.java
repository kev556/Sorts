import java.util.ArrayList;

import javax.swing.text.Utilities;

public class Sorts
{
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lowPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[lowPosition]) {
                    lowPosition = j;
                }
                swap(i, lowPosition, arr);
            }
        }
    }
    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lowPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[lowPosition]) < 0) {
                    lowPosition = j;
                }
                swap(i, lowPosition, arr);
            }
        }
    }
    public static void selectionSort(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int lowPosition = i;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j).compareTo(arr.get(lowPosition)) < 0) {
                    lowPosition = j;
                }

            }
        }
    }

    public static void insertionSort(int[] elements) {
        for (int i = 1; i < elements.length; i++) {
            int temp = elements[i];
            int possibleIndex = i;

            while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
    }
	
    public static void bubbleSort(int[] elements) {
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = 0; j < elements.length - i - 1; j++) {
                if (elements[j] > elements[j + 1]) {
                    int temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
	}
    
    public static void mergeSort(int[] elements, int left, int right) {
        if (left < right) {
            int middle = (l + r) / 2;

            mergeSort(elements, left, right);   // sort left half
            mergeSort(elements, middle + 1, right); // sort right half
            merge(elements, left, middle, right);    // merge sorted halfs
        }
        return arr;
    }
    public static void merge(int[] arr, int l, int m, int r) { 
        
        // Find lengths of two subarrays to be merged
        int length1 = m - l + 1;
        int length2 = r - m;

        // Create temp arrays 
        int L[] = new int[length1];
        int R[] = new int[length2];

        // Copy the sorted left & right halfs to temp arrays
        for (int i = 0; i < length1; i++) {
            L[i] = arr[l + i];
        }
        
        for (int j = 0; j < length2; j++) {
            R[j] = arr[m + 1 + j];
        }
        
        // initial indexes of left and right sub-arrays
        int i = 0; // index for left
        int j = 0; // index for right
        int k = l; // Initial index of merged subarray array

        // Merge the two sorted halfs into the original array
        while(i < length1 && j < length2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // One of the halfs will have elements remaining

        // Copy remaining elements of L[] if any 
        while (i < length1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any 
        while (j < length2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void bucketSort(int[] elements) {
        int[] temp = new int[3];
        for (int n : elements)
            temp[n]++;

        int i = 0;
        for (int n = 0; n < temp.length; n++) {
            for (int j = 0; j < temp[n]; j++) {
                elements[i] = n;
                i++;
            }
        }
    }
    public static void swap(int indexA,int indexB, int[] arr) {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }
    public static void swap(int indexA, int indexB, String[] arr) {
        String temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static int[] buildArray(int indices, int digits)
    {
        int[] arr = new int[indices];

        for (int i = 0; i < indices; i++)
            arr[i] = Utilities.getRandomNumber(digits);
        return arr;
    }
    public static int[] copyArray(int[] arr)
    {
        int[] copy = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++)
            copy[i] = arr[i];
        return copy;
    }

    public static ArrayList<String> removeLongerThan(int maxLength, ArrayList<String> arr) {

        ArrayList<String> temp = new ArrayList<>();

        for (int i = arr.size() - 1; i > 0; i--)
        {
            if (arr.get(i).length() > maxLength) {
                temp.add(arr.get(i));
                arr.remove(i);
            }
        }
        return temp;
    }
}
