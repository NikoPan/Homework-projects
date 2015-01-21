using System;

// Write a program that finds the biggest of three numbers. 

namespace TheBiggestOf3Numbers
{
    class TheBiggestOf3Numbers
    {
        static void Main()
        {
            Console.Write("a= ");
            double a = double.Parse(Console.ReadLine());
            Console.Write("b= ");
            double b = double.Parse(Console.ReadLine());
            Console.Write("c= ");
            double c = double.Parse(Console.ReadLine());

            if (a > b && a > c)
            {
                Console.WriteLine("Biggest is a= " + a);
            }
            else if (b > a && b > c)
            {
                Console.WriteLine("Biggest is b= " + b);
            }
            else
            {
                Console.WriteLine("Biggest is c= " + c);
            }
        }
    }
}
