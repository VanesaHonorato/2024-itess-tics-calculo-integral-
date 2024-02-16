/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciunidad1.aproximation;

/**
 *
 * @author vanesahonorato
 */
public class FuncionaproximacionTest {
    public static void main(String[]args){
        funcionaproximacion fa = new funcionaproximacion (0.0, 4.0, 4);
        fa.compute();
        System.out.println("area:"+ fa.getArea());
        
    }          
}
