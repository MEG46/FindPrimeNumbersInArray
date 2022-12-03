#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int func(int *arr,int num){
    if(arr[num]<2){
        return 0;
    }
    int i,j,flag=0;
    j=arr[num]/2;
    for(i=2;i<=j;i++){
        if(arr[num]%i==0){
            flag=1;
            break;
            return 0;
        }
    }
    if(flag==0){
        return arr[num];
    }
}
int main(){
    srand(time(NULL));
    int a,b=0,flag=0,i,j=0,k,gec,l=0;
    int arr[30],arr1[30];
    for(i=0;i<30;i++){
        arr[i]=rand()%100;
    }
    printf("Array:\n");
    for(i=0;i<30;i++){
        printf("%d\t",arr[i]);
    }
    printf("\nPrime Numbers:\n");
    for(i=0;i<30;i++){
        gec=func(arr,i);
        if(gec==0){
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
		printf("%d\t",arr1[i]);
	}
   
    return 0;
}
