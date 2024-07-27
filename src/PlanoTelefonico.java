public class PlanoTelefonico {
    
    public static void main(String[] args) {
        
        String tipoDoPlano = "BASIC";

        switch (tipoDoPlano) {
            case "BASIC":
                System.out.println("100 minutos de ligação");
                break;
            case "MIDIA":
                System.out.println("100 minutos de ligação + Whats e Instagram grátis");
                break;
            case "TURBO":
                System.out.println("100 minutos de ligação + Whats e Instagram grátis + 5GB Youtube");
                break;
            default:
                break;
        }

    }
}
