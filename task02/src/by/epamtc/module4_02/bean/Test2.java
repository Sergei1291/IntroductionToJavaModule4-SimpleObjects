package by.epamtc.module4_02.bean;

public class Test2 {

	private int value;
	private boolean flag;

	public Test2() {

		value = 0;
		flag = false;

	}

	public Test2(int value, boolean flag) {

		this.value = value;
		this.flag = flag;

	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}