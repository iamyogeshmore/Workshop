public class ArrayExample {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 4, 5, 6};

        int missingNumber = findMissingNumber(arr1, arr2);

        System.out.println("Missing number: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr1, int[] arr2) {
        int sumArr1 = 0;
        for (int num : arr1) {
            sumArr1 += num;
        }

        int sumArr2 = 0;
        for (int num : arr2) {
            sumArr2 += num;
        }

        return sumArr1 - sumArr2;
    }
}
