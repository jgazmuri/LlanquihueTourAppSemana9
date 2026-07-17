package model;


import Exepciones.rutInvalideException;

public class Cliente  extends Persona implements Registrable {


    private String rut;

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Cliente(String nombre, String apellido, int edad, String rut) throws rutInvalideException {
        super(nombre, apellido, edad);
        if (!rut.matches("[0-9]{7,8}-[0-9kK]")) {
            throw new rutInvalideException("El rut no es valido");
        }
        this.rut = rut;
    }


    public Cliente(String rut) throws rutInvalideException {
        super("Sin nombre", "Sin Apellido", 0);
        if (!rut.matches("[0-9]{7,8}-[0-9kK]")) {
            throw new rutInvalideException("El rut no es valido");
        }
        this.rut = rut;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "rut=" + rut +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
    @Override
    public void mostrarDatos() {

        System.out.println("\n--- DATOS DEL CLIENTE ---\n");
        System.out.println("RUT: " + rut);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }
    @Override
    public void registrar() {
        System.out.println("Registrando Producto");
    }
}
