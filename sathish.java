#include <stdio.h>

int main(void) {
	
    int num;
    
    printf("Enter any number: ");
    scanf("%d", &num);
        if(num > 0)
    {
        printf("%d Number is POSITIVE",num);
    }
    else if(num < 0)
    {
        printf("%d Number is NEGATIVE",num);
    }
    else
    {
        printf("Number is ZERO");
    }

    return 0;
}
