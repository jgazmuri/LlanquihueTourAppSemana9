package model;

public class GuiaTour extends Persona implements Registrable{
    private String tipoTour;
    private String antiguedad;

    public String getTipoTour() {
        return tipoTour;
    }

    public void setTipoTour(String tipoTour) {
        this.tipoTour = tipoTour;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public GuiaTour(String nombre, String apellido, int edad, String tipoTour, String antiguedad) {
        super(nombre, apellido, edad);
        this.tipoTour = tipoTour;
        this.antiguedad = antiguedad;


    }

    @Override
    public String toString() {
        return "GuiaTour{" +
                "tipoTour='" + tipoTour + '\'' +
                ", antiguedad='" + antiguedad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
    public void mostrarDatos(){

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Tipo tour: " + tipoTour);

    }
    @Override
    public void registrar() {
        System.out.println("Registrando Producto");
    }
}
