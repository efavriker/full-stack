import lesson8.Car;
import lesson8.Rectangle;

public static void main(String [] args) {

   // test of the Rectangle class


  /* Rectangle rectangle1 = new Rectangle('6');
    Rectangle rectangle2 = new Rectangle(10,3);
    System.out.println("1 perimeter : "+rectangle1.calculatePerimeter());
    System.out.println("2 perimeter : "+rectangle2.calculatePerimeter());
    System.out.println("1 perimeter : "+rectangle1.calculateArea());
    System.out.println("2 perimeter : "+rectangle2.calculateArea());

   */
    //test Car class

    Car kiaPicanto = new Car("kiapicanto",50000,false, "Arja");
    kiaPicanto.setForSale("Arja",true);
    kiaPicanto.setPrice("Arja",40000);
    kiaPicanto.sale("Cercey","Jaymi");
    kiaPicanto.sale("Arja","John");
    System.out.println(kiaPicanto.getOwner());

}
