class Array7{
	void leftRotate(int arr[],int d){
		int n=arr.length;
		d=d%n;
		int x[]=new int[d];
		for(int i=0;i<d;i++){
			x[i]=arr[i];
		}
		for(int i=d;i<n;i++){
			arr[i-d]=arr[i];
		}
		for(int i=n-d;i<n;i++){
			arr[i]=x[i-(n-d)];
		}
	}
}
class Run{
	public static void main(String[] args){
		Array7 a=new Array7();
        int arr[]={1,2,3,4,5,6};
		a.leftRotate(arr,7);
		for(int i:arr){
			System.out.println(i);
		}
	}
}