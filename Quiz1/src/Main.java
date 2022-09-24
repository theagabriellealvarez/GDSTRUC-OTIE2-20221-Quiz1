public class Main {
    public static void main(String[] args) {
        // initialize array for bubble sort
        int[] numbers = new int[10];
        numbers[0] = 25;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 10;
        numbers[4] = 38;
        numbers[5] = 62;
        numbers[6] = 20;
        numbers[7] = 8;
        numbers[8] = 173;
        numbers[9] = 65;

        //initialize another array for selection sort
        int[] numbers2 = new int[10];
        numbers2[0] = 25;
        numbers2[1] = 3;
        numbers2[2] = 5;
        numbers2[3] = 10;
        numbers2[4] = 38;
        numbers2[5] = 62;
        numbers2[6] = 20;
        numbers2[7] = 8;
        numbers2[8] = 173;
        numbers2[9] = 65;

        //BUBBLE SORT
        // array before sorting
        System.out.print("Array Before Sorting: ");
        printArrayElements(numbers);
        System.out.print("\n\n");

        // array after sorting
        System.out.print("Array After Sorting Using BubbleSort: ");
        bubbleSort(numbers);
        printArrayElements(numbers);
        System.out.print("\n\n");

        //SELECTION SORT
        System.out.print("Array Before Sorting: ");
        printArrayElements(numbers2);
        System.out.print("\n\n");

        // array after sorting
        System.out.print("Array After Sorting Using SelectionSort: ");
        selectionSort(numbers2);
        printArrayElements(numbers2);
        System.out.print("\n");
    }

    // function to print the array elements
    private static void printArrayElements(int[] numbers) {
        for (int value : numbers ) {
            System.out.print(value + " ");
        }
    }

    // function to sort the array using bubble sort algorithm
    private static void bubbleSort(int[] numbers) {
        for (int lastSortedIndex = numbers.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            for (int i = 0; i < lastSortedIndex; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    // swap the adjacent elements
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
    }

    // function to sort the array using selection sort algorithm
    private static void selectionSort(int[] numbers2) {
        for (int lastSortedIndex = numbers2.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            int smallestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++) {
                if (numbers2[i] < numbers2[smallestIndex]) {
                    smallestIndex = i;
                }
            }

            // swap element in smallestIndex with element in lastSortedIndex
            int temp = numbers2[smallestIndex];
            numbers2[smallestIndex] = numbers2[lastSortedIndex];
            numbers2[lastSortedIndex] = temp;
        }
    }
}