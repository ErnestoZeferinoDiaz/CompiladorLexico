
package compilador2;

import java.util.ArrayList;

public class AnalizadorLexico {
    String codigo;
    ArrayList<Token> tabla;
    I_Constant a;
    public AnalizadorLexico(){
        tabla = new ArrayList<Token>();
        a = new I_Constant();
        codigo="";
    }
    public String getCodigo() {
        return codigo;
    }
    
    public String toString(){
        String cad="";
        for(int x=0; x<tabla.size(); x++){
            cad+="\n  "+tabla.get(x)+"\t\t"+tabla.get(x).getValue();
        }
        return cad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo+" ";
    }

    public ArrayList<Token> getTabla() {
        return tabla;
    }
    
    public void generar(){
        int x=0;
        while(x<codigo.length()){            
            a.check(codigo.charAt(x));
            if(a.getStatus()==1){
                tabla.add(a.getConstant());                
                a.reset();
                x--;
            }            
            x++;
        }
    }

    
    
}
