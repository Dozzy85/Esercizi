package esercizio15;

/*Immaginiamo di creare una collezione o una lista sfruttando l'iterator*/
public class Main {

	public static void main(String[] args) {

		Aggregate aggregate = new ConcreteAggregate();
		aggregate.add("item1");
		aggregate.add("item2");

		MyIterator iterator = aggregate.createIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
