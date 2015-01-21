using System;

/* A beer time is after 1:00 PM and before 3:00 AM. 
 * Write a program that enters a time in format “hh:mm tt” (an hour in range [01...12],
 * a minute in range [00…59] and AM / PM designator) and prints “beer time” or “non-beer time” 
 * according to the definition above or “invalid time” if the time cannot be parsed. 
 * Note that you may need to learn how to parse dates and times. */

namespace BeerTime
{
    class BeerTime
    {
        static void Main()
        {
            Console.WriteLine("What time is it?");
            DateTime beerTime = DateTime.Parse(Console.ReadLine());
            string sign = beerTime.ToString("tt");

            if (beerTime.Hour < 12)
            {
                if (sign == "AM")
                {
                    if (beerTime.Hour >= 3 && beerTime.Minute >= 0 && beerTime.Minute < 60)
                    {
                        Console.WriteLine("non-beer time");
                    }
                    else
                    {
                        Console.WriteLine("beer time");
                    }
                }
            }
            else
            {
                if (beerTime.Hour - 12 >= 1)
                {
                    Console.WriteLine("beer time");
                }
                else
                {
                    Console.WriteLine("non-beer time");
                }
            }
        }
    }
}
