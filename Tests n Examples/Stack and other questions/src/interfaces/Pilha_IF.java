package src.interfaces;

/*
 * Interface para implementa��o da classe "PilhaComArray",
 * que deve ser implementada usando um array de tamanho 10.
 */
public interface Pilha_IF {
	public void push(int element) throws Exception;
	public int pop() throws Exception;
	public int top() throws Exception;
	public boolean isEmpty();
	public boolean isFull();
}
