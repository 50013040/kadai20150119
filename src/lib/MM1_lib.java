/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;
    import java.util.Scanner;
/**
 *
 * @author Henri_2
 */
public class MM1_lib {
    private double lambda, mu, rho;

    public MM1_lib(double lambda, double mu) {
        this.lambda = lambda;
        this.mu = mu;
        rho = mu/lambda;
    }
    
    public double getRho(){
        return rho;
    }
    
    public double getLength(){
        return rho/(1-rho);
    }

    public double getTime(){
        return 1/(1-rho) * 1/mu;
    }

    public double getQueue(){
        return Math.pow(rho,2) / (1-rho);
    }
    
    public double getWait(){
        return rho/(1-rho) * 1/mu;
    }
}
