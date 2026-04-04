(El siguiente archivo README.md fue realizado con la ayuda de la IA pero supervisado y corregido por el alumno.9



# Proyecto: Sistema de Juego en Java

## 📌 Descripción

Este proyecto implementa un sistema básico de un videojuego utilizando programación orientada a objetos en Java.
Incluye manejo de inventario, personajes, obstáculos, checkpoints y elementos dinámicos dentro de un nivel.

---

## 🧩 Estructura del Proyecto

### Interfaces

* **Inventariable**

  * `registrar()`: agrega el objeto al inventario
  * `borrar()`: elimina el objeto del inventario

* **Destruible**

  * `destruye()`: ejecuta la lógica de destrucción

* **ElementoDinamico**

  * `mover(direccion, distancia)`: mueve el objeto en el mapa

---

### Clases Principales

#### 🔹 Inventario

* Almacena objetos de tipo `Inventariable`
* Tiene capacidad máxima
* Permite:

  * agregar items
  * eliminar items
  * listar contenido

---

#### 🔹 Arma (Inventariable)

* Atributos:

  * nombre
  * daño
  * alcance
* Puede registrarse y eliminarse del inventario

---

#### 🔹 Recompensa (Inventariable)

* Atributos:

  * nombre
  * valor
  * tipo
* También puede agregarse y eliminarse del inventario

---

#### 🔹 Personaje (Destruible, ElementoDinamico)

* Tiene vida y posición
* Puede:

  * moverse
  * recibir daño
  * destruirse

---

#### 🔹 Obstaculo (Destruible)

* Tiene daño y posición
* Puede destruirse

---

#### 🔹 CheckPoint

* Guarda posición en el mapa
* Puede activarse

---

#### 🔹 Utileria (ElementoDinamico)

* Objetos que pueden moverse en el mapa
* Tienen nombre y descripción

---

#### 🔹 Nivel

* Contiene:

  * obstáculos
  * checkpoints
  * elementos dinámicos
  * inventario
* Permite:

  * agregar elementos
  * mover elementos dinámicos
  * mostrar estado del nivel

---

## ▶️ Ejecución

1. Crear un inventario
2. Crear objetos (`Arma`, `Recompensa`)
3. Asignar inventario a los objetos
4. Registrar objetos en el inventario
5. Crear nivel y elementos del juego
6. Ejecutar acciones (mover, destruir, activar)

---

## 💡 Ejemplo de uso

```java
Inventario inventario = new Inventario(5);

Arma espada = new Arma("Espada", 50, 1.5);
espada.setInventario(inventario);
espada.registrar();

System.out.println(inventario);
```

---

## ⚠️ Notas importantes

* Es necesario inicializar todas las listas (`ArrayList`) en los constructores.
* Los objetos inventariables deben tener asignado un inventario antes de registrarse.
* Se utiliza `toString()` para mostrar información de los objetos.

---

## 🧠 Conceptos aplicados

* Programación Orientada a Objetos (POO)
* Interfaces
* Encapsulamiento
* Polimorfismo
* Manejo de listas (`ArrayList`)

---

## 👤 Autor

Proyecto académico realizado para práctica de Java por Josué Rodrigo Rico Arreola.
