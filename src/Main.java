public class Main {
    public static void main(String[] args) {

        String[] texto = {"Hola", "Mundo", "Desde", "Java"};
        System.out.println(concatenarTexto(texto));
    }

    public static String concatenarTexto(String[] texto){
        StringBuilder frase = new StringBuilder();
        for (int i = 0; i < texto.length; i++){
            if (i == 0){
                frase.append(texto[i]);
            } else {
                frase.append(" ").append(texto[i]);
            }
        }
        return "La frase es:\n" + frase;
    }
}