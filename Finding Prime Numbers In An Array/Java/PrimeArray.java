import java.lang.Math;   
class PrimeArray {

public static int func(int arr[],int num){
    
    int i,j,flag=0;
    j=arr[num]/2;
    for(i=2;i<=j;i++){
        if(arr[num]<2){
           continue;
        }
        if(arr[num]%i==0){
            flag=1;
            continue;
        }
    }
    if(flag==0){
    return arr[num];
    }else{
        return 0;
    }
}
public static void main(String[] args) {

    int a,b=0,flag=0,i,j=0,k,gec,l=0;
    int arr[]=new int[30];
    int arr1[]=new int [30];
    for(i=0;i<30;i++){
        arr[i]=(int)(Math.random()*1000)%40;
    }
    System.out.print("Array:\n\n");
    for(i=0;i<30;i++){
       System.out.print(arr[i]+"\t");
    }
    System.out.print("\n\nPrime Numbers:\n\n");
    for(i=0;i<30;i++){
        gec=func(arr,i);
        if(gec==0||gec==1){
        	continue;
		}else{
			arr1[l]=gec;
			l++;
		}
    }
    i=0;
    gec=0;
    while(i<l){
    	for(k=0;k<l-1;k++){
    		if(arr1[k]>arr1[k+1]){
    		   gec=arr1[k+1];
			   arr1[k+1]=arr1[k];
			   arr1[k]=gec;
			}
		}
		i++;
	}
	for(i=0;i<l;i++){
		System.out.print(arr1[i] + "\t");
	}

}
}