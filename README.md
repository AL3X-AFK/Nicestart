# **NICESTART**

**NiseStart** es una aplicación Android creada con el propósito de experimentar con interfaces modernas, limpias y agradables.  
Está diseñada como un proyecto de práctica y demostración de diseño de UI/UX en Android, utilizando buenas prácticas y componentes visuales actuales.

<p align="center">
  <img src="img/icon.png" alt="NiseStart Logo" width="180">
</p>

## **Características principales**
- Pantallas de **Login**, **Registro** y **Main**.  
- Uso de **Material Design** para una experiencia fluida y moderna.  
- Código limpio y comentado para facilitar su estudio y entendimiento.

## **Tecnologías utilizadas**
- **Lenguaje:** Kotlin

---

## **Funciones de la Aplicación**

### **1) Splash Activity**
Pantalla inicial que se muestra durante 5 segundos al abrir la app.  
Incluye:
- Logo con animación  
- Texto con fuente personalizada  

<p align="center">
  <img src="img/splash_gif.gif" alt="Splash_activity" />
</p>

### **2) Login Activity**
Pantalla donde el usuario puede iniciar sesión.  
Incluye:
- Botón para navegar al registro  
- Diseño limpio y centrado en la experiencia del usuario  

<p align="center">
  <img src="img/login.png" alt="login_activity" />
</p>

### **3) Signup Activity**
Pantalla destinada a registrar usuarios nuevos.  
Incluye:
- Campos bien distribuidos para buena legibilidad  
- Estética consistente con Login Activity  

<p align="center">
  <img src="img/signup.png" alt="signup_activity" />
</p>

### **4) Main Activity**
Pantalla principal donde se concentran varias utilidades, elementos visuales y ejemplos de interacción.

---

### **Menú Contextual**
Se aplica sobre el `TextView` central y ofrece dos opciones:
- **Copy**
- **Download**

<p align="center">
  <img src="img/1.png" alt="context_menu" />
</p>

---

### **Menú de la App Bar**
La App Bar contiene opciones útiles y un submenú:

- **Settings**
- **Copy**
  - Bottom app bar
  - Bottom navigation
  - Signout

El menú se define en un archivo `menu.xml` y se controla con `showAsAction` para elegir qué mostrar directamente en la barra.

<p align="center">
  <img src="img/2.png" alt="appbar" />
  <img src="img/3.png" alt="appbar" />
</p>

---

### **Refresh**
La pantalla permite actualizar su contenido mediante el gesto de deslizar hacia abajo.

Proceso del refresh:
- Se activa el `OnRefreshListener`
- Se detiene la animación con `setRefreshing(false)`
- Se muestra un **Snackbar** indicando la acción
- Incluye un botón **UNDO**, que muestra un segundo Snackbar al presionarlo

<p align="center">
  <img src="img/main_refresh.png" alt="refresh" />
</p>


---
>This repository is licensed under
>[Creativecommons Org Licenses By Sa 4](http://creativecommons.org/licenses/by-sa/4.0/)
