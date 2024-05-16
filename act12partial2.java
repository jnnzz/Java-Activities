/*
 * Name: Jan Lorenz L. Laroco
 * Date: MAY 16, 2024
 * Description: Finals-Lab.Act.#12 - Constructors, constructor overloading, getters and setters
 */

class Dog {
  String color;
  String breed;
  String name;
  static int Legs = 4;

  
  void displayColor(String color) {
      this.color = color;
  }
  void displayBreed(String breed) {
      this.breed = breed;
  }
  void displayName(String name) {
      this.name = name;
  }
  void displayLegs(int legs) {
      this.legs = legs;
  }
//   void statement() {
//     System.out.printf("The color of my dog is %s and the breed is %s and he has %d legs\n\n", color, breed, Legs);
//   }
//   void statementTwo() {
//       System.out.println("I love them both :))");
//   }
}

//--MAIN--
public class act12partial2{
  public static void main(String[] args) {
      
     System.out.printf("Hi, let me introduce to you my two lovely dogs\n");
    //firstObj
    Dog brownDog = new Dog();
    brownDog.color = "brown";
    brownDog.breed = "aspin";
    brownDog.name = "Vito";

    brownDog.aww();
    brownDog.displayColor();
    brownDog.displayBreed();
    brownDog.displayName();
    brownDog.displayLegs();
    brownDog.statement();

    //secondObj
    Dog whiteDog = new Dog();
    whiteDog.color = "white";
    whiteDog.breed = "Dachshund";
    whiteDog.name = "Dutch";
    
    whiteDog.aww();
    whiteDog.displayColor();
    whiteDog.displayBreed();
    whiteDog.displayName();
    whiteDog.displayLegs();
    whiteDog.statement();
    whiteDog.statementTwo();
//--END--
  }
}