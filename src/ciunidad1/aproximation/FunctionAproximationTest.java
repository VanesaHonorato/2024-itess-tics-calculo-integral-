/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciunidad1.aproximation;

/**
 *
 * @author vanesahonorato
 */
public class FunctionAproximationTest {
    public static void main(String[]args){
        FunctionAproximation fa = new FunctionAproximation (0.0, 4.0, 4);
        fa.cumpute();
        System.out.println("area:"+ fa.getArea());
  
           
}
