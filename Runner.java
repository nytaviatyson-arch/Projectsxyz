public class Runner {
    public static void main(String[] args) {
        
        Animal a1 = new Animal();
        a1.setSpecies("Dog");
        System.out.println(a1.getSpecies());

        Animal a2 = new Animal();
        a2.setSpecies("Cat");
        System.out.println(a2.getSpecies());
    }
}
