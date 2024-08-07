package DSA;

public class Binary {

    public int search(int[] arr, int target) {
        int steps = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            steps++;
            System.out.println("Steps : " + steps);

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Binary b = new Binary();
        System.out.println(b.search(arr, 5));
    }
}
