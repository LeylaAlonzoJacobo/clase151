
package telefonia;

import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String Nombre = null;
        String Apellido = null;
        String Ciudad = null;
        double DPI=0;
        double Telefono=0;
        double can2=0;
        double cantidad=0;
        String tel;
        String dp;
        double saldoant=0;
        double saldoact=0;
        double opc =0;
        double total=0;
        double compra=0;
        double cobro=1.00;
        double can1=0;
        double oper=0;
        double Opcion=0;
        int Opcion1 =0;
        int Opcion2=0;
        int can3=0;
   
         
   
        int Contador = 0;
         boolean Salir = false;
        do{
            System.out.println ("Bienvenido a su servicio de telefonía en línea");
        System.out.println ("");
        System.out.print ("Ingrese su número de telefono ");                             // Ingreso de Datos al menu
        System.out.println ("");
        can1=sc.nextInt(); 
            if (oper >=8){
            while (!Salir){
            System.out.println("-----------------------------");
            System.out.println("BIENVENIDO A LA TELEFONIA");
            System.out.println("-----------------------------");
             System.out.println("Se presnte el siguiete menu: ");
            System.out.println("1. Cliente");
            System.out.println("2. Operaciones");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opcion");
            Opcion=sc.nextInt();
         
        
            switch(Opcion1 ){
            
                case 1 -> {
                    System.out.println("Ingreso de datos del clientes:  ");
                    
                    System.out.println("Ingresar nombre: ");
                    Nombre=sc.next();
                    System.out.println("Ingresar apellido: ");
                    Apellido=sc.next();
                    System.out.println("Ingresar la ciudad: ");
                    Ciudad=sc.next();
                    System.out.println("Ingresar DPI: ");
                    dp=sc.next();
                    System.out.println("Ingresar telefono: ");
                    tel=sc.next();
                    System.out.println("nombre: "+Nombre);
                    System.out.println("apellido: "+Apellido);
                    System.out.println("ciudad"+Ciudad);
                    System.out.println("DPI: "+DPI);
                    System.out.println("telefono: "+Telefono);
                    }
                    
                case 2 -> {
                    System.out.println("\n");
                    System.out.println("Elija eliga una opcion");
                    System.out.println("");
                    System.out.println("4 Compra de Saldo de recarga");
                    System.out.println("5 Consulta de saldo disponible");
                    System.out.println("6 Consulta de datos del cliente");
                    can3=sc.nextInt();
                    
                 switch (Opcion2){
                        case 3 -> {
                            System.out.println ("\n");
                            System.out.println ("Ingrese la cantidad: ");
                            cantidad = sc.nextInt();
                            saldoact = saldoant + compra;
                            System.out.println ("Saldo a debitar es: Q. "+can2 );
                            saldoant=saldoact;
                    }
                        case 4 -> {
                            System.out.println ("Las consultas por intento tiene un cobro de Q. 1.00 cada consulta");
                            System.out.println ("Presione 1 para continuar y 0 para salir");
                            can2= sc.nextInt();
                            if (opc!=0){
                                if (saldoact==0){
                                    System.out.println ("su saldo disponible no es suficiente para la consulta ");
                                }
                                else{
                                    saldoact = saldoact - cobro;
                                    System.out.println ("\n");
                                    System.out.println ("Su saldo actual es: "+ saldoact);
                                    saldoact = saldoant;
                                    System.out.println ("");
                                    System.out.println ("Su saldo Anterior es: "+ saldoant);
                                    saldoant = saldoact;
                                }
                    case 5 -> {
                     System.out.println ("Las consultas tienen un costo de Q0.75 C/Q");
                     System.out.println ("Presione 1 para continuar y 0 para salir");
                    Opcion3 = teclado.nextInt();
                     if (Opcion3!=0){
                         if (Saldo_Actual==0){
                    System.out.println ("Su saldo es insuficiente para realizar esta consultar el saldo");     
                         }
                         else {    
                     System.out.println ("");
                     System.out.println ("Numero de teléfono es :" + Notelefono);                //falta una validacion que, si no hay datos no haga la consulta. los valores por defecto son 0 y null.
                     System.out.println ("Nombre del cliente :"+ Nombre + Apellido);             // si hay saldo, si ingresara la consulta
                     System.out.println ("DPI del cliente :"+ DPI);
                     System.out.println ("Dirección del cliente :"+ Ciudad);              //Consultas.
                     Saldoant = Saldoant;
                         }
                  
    
        }
                    int Intentos;
        
        if(Intentos ==3) {
            System.out.println("");
            System.out.println ("Un número telefónico valio es de 8 digitos");
        break;
}
