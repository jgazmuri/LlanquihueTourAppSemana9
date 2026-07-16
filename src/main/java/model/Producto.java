package model;

public class Producto implements Registrable{

    private String nombreTur;

    public String getNombreTur() {
        return nombreTur;
    }

    public void setNombreTur(String nombreTur) {
        this.nombreTur = nombreTur;
    }

    public Producto(String nombreTur) {
        this.nombreTur = nombreTur;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombreTur='" + nombreTur + '\'' +
                '}';
    }

    @Override
    public void mostrarDatos() {

        System.out.println("Nombre: " + nombreTur);

    }
    @Override
    public void registrar() {
        System.out.println("Registrando Producto");
    }
}
