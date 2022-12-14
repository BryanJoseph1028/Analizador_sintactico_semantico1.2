package analizador;
import java.io.*;
import java.lang.*;
import java_cup.runtime.*;
import java_cup.runtime.Symbol;
import java.util.ArrayList;
import java.util.*;
//import analizador_lexico.*;
import javax.swing.JOptionPane;
public class parser extends java_cup.runtime.lr_parser {
  public parser() {super();}
  public parser(java_cup.runtime.Scanner s) {super(s);}
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\030\000\002\002\004\000\002\003\004\000\002\003" +
    "\003\000\002\004\003\000\002\004\003\000\002\004\003" +
    "\000\002\004\003\000\002\004\003\000\002\004\003\000" +
    "\002\005\003\000\002\005\003\000\002\005\003\000\002" +
    "\005\003\000\002\005\003\000\002\005\003\000\002\005" +
    "\003\000\002\005\003\000\002\005\003\000\002\005\003" +
    "\000\002\005\003\000\002\005\003\000\002\005\003\000" +
    "\002\005\003\000\002\005\003" });
  /** Access to production table. */
  public short[][] production_table() {return _production_table;}
  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\032\000\052\004\020\005\016\006\025\007\005\010" +
    "\011\011\017\012\026\013\006\014\023\015\021\016\030" +
    "\017\027\022\012\023\007\024\013\025\015\026\004\027" +
    "\031\030\010\031\022\001\002\000\054\002\ufffc\004\ufffc" +
    "\005\ufffc\006\ufffc\007\ufffc\010\ufffc\011\ufffc\012\ufffc\013" +
    "\ufffc\014\ufffc\015\ufffc\016\ufffc\017\ufffc\022\ufffc\023\ufffc" +
    "\024\ufffc\025\ufffc\026\ufffc\027\ufffc\030\ufffc\031\ufffc\001" +
    "\002\000\054\002\ufff5\004\ufff5\005\ufff5\006\ufff5\007\ufff5" +
    "\010\ufff5\011\ufff5\012\ufff5\013\ufff5\014\ufff5\015\ufff5\016" +
    "\ufff5\017\ufff5\022\ufff5\023\ufff5\024\ufff5\025\ufff5\026\ufff5" +
    "\027\ufff5\030\ufff5\031\ufff5\001\002\000\054\002\ufff1\004" +
    "\ufff1\005\ufff1\006\ufff1\007\ufff1\010\ufff1\011\ufff1\012\ufff1" +
    "\013\ufff1\014\ufff1\015\ufff1\016\ufff1\017\ufff1\022\ufff1\023" +
    "\ufff1\024\ufff1\025\ufff1\026\ufff1\027\ufff1\030\ufff1\031\ufff1" +
    "\001\002\000\054\002\uffeb\004\uffeb\005\uffeb\006\uffeb\007" +
    "\uffeb\010\uffeb\011\uffeb\012\uffeb\013\uffeb\014\uffeb\015\uffeb" +
    "\016\uffeb\017\uffeb\022\uffeb\023\uffeb\024\uffeb\025\uffeb\026" +
    "\uffeb\027\uffeb\030\uffeb\031\uffeb\001\002\000\054\002\ufffa" +
    "\004\ufffa\005\ufffa\006\ufffa\007\ufffa\010\ufffa\011\ufffa\012" +
    "\ufffa\013\ufffa\014\ufffa\015\ufffa\016\ufffa\017\ufffa\022\ufffa" +
    "\023\ufffa\024\ufffa\025\ufffa\026\ufffa\027\ufffa\030\ufffa\031" +
    "\ufffa\001\002\000\054\002\ufff4\004\ufff4\005\ufff4\006\ufff4" +
    "\007\ufff4\010\ufff4\011\ufff4\012\ufff4\013\ufff4\014\ufff4\015" +
    "\ufff4\016\ufff4\017\ufff4\022\ufff4\023\ufff4\024\ufff4\025\ufff4" +
    "\026\ufff4\027\ufff4\030\ufff4\031\ufff4\001\002\000\054\002" +
    "\uffec\004\uffec\005\uffec\006\uffec\007\uffec\010\uffec\011\uffec" +
    "\012\uffec\013\uffec\014\uffec\015\uffec\016\uffec\017\uffec\022" +
    "\uffec\023\uffec\024\uffec\025\uffec\026\uffec\027\uffec\030\uffec" +
    "\031\uffec\001\002\000\054\002\uffea\004\uffea\005\uffea\006" +
    "\uffea\007\uffea\010\uffea\011\uffea\012\uffea\013\uffea\014\uffea" +
    "\015\uffea\016\uffea\017\uffea\022\uffea\023\uffea\024\uffea\025" +
    "\uffea\026\uffea\027\uffea\030\uffea\031\uffea\001\002\000\054" +
    "\002\ufffe\004\ufffe\005\ufffe\006\ufffe\007\ufffe\010\ufffe\011" +
    "\ufffe\012\ufffe\013\ufffe\014\ufffe\015\ufffe\016\ufffe\017\ufffe" +
    "\022\ufffe\023\ufffe\024\ufffe\025\ufffe\026\ufffe\027\ufffe\030" +
    "\ufffe\031\ufffe\001\002\000\054\002\ufffd\004\ufffd\005\ufffd" +
    "\006\ufffd\007\ufffd\010\ufffd\011\ufffd\012\ufffd\013\ufffd\014" +
    "\ufffd\015\ufffd\016\ufffd\017\ufffd\022\ufffd\023\ufffd\024\ufffd" +
    "\025\ufffd\026\ufffd\027\ufffd\030\ufffd\031\ufffd\001\002\000" +
    "\054\002\ufff7\004\ufff7\005\ufff7\006\ufff7\007\ufff7\010\ufff7" +
    "\011\ufff7\012\ufff7\013\ufff7\014\ufff7\015\ufff7\016\ufff7\017" +
    "\ufff7\022\ufff7\023\ufff7\024\ufff7\025\ufff7\026\ufff7\027\ufff7" +
    "\030\ufff7\031\ufff7\001\002\000\054\002\ufff3\004\ufff3\005" +
    "\ufff3\006\ufff3\007\ufff3\010\ufff3\011\ufff3\012\ufff3\013\ufff3" +
    "\014\ufff3\015\ufff3\016\ufff3\017\ufff3\022\ufff3\023\ufff3\024" +
    "\ufff3\025\ufff3\026\ufff3\027\ufff3\030\ufff3\031\ufff3\001\002" +
    "\000\054\002\ufff8\004\ufff8\005\ufff8\006\ufff8\007\ufff8\010" +
    "\ufff8\011\ufff8\012\ufff8\013\ufff8\014\ufff8\015\ufff8\016\ufff8" +
    "\017\ufff8\022\ufff8\023\ufff8\024\ufff8\025\ufff8\026\ufff8\027" +
    "\ufff8\030\ufff8\031\ufff8\001\002\000\054\002\uffef\004\uffef" +
    "\005\uffef\006\uffef\007\uffef\010\uffef\011\uffef\012\uffef\013" +
    "\uffef\014\uffef\015\uffef\016\uffef\017\uffef\022\uffef\023\uffef" +
    "\024\uffef\025\uffef\026\uffef\027\uffef\030\uffef\031\uffef\001" +
    "\002\000\054\002\ufff9\004\ufff9\005\ufff9\006\ufff9\007\ufff9" +
    "\010\ufff9\011\ufff9\012\ufff9\013\ufff9\014\ufff9\015\ufff9\016" +
    "\ufff9\017\ufff9\022\ufff9\023\ufff9\024\ufff9\025\ufff9\026\ufff9" +
    "\027\ufff9\030\ufff9\031\ufff9\001\002\000\054\002\ufff0\004" +
    "\ufff0\005\ufff0\006\ufff0\007\ufff0\010\ufff0\011\ufff0\012\ufff0" +
    "\013\ufff0\014\ufff0\015\ufff0\016\ufff0\017\ufff0\022\ufff0\023" +
    "\ufff0\024\ufff0\025\ufff0\026\ufff0\027\ufff0\030\ufff0\031\ufff0" +
    "\001\002\000\054\002\033\004\020\005\016\006\025\007" +
    "\005\010\011\011\017\012\026\013\006\014\023\015\021" +
    "\016\030\017\027\022\012\023\007\024\013\025\015\026" +
    "\004\027\031\030\010\031\022\001\002\000\054\002\ufff6" +
    "\004\ufff6\005\ufff6\006\ufff6\007\ufff6\010\ufff6\011\ufff6\012" +
    "\ufff6\013\ufff6\014\ufff6\015\ufff6\016\ufff6\017\ufff6\022\ufff6" +
    "\023\ufff6\024\ufff6\025\ufff6\026\ufff6\027\ufff6\030\ufff6\031" +
    "\ufff6\001\002\000\054\002\ufff2\004\ufff2\005\ufff2\006\ufff2" +
    "\007\ufff2\010\ufff2\011\ufff2\012\ufff2\013\ufff2\014\ufff2\015" +
    "\ufff2\016\ufff2\017\ufff2\022\ufff2\023\ufff2\024\ufff2\025\ufff2" +
    "\026\ufff2\027\ufff2\030\ufff2\031\ufff2\001\002\000\054\002" +
    "\uffed\004\uffed\005\uffed\006\uffed\007\uffed\010\uffed\011\uffed" +
    "\012\uffed\013\uffed\014\uffed\015\uffed\016\uffed\017\uffed\022" +
    "\uffed\023\uffed\024\uffed\025\uffed\026\uffed\027\uffed\030\uffed" +
    "\031\uffed\001\002\000\054\002\uffee\004\uffee\005\uffee\006" +
    "\uffee\007\uffee\010\uffee\011\uffee\012\uffee\013\uffee\014\uffee" +
    "\015\uffee\016\uffee\017\uffee\022\uffee\023\uffee\024\uffee\025" +
    "\uffee\026\uffee\027\uffee\030\uffee\031\uffee\001\002\000\054" +
    "\002\ufffb\004\ufffb\005\ufffb\006\ufffb\007\ufffb\010\ufffb\011" +
    "\ufffb\012\ufffb\013\ufffb\014\ufffb\015\ufffb\016\ufffb\017\ufffb" +
    "\022\ufffb\023\ufffb\024\ufffb\025\ufffb\026\ufffb\027\ufffb\030" +
    "\ufffb\031\ufffb\001\002\000\054\002\uffff\004\uffff\005\uffff" +
    "\006\uffff\007\uffff\010\uffff\011\uffff\012\uffff\013\uffff\014" +
    "\uffff\015\uffff\016\uffff\017\uffff\022\uffff\023\uffff\024\uffff" +
    "\025\uffff\026\uffff\027\uffff\030\uffff\031\uffff\001\002\000" +
    "\004\002\001\001\002\000\054\002\000\004\000\005\000" +
    "\006\000\007\000\010\000\011\000\012\000\013\000\014" +
    "\000\015\000\016\000\017\000\022\000\023\000\024\000" +
    "\025\000\026\000\027\000\030\000\031\000\001\002" });
  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}
  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\032\000\010\003\023\004\031\005\013\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\004\033\005\013\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });
  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}
  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;
  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }
  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }
  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}
  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}
  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}
