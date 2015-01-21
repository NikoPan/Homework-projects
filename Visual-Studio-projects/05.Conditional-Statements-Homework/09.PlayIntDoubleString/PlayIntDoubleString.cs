using System;

/* Write a program that, depending on the user’s choice, inputs an int, double or string variable. 
 * If the variable is int or double, the program increases it by one. 
 * If the variable is a string, the program appends "*" at the end. 
 * Print the result at the console. Use switch statement.
 * 
Please choose a type:
1 --> int
2 --> double
3 --> string
Please enter a string:
hello*
*/

namespace PlayIntDoubleString
{
    class PlayIntDoubleString
    {
        static void Main()
        {
            Console.WriteLine("Please choose a type: \n 1 --> int \n 2 --> double \n 3 --> string");
            string type = Console.ReadLine();
            switch (type)
            {
                case "1": 
                    Console.Write("Please enter a int: ");
                    int i = int.Parse(Console.ReadLine());
                    Console.WriteLine("Result: " + i + 1);
                    break;
                case "2":
                    Console.Write("Please enter a double: ");
                    double d = double.Parse(Console.ReadLine());
                    Console.WriteLine("Result: " + (d + 1));
                    break;
                case "3":
                    Console.Write("Please enter a string: ");
                    string s = Console.ReadLine();
                    Console.WriteLine("Result: " + s + "*");
                    break;
            }
        }
    }
}
