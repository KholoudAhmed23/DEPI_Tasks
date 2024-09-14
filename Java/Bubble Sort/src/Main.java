public class Main {
    public static void main(String[] args) {
        int[] array = {4,5,3,2,1};

        System.out.print("Unsorted array: ");
        printArray(array);

        bubbleSort(array);

        System.out.print("Sorted array  : ");
        printArray(array);
    }
    //bubble sort function
        public static void bubbleSort(int[] arr) {
            //check fishing my array or not
            for (int i = 0; i < (arr.length) - 1; i++) {
                //comparing array elements
                for (int j = 0; j < (arr.length) - i - 1; j++) {
                    // Swapping(sorting) process if left is greater than right
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        //print array function
        public static void printArray(int[] arr) {
            for (int i : arr) {
                System.out.print( i + " " );
            }
            System.out.print("\n");
        }
    }
