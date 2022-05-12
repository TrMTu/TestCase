/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tu;

import tran.Calculator1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import tran.*;

/**
 *
 * @author TrMTu
 */
public class Unittest {

    //1. Test the result value
    Calculator1 c1 = new Calculator1();

    @Test
    public void Q1TestCase1() {
        assertEquals(c1.add(1, 1), 2);
    }

    //2. Test the number larger than maximum the int type
    @Test
    public void Q1TestCase2() {
        double exp = 3000000000.0;
        int act = c1.add(2000000000, 1000000000);
        assertEquals(exp, act);
    }

    //3. Test the number smaller than mimimum the int type
    @Test
    public void Q1TestCase3() {
        double exp = -3000000000.0;
        int act = c1.add(-2000000000, -1000000000);
        assertEquals(exp, act);
    }
//    1. Test the result value

    @Test
    public void Q2TestCase1() {
        Calculator2 c2 = new Calculator2();
        c2.number1 = 3;
        c2.number2 = 1;
        c2.sub();
        int exp = 2;
        int act = c2.result;
        assertEquals(exp, act);
    }
//    2. Test the number larger than maximum the int type

    @Test
    public void Q2TestCase2() {
        Calculator2 c2 = new Calculator2();
        c2.number1 = 2000000000;
        c2.number2 = -1000000000;
        c2.sub();
        double exp = 3000000000.0;
        int act = c2.result;
        assertEquals(exp, act);
    }
//    3. Test the number smaller than mimimum the int type

    public void Q2TestCase3() {
        Calculator2 c2 = new Calculator2();
        c2.number1 = -2000000000;
        c2.number2 = 1000000000;
        c2.sub();
        double exp = -3000000000.;
        int act = c2.result;
        assertEquals(exp, act);
    }
//    1. Test the result value

    @Test
    public void Q3TestCase1() {
        Calculator3 c3 = new Calculator3(2, 5);
        int exp = 10;
        int act = c3.mul();
        assertEquals(exp, act);

    }
//    2. Test the number larger than maximum the int type

    @Test
    public void Q3TestCase2() {
        Calculator3 c3 = new Calculator3(55000, 55000);
        double exp = 3025000000.0;
        int act = c3.mul();
        assertEquals(exp, act);

    }
//    3. Test the number smaller than mimimum the int type

    @Test
    public void Q3TestCase3() {
        Calculator3 c3 = new Calculator3(-55000, 55000);
        double exp = -3025000000.0;
        int act = c3.mul();
        assertEquals(exp, act);

    }
//    1. Test the result value

    Calculator4 c4 = new Calculator4();

    @Test
    public void Q4TestCase1() {
        c4.setNumber1(10);
        c4.setNumber2(5);
        int exp = 2;
        int act = c4.div();
        assertEquals(exp, act);
    }
//    2. division 0

    @Test
    public void Q4TestCase2() {
        try {
            c4.setNumber1(10);
            c4.setNumber2(0);
            int act = c4.div();

        } catch (Exception e) {
            fail("Nhap sai roi, nhap lai b khac 0 di nguoi ae!!! ");
        }

    }
//    3. return float type, ex 5/2= 2.5

    @Test
    public void Q4TestCase3() {

        c4.setNumber1(5);
        c4.setNumber2(2);
        int act = c4.div();
        double exp = 2.5;
        assertEquals(exp, act);

    }
//    1. Test Multi roots
    SolveEquation sol = new SolveEquation();

    @Test
    public void Q5TestCase1() {
        sol.setNumber1(0);
        sol.setNumber2(0);
        String exp = "Multi roots";
        String act = sol.linearEquation();
        assertEquals(exp, act);
    }
//    2. Test No root

    @Test
    public void Q5TestCase2() {
        sol.setNumber1(0);
        sol.setNumber2(1);
        String exp = "No root";
        String act = sol.linearEquation();
        assertEquals(exp, act);
    }
//    3. Test One root

    @Test
    public void Q5TestCase3() {
        sol.setNumber1(5);
        sol.setNumber2(10);
        String exp = "One root";
        String act = sol.linearEquation();
        assertEquals(exp, act);
    }
//    1. Test first number is max

