/////////////////////////////////////////////////////////////////////
////////////// CS 1632 DELIVERABLE 2 BY PETER STAMOS/////////////////
/////////////////////////////////////////////////////////////////////

// Test class for RouteGenerator

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.util.*;

public class RouteGeneratorTest {

  @Before
  public void setUp() throws Exception {}

/////////////////////////////////////////////////////////////////////

  @After
  public void tearDown() throws Exception {}

/////////////////////////////////////////////////////////////////////

  // Tests startRoute via mock with method stubs

  @Test
  public void testStartRoute() {

    Random random = new Random(5);
    Driver driver = new Driver(0);

    MockRouteGenerator generator = new MockRouteGenerator(driver, 1, random);

    assertTrue(generator.startRoute());
  }

/////////////////////////////////////////////////////////////////////

  // Tests that locations are converted correctly

  @Test
  public void testConvertLocation() {

    Random random = new Random(5);
    Driver driver = new Driver(0);

    RouteGenerator generator = new RouteGenerator(driver, 0, random);

    assertEquals(generator.convertLocation(4,0), 0);
    assertEquals(generator.convertLocation(2,1), 0);
    assertEquals(generator.convertLocation(3,1), 1);
    assertEquals(generator.convertLocation(0,0), 1);
    assertEquals(generator.convertLocation(0,1), 2);
    assertEquals(generator.convertLocation(3,0), 2);
    assertEquals(generator.convertLocation(1,1), 3);
    assertEquals(generator.convertLocation(4,1), 3);
    assertEquals(generator.convertLocation(2,0), 4);
    assertEquals(generator.convertLocation(1,0), 4);
  }

/////////////////////////////////////////////////////////////////////

  // Tests location name values

  @Test
  public void testConvertLocationNames() {

    Random random = new Random(5);
    Driver driver = new Driver(0);

    RouteGenerator generator = new RouteGenerator(driver, 0, random);

    assertTrue("Hotel".equals(generator.convertLocationName(0)));
    assertTrue("Diner".equals(generator.convertLocationName(1)));
    assertTrue("Library".equals(generator.convertLocationName(2)));
    assertTrue("Coffee".equals(generator.convertLocationName(3)));
    assertTrue("Outside City".equals(generator.convertLocationName(4)));
  }

/////////////////////////////////////////////////////////////////////

  // Tests street name values

  @Test
  public void testConvertStreet() {

    Random random = new Random(5);
    Driver driver = new Driver(0);

    RouteGenerator generator = new RouteGenerator(driver, 0, random);

    assertTrue(generator.convertStreet(2,0).equals(" via Bill St."));
    assertTrue(generator.convertStreet(0,2).equals(" via Bill St."));
    assertTrue(generator.convertStreet(1,3).equals(" via Phil St."));
    assertTrue(generator.convertStreet(3,1).equals(" via Phil St."));
    assertTrue(generator.convertStreet(0,1).equals(" via Fourth Ave."));
    assertTrue(generator.convertStreet(4,0).equals(" via Fourth Ave."));
    assertTrue(generator.convertStreet(3,2).equals(" via Fifth Ave."));
    assertTrue(generator.convertStreet(4,3).equals(" via Fifth Ave."));
  }

/////////////////////////////////////////////////////////////////////

  // Tests location name values with invalid location

  @Test
  public void testInvalidLocation() {

    Random random = new Random(5);
    Driver driver = new Driver(0);

    RouteGenerator generator = new RouteGenerator(driver, 0, random);

    assertFalse("Park".equals(generator.convertLocationName(5)));
  }

/////////////////////////////////////////////////////////////////////

  // Tests street name values with invalid street

  @Test
  public void testInvalidStreet() {

    Random random = new Random(5);
    Driver driver = new Driver(0);

    RouteGenerator generator = new RouteGenerator(driver, 0, random);

    assertFalse(generator.convertStreet(2,1).equals(" via Park St."));
  }
}

/////////////////////////////////////////////////////////////////////
////////////// CS 1632 DELIVERABLE 2 BY PETER STAMOS/////////////////
/////////////////////////////////////////////////////////////////////
