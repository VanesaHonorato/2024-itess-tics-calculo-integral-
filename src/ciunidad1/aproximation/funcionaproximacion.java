/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciunidad1.aproximation;

/**
 *Itess-Tics
 * Enero-Junio
 * Calculo integral
 * Ti202 Ejemp
 * 12 febrero 2024
 * vanegoho@gmail.com
 * 
 */

public class funcionaproximacion {
    
    private double xIni;
    private double xEnd;
    private int n;
    private double dx;
    private double x[];
    private double fx[];
    private double area;

    public funcionaproximacion(double xIni, double xEnd, int n) {
        this.xIni = xIni;
        this.xEnd = xEnd;
        this.n = n;
     
        this.x = new double [n+1];
        this.fx = new double [n+1];
        
        
    }
    
    public void compute() {
        
        dx = (xEnd - xIni) / n;
      
        for(int i=0; i<= n; i++){
            x[i] = xIni + i*dx;
            fx[i] =x[i] * x[i];
            area = area + fx[i] * dx;
        }
        
        
    }
  
    public double getArea() {
        return area;
    }
            
    
    
}
