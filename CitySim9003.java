/////////////////////////////////////////////////////////////////////
////////////// CS 1632 DELIVERABLE 2 BY PETER STAMOS/////////////////
/////////////////////////////////////////////////////////////////////

// Main class to run RouteGenerator with 5 drivers

import java.util.*;

public class CitySim9003 {

  public static void main(String[] args) {

    int seed = 0;

    // Exception if invalid args parameter passed
    try {
      seed = Integer.parseInt(args[0]);
    }
    catch (Exception e) {
      System.out.println("Error: Invalid Seed Value, Exiting...");
      System.exit(1);
    }

    // Exception if too many arg parameters passed
    if (args.length > 1) {
      System.out.println("Error: Invalid Seed Value, Exiting...");
      System.exit(1);
    }

    // Utilizes the parameter seed
    Random random = new Random(seed);

    System.out.println();

    // Runs RouteGenerator for 5 different drivers with input seed
    for (int i = 1; i <= 5; i++) {
      Driver driver = new Driver(random.nextInt(5));
      RouteGenerator generator = new RouteGenerator(driver, i, random);
      generator.startRoute();
    }

    System.out.println();
  }
}

/////////////////////////////////////////////////////////////////////
////////////// CS 1632 DELIVERABLE 2 BY PETER STAMOS/////////////////
/////////////////////////////////////////////////////////////////////
