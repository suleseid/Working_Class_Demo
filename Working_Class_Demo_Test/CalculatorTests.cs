using Microsoft.VisualStudio.TestTools.UnitTesting;
using Working_Class_Demo;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Working_Class_Demo.Tests
{
    [TestClass()]

    public class CalculatorTests
    {
        //Arrange
        //Act
        //Assert

        [TestMethod()]

        public void AddTestSuccess()
        {
            //Expected and Actual
            //Arrange
            Calculator calc = new Calculator();
            double num1 = 2;
            double num2 = 2;
            double expected = 4;

            //Act
            double outcome = calc.Add(num1, num2);

            //Assert
            Assert.AreEqual(expected, outcome);
            //Assert.Fail();
        }

        [TestMethod()]
        public void AddTestFaill()
        {
            //Arrange
            Calculator calc = new Calculator();
            double num1 = 2;
            double num2 = 2;
            double notExpected = 5;

            //Act
            double actual = calc.Add(num1, num2);
            //Assert
            Assert.AreNotEqual(notExpected, actual);    

        }
        //Multiply Method teste
        [TestMethod()]

        public void MultiplyTestSuccess()
        {
            //Arrange
            Calculator calc = new Calculator();
            double num1 = 5;
            double num2 = 10;
            double expected = 50;

            //Act
            double outcome = calc.Multiply(num1, num2);
            //Assert
            Assert.AreEqual(expected, outcome);

        }

        public void MultiplyTestFail()
        {
            //Arrange
            Calculator calc = new Calculator();
            double num1 = 5;
            double num2 = 10;
            double notExpected = 60;

            //Act
            double Actual = calc.Multiply(num1, num2);
            //Assert
            Assert.AreNotEqual(notExpected, Actual);

        }
    }
}