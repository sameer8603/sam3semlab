public class SortingFunction {
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {50, 20, 40, 10, 30};

        sort(arr);

        System.out.println("Array in ascending order:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
