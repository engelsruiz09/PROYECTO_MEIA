# PROYECTO_MEIA
# Red Social ¿?

Este proyecto simula una red social llamada ¿?, desarrollada en Java, y gestiona mensajes entre usuarios en almacenamiento secundario.

## Características principales:

- **Lenguaje:** Desarrollado en Java.
- **Ubicación de Archivos:** Todos los archivos se localizan en el directorio `C:\MEIA`.
- **Roles:** Funcionalidades dependen del rol del usuario.
- **Archivos Descriptor:** Cada archivo tiene su propio descriptor.
- **Formato de Archivos:** Los registros están delimitados por saltos de línea y el separador es `|`.

### Acceso al sistema:

Al iniciar, los usuarios son autenticados mediante login y password. Si no existe el usuario, se ofrece la opción de creación. Detalles adicionales:

- El primer usuario tiene rol de administrador por defecto.
- Los usuarios posteriores tienen rol de usuario por defecto.
- Los datos de los usuarios se almacenan en `C:/MEIA/usuario.txt`.
- Las contraseñas tienen que cumplir con un nivel mínimo de seguridad.

### Interfaz:

Una vez dentro de la aplicación, se muestra:

- Usuario, rol y fotografía del usuario.
- Menú de Administración.

### Menú de Administración:

Dependiendo del rol, las funcionalidades varían:

**Usuario no administrador:**
- Cambio de password, correo electrónico, fecha de nacimiento, teléfono, fotografía.
- Opción para darse de baja.

**Usuario administrador:**
- Todas las funcionalidades del usuario no administrador.
- Ingreso de nuevos usuarios.
- Búsqueda y modificación de usuarios.
- Reorganización del archivo de usuarios.
- Opción de respaldo de la información.

### Respaldo de Información:

Solo disponible para el usuario administrador. Permite hacer una copia de todos los datos de `c:/MEIA` a otra ubicación, generando una bitácora en `C:/MEIA/bitacora_backup.txt`.



