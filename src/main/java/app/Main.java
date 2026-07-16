package app;

import data.GestorServicio;
import model.Cliente;

public class Main {

    public static void main(String[] args){

        GestorServicio gestor = new GestorServicio();
try {
    System.out.println("Cargando Clientes desde el archivo...");
    gestor.cargarCliente();

    System.out.println("--- LISTA DE SERVICIOS REGISTRADOS ---");
    gestor.mostrarTodosLosServicios();

    String rutBuscar = "15099143-9";
    System.out.println("Buscabdi cliente por RUT: " + rutBuscar);

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
