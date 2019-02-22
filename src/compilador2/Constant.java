package compilador2;
public enum Constant implements Token
{
   EOF                 ,// (EOF)
   ERROR               ,// (Error)
   COMMENT             ,// Comment
   NEWLINE             ,// NewLine
   WHITESPACE          ,// Whitespace

   PORCENTAJE("%")          ,// '%'
   PAREN_A("(")             ,// '('
   PAREN_C(")")             ,// ')'
   COMA(",")                ,// ','
   PUNTO(".")               ,// '.'
   DOBLE_PUNTO(":")         ,// ':'
   PUNTO_Y_COMA(";")        ,// ';'
   CORCH_A("[")             ,// '['
   CORCH_C("]")             ,// ']'
   LLAVE_A("{")             ,// '{'
   LLAVE_C("}")             ,// '}'
   CARET("^")               ,// '^'
   
   BARRA("|")               ,// '|'
   OR("||")                  ,// '||'

  

   ASTERISCO("*")           ,// '*'
   ASTERISCOIGUAL("*=")      ,// '*='
   COMENTARIOFIN("*/")        ,// '*/'

   DIV("/")                 ,// '/'
   DIVIGUAL("/=")            ,// '/='
   COMENTARIOINI("/*")        ,// '/*'
   COMENT_LINEA("//")        ,// '//'

   MENOS("-")               ,// '-'
   MENOSMENOS("--")          ,// '--'
   MENOSIGUAL("-=")          ,// '-='
   
   MAS("+")                 ,// '+'
   MASMAS("++")              ,// '++'
   MASIGUAL("+=")            ,// '+='

   EXCLAMACION("!")         ,// '!'
   DIFERENTE("!=")           ,// '!='

   AMPERSON("&")            ,// '&'
   AND("&&")                 ,// '&&'   

   MENOR("<")               ,// '<'
   MENORIGUAL("<=")          ,// '<='

   ASIGNACION("=")          ,// '='
   IGUALIGUAL("==")          ,// '=='

   MAYOR(">")               ,// '>'
   MAYORIGUAL(">=")          ,// '>='
   
   
   BREAK("break")               ,// break
   
   CASE("case")                ,// case
   CHAR("char")                ,// char
   
   DEFAULT("default")             ,// default
   DO("do")                  ,// do
   DOUBLE("double")              ,// double
   
   ELSE("else")                ,// else
      
   FLOAT("float")               ,// float
   FOR("for")                 ,// for
   
   IF("if")                 ,// if
   INT("int")                 ,// int
   
   LONG("long")                ,// long
   
   RETURN("return")              ,// return
   
   SHORT("short")               ,// short   
   SWITCH("switch")              ,// switch
   
   VOID("void")                ,// voiD  
   
   WHILE("while")               ,// while
   
   ID                  ,// Id
   NUMBERINT,
   NUMBERDEC,   
   
   ARG                 ,// <Arg>
   ARRAY               ,// <Array>
   BASE                ,// <Base>
   BLOCK               ,// <Block>
   CASESTMS            ,// <Case Stms>
   DECL                ,// <Decl>
   DECLS               ,// <Decls>
   EXPR                ,// <Expr>
   FUNCDECL            ,// <Func Decl>
   FUNCID              ,// <Func ID>
   FUNCPROTO           ,// <Func Proto>
   IDLIST              ,// <Id List>
   MOD                 ,// <Mod>
   NORMALSTM           ,// <Normal Stm>
   OPADD               ,// <Op Add>
   OPAND               ,// <Op And>
   OPASSIGN            ,// <Op Assign>
   OPBINAND            ,// <Op BinAND>
   OPBINOR             ,// <Op BinOR>
   OPBINXOR            ,// <Op BinXOR>
   OPCOMPARE           ,// <Op Compare>
   OPEQUATE            ,// <Op Equate>
   OPIF                ,// <Op If>
   OPMULT              ,// <Op Mult>
   OPOR                ,// <Op Or>
   OPPOINTER           ,// <Op Pointer>
   OPSHIFT             ,// <Op Shift>
   OPUNARY             ,// <Op Unary>
   PARAM               ,// <Param>
   PARAMS              ,// <Params>
   POINTERS            ,// <Pointers>
   SCALAR              ,// <Scalar>
   SIGN                ,// <Sign>
   STM                 ,// <Stm>
   STMLIST             ,// <Stm List>
   STRUCTDECL          ,// <Struct Decl>
   STRUCTDEF           ,// <Struct Def>
   THENSTM             ,// <Then Stm>
   TYPE                ,// <Type>
   TYPEDEFDECL         ,// <Typedef Decl>
   TYPES               ,// <Types>
   UNIONDECL           ,// <Union Decl>
   VALUE               ,// <Value>
   VAR                 ,// <Var>
   VARDECL             ,// <Var Decl>
   VARITEM             ,// <Var Item>
   VARLIST             ;// <Var List>
   String val="";
   private Constant(){
       
   }
   public void imprim(int x){
       
   }
   private Constant(String val){
       this.val=val;
   }
   public String getValue(){
       return this.val;
   } 
   public void reset(){
       val="";
   }
};
