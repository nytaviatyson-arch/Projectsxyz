public class Pet {
    private String name;
    private String type;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        String output = " Pet information: " + "Name: " + name + " Type: " + type;
        return output;
    }

    public static void main(String[] args) {
        Pet myPet = new Pet("Nemo", "Fish");
        System.out.println(myPet.toString());
    }
}