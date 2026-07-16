package data;

import model.Cliente;
import model.Registrable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de administrar el almacenamiento y operaciones del sistema.
 * Implementa persistencia mediante archivos planos y manejo polimórfico.
 *
 * @author Javier Gazmuri B.
 * @version 1.0
 */


public class GestorServicio {

    private static final String DATA_FILE = "src/main/resources/cargarClientes.txt";
    List<Registrable> servicios = new ArrayList<>();
    public void cargarCliente() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(DATA_FILE));
            String linea;
            while ((linea = br.readLine()) != null) {
                String [] lineaSplit = linea.split(";");
                if (lineaSplit.length == 4) {
                    Cliente nuevoClientes = new Cliente(lineaSplit[0],
                            lineaSplit[1],
                            Integer.parseInt(lineaSplit[2]),
                            lineaSplit[3]);
                    servicios.add(nuevoClientes);
                }
            }


        }catch(Exception e) {
            System.out.println("Error al cargar los datos desde el archivo: " +  e.getMessage());
        }
    }

    public void mostrarTodosLosServicios() {

        for (Registrable servicio : servicios) {
            System.out.println(servicio.toString());
        }
    }

    /**
     * Busca un cliente dentro de la lista polimórfica utilizando su RUT.
     * Hace uso del operador instanceof para filtrar los tipos correctos.
     *
     * @param rutBuscar El RUT del cliente con formato 12345678-9.
     * @return El objeto Cliente encontrado, o null si no existe en el sistema.
     */

        public Cliente buscarClientePorRut(String rutBuscar){
            for (Registrable servicio : servicios) {
                if (servicio instanceof Cliente){
                    Cliente clienteTemporal = (Cliente) servicio;
                    if (clienteTemporal.getRut().equals(rutBuscar)){
                        return clienteTemporal;
                    }
                }
            }
            return null;
        }

    }



