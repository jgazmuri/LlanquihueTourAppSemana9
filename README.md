# Sistema de Gestión de Servicios Turísticos - LlanquihueTur (Semana 9)

Este proyecto corresponde a la evaluación de la Semana 9 para la carrera de Analista Programador. Consiste en un sistema backend modular desarrollado en Java que permite gestionar y persistir entidades relacionadas con servicios de turismo utilizando Programación Orientada a Objetos (POO), colecciones polimórficas y persistencia en archivos planos (`.txt`).

## 🚀 Características del Proyecto

- **Jerarquías de Herencia Eficientes:** Implementación de relaciones lógicas reales (v.gr., `Persona` como clase base de `Cliente` y `GuiaTour`).
- **Polimorfismo e Interfaces:** Uso de la interfaz `Registrable` para asegurar que todas las entidades puedan registrar y mostrar sus datos de manera uniforme.
- **Colecciones Dinámicas:** Administración centralizada de servicios mediante el uso de listas polimórficas (`List<Registrable>`).
- **Persistencia de Datos:** Carga y lectura automatizada de registros desde un archivo de texto plano (`cargarClientes.txt`) con validaciones avanzadas de formato.
- **Validación con Excepciones Propias:** Control estricto del formato del RUT chileno mediante expresiones regulares y el lanzamiento de una excepción personalizada (`RutInvalideException`).
- **Sobrecarga de Métodos:** Aplicación de sobrecarga en los constructores de la clase `Cliente`.

## 📦 Estructura del Proyecto (Módulos)

El código se encuentra modularizado bajo buenas prácticas en los siguientes paquetes:

- `app`: Aloja la clase `Main` encargada de orquestar y ejecutar la aplicación.
- `data`: Contiene el `GestorServicio`, componente responsable de la persistencia de datos (carga de archivos) y de operaciones lógicas como búsqueda y filtrado.
- `model`: Almacena las clases de negocio (`Persona`, `Cliente`, `GuiaTour`, `Producto`, `Direccion`) y la interfaz común `Registrable`.
- `excepciones`: Define las excepciones personalizadas para el control de errores del sistema.

## 🛠️ Requisitos e Instalación

1. Clonar el repositorio:
   ```bash
   git clone https://github.com
   ```
2. Abrir el proyecto en tu IDE favorito (se recomienda **IntelliJ IDEA**).
3. Asegurarse de tener instalado el **JDK 11** o superior.
4. Verificar la presencia del archivo de prueba en la ruta: `src/main/resources/cargarCliente.txt`.

## 📋 Ejemplo del Archivo de Datos (`cargarCliente.txt`)
El archivo debe mantener la estructura `nombre;apellido;edad;rut` separada por punto y coma:
```text
Juan;Perez;30;12345678-9
Maria;Gomez;25;7654321-K
Javier;Gazmuri;28;15099143-9
```

---
*Desarrollado por [Javier Gazmuri Bañados] - Estudiante de Analista Programador.*
