
class Sorti{

public static void main(String []args){

int temp=0;
int arr[]={23,45,67,87,7,3,13,16,21,12,32};
System.out.print("[");  
for (int i = 0; i < arr.length; i++)   
{  
for (int j = i + 1; j < arr.length; j++)   
{  
int temp = 0;  
if (arr[i] > arr[j])   
{  
temp = arr[i];  
arr[i] = arr[j];  
arr[j] = temp;  
}  
}  
//prints the sorted element of the array  
System.out.print(arr[i]+" ");  
}  
System.out.print("]");  
}}