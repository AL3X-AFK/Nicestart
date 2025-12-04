# **NiseStart**

**NiseStart** es una aplicación Android creada con el propósito de explorar y practicar el diseño de interfaces modernas, limpias y agradables.  
Se trata de un proyecto orientado al aprendizaje, que implementa principios actuales de **UI/UX** y buenas prácticas en Android.

<p align="center">
  <img src="img/icon.png" alt="NiseStart Logo" width="180">
</p>
<br>

## 🚀 **Características principales**
- Pantallas completas de **Splash**, **Login**, **Registro**, **Main**  y **Profile**
- Interfaz basada en **Material Design**  
- Navegación intuitiva con enfoque en la experiencia de usuario  
- Código limpio, organizado y comentado  
- Uso de menús contextuales, App Bar y Swipe Refresh  
<br>

## 🧰 **Tecnologías utilizadas**
- **Lenguaje:** Kotlin 
<br>

# 📱 **Funciones de la Aplicación**

## **1) Splash Activity**
Pantalla inicial que aparece durante 5 segundos.

Incluye:
- Animación 
- Fuente personalizada  
- Transición suave hacia Login  


  <img src="img/splash_gif.gif" alt="Splash_activity" />



## **2) Login Activity**
Pantalla para iniciar sesión.

Características:
- Botón para ir a Registro  
- Diseño minimalista y accesible  
- Validación básica de campos  


  <img src="img/login.png" alt="login_activity" />



## **3) Signup Activity**
Pantalla para que nuevos usuarios se registren.

Incluye:
- Distribución clara y legible  
- Estética coherente con Login  
- Campos organizados y bien espaciados  

  <img src="img/signup.png" alt="signup_activity" />



## **4) Main Activity**
Pantalla principal donde se agrupan utilidades, menús, elementos visuales y ejemplos de interacción.
Cuenta con una función se refesh que al refrescar cambia de imagen.

Proceso:
1. Se activa el `OnRefreshListener`  
2. Se detiene la animación con `setRefreshing(false)`  
3. Se muestra un **Snackbar** informativo  
4. El botón **UNDO** muestra un segundo Snackbar  

| Imagen 1 | Imagen 2 | Imagen 3 |
|---------|----------|----------|
| <img src="img/main1.png" alt="login_activity" width="200"/> | <img src="img/main2.png" alt="login_activity" width="200"/> | <img src="img/main3.png" alt="login_activity" width="200"/> |



### **Menú Contextual**
Aplicado sobre el refresh central. Al mantener pulsado ofrece las opciones de copy y download

  <img src="img/menu_context.png" alt="context_menu" />



### **Menú de la App Bar**
Incluye opciones rápidas y un submenú:

- **Settings**
- **Copy**
  - Bottom app bar  
  - Bottom navigation  
  - Account
  <img src="img/menu_appbar.png" alt="context_menu" />
    
| Show Alert | Github Profile | Dialog Alert |
|---------|----------|----------|
| <img src="img/showAlert.png" alt="login_activity" width="200"/> | <img src="img/githubProfile.png" alt="login_activity" width="200"/> | <img src="img/dialogAlert.png" alt="login_activity" width="200"/> |
| Muestra una alert que aparece desde arriba de la pantalla con una leve animación | Abre un activity donde se puede ver mi perfil de Github | Abre un Dialog Alert que ofrece 3 opciones al usuaario|





## 📄 Licencia
>This repository is licensed under  
>[Creativecommons Org Licenses By Sa 4](http://creativecommons.org/licenses/by-sa/4.0/)
