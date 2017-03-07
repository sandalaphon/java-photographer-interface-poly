import static org.junit.Assert.*;
import org.junit.*;


public class PhotographerTest{
  
  Photographer phil;
  AnalogueCamera nikkon;
  DigitalCamera canon550d;

  @Before
  public void before(){
    phil = new Photographer("phil");
    nikkon = new AnalogueCamera(300, "Nikkon", "Vintage Number 3");
    canon550d = new DigitalCamera(500, "Cannon", "550d");
  }

  @Test
  public void hasName(){
    
    assertEquals("phil", phil.getName());
  }

  @Test
  public  void addCamera(){
    phil.addCamera(nikkon);
    phil.addCamera(canon550d);
    assertEquals(2, phil.countCameras());
  }

}

