using System;

//Write a program that finds the biggest of five numbers by using only five if statements.

namespace BiggestOfFive
{
    class BiggestOfFive
    {
        static void Main()
        {
            Console.Write("a= ");
            double a = double.Parse(Console.ReadLine());
            Console.Write("b= ");
            double b = double.Parse(Console.ReadLine());
            Console.Write("c= ");
            double c = double.Parse(Console.ReadLine());
            Console.Write("d= ");
            double d = double.Parse(Console.ReadLine());
            Console.Write("e= ");
            double e = double.Parse(Console.ReadLine());

            if (a > b && a > c && a > d && a > e)          //if 1
            {
                Console.WriteLine("Biggest is a= " + a);
            }
            else if (b > a && b > c && b > d && b > e)     //if 2
            {
                Console.WriteLine("Biggest is b= " + b);
            }
            else if (c > a && c > b && c > d && c > e)     //if 3
            {
                Console.WriteLine("Biggest is c= " + c);
            }
            else if (d > a && d > b && d > c && d > e)     //if 4
            {
                Console.WriteLine("Biggest is d= " + d);
            }
            else
            {
                Console.WriteLine("Biggest is e= " + e);
            }
        }
    }
}
