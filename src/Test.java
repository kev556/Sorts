public class Test
{
    public static void main(String[] args)
    {
        int[] arr1 = Sorts.buildArray(100000, 5);
        // int[] arr2 = Sorts.copyArray(arr);
        int[] arr2 = arr1.clone();

        //selection sort on unsorted data
        long start1 = System.currentTimeMillis();
        Sorts.ascendingSort(arr1);
        long end1 = System.currentTimeMillis();
        long selectiontime1 = end1 - start1;
        System.out.println("Selection sort on unsorted data: " + selectiontime1);

        //selection sort on sorted data
        long start2 = System.currentTimeMillis();
        Sorts.ascendingSort(arr1);
        long end2 = System.currentTimeMillis();
        long selectiontime2 = end2 - start2;
        System.out.println("Selection sort on sorted data: " + selectiontime2);

        //insertion sort on unsorted data
        long start3 = System.currentTimeMillis();
        Sorts.insertionSort(arr2);
        long end3 = System.currentTimeMillis();
        long selectiontime3 = end3 - start3;
        System.out.println("Insertion sort on unsorted data: " + selectiontime3);

        long start4 = System.currentTimeMillis();
        Sorts.insertionSort(arr2);
        long end4 = System.currentTimeMillis();
        long selectiontime4 = end4 - start4;
        System.out.println("Insertion sort on sorted data: " + selectiontime4);
    }
}
