/////////////////////////////////////////////////////////////////////
////////////// CS 1632 DELIVERABLE 2 BY PETER STAMOS/////////////////
/////////////////////////////////////////////////////////////////////

// Generates city map for driver to traverse

import java.util.Random;

public class RouteGenerator {

  private Random random;
  private Driver driver;
  private int id;

/////////////////////////////////////////////////////////////////////

  // Constructor
  public RouteGenerator(Driver driver, int id, Random random) {
    this.driver = driver;
    this.id = id;
    this.random = random;
  }

/////////////////////////////////////////////////////////////////////

  // Start of RouteGenerator
  // Generates driver at random location and maintains coffee count
  public void startRoute() {

    int coffee = 0;
    int previous = 0;
    int current = 0;
    boolean flag = false;

    do {

      previous = driver.getLocation();

      if (previous == 4 && flag == false) {
          previous--;
          flag = true;
      }

      if (previous == 3) {
        coffee++;
      }

      updateRoute(previous);

      current = driver.getLocation();

      System.out.println("Driver " + id + " heading from " + convertLocationName(previous) + " to " + convertLocationName(current) + convertStreet(previous, current));

    } while (driver.getLocation() != 4);

    System.out.println("Driver " + id + " got " + coffee + " cup(s) of coffee.");
    System.out.println("-----");
  }

/////////////////////////////////////////////////////////////////////

  private void updateRoute(int previous) {

    int current = convertLocation(previous, random.nextInt(2));
    driver.setLocation(current);
  }

/////////////////////////////////////////////////////////////////////

  // Converts number values from convertLocation to their
  // respective names
  public String convertLocationName(int i) {

    if (i == 0) {
      return "Hotel";
    }

    else if (i == 1) {
      return "Diner";
    }

    else if (i == 2) {
      return "Library";
    }

    else if (i == 3) {
      return "Coffee";
    }

    return "Outside City";
  }

/////////////////////////////////////////////////////////////////////

  // Converts driver location into associated map value
  public int convertLocation(int previous, int current) {

    // Hotel
    if (previous == 2 && current == 1) {
      return 0;
    }

    // Hotel
    else if (previous == 4 && current == 0) {
      return 0;
    }

    // Diner
    else if (previous == 0 && current == 0) {
      return 1;
    }

    // Diner
    else if (previous == 3 && current == 1) {
      return 1;
    }

    // Library
    else if (previous == 0 && current == 1) {
      return 2;
    }

    // Library
    else if (previous == 3 && current == 0) {
      return 2;
    }

    // Coffee
    else if (previous == 1 && current == 1) {
      return 3;
    }

    // Outside City
    else if (previous == 2 && current == 0) {
      return 4;
    }

    // Outside City
    else if (previous == 1 && current == 0) {
      return 4;
    }

    // Coffee
    return 3;
  }

/////////////////////////////////////////////////////////////////////

  // Fills in appropriate street content based on driver's visited locations
  public String convertStreet(int previous, int current) {

    if (previous == 0 && current == 1) {
      return " via Fourth Ave.";
    }

    else if (previous == 0 && current == 2) {
      return " via Bill St.";
    }

    else if (previous == 1 && current == 3) {
      return " via Phil St.";
    }

    else if (previous == 1 && current == 4) {
      return " via Fourth Ave.\nDriver " + id + " has gone to Philadelphia!";
    }

    else if (previous == 2 && current == 0) {
      return " via Bill St.";
    }

    else if (previous == 2 && current == 4) {
      return " via Fifth Ave.\nDriver " + id + " has gone to Cleveland!";
    }

    else if (previous == 3 && current == 1) {
      return " via Phil St.";
    }

    else if (previous == 3 && current == 2) {
      return " via Fifth Ave.";
    }

    else if (previous == 4 && current == 0) {
      return " via Fourth Ave.";
    }

    return " via Fifth Ave.";
  }
}

/////////////////////////////////////////////////////////////////////
////////////// CS 1632 DELIVERABLE 2 BY PETER STAMOS/////////////////
/////////////////////////////////////////////////////////////////////
