package Retangulo;

public class TestaRetangulo {
    
    public static void main(String[] args) {
        
        System.out.println("--- Teste 1: Valores Padrão ---");
        Retangulo r1 = new Retangulo();
        System.out.println("Altura: " + r1.getAltura());
        System.out.println("Largura: " + r1.getLargura());
        System.out.println("Área: " + r1.calcularArea());
        System.out.println("Perímetro: " + r1.calcularPerimetro());

        System.out.println("\n--- Teste 2: Valores Válidos (10.0 e 5.0) ---");
        r1.setAltura(10.0);
        r1.setLargura(5.0);
        System.out.println("Altura: " + r1.getAltura());
        System.out.println("Largura: " + r1.getLargura());
        System.out.println("Área: " + r1.calcularArea());
        System.out.println("Perímetro: " + r1.calcularPerimetro());

        System.out.println("\n--- Teste 3: Valores Inválidos (25.0 e -2.0) ---");
        System.out.println("Tentando mudar altura para 25.0...");
        r1.setAltura(25.0);
        
        System.out.println("Tentando mudar largura para -2.0...");
        r1.setLargura(-2.0);

        System.out.println("\nValores Finais (devem ser os do Teste 2):");
        System.out.println("Altura: " + r1.getAltura());
        System.out.println("Largura: " + r1.getLargura());
    }
}
