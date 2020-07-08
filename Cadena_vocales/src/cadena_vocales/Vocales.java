/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena_vocales;

/**
 *
 * @author omarmora
 */
public class Vocales {
    public static void Vocales(String Frase){
        String Texto= Frase;
       int A=0;
       int E=0;
       int I=0;
       int O=0;
       int U=0;
       int a=0;
       int e=0;
       int i=0;
       int o=0;
       int u=0;
       int TamañoTexto=Texto.length();
       int posicion=0;
       
       posicion=Texto.indexOf("A");
       while(posicion!=-1)
       {
           A++;
           posicion=Texto.indexOf("A",posicion+1);
       }
       
       posicion=0;
       posicion=Texto.indexOf("E");
       while(posicion!=-1)
       {
           E++;
           posicion=Texto.indexOf("E",posicion+1);
       }
       
       posicion=0;
       posicion=Texto.indexOf("I");
       while(posicion!=-1)
       {
           I++;
           posicion=Texto.indexOf("I",posicion+1);
       }
       
       posicion=0;
       posicion=Texto.indexOf("O");
       while(posicion!=-1)
       {
           O++;
           posicion=Texto.indexOf("O",posicion+1);
       }
       
       posicion=0;
       posicion=Texto.indexOf("U");
       while(posicion!=-1)
       {
           U++;
           posicion=Texto.indexOf("U",posicion+1);
       }
       
       posicion=0;
        posicion=Texto.indexOf("a");
       while(posicion!=-1)
       {
           a++;
           posicion=Texto.indexOf("a",posicion+1);
       }
       
       posicion=0;
       posicion=Texto.indexOf("e");
       while(posicion!=-1)
       {
           e++;
           posicion=Texto.indexOf("e",posicion+1);
       }
       
       posicion=0;
       posicion=Texto.indexOf("i");
       while(posicion!=-1)
       {
           i++;
           posicion=Texto.indexOf("i",posicion+1);
       }
       
       posicion=0;
       posicion=Texto.indexOf("o");
       while(posicion!=-1)
       {
           o++;
           posicion=Texto.indexOf("o",posicion+1);
       }
       
       posicion=0;
       posicion=Texto.indexOf("u");
       while(posicion!=-1)
       {
           u++;
           posicion=Texto.indexOf("u",posicion+1);
       }
       Interfaz.jTextField2.setText(""+TamañoTexto);
       Interfaz.jTextField3.setText(""+A);
       Interfaz.jTextField4.setText(""+E);
       Interfaz.jTextField5.setText(""+I);
       Interfaz.jTextField6.setText(""+O);
       Interfaz.jTextField7.setText(""+U);
       Interfaz.jTextField8.setText(""+a);
       Interfaz.jTextField9.setText(""+e);
       Interfaz.jTextField10.setText(""+i);
       Interfaz.jTextField11.setText(""+o);
       Interfaz.jTextField12.setText(""+u);
       Interfaz.jTextField13.setText(""+(A+a));
       Interfaz.jTextField14.setText(""+(E+e));
       Interfaz.jTextField15.setText(""+(I+i));
       Interfaz.jTextField16.setText(""+(O+o));
       Interfaz.jTextField17.setText(""+(U+u));
       Interfaz.jTextField18.setText(""+(A+a+E+e+I+i+O+o+U+u));
       

    }
    
}
