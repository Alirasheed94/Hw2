public class FactoryPatternDemo {

   public static void main(String[] args) {
      ShapeFactory shapeFactory = new ShapeFactory();

      //get an object of Pyramid and call its draw method.
      Shape shape1 = shapeFactory.getShape("Pyramid");

      //call draw method of Pyramid
      shape1.draw();

      //get an object of Triangle and call its draw method.
      Shape shape2 = shapeFactory.getShape("Triangle");

      //call draw method of Triangle
      shape2.draw();

      //get an object of Hexagon and call its draw method.
      Shape shape3 = shapeFactory.getShape("Hexagon");

      //call draw method of Hexagon
      shape3.draw();
   }
}