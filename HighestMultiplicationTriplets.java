public class HighestMultiplicationTriplets{


	    public static void main(String[] args) {
		
			 int arr[]={-4,3,-6,7};
			 
int temp=0; int mult=1;
for(int i=0;i<=arr.length-1;i++){
	for(int j=i+1;j<=arr.length-1;j++){
	if(arr[i]<arr[j]){

	temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}}}

for(int k=0;k<=2;k++){
    mult=mult*arr[k];
}
System.out.println(mult);		
	}

}