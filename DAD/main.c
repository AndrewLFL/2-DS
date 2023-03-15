#include <stdio.h>
#include <stdlib.h>
#define maz 2
int main()
{
    int i, v[maz];
    for(i = 0 ; i<maz;i++)
    {
        printf("\nDigite o %d.o numero do vetor:\n", i+1);
        scanf("%d",&v[i]);
    }
    printf("\n\nO vetor digitado foi: \n\n");
    for(i = 0 ; i<maz;i++)
    {
        printf("%d\n", v[i]);
    }
    return 0;
}
