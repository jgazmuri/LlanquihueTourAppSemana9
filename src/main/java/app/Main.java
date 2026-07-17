package app;

import data.GestorServicio;
import model.Cliente;
import model.Direccion;
import model.GuiaTour;

public class Main {

    public static void main(String[] args){

        GestorServicio gestor = new GestorServicio();
try {
    gestor.cargarCliente();

    model.Producto tourMontana = new model.Producto("Tour Alta Montaña");
    model.Direccion oficina = new model.Direccion("Av. Libertad", "1024", "Concon", "Chile");
    GuiaTour guiaCarlos = new GuiaTour("Carlos", "Rojas", 35, "Trekking", "5 Años");

    gestor.agregarServicio(tourMontana);
    gestor.agregarServicio(oficina);
    gestor.agregarServicio(guiaCarlos);

    System.out.println("\n--- LISTA DE SERVICIOS REGISTRADOAS ---\n");
    gestor.mostrarTodosLosServicios();

    String rutABuscar = "7654321-K";
    System.out.println("\nBuscando cliente con RUT: " + rutABuscar);

    Cliente clienteEncontrado1 = gestor.buscarClientePorRut(rutABuscar);

    if (clienteEncontrado1 != null){
        clienteEncontrado1.mostrarDatos();
    }else{
        System.out.println("No se encontró ningún cliente con el RUT especificado.");
    }

    System.out.println("Cargando Clientes desde el archivo...\n");
    gestor.cargarCliente();

    System.out.println("\n--- LISTA DE SERVICIOS REGISTRADOS ---\n");
    gestor.mostrarTodosLosServicios();

    String rutBuscar = "15099143-9";
    System.out.println("\nBuscando cliente por RUT: " + rutBuscar);

    Cliente clienteEncontrado = gestor.buscarClientePorRut(rutBuscar);

    if (clienteEncontrado != null){
        clienteEncontrado.mostrarDatos();
    }else{
        System.out.println("Cliente no encontrado");
    }

}catch (Exception e){
    System.out.println("Error al cargar los servicios registrados"+ e.getMessage());
}

    }

}
