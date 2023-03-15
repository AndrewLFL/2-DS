using System;

namespace _15_03
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] v = new int[10];
            Random numAleatorio = new Random();
            for(int i=0;i<10;i++)
            {
                v[i] = numAleatorio.Next(1,100);
            }
            int[] c = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            int[] d = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, };
            Console.WriteLine("Vetor aleatorio\n");
            mostraVetor(v);
            Console.WriteLine("Ordenando vetor aleatorio com BubbleSort\n");
            bubbleSort(v);
            mostraVetor(v);
            Console.WriteLine("Ordenando vetor aleatorio com SelectionSort\n");
            selectionSort(v);
            mostraVetor(v);
            Console.WriteLine("Ordenando vetor crescente com BubbleSort\n");
            bubbleSort(c);
            mostraVetor(c);
            Console.WriteLine("Ordenando vetor crescente com SelectionSort\n");
            selectionSort(c);
            mostraVetor(c);
            Console.WriteLine("Ordenando vetor decrescente com BubbleSort\n");
            bubbleSort(d);
            mostraVetor(d);
            Console.WriteLine("Ordenando vetor decrescente com SelectionSort\n");
            selectionSort(d);
            mostraVetor(d);
        }

        static void bubbleSort(int[] v)
        {
            int aux;
            for (int j = 0; j < v.Length - 1; j++)
            {
                for (int i = 0; i < v.Length - 1; i++)
                {
                    if (v[i] > v[i + 1])
                    {
                        aux = v[i];                        
                        v[i] = v[i + 1];
                        v[i + 1] = aux;
                    }
                }
            }
        }
        static void mostraVetor (int[] v){
            for (int i = 0; i < v.Length; i++)
            {
                Console.WriteLine(v[i] + "\n");

            }
        }

        static void selectionSort(int[] v)
        {
            int menorIndex;
            int aux;
            for (int i = 0; i < v.Length - 1; i++)
            {
                menorIndex = i;

                // loop para pegar o index do menor número

                for (int j = i; j < v.Length; j++)
                {
                    if (menorIndex > j)
                    {
                        menorIndex = j;
                    }
                }

                // if para controle

                if (i != menorIndex)
                {
                    aux = v[i];
                    v[i] = v[menorIndex];
                    v[menorIndex] = aux;
                }
            }
        }
    }
}
