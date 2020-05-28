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
        /*
        Los elementos que encontramos en este nivel son:
        1)Sensores 
            Uprox+: la empresa Wolkwagen utiliza sensores uprox+ para sus procesos de ensamblaje.
            Inductivos; detectan objetos de metal sin desgaste.
            De ángulo RI inductivos: sirven para asegurar que los tornillos sean insertados exactamente a las especificaciones.
        2)Actuadores: los actuadores acompañados de los sensores generan el movimiento de las partes del robot.
            Hidraulicos: se utilizan en robots de gran tamaño que requieren velocidad en la ejecución.
            Neumáticos: usados en robots de pequeño tamaño y en mecanismos de accionamiento.
            Eléctricos: son los más idóneos para robots que no demandan gran velocidad ni potencia.
        */

        
        
        System.out.println("Administraciòn del nivel de control PLC:");
        String niveldecontrolPLC=objeto.nextLine();
        /*
        PLC es un controlador lógico programable.
        Los elementos que encontramos en este nivel son:
        1)Control de procesos.
            Control de colocación en mesas giratorias: Los sensores fotoeléctricos detectan la parte lateral en una mesa giratoria.
            Inspección de piezas en herramientas de soldado: Los detectores inductivos detectan sin interferencias las piezas en instalaciones de soldadura.
            Supervisión de vacío en ventosas: detectan si existe el vacío necesario para el funcionamiento seguro de las ventosas.
        2)Decisiones de Planta. 
            Identificación del tipo de carrocerías y componentes: Identificación de piezas estructurales.
            Identificación de topos adhesivos de insonorización: Para la insonorización
       */
        
        
        
        System.out.println("Administración del nivel de supervisión:");
        String niveldesupervisión=objeto.nextLine();
        /*
        Los elementos que encontramos en este nivel son:
        1)Estaciones de Operación: precisan una tecnología de ajuste de la trayectoria del 
            robot cuando las piezas se colocan de forma distinta en cada ciclo
        2)Servidores de procesos: Se utiliza el programa Windows NT/2000 para el procesamiento de datos:     
            Ajuste de trayectoria de robot, trayectorias de medicion.
        */
        
        
        System.out.println("Registro del nivel MES:");
        String nivelMES=objeto.nextLine();
        /*
        MES Sistema de ejecución de manufactura.
        Los elementos que encontramos en este nivel son:
        1) Producto: la producción  trabajan los robots para crear hasta 113 carros por hora
        2) Monitorización: Para medir el perfil del automóvil, los sensores se mueven, 
            bien mediante el robot o mediante una pequeña unidad de transporte incorporada.
        3) Decisiones de Planta: Desarrollado en las instalaciones body-in-white de ABB, es una solución 
            de software que aumentará el rendimiento y reducirá los costes de montaje de las carrocerías de automóviles.
        */
        
        
        
        System.out.println("Registro del nivel ERP:");
        String nivelERP=objeto.nextLine();
        /*
        ERP Sistema de Planificacion de Recursos Empresariales.
        Los elementos que encontramos en este nivel son:
        1)Planificación de recursos: Aumento de productividad mediante control inteligente.
        2)Cliente: Nos prefieren por trabajar con recursos de excelente calidad y un buen precio en el mercado.
        3)Decisiones del negocio: Adquirir mejor control inteligente que calcule cuantos autos se esta ensamblado en un día.  
        */
        
        
        
        System.out.println("Imprimir reportes:");
        String reportes=objeto.nextLine();
        /*
        En este nivel se exponen los reportes finales de cada nivel
        de automatizacion
        */
    }
    
}
