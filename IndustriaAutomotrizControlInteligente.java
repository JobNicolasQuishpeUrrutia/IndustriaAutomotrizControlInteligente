/*
 Implementar un algoritmo que me permita solicitar el ingreso por teclado los niveles de
Automatización Indsturial, referente a la Industria Automotriz-CONTROL INTELIGENTE.
1) Administración del nivel de campo.
2) Administración del nivel de control PLC.
3) Administración del nivel de supervisión.
4) Registro del nivel MES.
5) Registro del nivel ERP.
6) Imprimir reportes.
 */
package industriaautomotrizcontrolinteligente;

import java.util.Scanner;

/**
 *
 * @author  Ortiz Hector, Padilla Fernando, Pico Ana, Quishpe Nicolás.
 */
public class IndustriaAutomotrizControlInteligente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner (System.in); //new, reserva espacio de memoria.
        
        System.out.println("                               Universidad de las Fuerzas Armadas ESPE");
        System.out.println("                                           Sede Latacunga");
        System.out.println("Tema: MODELO DE COMPUTACION – CASO PRÁCTICO-ROBOTS EN LA INDUSTRIA AUTOMOTRIZ – CONTROL INTELIGENTE");
        System.out.println("Integrantes:  Ortiz Hector");
        System.out.println("              Padilla Fernando");
        System.out.println("              Pico Ana");
        System.out.println("              Quishpe Nicolás");
        
        System.out.println("Administración del nivel de campo:");
        String niveldecampo=objeto.nextLine();
        
        System.out.println("Administraciòn del nivel de control PLC:");
        String niveldecontrolPLC=objeto.nextLine();
        
        System.out.println("Administración del nivel de supervisión:");
        String niveldesupervisión=objeto.nextLine();
        
        System.out.println("Registro del nivel MES:");
        String nivelMES=objeto.nextLine();
        
        System.out.println("Registro del nivel ERP:");
        String nivelERP=objeto.nextLine();
        
        System.out.println("Imprimir reportes:");
        String reportes=objeto.nextLine();
        
    }
    
}
