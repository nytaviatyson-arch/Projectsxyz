public class Pet2 {
  private String name;
  private String type;
  private int age;

    public Pet2() {
        this.name = "Nemo";
        this.type = "Fish";
        this.age = 2;
    }

    public Pet2(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public void setName(String name) { this.name = name; 
    public void setType(String type) { this.type = type; 
    public void setAge(int age) { this.age = age; }
    }
    public String getName() {return this.name;}
    public String getType() {return this.type; }
    public int getAge() {return this.age; }
    }
public String speak() {
        if (type.equalsIgnoreCase("elephant")) return "Trumpet!";
        else if (type.equalsIgnoreCase("wolf")) return "Howl!";
        else return "Blub!";
}
public String toString() {
      return "Pet information:\n" +
              "Name: " + name + "\n" +
              "Type: " + type + "\n" +
              "Age: " + age + "\n" +
              "Sound: " + speak();
    }
}