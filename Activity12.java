/*
 * Name: Jan Lorenz L. Laroco
 * Date: MAY 21, 2024
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

}

//--MAIN--
public class Activity12{
  public static void main(String[] args) {
      
     System.out.printf("Hi, let me introduce to you my two lovely dogs\n");
     System.out.println();

    //firstObj
    Dog brownDog = new Dog("brown", "aspin", "Vito", 4);
    System.out.printf("The color of my first dog is %s \nThe breed is %s \nHis name is %s \nHe has %d legs\n", brownDog.getColor(), brownDog.getBreed(), brownDog.getName(), brownDog.getLegs());

    // //secondObj
    Dog whiteDog = new Dog();
    whiteDog.displayColor("white");
    whiteDog.displayBreed("Dachshund");
    whiteDog.displayName("Dutch");
    whiteDog.displayLegs(4);
    
    System.out.println();
    System.out.printf("The color of my second dog is %s \nThe breed is %s \nHis name is %s \nHe has %d legs\n", whiteDog.getColor(), whiteDog.getBreed(), whiteDog.getName(), whiteDog.getLegs());

//--END--
  }
}