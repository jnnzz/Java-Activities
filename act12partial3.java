/*
 * Name: Jan Lorenz L. Laroco
 * Date: MAY 16, 2024
 * Description: Finals-Lab.Act.#12 - Constructors, constructor overloading, getters and setters
 */

class Dog {
  private String color;
  private String breed;
  private String name;
  private int Legs;
    
  Dog(){
      
  }
  Dog(String color){
      this.color = color;  
  }
  Dog(String breed, String name){
      this.breed = breed;
      this.name = name;
  }
  Dog(String color, String breed, String name){
      this.color = color;
      this.breed = breed;
      this.name = name;
  }
  Dog(String color, String breed, String name, int Legs){
      this.color = color;
      this.breed = breed;
      this.name = name;
      this.Legs = Legs;
  }
  //getters
  String getColor(){
      return color;
  }
  String getBreed(){
      return breed;
  }
  String getName(){
      return name;
  }
  int getLegs(){
      return Legs;
  }
  //setters
  void displayColor(String color) {
      this.color = color;
  }
  void displayBreed(String breed) {
      this.breed = breed;
  }
  void displayName(String name) {
      this.name = name;
  }
  void displayLegs(int Legs) {
      this.Legs = Legs;
  }
//   void statement() {
//     System.out.printf("The color of my dog is %s and the breed is %s and he has %d legs\n\n", color, breed, Legs);
//   }
//   void statementTwo() {
//       System.out.println("I love them both :))");
//   }
}

//--MAIN--
public class act12partial3{
  public static void main(String[] args) {
      
     System.out.printf("Hi, let me introduce to you my two lovely dogs\n");
     System.out.println();

    //firstObj
    Dog brownDog = new Dog("brown", "aspin", "Vito", 4);
    System.out.printf("The color of my dog is %s \n", brownDog.getColor());
    System.out.printf("The breed is %s \n", brownDog.getBreed());
    System.out.printf("His name is %s \n", brownDog.getName());
    System.out.printf("He has %d legs\n", brownDog.getLegs());

    // //secondObj
    Dog whiteDog = new Dog("white", "Dachshund", "Dutch", 4);
    System.out.println();
    System.out.printf("The color of my dog is %s \n", whiteDog.getColor());
    System.out.printf("The breed is %s \n", whiteDog.getBreed());
    System.out.printf("His name is %s \n", whiteDog.getName());
    System.out.printf("He has %d legs\n", whiteDog.getLegs());
  
//--END--
  }
}