class Array6{
	void leftRotate(int arr[]){
		int x=arr[0];
		int n=arr.length;
		for(int i=1;i<n;i++){
			arr[i-1]=arr[i];
		}
		arr[n-1]=x;
	}
}
class Run{
	public static void main(String[] args){
		Array6 a=new Array6();
        int arr[]={1,2,3,4,5,6};
		a.leftRotate(arr);
		for(int i:arr){
			System.out.println(i);
		}
	}
}