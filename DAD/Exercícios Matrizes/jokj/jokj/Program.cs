using System;

namespace jokj
{
    class Program
    {
        static void Main(string[] args)
        {
            int[,] matriz = new int[4, 4];
            int menor, maior;
            //inicializa a matriz
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
            //f rosana
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    if (maior < matriz[i, j])
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
            //copia as matrizes
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    backup[i, j] = matriz[i, j];
                }
            }
            //controle de repetição
            int valor = 0, rep = 0;
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    valor = backup[i,j];
                    if(valor != -1)
                    {
                        for (int m = 0; m < 4; m++)
                        {
                            for (int n = 0; n < 4; n++)
                            {
                                if (backup[m, n] == valor)
                                {
                                    rep++;
                                    backup[m, n] = -1;
                                }
                            }
                        }
                        Console.WriteLine("\nO número " + matriz[i, j] + " repete " + rep + " vezes");
                        rep = 0;
                    }
                }
            }
            Console.WriteLine("\nO maior número da matriz é: " + maior + "\nO menor número da matriz é: " + menor);
        }
    }
}
