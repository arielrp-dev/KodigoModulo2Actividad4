# Sistema de Reservas de Hotel

## Descripción

El **Sistema de Reservas de Hotel** es una aplicación Java que simula un sistema de reservas para un hotel, implementando principios de Programación Orientada a Objetos y patrones de diseño. El sistema permite gestionar clientes, habitaciones, servicios y reservas de manera eficiente.

## Funcionalidades

- **Agregar Cliente:** Permite registrar nuevos clientes en el sistema.
- **Agregar Habitación:** Facilita la incorporación de nuevas habitaciones.
- **Agregar Servicio:** Permite añadir servicios adicionales que pueden ser contratados por los clientes.
- **Realizar Reserva:** Gestiona el proceso de reserva de habitaciones, incluyendo la opción de agregar servicios adicionales.
- **Mostrar Información:** Permite visualizar listas de clientes, habitaciones, servicios y reservas.
- **Eliminar Registro:** Posibilita la eliminación de clientes, habitaciones, reservas y servicios del sistema.

## Estructura del Proyecto


/SistemaReservaHotelKodigo\
│\
├── /src\
│   ├── /main\
│   │   ├── /java\
│   │   │   ├── Main.java\
│   │   │   ├── /decorators\
│   │   │   ├── /models\
│   │   │   ├── /factories\
│   │   │   ├── /singleton\
│   │   │   ├── /observers\
│   │   │   └── /exceptions\
│   │   ├── /resources\
│   │   └── /test\
│   └── /docs\
├── pom.xml\
└── README.md

## Tecnologías Utilizadas

- Java 11 o superior
- Maven para la gestión de dependencias
- Diseño orientado a objetos

## Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/SistemaReservaHotelKodigo.git

2. Navega al directorio del proyecto:
   ```bash
   cd SistemaReservaHotelKodigo
   ```
3. Compila el proyecto utilizando Maven:
   ```bash
   mvn clean install
   ```

## Ejecución

Para ejecutar la aplicación, utiliza el siguiente comando:
```bash
mvn exec:java -Dexec.mainClass="Main"
```

## Pruebas

Se realizarán pruebas del flujo de cada funcionalidad del proyecto mediante la interfaz de usuario de la consola, asegurando que todas las características funcionen como se espera.

## Referencias

- [Documentación de Java](https://docs.oracle.com/en/java/)
- [Guía de Maven](https://maven.apache.org/guides/index.html)
- [Patrones de Diseño en Java](https://refactoring.guru/es/design-patterns/java)