public void syntax_error(Symbol cur_token){
System.out.println("va a ingresar el error sintactico "+ cur_token.value);
JOptionPane.showMessageDialog(null, "Debe de ingresar algun Texto", "ERROR", JOptionPane.ERROR_MESSAGE);
}
public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{

System.out.println("error  YA no se recupera");
 }
public void semantic(Symbol cur_token,String n)
{
System.out.println("error semantico ");
  }
public void semantic(String msg, Object obj) {
}
}
/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
void print(String msj)
   {System.out.println(msj);}
  private final parser parser;
  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }
  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;
      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // SIMBOLO ::= COMILLA 
            {
              String RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT =d.toString();
              CUP$parser$result = new java_cup.runtime.Symbol(3/*SIMBOLO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // SIMBOLO ::= MENORQ 
            {
              String RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT =d.toString();
              CUP$parser$result = new java_cup.runtime.Symbol(3/*SIMBOLO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // SIMBOLO ::= MAYORQ 
            {
              String RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT =d.toString();
              CUP$parser$result = new java_cup.runtime.Symbol(3/*SIMBOLO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // SIMBOLO ::= CORCHETE_C 
            {
              String RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT =d.toString();
              CUP$parser$result = new java_cup.runtime.Symbol(3/*SIMBOLO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // SIMBOLO ::= CORCHETE_A 
            {
              String RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT =d.toString();
              CUP$parser$result = new java_cup.runtime.Symbol(3/*SIMBOLO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // SIMBOLO ::= LLAVE_C 
            {
              String RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT =d.toString();
              CUP$parser$result = new java_cup.runtime.Symbol(3/*SIMBOLO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // SIMBOLO ::= LLAVE_A 
            {
              String RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT =d.toString();
              CUP$parser$result = new java_cup.runtime.Symbol(3/*SIMBOLO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // SIMBOLO ::= IGUAL 
            {
              String RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT =d.toString();
              CUP$parser$result = new java_cup.runtime.Symbol(3/*SIMBOLO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // SIMBOLO ::= SIG_RESTA 
            {
              String RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT =d.toString();
              CUP$parser$result = new java_cup.runtime.Symbol(3/*SIMBOLO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // SIMBOLO ::= DIAGONAL 
            {
              String RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT =d.toString();
              CUP$parser$result = new java_cup.runtime.Symbol(3/*SIMBOLO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // SIMBOLO ::= COMA 
            {
              String RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT =d.toString();
              CUP$parser$result = new java_cup.runtime.Symbol(3/*SIMBOLO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;
         /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // SIMBOLO ::= DOSPUNTOS 
            {
              String RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT =d.toString();
              CUP$parser$result = new java_cup.runtime.Symbol(3/*SIMBOLO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // SIMBOLO ::= PUNTOCOMA 
            {
              String RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT =d.toString();
              CUP$parser$result = new java_cup.runtime.Symbol(3/*SIMBOLO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SIMBOLO ::= PARENTESIS_C 
            {
              String RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT =d.toString();
              CUP$parser$result = new java_cup.runtime.Symbol(3/*SIMBOLO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SIMBOLO ::= PARENTESIS_A 
            {
              String RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT =d.toString();
              CUP$parser$result = new java_cup.runtime.Symbol(3/*SIMBOLO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // INICIO ::= ATRIBUTO 
            {
              Object RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		Interfaz.rotular("Se reconocio el token tipo Atributo de HTML:   "+d.toString());
              CUP$parser$result = new java_cup.runtime.Symbol(2/*INICIO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // INICIO ::= ETIQUETA 
            {
              Object RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		Interfaz.rotular("Se reconocio el token tipo Etiqueta de HTML:   "+d.toString());
              CUP$parser$result = new java_cup.runtime.Symbol(2/*INICIO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // INICIO ::= ALFABETICO 
            {
              Object RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		Interfaz.rotular("Se reconocio el token tipo Alfabetico:   "+d.toString());
              CUP$parser$result = new java_cup.runtime.Symbol(2/*INICIO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // INICIO ::= NUMERICO 
            {
              Object RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
         	Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		Interfaz.rotular("Se reconocio el token tipo Numerico:   "+d.toString());
              CUP$parser$result = new java_cup.runtime.Symbol(2/*INICIO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // INICIO ::= ALFANUMERICO 
            {
              Object RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		Interfaz.rotular("Se reconocio el token tipo Alfanumerico:   "+d.toString());
              CUP$parser$result = new java_cup.runtime.Symbol(2/*INICIO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INICIO ::= SIMBOLO 
            {
              Object RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		String d = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		Interfaz.rotular("Se reconocio el token tipo Simbolo:   "+d.toString());
              CUP$parser$result = new java_cup.runtime.Symbol(2/*INICIO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // START ::= INICIO 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(1/*START*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // START ::= START INICIO 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(1/*START*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= START EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;
          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");
        }
    }
}