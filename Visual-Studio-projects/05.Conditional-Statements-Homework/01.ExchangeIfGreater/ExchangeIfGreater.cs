using System;

/* Write an if-statement that takes two integer variables a and b 
 * and exchanges their values if the first one is greater than the second one. 
 * As a result print the values a and b, separated by a space. */

namespace ExchangeIfGreater
{
    class ExchangeIfGreater
    {
        static void Main()
        {
            Console.WriteLine("value for a:");
            double a = double.Parse(Console.ReadLine());
            Console.WriteLine("value for b:");
            double b = double.Parse(Console.ReadLine());

            if (a > b)
            {
                double c = a;
                a = b;
                b = c;
                Console.WriteLine(a + " " + b);
            }
            else
            {
                Console.WriteLine(a + " " + b);
            }
        }
    }
}
