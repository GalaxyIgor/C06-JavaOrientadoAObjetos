class Cachorro extends Animal {
    // 1. Implementação OBRIGATÓRIA do método abstrato
    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }



    // 2. Método ESPECÍFICO (exclusivo de Cachorro)
    public void abanarRabo() {
        System.out.println("Abanando o rabo!");
    }
}