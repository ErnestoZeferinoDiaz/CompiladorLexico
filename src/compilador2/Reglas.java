package compilador2;
import java.util.ArrayList;

public class Reglas {
    ArrayList<Token> programa;
    Constant act;
    int status;
    int estado;
    
    public Reglas(ArrayList<Token> lis){
        this.programa = lis;
        status=0;
        estado=0;
        act=null;
    }
    public Constant getConstant(){
        return act;
    }
    public int getStatus(){
        return status;
    }
    public int check(Token a){
        switch(estado){
            case 0:
                if(a==Constant.CHAR ||
                   a==Constant.INT  ||
                   a==Constant.FLOAT ||
                   a==Constant.DOUBLE ||
                   a==Constant.SHORT ||
                   a==Constant.LONG){                    
                    estado=1;
                }else if(a==Constant.TYPE){
                    estado=2;
                }
            break;
            case 1:
                act = Constant.TYPE;
                status=1;
            break;
            case 2:
                
            break;
        }
        return status;
    }
}
