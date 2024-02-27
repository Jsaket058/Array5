class Array8{
	void leftRotate(int arr[],int d){
          int n=arr.length;
		  d=d%n;
		  reverse(arr,0,d-1);
          reverse(arr,d,n-1);
          reverse(arr,0,n-1);
	}
	
	void reverse(int[] arr,int low,int high){
		for(int i=low;i<high/2;i++){
			int x=arr[i];
			arr[i]=arr[high - i];
			arr[high - i]=x;
		}
	}
}
class Run{
	public static void main(String[] args){
		Array8 a=new Array8();
        int arr[]={1,2,3,4,5,6};
		a.leftRotate(arr,7);
		for(int i:arr){
			System.out.println(i);
		}
	}
}