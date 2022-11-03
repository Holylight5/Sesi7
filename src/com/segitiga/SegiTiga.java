
package com.segitiga;

public class SegiTiga {
    double alas,tinggi;
    
    public SegiTiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public double getLuasSegiTiga(){
        return 0.5*alas*tinggi;
    }
   
}
