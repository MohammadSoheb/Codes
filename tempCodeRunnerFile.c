#include<stdio.h>
int main(){
int foo(int i){
    int x=1,j=1;
    while(i){
        x*=j;
        j++;
        if(j<7){
            continue;
        }
        else{
            break;
        }
    }
    return x;
}
printf("%d",foo(1));
//foo(1);
return 0;
}