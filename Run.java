package thuhanh.AnimalAndCat;

public class Run {
  public static void main(String[] args) {
    Animal [] animal = new Animal[1];
    animal[0] = new Cat ();
    for (Animal name:animal) {
      System.out.println (name.makeSound ());
      if(name instanceof Cat){
        Edible edible = (Cat) name;
        System.out.println (edible.HowToEat () );
      }
    }
  }
}
