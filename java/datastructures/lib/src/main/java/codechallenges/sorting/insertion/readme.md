# Insertion Sort

We start with the provided array [8, 4, 23, 42, 16, 15]

We insert, 4 to get [4, 8, 23, 42, 16 , 15]

We insert 23 to get [4, 8, 23, 42, 16, 15]

We insert 42 to get [4, 8, 23, 42, 16, 15]

We insert 16 to get [4, 8, 16, 23, 42, 15]

We insert 15 to get [4, 8, 15, 16, 23, 42]

sorted is initalized as a new array, input[0] = 8, then for the first iteration, where i = 1, input [1] = 4, since 4<8 don't iterate i, then shift the 8 to the right and insert 4 at index i

Repeat this process for each of the values, the code will look something like this (generated with ChatGPT help):

public class InsertionSort {
    public static void main(String[] args) {
        int[] input = {8,4,23,42,16,15};
        int[] sorted = insertionSort(input);

        for(int value : sorted) {
            System.out.print(value + " ");
        }
    }

    public static int[] insertionSort(int[] input) {
        int[] sorted = new int[input.length];
        sorted[0] = input[0];

        for (int i = 1; i < input.length; i++) {
            insert(sorted, input[i], i);
        }

        return sorted;
    }

    public static void insert(int[] sorted, int value, int end) {
        int i = 0;
        while (i < end && value > sorted[i]) {
            i++;
        }

        // Shift elements to the right from the position where value is to be inserted
        for (int j = end; j > i; j--) {
            sorted[j] = sorted[j - 1];
        }

        sorted[i] = value;
    }
}

