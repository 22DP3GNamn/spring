package rvt;

public class indexOfSmallest {
    public static int FindindexOfSmallest(int[] array){
        int smallest = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++){
            if (smallest > array[i]){
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
}
