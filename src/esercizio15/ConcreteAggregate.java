package esercizio15;

import java.util.ArrayList;

public class ConcreteAggregate implements Aggregate {

	private ArrayList arrayList;

	public ConcreteAggregate() {
		arrayList = new ArrayList();
	}

	@Override
	public MyIterator createIterator() {
		return new ConcreteIterator(arrayList);
	}

	@Override
	public void add(String item) {
		arrayList.add(item);
	}

}
