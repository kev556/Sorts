
import java.util.ArrayList;

public class Sorts
{

    public static void ascendingSort(int[] arr) {
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
    public static void ascendingSort(String[] arr) {
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
    public static void ascendingSort(ArrayList<String> arr) {
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

        ArrayList<String> dumpster = new ArrayList<>();

        for (int i = arr.size() - 1; i > 0; i--)
        {
            if (arr.get(i).length() > maxLength) {
                dumpster.add(arr.get(i));
                arr.remove(i);
            }
        }
        return dumpster;
    }
}
