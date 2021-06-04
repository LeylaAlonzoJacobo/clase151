
package telefonia;

public class Consultas extends Operacion {
     double cantidad;
     double can2;
     double Telefono;
     String Nombre;
     String Apellido;
     String Ciudad;
     double DPI;
     double consulta;

    
    public Consultas(double cantidad, double can2, double Telefono, String Nombre, String Apellido, String Ciudad, double DPI){
        super(cantidad, can2, Telefono, Nombre, Apellido, Ciudad, DPI);
        this.cantidad=cantidad;
        this.can2=can2;
        this.Telefono=Telefono;
        this.Nombre=Nombre;
        this.Apellido=Apellido;
         this.Ciudad=Ciudad;
          this.DPI=DPI;
        this.setCantidad(this.cantidad);
        this.setCan2(this.can2);
        this.setTelefono(this.Telefono);
        this.setNombre(this.Nombre);
        this.setApellido(this.Apellido);
        this.setCiudad(this.Ciudad);
        this.setDPI(this.DPI);
    }   

    void MostrarConsultas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   




}



