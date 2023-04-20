package thuhanh.AnimalAndInterfaceEdible;

public class Run2 {
  public static void main(String[] args) {
//    Chicken chicken = new Chicken ( );
//    System.out.println ( "Chicken: " );
//    System.out.println ( chicken.howToEat ( ) );
//    System.out.println ( chicken.makeSound ( ) );
//    Apple apple = new Apple ();
//    System.out.print ("Apple: ");
//    System.out.println (apple.howToEat ());
//
//    Orange orange = new Orange ();
//    System.out.printf ("Orange: ");
//    System.out.println (orange.howToEat ());
//
//    Tiger tiger = new Tiger ();
//    System.out.printf ("Tiger: ");
//    System.out.println (tiger.makeSound ());
    Animal[] animal = new Animal[4];
    animal[0] = new Chicken ( );
    animal[1] = new Tiger ( );
    for (Animal animals : animal) {
      System.out.println (animals.makeSound ());
      if (animals instanceof Chicken) {
        Edible edibler = (Chicken) animals;
        System.out.println(edibler.howToEat());
      }

    }

  }
}
