
package modell;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Galeria {

    
    
    public static void main(String[] args) throws IOException {
        List<String> sorok = Files.readAllLines(Paths.get("kep.txt"));
        List<KiallitasiTargy> targyak = new ArrayList();
        for(String sor : sorok){
                targyak.add(new KiallitasiTargy(sor) {});
            }
        if(new File("kep.txt").exists()){
            System.out.println("megjelenités folyamatban...");
        }else{
            System.out.println("nem lehet megjeleniteni");
        }
            
        Collections.sort(targyak);
           for (KiallitasiTargy targy : targyak) {
                System.out.println(targy);
            }
    }
}
