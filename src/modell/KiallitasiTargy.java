/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.util.Date;



/**
 *
 * @author Toth.Virag
 */
public abstract class KiallitasiTargy {

//    public String format(Date date);
    private String datum, keszito, cim;

//    public KiallitasiTargy(String datum, String keszito, String cim) {
//        this.datum = datum;
//        this.keszito = keszito;
//        this.cim = cim;
//    }

    public String getKeszito() {
        return keszito;
    }

    public String getCim() {
        return cim;
    }

    @Override
    public String toString() {
        return "KiallitasiTargy{" + "datum=" + datum + ", keszito=" + keszito + ", cim=" + cim + '}';
    }
    
    public int compareTo(KiallitasiTargy o, KiallitasiTargy p) {
        return this.keszito.compareTo(o.getKeszito());
//        return this.cim.compareTo(p.getCim());
    }
    
//    @Override
//    public int compareTo(KiallitasiTargy p) {
//        return this.cim.compareTo(p.getCim());
//    }
//    
    
    
}
