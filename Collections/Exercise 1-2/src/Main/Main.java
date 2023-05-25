package Main;

import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    
    //Exercise 1
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    ArrayList <String> arrayWithDifferentDogBreeds = new ArrayList<>();
    boolean isTrue = true;
    boolean foundDogToRemoveFromList = true;
    
    do{
      System.out.println("Add a new dog bread: ");
      arrayWithDifferentDogBreeds.add(scanner.next());
      System.out.println("Do you want to add another dog breed? (type anything to continue adding," +
          " or 'no' to exit: ");
      if(scanner.next().equalsIgnoreCase("no")) {
        isTrue = false;
        System.out.println("Goodbye!.");
        System.out.println("------------------------");
      }
    }while (isTrue);
    
    System.out.println("This are the breeds that your list contains: ");
    arrayWithDifferentDogBreeds.forEach(System.out::println);
    System.out.println("------------------------");
    
    // Exercise 2 (complements to the first one)
    System.out.println("This program will help you delete any dog breed that you have entered previously, " +
        " type the one that you want to get removed.: ");
    String breadToRemoveFromArray = scanner.next();
    
    Iterator<String> iterator = arrayWithDifferentDogBreeds.iterator();
    while(iterator.hasNext()){
      if (iterator.next().equalsIgnoreCase(breadToRemoveFromArray)){
        iterator.remove();
        foundDogToRemoveFromList = false;
      }
    }
    
    if (foundDogToRemoveFromList) System.out.println("The breed that you entered is not in the list.");
    System.out.println();
    System.out.println("Your new and updated dog breed list is the following: ");
    Collections.sort(arrayWithDifferentDogBreeds);
    arrayWithDifferentDogBreeds.forEach(System.out::println);
    
  }
  
}

/* 1). Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/

/* 2). Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/