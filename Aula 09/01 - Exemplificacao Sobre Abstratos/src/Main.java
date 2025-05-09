// codigo para manipular
public class Main {
    public static void main(String[] args) {
        Animal dog = new Cachorro();
        dog.fazerSom();    // ✅ "Au au!" (método sobrescrito)
        dog.dormir();      // ✅ "Animal dormindo...Zzz" (método herdado)
        if (dog instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) dog; // Casting seguro
            cachorro.abanarRabo(); // "🐕 Cachorro abanando o rabo!"
        }
    }
}