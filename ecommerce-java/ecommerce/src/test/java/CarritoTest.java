import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.generation.Carrito;
import com.generation.Producto;

public class CarritoTest {

    //Junit nos proporciona la anotacion @Test para indicar que un método es un test unitario
    @Test
    void agregarProductoTest() {
        //Arrange es donde creamos las instancias necesarias para el test
        Carrito carrito = new Carrito();
        Producto producto = new Producto("Celular", 500.00);
        Producto productoDos = new Producto("Audifonos", 50.00);

        //Act
        carrito.agregarProducto(producto);
        carrito.agregarProducto(productoDos);

        //Assert es donde se indica lo que se espera obtener mediante el test
        assertEquals(550.00, carrito.calcularTotal());
    }

    @Test
    void aplicarDescuentoTest() {
        //Arrange
        Carrito carrito = new Carrito();
        Producto producto = new Producto("PC", 1000.00);

        //Act
        carrito.agregarProducto(producto);

        //Assert
        assertEquals(900.00, carrito.aplicarDescuento(10.00));
    }

    @Test
    void estaVacioTest() {
        Carrito carrito = new Carrito();
        assertTrue(carrito.estaVacio());

        Producto producto = new Producto("PC", 1000.00);
        carrito.agregarProducto(producto);
        assertFalse(carrito.estaVacio());

    }


    
}
