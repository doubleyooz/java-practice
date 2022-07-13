package src.interfaces;

/*
 * Interface para implementa��o da classe "FilaComPilhas", a qual deve
 * ser implementada usando duas inst�ncias da classe "PilhaComArray".
 */
public interface Fila_IF {
	public void enqueue(int element) throws Exception;
	public int dequeue() throws Exception;
	public int head() throws Exception;
	public boolean isEmpty();
	public boolean isFull();
}
