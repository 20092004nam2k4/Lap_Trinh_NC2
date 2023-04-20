package thuhanh.AnimalAndInterfaceEdible;

public class Chicken extends Animal implements Edible{
  @Override
  public String makeSound(){
    return "Chicken: ò ó o.....";
  }
  public String howToEat(){
    return "Eat:  thịt gà";
  }
}
