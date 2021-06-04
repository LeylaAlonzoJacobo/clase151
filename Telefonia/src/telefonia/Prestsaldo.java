
package telefonia;

public class Prestsaldo extends Operacion{
     double retiro;
     double cantidad;
     double can2;
     double Telefono;
     String Nombre;
     String Apellido;
     String Ciudad;
     double DPI;
  

     
    public Prestsaldo(double cantidad, double can2, double Telefono, String Nombre, String Apellido,String Ciudad, double DPI){
        super(cantidad, can2, Telefono, Nombre, Apellido, Ciudad, DPI );
        this.retiro=cantidad-can2;
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.Telefono=Telefono;
        this.setCantidad(this.retiro);
        this.setNombre(this.Nombre);
        this.setApellido(this.Apellido);
        this.setTelefono(this.Telefono);
        System.out.println("Saldo a debitar es: Q."+can2);
    }
            
               {  
   
               }
              
}
    


       
