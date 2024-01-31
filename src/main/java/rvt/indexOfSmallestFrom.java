package rvt;

public class indexOfSmallestFrom {
    public static int FindindexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (smallest > table[i]) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }
}


// public static int sort(int[] array) {

//     for (int i = 0; i < array.length; i++) {
//         int indexOfSmallestFrom = indexOfSmallestFrom(array, i);
//         swap(array, i, indexOfSmallestFrom);
//     }
//     return array;
// }

