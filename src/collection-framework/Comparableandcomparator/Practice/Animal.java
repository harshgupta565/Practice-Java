package Practice;

public class Animal implements  Comparable<Animal> {
    String name ;
    int age;
    int weight;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
    @Override
    public int compareTo(Animal o) {
        return 0;
    }
}
