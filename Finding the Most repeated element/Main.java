import java.util.Scanner; 
class Main 
{
	public static void main (String[] args) 
	{ 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int freq[] = new int[n]; 
      int max_count_idx = 0; 
		int curr_count = 1; 
		
	    for(int i = 0; i < n; i++)
	    {
		    for (int j = i+1; j < n; j++) 
		    { 
	            if(arr[i] == arr[j])
	            curr_count ++;
		    }
		    freq[i] = curr_count;
		    curr_count = 1;
	    } 
	    for( int i = 0; i < n; i++)
	    {
            if(freq[i]>freq[max_count_idx])
            max_count_idx = i;
	    }
	    System.out.println(arr[max_count_idx]);
	} 
}