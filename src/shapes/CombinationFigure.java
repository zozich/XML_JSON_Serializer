package shapes;

public class CombinationFigure extends Shape {
  public Circle circle;
  public Rectangle rectangle;

  public CombinationFigure(Circle circle, Rectangle rectangle) {
    this.circle = circle;
    this.rectangle = rectangle;
  }
}
