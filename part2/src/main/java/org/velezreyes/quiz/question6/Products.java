package org.velezreyes.quiz.question6;

public class Products implements Drink {
	private String name;
	private boolean fizzy;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setFizzy(boolean fizzy) {
		this.fizzy = fizzy;
	}

	public Products() {
		// TODO Auto-generated constructor stub
	}

	public Products(String name, boolean fizzy) {
		this.name = name;
		this.fizzy = fizzy;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isFizzy() {
		return fizzy;
	}
}
