public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //Area de un circulo
        //pi * r2
        circleArea(y);

        //Área de una esfera
        //4*PI*r2
        sphereArea(y);

        //Volumen de una esfera
        //(4/3) * pi * r3
        sphereVolumen(y);

        System.out.println("SOLES A DOLARES: " + convertToDolar(200, "PE"));
        System.out.println("PESOS MEXICANOS A DOLARES: " + convertToDolar(1000, "MXN"));
    }
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }
    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }
    public static double  sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }
    public static double convertToDolar (double quantity, String currency){
        //PE MXN
        switch(currency){
            case "PE":
                quantity = quantity * 0.27;
                break;
            case "MXN":
                quantity = quantity * 0.059;
                break;
        }
        return quantity;
    }
}
