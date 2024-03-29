import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a picture.
 *
 * @author Nick Efford
 * @version 1.3 (2013-09-17)
 */
public class Picture
{
  private List<Circle> elements = new ArrayList<>();

  /**
   * Creates a picture containing some circles.
   */
  public Picture()
  {
    // TO DO: add code here to add some Circle objects to the list
	  elements.add(new Circle(10, 10, 10));
	  elements.add(new Circle(20, 30, 25));
	  elements.add(new Circle(50, 80, 65));
	  elements.add(new Circle(130, 210, 170));
  }

  /**
   * Draws this picture in the specified graphics context.
   *
   * @param context Graphics context used for drawing
   */
  public void draw(Graphics2D context)
  {
    for (Circle element : elements) {
      element.draw(context);
    }
  }
}