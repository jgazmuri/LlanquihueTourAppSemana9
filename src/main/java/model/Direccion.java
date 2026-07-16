package model;

public class Direccion implements Registrable {

    private String calle;
    private String numeroCalle;
    private String comuna;
    private String pais;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(String numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Direccion(String calle, String numeroCalle, String comuna, String pais) {
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.comuna = comuna;
        this.pais = pais;


    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", numeroCalle='" + numeroCalle + '\'' +
                ", comuna='" + comuna + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }

    @Override
    public void mostrarDatos() {

        System.out.println("Direccion: " + calle + ", " + numeroCalle + ", " + comuna);
        System.out.println("Pais: " + pais);


    }
    @Override
    public void registrar() {
        System.out.println("Registrando Producto");
    }
}
