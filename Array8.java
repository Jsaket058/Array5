class Array8{
	void leftRotate(int arr[],int d){
          int n=arr.length;
		  d=d%n;
		  reverse(arr,0,d-1);
          reverse(arr,d,n-1);
          reverse(arr,0,n-1);
	}
	
	void reverse(int[] arr,int low,int high){
		while(low<=high){
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	}
}
class Run{
	public static void main(String[] args){
		Array8 a=new Array8();
        int arr[]={1,2,3,4,5,6};
		a.leftRotate(arr,3);
		for(int i:arr){
			System.out.println(i);
		}
	}
}