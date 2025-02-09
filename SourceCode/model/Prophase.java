package model;

public class Prophase extends MiddleState {
	
	public void prev(DivisionProcess cell) {
		if (process.equals("Meiosis2")) {
			cell.setState(new Telophase("Meiosis"));
		} else {
			cell.setState(new Interphase(process));
		}
	}
	
	public void next(DivisionProcess cell) {
		cell.setState(new Metaphase(process));
	}
	
	public String printState() {
		return "Prophase";
	}

	public String printDescription() {
		return "Chromatin condenses into chromosomes. Nucleolus disappears";
	}
	
	public Prophase(String process) {
		super();
		this.process = process;
		this.chromoX = new float[] {282, 288, 310, 316, 304, 310, 332, 338};
		this.chromoY = new float[] {188, 188, 229, 229, 205, 205, 188, 188};
		this.chromoRotate = new float[] {0, 180, 0, 180, 0, 180, 0, 180};
		this.visible = new boolean[]{true, true, false};
		super.fitComponent();
	}
}
