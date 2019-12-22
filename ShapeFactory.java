import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.awt.Paint;
import java.awt.BasicStroke;
import java.awt.Shape;


public class ShapeFactory
{
    public Shape shape;
    public BasicStroke stroke;
    public Paint paint;
    public int width;
    public int height;
    
    public ShapeFactory(final int shape_type) {
        this.width = 25;
        this.height = 25;
        this.stroke = new BasicStroke(3.0f);
        this.shape = new Rectangle2D.Double(-this.width / 2.0, -this.height / 2.0, this.width, this.height);
        this.paint = Color.red;
    }
}