    @Test
    public void Q6TestCase1() {
        MaxNumber1 m1 = new MaxNumber1(3, 2, 1);
        int exp = 3;
        int act = m1.max3();
        assertEquals(exp, act);
    }
//    2. Test second number is max

    public void Q6TestCase2() {
        MaxNumber1 m1 = new MaxNumber1(2, 3, 1);
        int exp = 3;
        int act = m1.max3();
        assertEquals(exp, act);
    }
//    3. Test third number is max

    public void Q6TestCase3() {
        MaxNumber1 m1 = new MaxNumber1(1, 2, 3);
        int exp = 3;
        int act = m1.max3();
        assertEquals(exp, act);
    }
//    1. Test first number is max

    @Test
    public void Q7TestCase1() {
        MaxNumber2 m2 = new MaxNumber2();
        m2.number1 = 2;
        m2.number2 = 1;
        int exp = 2;
        int act = m2.max2();
        assertEquals(exp, act);

    }
//    2. Test second number is max

    @Test
    public void Q7TestCase2() {
        MaxNumber2 m2 = new MaxNumber2();
        m2.number1 = 1;
        m2.number2 = 2;
        int exp = 2;
        int act = m2.max2();
        assertEquals(exp, act);

    }
//    Test number1 is greater than number 2

    @Test
    public void Q8TestCase1() {
        Sort1.number1 = 2;
        Sort1.number2 = 1;
        Sort1.sortAsc();
        assertEquals(1, Sort1.number1);
    }
//    Test number1 is less than number 2

    @Test
    public void Q8TestCase2() {
        Sort1.number1 = 1;
        Sort1.number2 = 2;
        Sort1.sortAsc();
        assertEquals(1, Sort1.number1);
    }

//    Test number1 is greater than number 2
    @Test
    public void Q9TestCase1() {
        Sort1.number1 = 1;
        Sort1.number2 = 2;
        Sort1.sortAsc();
        assertEquals(2, Sort1.number1);
    }
//    Test number1 is less than number 2

    @Test
    public void Q9TestCase2() {
        Sort1.number1 = 2;
        Sort1.number2 = 1;
        Sort1.sortAsc();
        assertEquals(2, Sort1.number1);

    }

//    1. Test first number is max
    Triangle tri = new Triangle();

    @Test
    public void Q10TestCase1() {
        tri.setNumber1(3);
        tri.setNumber2(2);
        tri.setNumber3(1);
        int exp = 3;
        int act = tri.maxLength();
        assertEquals(exp, act);
    }
//    2. Test second number is max

    @Test
    public void Q10TestCase2() {
        tri.setNumber1(2);
        tri.setNumber2(3);
        tri.setNumber3(1);
        int exp = 3;
        int act = tri.maxLength();
        assertEquals(exp, act);
    }
//    3. Test third number is max

    @Test
    public void Q10TestCase3() {
        tri.setNumber1(1);
        tri.setNumber2(2);
        tri.setNumber3(3);
        int exp = 3;
        int act = tri.maxLength();
        assertEquals(exp, act);
    }
//      1. Test the result value
    Advance1 a1 = new Advance1();

    @Test
    public void Q11TestCase1() {

        assertEquals(a1.USCLN(42, 56), 14);
    }

    @Test
    public void Q11TestCase12() {
        assertEquals(a1.BSCNN(10, 1), 10);
    }
//    2. Test the number larger than maximum the int type

    @Test
    public void Q11TestCase2() {
        double x = 3000000000.0;
        double y = 6000000000.0;
        double exp = 3000000000.0;
        double act = a1.USCLN((int) x, (int) y);
        assertEquals(exp, act);
    }

    @Test
    public void Q11TestCase22() {
        double x = 3000000000.0;
        double exp = 3000000000.0;
        double act = a1.BSCNN((int) x, 1);
        assertEquals(exp, act);
    }
    //1. Test the result value

    Advance2 a2 = new Advance2();

