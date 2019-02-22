
package compilador2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.util.ArrayList;


public class Compilador2 {
    
    public static void main(String[] args) {
        LeerFichero b = new LeerFichero("prueba.txt");
        AnalizadorLexico a = new AnalizadorLexico();       
        b.execute();
        a.setCodigo(b.getContent());
        a.generar();
        System.out.print(a);        
        
    }
    
}
