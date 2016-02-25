import figure.Triangle;
class DrawSoft{
  public static void main(String[] args){

    Pen mypen = new Pen();

    mypen.setFigure(new Triangle(3,4));
    mypen.showFigure();
    System.out.println("-------------------------");
    mypen.drawFigure();
  }
}
