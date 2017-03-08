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
    canon550d = new DigitalCamera(500, "Canon", "550d");
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

  @Test
  public void deleteCamera(){
    phil.addCamera(nikkon);
    phil.addCamera(canon550d);
    phil.deleteCamera(nikkon);
    // System.out.println(phil.printCameras());
    assertEquals(1, phil.countCameras());
  }

  @Test
  public void printCameraDetails(){
    assertEquals("£500 and was make by Canon it is model: 550d", canon550d.printDetails());

  }

  @Test
  public void printAllCameras(){
    phil.addCamera(nikkon);
    phil.addCamera(canon550d);
    assertEquals(" Camera 1 cost £300 and was make by Nikkon it is model: Vintage Number 3\n Camera 2 cost £500 and was make by Canon it is model: 550d\n", phil.printDetails());
  }

}

