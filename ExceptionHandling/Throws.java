package ExceptionHandling;

public class Throws {
    public void Shorting(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("sorted array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[10]);
    }

    public static void main(String[] args) throws Exception {
        int[] arr = { 5, 4, 3, 2, 1 };
        Throws obj = new Throws(); // creating object
        obj.Shorting(arr); // call by object because Shorting method is not static
    }
}
