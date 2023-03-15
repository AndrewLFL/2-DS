#include <stdio.h>
#include <stdlib.h>
#define maz 2
int main()
{
    int i, tam , v[] = {1,5,8,10,4,3,9,2,7,6};
    tam = sizeof(v)/4;
        printf("\nO vetor declarado tem %d posições e o seguinte conteudo:\n", tam);
    for(i = 0 ; i<tam;i++)
    {
        printf("%d\n", v[i]);
    }
    return 0;
}
