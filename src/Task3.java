public class Task3 {


    public static void method(int arr)
    {
        boolean varBool;
        varBool= arr%2==0 ? true : false;
        System.out.println(varBool);

    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,};
        method(arr[0]);
        method(arr[1]);
        method(arr[2]);
        method(arr[3]);
    }
}
