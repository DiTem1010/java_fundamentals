public class Switch {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";

        switch(colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste Light");
                break;
            case "Night" :
                System.out.println("Seleccionaste NightMode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark Mode");
                break;
            default:
                System.out.println("Selecciona una opcion");

        }
    }
}
