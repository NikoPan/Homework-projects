using System;

/* Write a program that asks for a digit (0-9), and depending on the input, shows the digit as a word (in English). 
 * Print “not a digit” in case of invalid inut. Use a switch statement. */

namespace DigitAsWord
{
    class DigitAsWord
    {
        static void Main()
        {
            Console.WriteLine("Write a digit from 0 to 9.");
            string digit = Console.ReadLine();

            Console.Write("Result: ");
            switch (digit)
            {
                case "0": Console.Write("zero"); break;
                case "1": Console.Write("one"); break;
                case "2": Console.Write("two"); break;
                case "3": Console.Write("three"); break;
                case "4": Console.Write("four"); break;
                case "5": Console.Write("five"); break;
                case "6": Console.Write("six"); break;
                case "7": Console.Write("seven"); break;
                case "8": Console.Write("eight"); break;
                case "9": Console.Write("nine"); break;
                default: Console.Write("not a digit"); break;
            }
            Console.WriteLine();
        }
    }
}
