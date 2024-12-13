class Carrito {
    //Constructor
    constructor() {
        this.productos = [];
    }

    agregarProducto(producto) {
        this.productos.push(producto);
    }

    calcularTotal() {
        return this.productos.reduce((total, producto) => total + producto.precio, 0);
    }

    aplicarDescuento(porcentaje) {
        return this.calcularTotal() * (1- porcentaje/100);
    }

    estaVacio() {
        return this.productos.length === 0;
    }
}

export default Carrito;