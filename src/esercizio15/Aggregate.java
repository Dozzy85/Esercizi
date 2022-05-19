package esercizio15;

public interface Aggregate {
	
	public MyIterator createIterator();
    public void add(String item);

}
