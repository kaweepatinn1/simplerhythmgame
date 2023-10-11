package SimpleRhythmGame;

public class Note {
	private int type;
	private int bar; // which full musical bar to place the note in
	private int beat; // which beat to place the note in (in terms of quavers)
	private int[] subBeat; 
	// value 0 is the numerator, and value 1 is the denominator.
	// says where to place each note if it does not fall on a full beat. 
	// 1/2, 1/3, and 2/3 should be most common
	private float speed;
	
	public transient static final int Note_HIHAT = 0;
	public transient static final int Note_SNAREDRUM = 1;
	public transient static final int Note_CRASHCYMBAL = 2;
	public transient static final int Note_TOM = 3;
	public transient static final int Note_RIDECYMBAL = 4;
	
	public Note(int type, int bar, int beat, int[] subBeat, float speed) {
		this.type = type;
		this.bar = bar;
		this.beat = beat;
		this.subBeat = subBeat;
		this.speed = speed;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getBar() {
		return bar;
	}

	public void setBar(int bar) {
		this.bar = bar;
	}

	public int getBeat() {
		return beat;
	}

	public void setBeat(int beat) {
		this.beat = beat;
	}

	public int[] getSubBeat() {
		return subBeat;
	}

	public void setSubBeat(int[] subBeat) {
		this.subBeat = subBeat;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}
}