package lib;

/**
 *
 * @author 50013040
 */
public class MMS_lib {
    private double lambda, mu, rho, alpha;
    private int s,r;

    public MMS_lib(double lambda, double mu, int s/*, int r*/) {
        this.lambda = lambda;
        this.mu = mu;
        this.alpha = lambda/mu;
        this.rho = alpha/s;
        this.s = s;
//        this.r = r;
    }

    public int getFactorial(int s){
        int i,t=s;
        for(i=1;i<s;i++){
            t=t*(s-i);
        }
        if(t == 0)
            t = 1;
        return t;
    }
    
    public double getP0(){
        double p0 = 0, p01 = 0, p02 = 0;
        for(int i = 0;i <= this.s - 1;i++){
            p01 += Math.pow(this.alpha, i)/getFactorial(i);
        }
        p02 = Math.pow(this.alpha, this.s)
                /getFactorial(this.s)
                /(1 - this.rho);
        p0 = 1/(p01 + p02);
        return(p0);
    }

    public double getRho(){
        return (this.rho);
    }    
    
    public double getLq(){
        double lq;
        lq = Math.pow(this.s, this.s)
                *Math.pow(this.rho, this.s + 1)
                *getP0()
                /getFactorial(this.s)
                /Math.pow(1 - this.rho, 2);
        return(lq);
    }
        
    public double getL(){
        double L = 0;
        L = getLq() + this.alpha;
        return(L);
    }
    
    public double getWq(){
        double Wq = 0;
        Wq = getLq() / this.lambda;
        return(Wq);
    }
    
    public double getW(){
        double W = 0;
        W = getWq() + (1 / this.mu);
        return(W);
    }
    
/*    public int getConbination(int s, int r){
        int t;
        t = getFactorial(s)/getFactorial(r)/getFactorial(s-r);
        return t;        
    }
*/
}
