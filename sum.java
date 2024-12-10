public class sum {
    public static void main(String[] args) {
        int count =0;
        int sum =0;
        
        int arr[] = {10,20,30,40,50};

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count++;
        }

        System.out.println("sum of elements: " + sum);
        System.out.println("Number of opeartions is " + (count -1));
    }


}