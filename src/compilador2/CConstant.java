/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador2;

/**
 *
 * @author Familia
 */
public class CConstant implements Token{
    Constant c;
    String val;
    
    CConstant(Constant c,String val){
        this.c=c;
        this.val=val;
    }
    CConstant(Constant c){
        this.c=c;
    }
    public String toString(){
        return this.c.toString();
    }
    public void imprim(int x){
       
   }
    public void setValue(String a){
       this.val+=a;
   }
    public String getValue(){
       return this.val;
   }
    
}
