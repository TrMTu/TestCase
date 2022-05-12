/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tran;

/**
 *
 * @author TrMTu
 */
public class Advance2 {

    public int sum(long number) {
//Tính tổng các phần tử của number
//VD number = 5765, sum = 5+7+6+5 = 23
        int sum = 0;
        long index;
        while (number != 0) {
            index = number % 10;
            sum += index;
            number /= 10;
        }
        return sum;
    }
}
