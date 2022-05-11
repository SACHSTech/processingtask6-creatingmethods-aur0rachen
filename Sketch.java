import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(158, 221, 255);
  }

  
  
  public void draw() {
    flower(0, 255, 201, 251); 
    flower(-80, 197, 196, 255);
    flower(-160, 200, 255, 196);
    flower(80, 196, 239, 255);
    flower(160, 255, 188, 117);
    
    cloud(0, 0);
    cloud(255, 50);

    grass();

    sun(sunLocation(), 0, 155);
	}

    /**
    * This method draws a flower
    * 
    * @param flowerX changes the horizontal coordinate of the flower
    * @param flowerColor1 for the first value of the color of the flower
    * @param flowerColor2 for the second value of the color of the flower
    * @param flowerColor2 for the third value of the color of the flower
    *
    */
    public void flower(int flowerX, int flowerColor1, int flowerColor2, int flowerColor3){
      stroke(0);
      
      // stem
      fill(14, 110, 32);
      rect(199 + flowerX, 280, 2, 90, 1);
      
      // leaf
      fill(14, 110, 32);
      
      beginShape();
      curveVertex(199 + flowerX, 315);
      curveVertex(199 + flowerX, 315);
      curveVertex(180 + flowerX, 308);
      curveVertex(159 + flowerX, 315);
      curveVertex(159 + flowerX, 315);
      endShape();
  
      beginShape();
      curveVertex(199 + flowerX, 315);
      curveVertex(199 + flowerX, 315);
      curveVertex(180 + flowerX, 322);
      curveVertex(159 + flowerX, 315);
      curveVertex(159 + flowerX, 315);
      endShape();
      
      beginShape();
      curveVertex(201 + flowerX, 330);
      curveVertex(201 + flowerX, 330);
      curveVertex(220 + flowerX, 323);
      curveVertex(241 + flowerX, 330);
      curveVertex(241 + flowerX, 330);
      endShape();
  
      beginShape();
      curveVertex(201 + flowerX, 330);
      curveVertex(201 + flowerX, 330);
      curveVertex(220 + flowerX, 337);
      curveVertex(241 + flowerX, 330);
      curveVertex(241 + flowerX, 330);
      endShape();
  
      // petals
      fill(flowerColor1, flowerColor2, flowerColor3);
      ellipse (200  + flowerX, 225, 35, 35);  
      ellipse(225 + flowerX, 245, 35, 35); 
      ellipse(175 + flowerX, 245, 35, 35); 
      ellipse(215 + flowerX, 275, 35, 35); 
      ellipse(185 + flowerX, 275, 35, 35);
  
      // center of flower
      fill(255, 236, 173);
      ellipse(200 + flowerX, 250, 30, 30);
    }

    /**
    * This method draws a cloud
    * 
    * @param cloudX changes the horizontal coordinate of the cloud
    * @param cloudY changes the vertical coordinate of the cloud
    *
    */
  public void cloud(int cloudX, int cloudY){
    stroke(237, 244, 255);
    fill(237, 244, 255);

    ellipse(90 + cloudX, 105 + cloudY, 50, 50);
    ellipse(60 + cloudX, 120 + cloudY, 35, 35);
    ellipse(120 + cloudX, 120 + cloudY, 35, 35);
    rect(60 + cloudX, 125 + cloudY, 60, 12, 5);
  }

    /**
    * This method draws the grass
    */
    public void grass(){
      fill(210, 255, 173);
      rect(0, 370, 400, 30);
    }
  
    /**
    * This method draws the sun
    *
    *
    */
    public void sun (int sunX, int sunY, int sunSize){
      noStroke();
      fill(255, 234, 0);
      ellipse(sunX, sunY, sunSize, sunSize);
  }

    /**
    * This method determines the location of the sun and draws the sun in the middle of the screen
    *
    * @param sunSize The width of the sun
    * @return The x location of the sun
    * 
    */
   public int sunLocation(){
     return width / 2;
   }
}
  
