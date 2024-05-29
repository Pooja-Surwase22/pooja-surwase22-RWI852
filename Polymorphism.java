class Animal {
   public void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
  
   public void sound() {
        System.out.println("Dog bark");
    }
}

class Cat extends Animal { 
  public void sound() {
        System.out.println("Cat meow");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal=new Animal(); 

        myAnimal = new Dog(); 
        myAnimal.sound();     

        myAnimal = new Cat(); 
        myAnimal.sound();     
    }
}
