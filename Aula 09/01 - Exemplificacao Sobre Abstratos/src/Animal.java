public abstract class Animal {
        // Método ABSTRATO (deve ser implementado pelas subclasses)
        public abstract void fazerSom();

        // Método CONCRETO (já implementado, pode ser herdado ou sobrescrito)
        public void dormir() {
            System.out.println("Animal dormindo... Zzz");
        }
}
