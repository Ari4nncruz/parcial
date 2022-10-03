public class variables {
    public static void main(String[] args) {
        int pizzas = 6;
        int personas = 3;
        int pizzasporpersonas = pizzas / personas;
     System.out.printf("si hay %d pizzas y %d personas, a cada una le tocan %d pizzas\n", pizzas, personas, pizzasporpersonas);

     String auto = "Renault 12";
     double velocidad= 280.0;
     System.out.printf("El %s se desplaza a una velocidad de %f  kilometros por hora\n", auto,velocidad);

     int precioleche=14;
     double preciojamón= 35.6;
     int preciohuevo=23;

     double PrecioTotal= precioleche+preciohuevo+preciojamón;
     System.out.printf("El precio total de todos los productos es de %f \n", PrecioTotal);
    }
}

