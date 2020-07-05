/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5_avaliativo;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Exercicio5_avaliativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner result = new Scanner (System.in);
       int hora_extra, hora_falta, premio, h;
       System.out.println("Informe o número de horas extras: ");
       hora_extra = result.nextInt();
       System.out.println("Informe o número de horas de faltas:");
       hora_falta = result.nextInt();
       h = (hora_extra) - (2 / 3 * (hora_falta));
       
       if(h > 40)
       {
       premio = 500;
       }
       else 
       {
           if (h > 30 && h <= 40)
           {
           premio = 400;
           }
        else
           {
           if (h > 20 && h <= 30)
           {
           premio = 300;
           }
           else 
           {
           if (h > 10 && h <= 20)
           {
           premio = 200;
           }
           else
           {
           if (h <= 10)
           {
           premio = 100;
           }
           System.out.println("O valor da sua gratificação é de ");
           }
           }
           }
       }
       
    }
    
}
