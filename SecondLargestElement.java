public class multiplicationTriplets{


public static void main(String[] args) {
	 
	 

			 int arr[]={1,-4,3,-6,7,0};
			 int b=-1;
int temp=0; int mult=1;
for(int i=0;i<=arr.length-1;i++){
	for(int j=i+1;j<=arr.length-1;j++){
	if(arr[i]>arr[j]){

	temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}}}

        for(int k=0;k<=arr.length-2;k++){
            if(arr[k]!=arr[1]){
                b=arr[k];
            }
        }
        	
        	System.out.print(b);	

}
}