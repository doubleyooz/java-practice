package src;

import java.util.Arrays;


import src.algorithms.BinarySearchTree;
import src.algorithms.ChainedList;
import src.algorithms.Queue2;
import src.algorithms.Stack;
import src.interfaces.BST_IF;
import src.interfaces.Fila_IF;
import src.interfaces.ListaEncadeada_IF;
import src.interfaces.Pilha_IF;

public class App {

    public static void main(String[] args) throws Exception {
   
        /*
         * ChainedList chain = new ChainedList();
         * 
         * chain.search(12);
         * chain.search(56);
         * chain.search(3213);
         * 
         * System.out.println(Arrays.toString(chain.toArray()));
         * 
         * //chain.addAtBeginning(42);
         * chain.addAtPosition(10, 42);
         * 
         * System.out.println(Arrays.toString(chain.toArray()));
         * chain.remove(0);
         * System.out.println(Arrays.toString(chain.toArray()));
         * 
         */

         
		System.out.println("Brincando com PilhaComArray...");
		Pilha_IF minhaPilha = new Stack();
		minhaPilha.push(100);
		minhaPilha.push(200);
		System.out.println(minhaPilha.top() == 200);
		System.out.println(minhaPilha.pop() == 200);
		System.out.println(minhaPilha.pop() == 100);
		System.out.println(minhaPilha.isEmpty());
		System.out.println();
		
		System.out.println("Brincando com FilaComPilhas...");
		Fila_IF minhaFila = new Queue2();
		minhaFila.enqueue(100);
		minhaFila.enqueue(200);
		System.out.println(minhaFila.head() == 100);
		System.out.println(minhaFila.dequeue() == 100);
		System.out.println(minhaFila.dequeue() == 200);
		System.out.println(minhaFila.isEmpty());
		System.out.println();
		
		System.out.println("Brincando com ListaEncadeada...");
		ListaEncadeada_IF minhaLista = new ChainedList();
		System.out.println(minhaLista.isEmpty());
		System.out.println(minhaLista.size() == 0);
		minhaLista.insert(100);
		System.out.println(minhaLista.size() == 1);
		System.out.println(minhaLista.toArray()[0] == 100);
		minhaLista.insert(200);
      
		System.out.println(minhaLista.size() == 2);  
        System.out.println(Arrays.toString(minhaLista.toArray()));

		System.out.println(minhaLista.toArray()[0] == 200);
		System.out.println(minhaLista.toArray()[1] == 100);
		minhaLista.insert(300);
		System.out.println(minhaLista.size() == 3);
		System.out.println(minhaLista.toArray()[0] == 300);
		System.out.println(minhaLista.toArray()[1] == 200);
		System.out.println(minhaLista.toArray()[2] == 100);
		minhaLista.remove(100);
		System.out.println(minhaLista.size() == 2);
		System.out.println(minhaLista.toArray()[0] == 300);
		System.out.println(minhaLista.toArray()[1] == 200);
		minhaLista.remove(300);
		System.out.println(minhaLista.size() == 1);
		System.out.println(minhaLista.toArray()[0] == 200);
		System.out.println(minhaLista.search(200) == 200);
		System.out.println();
		
		System.out.println("Brincando com BST...");
		BST_IF minhaArvore = new BinarySearchTree();
		minhaArvore.insert(8);
		System.out.println(minhaArvore.isComplete());
		System.out.println(Arrays.toString(minhaArvore.preOrder()).equals("[8]"));
		System.out.println(Arrays.toString(minhaArvore.order()).equals("[8]"));
		System.out.println(Arrays.toString(minhaArvore.postOrder()).equals("[8]"));
		minhaArvore.insert(12);
		System.out.println(!minhaArvore.isComplete());
		minhaArvore.insert(14);
		System.out.println(!minhaArvore.isComplete());
		minhaArvore.insert(15);
		System.out.println(!minhaArvore.isComplete());
		minhaArvore.insert(4);
		System.out.println(!minhaArvore.isComplete());
		minhaArvore.insert(2);
		System.out.println(!minhaArvore.isComplete());
		minhaArvore.insert(1);
		System.out.println(!minhaArvore.isComplete());
		minhaArvore.insert(13);
		System.out.println(!minhaArvore.isComplete());
		minhaArvore.insert(3);
		System.out.println(!minhaArvore.isComplete());
		minhaArvore.insert(6);
		System.out.println(!minhaArvore.isComplete());
		minhaArvore.insert(7);
		System.out.println(!minhaArvore.isComplete());
		minhaArvore.insert(10);
		System.out.println(!minhaArvore.isComplete());
		minhaArvore.insert(9);
		System.out.println(!minhaArvore.isComplete());
		minhaArvore.insert(5);
		System.out.println(!minhaArvore.isComplete());
		minhaArvore.insert(11);
		System.out.println(minhaArvore.isComplete());
		for (int k = 1; k <= 15; k++) {
			System.out.println(minhaArvore.search(k) == k);
		}
		System.out.println(Arrays.toString(minhaArvore.preOrder()).equals(Arrays.toString(new int[]{8,4,2,1,3,6,5,7,12,10,9,11,14,13,15})));
		System.out.println(Arrays.toString(minhaArvore.order()).equals(Arrays.toString(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15})));
		System.out.println(Arrays.toString(minhaArvore.postOrder()).equals(Arrays.toString(new int[]{1,3,2,5,7,6,4,9,11,10,13,15,14,12,8})));
		System.out.println();
		/*
		System.out.println("Brincando com TabelaHash...");
		TabelaHash_IF minhaTabelaHash = new TabelaHash(8);
		System.out.println(minhaTabelaHash.print().equals("0: \n1: \n2: \n3: \n4: \n5: \n6: \n7: "));
		for (int key = 1; key < 25; key++) {
			minhaTabelaHash.insert(key);
			System.out.println(minhaTabelaHash.search(key) == key);
		}
		System.out.println(minhaTabelaHash.print().equals("0: 24, 16, 8\n1: 17, 9, 1\n2: 18, 10, 2\n3: 19, 11, 3\n4: 20, 12, 4\n5: 21, 13, 5\n6: 22, 14, 6\n7: 23, 15, 7"));
		int[] elementosARemover = new int[]{1,2,5,7,8,9,13,17,18,20,21,23};
		for (int i = 0; i < elementosARemover.length; i++) {
			minhaTabelaHash.remove(elementosARemover[i]);
		}
		System.out.println(minhaTabelaHash.print().equals("0: 24, 16\n1: \n2: 10\n3: 19, 11, 3\n4: 12, 4\n5: \n6: 22, 14, 6\n7: 15"));
		System.out.println();
				
		//OBS.: Espera-se que nenhum print mostre 'false' na tela!
		
      

      */

         
        
    }

   
}