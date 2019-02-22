
package compilador2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerFichero {
    
    String nombre;
    String cad="";
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    
    LeerFichero(String nom){
        nombre=nom;
    }
    public String getContent(){
        return cad;
    }
    public void execute(){
        try{
            archivo = new File ("prueba.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null){
                cad+=linea;
            }            
        }catch(Exception e){
            e.printStackTrace();
        }finally{         
            try{                    
                if( null != fr ){   
                   fr.close();     
                }                  
            }catch (Exception e2){ 
                e2.printStackTrace();
            }
        }        
    }
   
}