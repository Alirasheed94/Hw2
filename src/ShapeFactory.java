public class ShapeFactory {
	
   //use getShape method to get object of type shape 
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("Pyramid")){
         return new Pyramid();
         
      } else if(shapeType.equalsIgnoreCase("Triangle")){
         return new Triangle();
         
      } else if(shapeType.equalsIgnoreCase("Hexagon")){
         return new Hexagon();
      }
      
      return null;
   }
}