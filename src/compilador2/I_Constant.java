
package compilador2;

public class I_Constant{
    Token act;
    int status;
    int estado;
    String ide;

    public I_Constant(){
        reset();
    }
    public void reset(){
        act=null;
        status=0;
        estado=0;
        ide="";
    }

    public int getStatus(){
        return status;
    }
    public Token getConstant(){
        return act;
    }
    public String getId(){
        return ide;
    }
    public int check(char c){
        switch(estado){
            case 0:
                if(c==' ' || c=='\t' || c=='\n'){
                    estado=0;
                }else if(c=='%'){
                    estado=1;
                }else if(c=='('){
                    estado=2;
                }else if(c==')'){
                    estado=3;
                }else if(c=='{'){
                    estado=4;
                }else if(c=='}'){
                    estado=5;
                }else if(c=='['){
                    estado=6;
                }else if(c==']'){
                    estado=7;
                }else if(c=='.'){
                    estado=8;
                }else if(c==':'){
                    estado=9;
                }else if(c==';'){
                    estado=10;
                }else if(c==','){
                    estado=11;
                }else if(c=='|'){
                    estado=12;
                }else if(c=='*'){
                    estado=14;
                }else if(c=='/'){
                    estado=17;
                }else if(c=='-'){
                    estado=21;
                }else if(c=='+'){
                    estado=24;
                }else if(c=='!'){
                    estado=27;
                }else if(c=='&'){
                    estado=29;
                }else if(c=='<'){
                    estado=31;
                }else if(c=='='){
                    estado=33;
                }else if(c=='>'){
                    estado=35;
                }else if(c=='b'){
                    estado=38;
                    ide+=Character.valueOf(c);
                }else if(c=='c'){
                    estado=43;
                    ide+=Character.valueOf(c);
                }else if(c=='d'){
                    estado=50;
                    ide+=Character.valueOf(c);
                }else if(c=='e'){
                    estado=62;
                    ide+=Character.valueOf(c);
                }else if(c=='f'){
                    estado=66;
                    ide+=Character.valueOf(c);
                }else if(c=='i'){
                    estado=73;
                    ide+=Character.valueOf(c);
                }else if(c=='l'){
                    estado=77;
                    ide+=Character.valueOf(c);
                }else if(c=='r'){
                    estado=81;
                    ide+=Character.valueOf(c);
                }else if(c=='s'){
                    estado=87;
                    ide+=Character.valueOf(c);
                }else if(c=='v'){
                    estado=98;
                    ide+=Character.valueOf(c);
                }else if(c=='w'){
                    estado=102;
                    ide+=Character.valueOf(c);
                }else if((c>=65 && c<=90)||(c>=97 && c<=122)){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if((c>=48 && c<=57)){
                    estado=107;
                    ide+=Character.valueOf(c);
                }
            break;
            case 1:
                status=1;
                act=Constant.PORCENTAJE;
            break;
            case 2:
                status=1;
                act=Constant.PAREN_A;
            break;
            case 3:
                status=1;
                act=Constant.PAREN_C;
            break;
            case 4:
                status=1;
                act=Constant.LLAVE_A;
            break;
            case 5:
                status=1;
                act=Constant.LLAVE_C;
            break;
            case 6:
                status=1;
                act=Constant.CORCH_A;
            break;
            case 7:
                status=1;
                act=Constant.CORCH_C;
            break;
            case 8:
                status=1;
                act=Constant.PUNTO;
            break;
            case 9:
                status=1;
                act=Constant.DOBLE_PUNTO;
            break;
            case 10:
                status=1;
                act=Constant.PUNTO_Y_COMA;
            break;
            case 11:
                status=1;
                act=Constant.COMA;
            break;
            case 12:
                if(c=='|'){
                    estado=13;
                }else{
                    status=1;
                    act=Constant.BARRA;
                }
            break;
            case 13:
                status=1;
                act=Constant.OR;
            break;
            case 14:
                if(c=='='){
                    estado=15;
                }else if(c=='/'){
                    estado=16;
                }else{
                    status=1;
                    act=Constant.ASTERISCO;
                }
            break;
            case 15:
                status=1;
                act=Constant.ASTERISCOIGUAL;
            break;
            case 16:
                status=1;
                act=Constant.COMENTARIOFIN;
            break;
            case 17:
                if(c=='='){
                    estado=18;
                }else if(c=='*'){
                    estado=19;
                }else if(c=='/'){
                    estado=20;
                }else{
                    status=1;
                    act=Constant.DIV;
                }
            break;
            case 18:
                status=1;
                act=Constant.DIVIGUAL;
            break;
            case 19:
                status=1;
                act=Constant.COMENTARIOINI;
            break;
            case 20:
                status=1;
                act=Constant.COMENT_LINEA;
            break;
            case 21:
                if(c=='='){
                    estado=22;
                }else if(c=='-'){
                    estado=23;
                }else{
                    status=1;
                    act=Constant.MENOS;
                }
            break;
            case 22:
                status=1;
                act=Constant.MENOSIGUAL;
            break;
            case 23:
                status=1;
                act=Constant.MENOSMENOS;
            break;
            case 24:
                if(c=='='){
                    estado=25;
                }else if(c=='+'){
                    estado=26;
                }else{
                    status=1;
                    act=Constant.MAS;
                }
            break;
            case 25:
                status=1;
                act=Constant.MASIGUAL;
            break;
            case 26:
                status=1;
                act=Constant.MASMAS;
            break;
            case 27:
                if(c=='='){
                    estado=28;
                }else{
                    status=1;
                    act=Constant.EXCLAMACION;
                }
            break;
            case 28:
                status=1;
                act=Constant.DIFERENTE;
            break;
            case 29:
                if(c=='&'){
                    estado=30;
                }else{
                    status=1;
                    act=Constant.AMPERSON;
                }
            break;
            case 30:
                status=1;
                act=Constant.AND;
            break;
            case 31:
                if(c=='='){
                    estado=32;
                }else{
                    status=1;
                    act=Constant.MENOR;
                }
            break;
            case 32:
                status=1;
                act=Constant.MENORIGUAL;
            break;
            case 33:
                if(c=='='){
                    estado=34;
                }else{
                    status=1;
                    act=Constant.ASIGNACION;
                }
            break;
            case 34:
                status=1;
                act=Constant.IGUALIGUAL;
            break;
            case 35:
                if(c=='='){
                    estado=36;
                }else{
                    status=1;
                    act=Constant.MAYOR;
                }
            break;
            case 36:
                status=1;
                act=Constant.MAYORIGUAL;
            break;

            case 37:
                if((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122)){
                    ide+=Character.valueOf(c);
                    estado=37;
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);

                }

            break;
            case 38:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='r'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='r'){
                    estado=39;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 39:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='e'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='e'){
                    estado=40;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 40:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='a'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='a'){
                    estado=41;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 41:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='k'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='k'){
                    estado=42;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 42:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=Constant.BREAK;
                }
            break;
            case 43:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&!(c=='a' || c=='h')){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='a'){
                    estado=44;
                    ide+=Character.valueOf(c);
                }else if(c=='h'){
                    estado=47;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 44:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='s'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='s'){
                    estado=45;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 45:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='e'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='e'){
                    estado=46;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 46:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=Constant.CASE;
                }
            break;
            case 47:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='a'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='a'){
                    estado=48;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 48:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='r'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='r'){
                    estado=49;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 49:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=Constant.CHAR;
                }
            break;
            case 50:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&!(c=='e' || c=='o')){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='e'){
                    estado=51;
                    ide+=Character.valueOf(c);
                }else if(c=='o'){
                    estado=57;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 51:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='f'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='f'){
                    estado=52;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 52:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='a'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='a'){
                    estado=53;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 53:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='u'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='u'){
                    estado=54;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 54:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='l'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='l'){
                    estado=55;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 55:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='t'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='t'){
                    estado=56;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 56:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=Constant.DEFAULT;
                }
            break;
            case 57:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='u'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='u'){
                    estado=58;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=Constant.DO;
                }
            break;
            case 58:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='b'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='b'){
                    estado=59;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 59:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='l'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='l'){
                    estado=60;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 60:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='e'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='e'){
                    estado=61;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 61:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=Constant.DOUBLE;
                }
            break;
            case 62:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='l'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='l'){
                    estado=63;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 63:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='s'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='s'){
                    estado=64;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 64:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='e'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='e'){
                    estado=65;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 65:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=Constant.ELSE;
                }
            break;
            case 66:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&!(c=='l' || c=='o')){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='l'){
                    estado=67;
                    ide+=Character.valueOf(c);
                }else if(c=='o'){
                    estado=71;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 67:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='o'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='o'){
                    estado=68;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 68:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='a'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='a'){
                    estado=69;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 69:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='t'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='t'){
                    estado=70;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 70:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=Constant.FLOAT;
                }
            break;
            case 71:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='r'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='r'){
                    estado=72;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 72:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=Constant.FOR;
                }
            break;
            case 73:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&!(c=='f' || c=='n')){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='f'){
                    estado=74;
                    ide+=Character.valueOf(c);
                }else if(c=='n'){
                    estado=75;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 74:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=Constant.IF;
                }
            break;
            case 75:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='t'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='t'){
                    estado=76;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 76:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=Constant.INT;
                }
            break;
            case 77:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='o'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='o'){
                    estado=78;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 78:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='n'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='n'){
                    estado=79;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 79:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='g'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='g'){
                    estado=80;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 80:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=Constant.LONG;
                }
            break;
            case 81:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='e'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='e'){
                    estado=82;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 82:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='t'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='t'){
                    estado=83;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 83:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='u'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='u'){
                    estado=84;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 84:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='r'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='r'){
                    estado=85;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 85:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='n'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='n'){
                    estado=86;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 86:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=Constant.RETURN;
                }
            break;
            case 87:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&!(c=='h' || c=='w')){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='h'){
                    estado=88;
                    ide+=Character.valueOf(c);
                }else if(c=='w'){
                    estado=92;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 88:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='o'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='o'){
                    estado=89;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 89:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='r'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='r'){
                    estado=90;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 90:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='t'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='t'){
                    estado=91;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 91:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=Constant.SHORT;
                }
            break;
            case 92:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='w'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='w'){
                    estado=93;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 93:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='i'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='i'){
                    estado=94;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 94:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='t'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='t'){
                    estado=95;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 95:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='c'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='c'){
                    estado=96;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 96:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='h'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='h'){
                    estado=97;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 97:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=Constant.SWITCH;
                }
            break;
            case 98:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='o'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='o'){
                    estado=99;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 99:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='i'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='i'){
                    estado=100;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 100:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='d'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='d'){
                    estado=101;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 101:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=Constant.VOID;
                }
            break;
            case 102:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='h'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='h'){
                    estado=103;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 103:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='i'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='i'){
                    estado=104;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 104:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='l'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='l'){
                    estado=105;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 105:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))&&c!='e'){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else if(c=='e'){
                    estado=106;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ID,ide);
                }
            break;
            case 106:
                if(((c>=48 && c<=57)||(c>=65 && c<=90)||(c>=97 && c<=122))){
                    estado=37;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=Constant.WHILE;
                }
            break;
            case 107:
                if(c>=48 && c<=57){
                    estado=108;
                    ide+=Character.valueOf(c);
                }else if(c=='.'){
                    estado=109;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.NUMBERINT,ide);
                }
            break;
            case 108:
                if(c>=48 && c<=57){
                    estado=108;
                    ide+=Character.valueOf(c);
                }else if(c=='.'){
                    estado=109;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.NUMBERINT,ide);
                }
            break;
            case 109:
                if(c>=48 && c<=57){
                    estado=110;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.ERROR,ide);
                }
            break;
            case 110:
                if(c>=48 && c<=57){
                    estado=110;
                    ide+=Character.valueOf(c);
                }else{
                    status=1;
                    act=new CConstant(Constant.NUMBERDEC,ide);
                }
            break;

        }
        return status;
    }
}
