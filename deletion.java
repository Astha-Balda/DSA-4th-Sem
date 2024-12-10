import java.util.Arrays;

public class deletion {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int index = 2;
        int n = arr.length;

       int newArr[] = new int[ n - 1];


       for ( int i =0 ; i< n; i++)
       {
         if (i < index)
         {
            newArr[i] = arr[i];
         }
          else if (i > index)
          {
              newArr[i-1] = arr[i];
          }
          else
          {
              continue;
          }
       }

       System.out.println("Array after deletion of element: " + Arrays.toString(newArr));
  
        }
    }