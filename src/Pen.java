import figure.Figure;
public class Pen {

	private Figure fig;

	public Pen(){
//		fig = null;
	}

	public Pen (Figure newfig){
		fig = newfig;
	}

	public void drawFigure(){
		fig.draw();
	}

	public void showFigure(){
		fig.show();
	}

	public void setFigure(Figure newfig){
		fig = newfig;
	}

	public Figure getFig(){
		return fig;
	}

}
