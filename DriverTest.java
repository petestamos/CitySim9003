/////////////////////////////////////////////////////////////////////
////////////// CS 1632 DELIVERABLE 2 BY PETER STAMOS/////////////////
/////////////////////////////////////////////////////////////////////

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

// A test for the driver class
public class DriverTest {

/////////////////////////////////////////////////////////////////////

  @Before
  public void setUp() throws Exception {}

/////////////////////////////////////////////////////////////////////

  @After
  public void tearDown() throws Exception {}

/////////////////////////////////////////////////////////////////////

  @Test // Test double
  public void testSetLocation() {
    Driver driver = new Driver(10);
    assertEquals(10, driver.getLocation());
  }

/////////////////////////////////////////////////////////////////////

  @Test // Test double
  public void testGetLocation() {
    Driver driver = new Driver(0);
    driver.setLocation(10);
    assertEquals(10, driver.getLocation());
  }
}

/////////////////////////////////////////////////////////////////////
////////////// CS 1632 DELIVERABLE 2 BY PETER STAMOS/////////////////
/////////////////////////////////////////////////////////////////////
