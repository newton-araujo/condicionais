public class ResultadoEscola {
    
    public static void main(String[] args) {
        
        int nota = 7;

        if(nota < 5)
            System.out.println("Reprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Aprovado");
    }   
}


