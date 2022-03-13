1. Using Sorting TC- O(nlogn)  SC-O(1)

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
       Arrays.sort(arr);
       
       return arr[k-1];
    } 
}


2. Using Priority Queue  TC-O(N) SC-O(logn)
  class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       
       for(int i=0;i<=r;i++)
       {
           pq.add(arr[i]);
       }
       
       for(int i=1;i<k;i++)
       {
           pq.remove();
       }
       
       return pq.peek();
    } 
}
  
