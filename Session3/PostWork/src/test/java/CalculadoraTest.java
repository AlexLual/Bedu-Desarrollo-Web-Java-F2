
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {
//@TestFactory es una característica muy poderosa de JUnit 5
// que permite la creación de pruebas dinámicas y personalizables
// de manera programática. El método anotado con @TestFactory debe
// tener un tipo de retorno que sea una subclase de Iterable<DynamicNode>.
// DynamicNode es una interfaz que se utiliza para representar una prueba
// dinámicamente generada en tiempo de ejecución. Esto permite la creación
// de pruebas parametrizadas, pruebas con datos generados dinámicamente, pruebas
// que utilizan argumentos proporcionados por el usuario, entre otras posibilidades.



    @TestFactory
    Stream<DynamicTest> dynamicTest() {

        Calculadora calculadora = new Calculadora();
        List<Integer> entradas = IntStream.range(0, 1000).boxed().collect(Collectors.toList());
        List<Integer> resultados = IntStream.range(0, 1000).map(n -> n * 2).boxed().collect(Collectors.toList());


        return entradas.stream()
                .map(numero -> DynamicTest.dynamicTest("multiplicando: " + numero,
                        () -> {
                            assertEquals(calculadora.multiplica(numero, 2), resultados.get(numero));
                        }));
    }


}


//dynamicTest() está utilizando un flujo (Stream) de números enteros del 0 al 999,
// generados mediante el método range() de IntStream. A continuación, se crean dos listas:
// una con los números de entrada, y otra con los resultados esperados, que es simplemente
// cada número de entrada multiplicado por 2.

//A continuación, se utiliza el método stream() de entradas para convertir la lista en un
// flujo de datos, y se utiliza el método map() para convertir cada número de entrada en un
// objeto DynamicTest. Cada objeto DynamicTest se crea utilizando el método dynamicTest()
// de la clase DynamicTest, que toma como argumentos un nombre para la prueba y una función
// ejecutable que realiza la prueba en sí.
//
//En este caso, el nombre de la prueba se establece como "multiplicando: " seguido del
// número correspondiente, y la función ejecutable se define como una expresión lambda
// que llama al método multiplica() de la Calculadora con el número de entrada y el valor 2
// como argumentos, y luego verifica que el resultado obtenido sea igual al resultado esperado
// de la lista resultados.