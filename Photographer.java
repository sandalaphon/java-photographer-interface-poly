import java.util.*;

public class Photographer {
  
    private String name;
    private ArrayList<Camera> cameras;

    public Photographer(String name){
      this.name = name;
      this.cameras = new ArrayList<Camera>();
    }

    public String getName(){
      return this.name;
    }

    public void addCamera(Camera newCamera){
      cameras.add(newCamera);

    }

    public ArrayList<Camera> printCameras(){
      return cameras;
    }

    public void deleteCamera(Camera lostOrSold){
      int count=0;
      for(Camera cam : cameras){
        if(cam==lostOrSold){cameras.remove(count);}
          else {count++;}
      }
    }

      public String printDetails(){
       String str = new String();
       int count = 0;
        for (Camera cam : cameras){
         str= str+" Camera "+(count+1)+" cost "+cam.printDetails()  +"\n";
         count++;
          // System.out.println(cam.printDetails());
        }
        System.out.println(str);
      return str;
      }
    
  


    public int countCameras(){
      return cameras.size();
    }

}