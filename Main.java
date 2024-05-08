// Classe Animal
class Animal {
    private String espécie;
    private String cor;
    
    // Construtor
    public Animal(String espécie, String cor) {
        this.espécie = espécie;
        this.cor = cor;
    }
    
    // Getters e Setters
    public String getEspécie() {
        return espécie;
    }
    
    public void setEspécie(String espécie) {
        this.espécie = espécie;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Animal Espécie=" + espécie + ", de cor=" + cor;
    }
}

// Classe Peixe
class Peixe extends Animal {
    private String habitat;
    
    // Construtor
    public Peixe(String espécie, String cor, String habitat) {
        super(espécie, cor);
        this.habitat = habitat;
    }
    
    // Getters e Setters
    public String getHabitat() {
        return habitat;
    }
    
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    // Método toString
    @Override
    public String toString() {
        return super.toString() + ", habitat=" + habitat;
    }
}

// Classe AnimalPersonalizado
class AnimalPersonalizado extends Peixe {
    private String caracteristica;

    // Construtor
    public AnimalPersonalizado(String espécie, String cor, String habitat, String caracteristica) {
        super(espécie, cor, habitat);
        this.caracteristica = caracteristica;
    }

    // Getter e Setter para o atributo caracteristica
    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    // Método toString sobrescrito para retornar dados do peixe
    @Override
    public String toString() {
        return super.toString() + ", caracteristica=" + caracteristica;
    }
}

// Classe Mamifero
class Mamifero extends Animal {
    private String alimento;
    
    // Construtor
    public Mamifero(String espécie, String cor, String alimento) {
        super(espécie, cor);
        this.alimento = alimento;
    }
    
    // Getters e Setters
    public String getAlimento() {
        return alimento;
    }
    
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}

// Teste
public class Main {
    public static void main(String[] args) {
        AnimalPersonalizado animal = new AnimalPersonalizado("Peixe-palhaço", "Laranja e Branco", "Recife de Coral", "Possui duas cores");
        System.out.println(animal.toString());
        
        Mamifero mamifero = new Mamifero("Leão", "Marrom", "Carne");
        System.out.println("Espécie: " + mamifero.getEspécie());
        System.out.println("Cor: " + mamifero.getCor());
        System.out.println("Alimento: " + mamifero.getAlimento());
    }
}

