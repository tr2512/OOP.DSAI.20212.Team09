package model;

public class Anaphase extends MiddleState {
	
	public void prev(DivisionProcess cell) {
		cell.setState(new Metaphase(process));
	}
	
	public void next(DivisionProcess cell) {
		cell.setState(new Telophase(process));
	}
	
	public String printState() {
		return "Anaphase";
	}

	public String printDescription() {
		return "Chromosomes break at centromeres, and sister chromatids move to opposite ends of the cell.";
	}

	public Anaphase(String process) {
		super();
		this.process = process;
		if (process.equals("Meiosis")) {
			this.chromoX = new float[]{232, 238, 600-232+6, 600-232+12, 232, 238, 600-232+6, 600-232+12};
			this.chromoY = new float[]{175, 175, 175, 175, 230, 230, 230, 230};
			this.chromoRotate = new float[]{0, 180, 0, 180, 0, 180, 0, 180};
		} else {
			this.chromoX = new float[]{232, 600-232+6, 256, 600-256+6, 256, 600-256+6, 232, 600-232+6};
			this.chromoY = new float[]{165, 165, 182, 182, 213, 213, 237, 237};
			this.chromoRotate = new float[]{90, 90, 0, 180, 0, 180, 0, 180};

		}
		this.visible = new boolean[] {true, false, false};
		super.fitComponent();
	}
}
