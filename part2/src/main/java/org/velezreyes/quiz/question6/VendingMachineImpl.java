package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine{
	
	private static VendingMachineImpl instance;

	public static VendingMachine getInstance(){
		if (instance == null) {
            instance = new VendingMachineImpl();
        }
        return instance;
	}

	
	int Quarter = 0;
	@Override
	public void insertQuarter() {
		Quarter = Quarter + 25; 
	}
	
	@Override
	public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
		Products p = new Products();
		Drink drink = p;
		if (name == "ScottCola") {
			System.out.println(Quarter);
			if(Quarter == 75) {
				p.setName(name);
				p.setFizzy(true);
				Quarter = 0;
				return drink;
			}
			throw new NotEnoughMoneyException();
					
		}else if (name == "KarenTea") {
			if(Quarter > 75) {
				p.setName(name);
				p.setFizzy(false);
				Quarter = 0;
				return drink;
			}
			throw new NotEnoughMoneyException();
		}else {
			Quarter = 0;
			throw new UnknownDrinkException();
		}
	}


}
