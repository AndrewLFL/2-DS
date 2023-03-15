using System;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            int[,] matriz = new int[4, 4];
            int menor, maior;
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    Console.Write("Digite o número da linha " + (i + 1) + " e coluna " + (j + 1) + "\n");
                    matriz[i, j] = Convert.ToInt32(Console.ReadLine());
                }
            }
            menor = matriz[0, 0];
            maior = matriz[0, 0];
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    if(maior < matriz[i, j])
                    {
                        maior = matriz[i, j];
                    }
                    if (menor > matriz[i, j])
                    {
                        menor = matriz[i, j];
                    }
                    Console.Write("o número da linha " + (i + 1) + " e coluna " + (j + 1) + " é " + matriz[i, j] + "\n");
                }
            }
            int[,] backup = new int[4, 4];
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    backup[i, j] = matriz[i, j];
                }
            }
            for (int i = 0; i < 4; i++)
            {

                for (int j = 0; j < 4; j++)
                {
                    int rep = 0;
                    for (int m = 0; m < 4; m++)
                    {
                        for(int n=0;n<4;n++)
                        {
                            if(matriz[i, j] == matriz[m,n])
                            {
                                rep++;
                            }
                        }
                    }
                Console.WriteLine("O número " + matriz[i, j] + " repete " + rep + " vezes\n");
                }
            }
        }
    }
}

