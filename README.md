# **NiseStart**

**NiseStart** es una aplicación Android creada con el propósito de explorar y practicar el diseño de interfaces modernas, limpias y agradables.  
Se trata de un proyecto orientado al aprendizaje, que implementa principios actuales de **UI/UX** y buenas prácticas en Android.

<p align="center">
  <img src="img/icon.png" alt="NiseStart Logo" width="180">
</p>

---

## 🚀 **Características principales**
- Pantallas completas de **Splash**, **Login**, **Registro**, **Main**  y **Profile**
- Interfaz basada en **Material Design**  
- Navegación intuitiva con enfoque en la experiencia de usuario  
- Código limpio, organizado y comentado  
- Uso de menús contextuales, App Bar y Swipe Refresh  

---

## 🧰 **Tecnologías utilizadas**
- **Lenguaje:** Kotlin 

---

# 📱 **Funciones de la Aplicación**

## **1) Splash Activity**
Pantalla inicial que aparece durante 5 segundos.

Incluye:
- Animación 
- Fuente personalizada  
- Transición suave hacia Login  

<p align="center">
  <img src="img/splash_gif.gif" alt="Splash_activity" />
</p>

---

## **2) Login Activity**
Pantalla para iniciar sesión.

Características:
- Botón para ir a Registro  
- Diseño minimalista y accesible  
- Validación básica de campos  

<p align="center">
  <img src="img/login.png" alt="login_activity" />
</p>

---

## **3) Signup Activity**
Pantalla para que nuevos usuarios se registren.

Incluye:
- Distribución clara y legible  
- Estética coherente con Login  
- Campos organizados y bien espaciados  

<p align="center">
  <img src="img/signup.png" alt="signup_activity" />
</p>

---

## **4) Main Activity**
Pantalla principal donde se agrupan utilidades, menús, elementos visuales y ejemplos de interacción.

---

## 📝 **Menú Contextual**
Aplicado sobre el `TextView` central. Ofrece:

- **Copy**  
- **Download**

<p align="center">
  <img src="img/1.png" alt="context_menu" />
</p>

---

## 📂 **Menú de la App Bar**
Incluye opciones rápidas y un submenú:

- **Settings**
- **Copy**
  - Bottom app bar  
  - Bottom navigation  
  - Account  

El menú se define en `menu.xml` usando `showAsAction` para indicar qué íconos se muestran en la barra.

<p align="center">
  <img src="img/2.png" alt="appbar" />
  <img src="img/3.png" alt="appbar" />
</p>

### 🔔 **Alert Dialog (Account)**
Al seleccionar **Account**, se muestra un cuadro de diálogo con opciones como:
- Ir a **ProfileActivity**
- Salir de la aplicación

<p align="center">
  <img src="img/alertDialog.png" alt="alert" />
</p>

<p align="center">
  <img src="img/profile.png" alt="profile" />
</p>

---

## 🔄 **Swipe Refresh**
El contenido puede actualizarse deslizando hacia abajo.

Proceso:
1. Se activa el `OnRefreshListener`  
2. Se detiene la animación con `setRefreshing(false)`  
3. Se muestra un **Snackbar** informativo  
4. El botón **UNDO** muestra un segundo Snackbar  

<p align="center">
  <img src="img/main_refresh.png" alt="refresh" />
</p>

---

## 📄 Licencia
>This repository is licensed under  
>[Creativecommons Org Licenses By Sa 4](http://creativecommons.org/licenses/by-sa/4.0/)
