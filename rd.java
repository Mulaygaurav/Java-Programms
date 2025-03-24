class rd{


public static void main(String []a){
int [] arr ={4,6,4,3,4,3,2,1,1};
int [] n = new int[10];
int k=0;
 int l;
for(int i=0;i<arr.length;i++){
   l=0;

for(int j=i;j>0;j--){
if(arr[j]==arr[i]){
    l++;
}
}
if(l==1){
n[k]=arr[i];
k++;
}
}






for(int i=0;i<n.length;i++){
System.out.print(n[i] +" ");
}

}
}