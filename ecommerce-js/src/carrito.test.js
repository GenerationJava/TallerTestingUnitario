import {describe, it, expect} from "vitest";
import Carrito from "./carrito";

describe("Funcionalidades del carrito", () => {
    it("Debería agregar productos al carrito y calcular el monto total", () => {
        //Arrange
        const carrito = new Carrito();

        //Act
        carrito.agregarProducto({nombre: "Celular", precio: 500.00});

        //Assert
        expect(carrito.calcularTotal()).toBe(500.00);
    });//It indica cada test individual

    it("Debería aplicar descuento al total", () => {
        //Arrange
        const carrito = new Carrito();

        //Act
        carrito.agregarProducto({nombre: "Pc Gamer", precio: 2000.00});

        //Assert
        expect(carrito.aplicarDescuento(10)).toBe(1800.00);
    });

    it("Debería chequear si el carrito está vacío", () => {
        //Arrange
        const carrito = new Carrito();
        expect(carrito.estaVacio()).toBe(true);
        carrito.agregarProducto({nombre: "Celular", precio: 500.00});
        expect(carrito.estaVacio()).toBe(false);
    });

});