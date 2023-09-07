package utils;

public class MergeArray {

    public static int [] merge(int arr1 [], int arr2 []){

        int [] arr3 = new int[arr1.length + arr2.length];

        int k = 0;//new variable that will be used as an index number of merged array

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];// every time i is increased, k is increased, we are assigning elements of arr1 to index numbers of arr3
        }
        for (int j = 0; j < arr2.length; j++, k++) {
            arr3[k] = arr2[j];
        }
        return arr3;
    }
}
