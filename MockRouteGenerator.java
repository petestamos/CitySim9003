/////////////////////////////////////////////////////////////////////
////////////// CS 1632 DELIVERABLE 2 BY PETER STAMOS/////////////////
/////////////////////////////////////////////////////////////////////

// Mock of RouteGenerator class
// Contains method stubs for testing purposes

import java.util.*;

public class MockRouteGenerator {

  private Driver driver;
  private int id;

/////////////////////////////////////////////////////////////////////

  public MockRouteGenerator(Driver driver, int id, Random random) {
    this.driver = driver;
    this.id = id;
  }

/////////////////////////////////////////////////////////////////////

  public boolean startRoute() {

    int previous = 0;
    int current = 0;
    int coffee = 0;
    boolean flag = false;

    System.out.println();
    System.out.println("----- Mock RouteGenerator Test Run -----");
    System.out.println();

    do {

      previous = driver.getLocation();

      if (previous == 4 && flag == false) {
          previous--;
          flag = true;
      }

      if (previous == 3) {
        coffee++;
      }

      updateRoute();

      current = driver.getLocation();

      System.out.println("Driver " + id + " heading from " + convertLocationName(previous) + " to " + convertLocationName(current) + convertStreet(previous, current));

    } while (driver.getLocation() != 4);

    System.out.println("Driver " + id + " got " + coffee + " cup(s) of coffee.");
    System.out.println("-----");

    return true;
  }

/////////////////////////////////////////////////////////////////////

  private void updateRoute() {
    driver.setLocation(4);
  }

/////////////////////////////////////////////////////////////////////

  public int convertLocation(int previous, int current) {
    return 4;
  }

/////////////////////////////////////////////////////////////////////

  public String convertLocationName(int i) {
    return "Outside City";
  }

/////////////////////////////////////////////////////////////////////

  public String convertStreet(int previous, int current) {
    return " via Fourth Ave.";
  }
}

/////////////////////////////////////////////////////////////////////
////////////// CS 1632 DELIVERABLE 2 BY PETER STAMOS/////////////////
/////////////////////////////////////////////////////////////////////
