using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Working_Class_Demo
{
    public class Calculator
    {

        public double Add(double num1, double num2)
        {
             return num1 + num2;
        }
        
        //lets test multplication
        public double Multiply(double num1, double num2)
        {
            return num1 * num2;

        }

        //Lets test subtraction.
        public double Subtract(double num1, double num2)
        {
            return num1 - num2;
        }

        //Lets test Division.

        public double Division(double num1, double num2)
        {
            return num1 / num2;
        }
    }
}
