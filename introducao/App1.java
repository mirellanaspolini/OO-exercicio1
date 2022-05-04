package introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;

import introducao.exercicio1.Autor;
import introducao.exercicio1.Livro;

public class App1 {
    public static void main(String[] args){
        //PRIMEIRO LIVRO
        Livro livro1 = new Livro("Java como programar");
        livro1.setValor(349f);
        livro1.setEsgotado(false);
        Calendar data1 = GregorianCalendar.getInstance();
        data1.set(1945,0,01);
        Autor escritor1 = new Autor("Deitel", data1.getTime());
        livro1.setEscritor(escritor1);  
        
        System.out.println(livro1.toString());
        
        //SEGUNDO LIVRO
        Livro livro2 = new Livro("UML guia do usuário");
        livro2.setValor(165f);
        livro2.setEsgotado(false);
        Calendar data2 = GregorianCalendar.getInstance();
        data2.set(1955,01,27);
        Autor escritor2 = new Autor("Grady Booch", data2.getTime());
        livro2.setEscritor(escritor2);

        System.out.println(livro2.toString());

        //TERCEIRO LIVRO
        Livro livro3 =  new Livro("Java 2 ensino didático");
        livro3.setValor(126f);
        livro3.setEsgotado(true);
        Autor escritor3 = new Autor("Grady Booch", null);
        livro3.setEscritor(escritor3);

        System.out.println(livro3.toString());
    }
}
