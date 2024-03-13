 
 arr[]={1,2,3,4,5}; w=2;
 //subarray
 //code for finding subarray of window size w
 for(int i=0; i<n-w; i++)
   for(int j=i; j<n; j++)
     for(int k=i; k<=j;k++ )
      sop(arr[k]); 

//multiple approaches
//sum of min and max elements of all subarrays of size w
arr[]={1,2,3,4,5,6,7,8}
w=3;

output=?
 1 2 3   4
 2 3 4   10
 3 4 5   18
 4 5 6   28
 5 6 7   40
 6 7 8   54

 int sum=0;
   for(int i=0; i<n-w; i++)  

   int len=0;
   for(int j=0; j<n;j++)
    len++;
     if(len==w){}
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
for(int l=i;k<=j;k++)
 if(min>arr[k])
   min=arr[k];
   if(max<arr[k])
   max=arr[k]
}
sum+= min+max;
} }
sop(sum);


//count distinct elements in every window of size w
arr[]={1,2,1,3,4,2,3}, w=4;
output: ?

subarray   no of distnict elements
1 2 1 3    3
2 1 3 4    4
1 3 4 2    4
3 4 2 3    3

naive approach: O(N*W^2)

main(){
    arr[]={1,2,1,3,4,2,3},w=4;
    n=arr.length;
    dist(arr,n,w);
}
dist(int arr[], int n, int w){
     for(int i=0;i<n-w ;i++) 
     sop(count(Arrays.copyOfRange(arr,i,n),w));
}
count(int arr[], int w){
     count=0;
    for(int i=0;i<n;i++)
 for(int j=i;j<n;j++){
   if(arr[i]==arr[j])
   break;
 }
 if(j==i)
  count++;
  }
  return count;
}


//optimized way using hashmap: O(N)
main(){
    arr[]={1,2,1,3,4,2,3}, w=4;
    n=arr.length;
    dist(arr,n,w);
}
dist(int arrr[], int n, int w){
    //first step- declare a map
    HashMap<Integer,Integer> hm=new Hashmap<>();
    for(int i=0; i< w; i++)
       hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
              sop(hm.size());

        for(int i=k; i<n; i++){
          if(hm.get(arr[i-k])==1)
          hm.remove(arr[i-k]);
        else 
        hm.put(arr[i-k],hm.get(arr[i-k])-1);
       
        hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        sop(hm.size());
}
}

//first negative number in every window of size w
arr[]={-8,2,3,-4,3,7,9};, w=3;
output=?

-8 2 3     -8
2  3 -4    -4
3 -4 3     -4
-4 3 7     -4
3 7 9      0


main{
  arr[]={-8,2,3,-4,3,7,9};
  w=3;
  n=arr.length;
  method1(int[] arr, int n, int w){
    boolean flag;
    for(int i=0; i< (n-w+1); i++){
       flag=false;
      for(int j=0; j<w; j++)
         if(arr[i+j]<0){
          break;
         }
    }
    sop(arr[i+j]);
    flag=true;
    break;
  }
}
if(!flag) sop("()");
}


complexity: O(N)

main{
  arr[]={-8, 2,3,-4,3,7,9};
  w=3;
  n=arr.length;
  method1(arr,n,w);
}
  method1(int[]arr, int n, int w){
    NI=0, NE=0;
    for(int i=w-1; i<n; i++){
      while((NI<i)&&(NI<=i-k || arr[NI]>=0))
       NI++;
       if(arr[NI]<0)
         NE=arr[NI];
         else
         NE=0;
         sop(NE);
    }
  }






