import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int arr[] = new int[n];
       for(int i = 0; i <= n - 1; i++){
           arr[i] = in.nextInt();
       }
       // Function call
       subsets_of_size_3(n, arr);
    }
    public static void subsets_of_size_3(int arr_size, int arr[])
    {
        for(int index1 = 0; index1 <= arr_size - 2; index1++)
        {
            for(int index2 = index1 + 1; index2 <= arr_size - 1; index2++)
            {
                for(int index3 = index2 + 1; index3 <= arr_size - 1; index3++)
                {
                    System.out.print("(" + arr[index1] + "," + " " + arr[index2] + "," + " " + arr[index3] + ")" + " ");
                }
            }
            System.out.println();
        }
    
    }
}