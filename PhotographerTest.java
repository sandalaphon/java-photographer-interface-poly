import static org.junit.Assert.*;
import org.junit.*;


public class PhotographerTest{
  
  Photographer phil;

  @Before
  public void before(){
    phil = new Photographer("phil");
  }

  @Test
  public void hasName(){
    
    assertEquals("phil", phil.getName());
  }

}

