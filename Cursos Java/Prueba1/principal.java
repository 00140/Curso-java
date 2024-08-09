public class principal {
    // Clase principal
    public class lambdaFunction {

        // Se declara la interface
        interface operacion {
            // el metodo abstracto
            public double suma(double x, double y);
        }

        public static void main(String[] args) {
            // Expresion lambda
            operacion l = (x, y) -> x + y;
            System.out.println(l.suma(8, 30));
        }
    }
}