    @Test
    public void Q12TestCase1() {
        assertEquals(a2.sum(5765), 23);
    }
    Advance3 a3 = new Advance3();
    //1. Test the result value

    @Test
    public void Q13TestCase1() {
        assertEquals(a3.fibonacci(10), 55);
    }

    @Test
    public void Q13TestCase12() {
        assertEquals(a3.fibonacci(-1), -1);
    }
    //    2. Test the number larger than maximum the int type

    @Test
    public void Q13TestCase2() {
        double x = 12586269025.0;
        assertEquals(a3.fibonacci(50), x);
    }
    //  1. Test the result value
    Advance4 a4 = new Advance4();

    @Test
    public void Q14TestCase1() {
        assertTrue(a4.isPrimeNumber(3));
        assertFalse(a4.isPrimeNumber(-1));
    }

    //    2. Test the number larger than maximum the int type
    @Test
    public void Q14TestCase2() {
        int x = Integer.MAX_VALUE;
        boolean exp = true;
        boolean act = a4.isPrimeNumber(x + 1);
        assertEquals(exp, act);
    }
//    3. Test the number smaller than mimimum the int type

    @Test
    public void Q14TestCase3() {
        int x = Integer.MIN_VALUE;
        boolean exp = false;
        boolean act = a4.isPrimeNumber(x - 1);
        assertEquals(exp, act);
    }
    //  1. Test the result value
    Advance5 a5 = new Advance5();

    @Test
    public void Q15TestCase1() {
        assertTrue(a5.kiemTraDoiXung(121));
        assertFalse(a5.kiemTraDoiXung(123));

    }

    //    2. Test the number larger than maximum the int type
    @Test
    public void Q15TestCase2() {
        double x = 1234554321.0;
        boolean exp = true;
        boolean act = a4.isPrimeNumber((int) x);
        assertEquals(exp, act);
    }

    //    3. Test the number smaller than mimimum the int type
    @Test
    public void Q15TestCase3() {
        double x = -1234554321.0;
        boolean exp = false;
        boolean act = a4.isPrimeNumber((int) x);
        assertEquals(exp, act);
    }
    //  1. Test the result value
    Advance6 a6 = new Advance6();

    @Test
    public void Q16TestCase1() {
        assertEquals(a6.tinhTuoi(12, 1, 1999), 23);
    }
    // 2. Check wrong data
    @Test
    public void Q16TestCase2(){
        
        try {
            a6.tinhTuoi(31,2, 1999);
        } catch (Exception e) {
            fail("Nhap sai roi cha noi");
        }
    }
    @Test
    public void Q16TestCase22(){
        assertEquals(a6.tinhTuoi(13, 5, 2025), -1);
    }
    //    3. Test the number larger than maximum the int type
    @Test
    public void Q16TestCase3(){
        try {
            a6.tinhTuoi(31, 2, Integer.MAX_VALUE+1);
        } catch (Exception e) {
            fail("Nhap sai roi cha");
        }
    }
    //    4. Test the number smaller than mimimum the int type
    @Test
    public void Q16TestCase4(){
        try {
            a6.tinhTuoi(31, 2, Integer.MIN_VALUE-1);
        } catch (Exception e) {
            fail("Nhap sai roi cha");
        }
    }
    //    1. Test the result value
    Advance7 a7 = new Advance7();
    @Test
    public void Q17TestCase1(){
        assertEquals(a7.tinhThu(5, 4, 2020), 1);
        
    }
    //    2. Check wrong data
    @Test
    public void Q17TestCase2(){
        
       assertEquals(a7.tinhThu(32, 2, 2022),0);
    }
    @Test
    public void Q17TestCase22(){
        
       assertEquals(a7.tinhThu(32, 2, -2022),0);
    }
    //    3. Test the number larger than maximum the int type
    @Test
    public void Q17TestCase3(){
        assertEquals( a7.tinhThu(1, 1, Integer.MAX_VALUE+1),0);
    }
    //    4. Test the number smaller than mimimum the int type
    @Test
    public void Q17TestCase4(){
        assertEquals( a7.tinhThu(1, 1, Integer.MIN_VALUE-1),0);
    }
}
