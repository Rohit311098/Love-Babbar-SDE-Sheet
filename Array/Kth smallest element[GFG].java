1. Using Sorting TC- O(nlogn)  SC-O(1)

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
       Arrays.sort(arr);
       
       return arr[k-1];
    } 
}


2. Using Priority Queue  TC-O(Nlogk) SC-O(logn)
  class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       
       for(int i=0;i<=r;i++)
       {
           pq.add(arr[i]);
           
           if(pq.size()>k)
           {
               pq.remove();
           }
           
       }
      
       
       return pq.peek();
        
    } 
}
  

3. Using Quick Sort 
In QuickSort, we pick a pivot element, then move the pivot element to its correct position and partition the surrounding array. The idea is, not to do
complete quicksort, but stop at the point where pivot itself is k’th smallest element. Also, not to recur for both left and right sides of pivot, but recur 
for one of them according to the position of pivot. The worst case time complexity of this method is O(n2), but it works in O(n) on average. 
    
    TC-O(n) -> Average case   SC-0(1) constant space
        
public static int partition(Integer[] arr, int l,
                                int r)
    {
        int x = arr[r], i = l;
        for (int j = l; j <= r - 1; j++) {
            if (arr[j] <= x) {
                // Swapping arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
 
                i++;
            }
        }
 
        // Swapping arr[i] and arr[r]
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
 
        return i;
    }      
        
        
        
public static int kthSmallest(Integer[] arr, int l,
                                  int r, int k)
    {
        // If k is smaller than number of elements
        // in array
        if (k > 0 && k <= r - l + 1) {
            // Partition the array around last
            // element and get position of pivot
            // element in sorted array
            int pos = partition(arr, l, r);
 
            // If position is same as k
            if (pos - l == k - 1)
                return arr[pos];
 
            // If position is more, recur for
            // left subarray
            if (pos - l > k - 1)
                return kthSmallest(arr, l, pos - 1, k);
 
            // Else recur for right subarray but now value of k will get changes as we left some element in left subarray
            return kthSmallest(arr, pos + 1, r, k - pos + l - 1);
        }
 
        // If k is more than number of elements
        // in array
        return Integer.MAX_VALUE;
    }
        
4. TreeMap Approach

class GFG {
    static int Kth_smallest(TreeMap<Integer, Integer> m,
                            int k)
    {
        int freq = 0;
        for (Map.Entry it : m.entrySet())
        {
           
            // adding the frequencies of each element
            freq += (int)it.getValue();
 
            // if at any point frequency becomes
            // greater than or equal to k then
            // return that element
            if (freq >= k) {
                return (int)it.getKey();
            }
        }
 
        return -1; // returning -1 if k>size of the array
                   // which is an impossible scenario
    }
    

