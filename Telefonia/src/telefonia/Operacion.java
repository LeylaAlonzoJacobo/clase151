
package telefonia;

public class Operacion {
    private double cantidad;
    private double can2;
    private double Telefono;
    private String Nombre;
    private String Apellido;
    private String Ciudad;
    private double DPI;

    public Operacion(double cantidad, double can2, double Telefono, String Nombre, String Apellido, String Ciudad, double DPI) {
        this.cantidad = cantidad;
        this.can2 = can2;
        this.Telefono = Telefono;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Ciudad = Ciudad;
        this.DPI = DPI;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCan2() {
        return can2;
    }

    public void setCan2(double can2) {
        this.can2 = can2;
    }

    public double getTelefono() {
        return Telefono;
    }

    public void setTelefono(double Telefono) {
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public double getDPI() {
        return DPI;
    }

    public void setDPI(double DPI) {
        this.DPI = DPI;
    }
    
     
    public void MostrarOperacion(){
        System.out.println("Saldo anterior es: "+this.can2);
        System.out.println("Saldo actual es: "+this.cantidad);
        System.out.println("Numero de telefono es: "+this.Telefono);
        System.out.println("Nombre del cliente es: "+this.Nombre);  
    
    }
}
    

