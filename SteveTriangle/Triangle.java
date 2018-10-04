public class Triangle extends GeometricObject {
  private double base;
  private double height;

        public Triangle(){



        }
        public Triangle(

            double base, double height) {

          this.base = base;

          this.height = height;

        }

        public Triangle(

            double base, double height, String color, boolean filled) {

          this.base = base;

          this.height = height;

          setColor(color);

          setFilled(filled);

        }


          public double getArea() {

            return (base * height)/2;

          }
          public double getHeight() {

            return height;

          }

}
