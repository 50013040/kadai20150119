/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

/**
 *
 * @author 50013040
 */
public class Calculation_lib {
    //
    private int m,n;

    public Calculation_lib(int m, int n) {
        this.m = m;
        this.n = n;
    }
    
    public int getPlus(){
        return m+n;
    }

    public int getMinus(){
        return m-n;
    }
    
    public int getMultiple(){
        return m*n;
    }
        
    public int getDivide(){
        return m/n;
    }
}
