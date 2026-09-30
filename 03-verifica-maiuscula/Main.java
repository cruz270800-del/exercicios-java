public class Main {
    public static void main(String[] args) {
        String senha = "java2026!";
        boolean temMaiuscula = false;

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);
            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            }
        }

        System.out.println("Tem maiúscula? " + temMaiuscula);
    }
}