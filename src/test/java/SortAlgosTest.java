package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class SortAlgosTest {
	
	Item [] data = new Item[6];
	
	// @Before test case will run before each test case is executed. It will resetInputdata before every test case for each sorting algorithm. 
	@Before
	public void resetData() {
		data[0]= new Item(1);
		data[1]= new Item(3);
		data[2]= new Item(0);
		data[3]= new Item(2);
		data[4]= new Item(8);
		data[5]= new Item(4);
	}

	/**Null array checking for Bubble Sort (Empty array)
	*Test Sequence - 20,21,22-> 36
	*/	
		@Test(expected=java.lang.NullPointerException.class)
		public void testBubbleSortNull() {
			data=null;
			SortAlgos.bubbleSort(data);
		}
		
	/**Checking empty array for bubbleSort
	* Test Sequence - 20,21,22,23,24,25 -> 27 ->36
	*/
	@Test
	public void testBubbleSortOneElement() {
		Item []ans = new Item[6];   
		
	}
		
	/**Test case for BubbleSort (Random Order Array)
	*  Test Sequence - (20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36)
	*/
	@Test
	public void testBubbleSort() {	
		Item []ans = new Item[6];   
		ans[0]= new Item(0);
		ans[1]= new Item(1);
		ans[2]= new Item(2);
		ans[3]= new Item(3);
		ans[4]= new Item(4);
		ans[5]= new Item(8);

		SortAlgos.bubbleSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}
	
	/**Test case for BubbleSort (Sorted Order Array)
	*  Test Sequence - 20,21,22,23,24,25,26,27,28,29 -> 34
	*/
	@Test
	public void testBubbleSortAlreadySorted() {	
		
		data[0]= new Item(0);
		data[1]= new Item(1);
		data[2]= new Item(2);
		data[3]= new Item(3);
		data[4]= new Item(4);
		data[5]= new Item(8);
		
		Item []ans = new Item[6];   
		ans[0]= new Item(0);
		ans[1]= new Item(1);
		ans[2]= new Item(2);
		ans[3]= new Item(3);
		ans[4]= new Item(4);
		ans[5]= new Item(8);

		SortAlgos.bubbleSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}

	//Null array checking for Selection Sort
	@Test(expected=java.lang.NullPointerException.class)
	public void testSelectionSortNull() {
		data=null;
		SortAlgos.selectionSort(data);
	}
	
	//Test case for SelectionSort
	@Test
	public void testSelectionSort() {
		Item []ans = new Item[6];   
		ans[0]= new Item(0);
		ans[1]= new Item(1);
		ans[2]= new Item(2);
		ans[3]= new Item(3);
		ans[4]= new Item(4);
		ans[5]= new Item(8);

		SortAlgos.selectionSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}

	//Null array checking for Insertion Sort
	@Test(expected=java.lang.NullPointerException.class)
	public void testInsertionSortNull() {
		data=null;
		SortAlgos.insertionSort(data);
	}
	
	//Test case for InsertionSort
	@Test
	public void testInsertionSort() {
		Item []ans = new Item[6];   
		ans[0]= new Item(0);
		ans[1]= new Item(1);
		ans[2]= new Item(2);
		ans[3]= new Item(3);
		ans[4]= new Item(4);
		ans[5]= new Item(8);

		SortAlgos.insertionSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}
	
	//Null array checking for Merge Sort
		@Test(expected=java.lang.NullPointerException.class)
		public void testMergeSortNull() {
			data=null;
			SortAlgos.mergeSort(data);
		}

	//Test case for MergeSort
	@Test
	public void testMergeSort() {
		Item []ans = new Item[6];   
		ans[0]= new Item(0);
		ans[1]= new Item(1);
		ans[2]= new Item(2);
		ans[3]= new Item(3);
		ans[4]= new Item(4);
		ans[5]= new Item(8);

		SortAlgos.mergeSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}
	

	//Null array checking for Quick Sort
	@Test(expected=java.lang.NullPointerException.class)
	public void testQuickSortNull() {
		data=null;
		SortAlgos.quickSort(data);
	}

	//Test case for QuickSort
	@Test
	public void testQuickSort() {
		Item []ans = new Item[6];   
		ans[0]= new Item(0);
		ans[1]= new Item(1);
		ans[2]= new Item(2);
		ans[3]= new Item(3);
		ans[4]= new Item(4);
		ans[5]= new Item(8);

		SortAlgos.quickSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}
	

	//Null array checking for Heap Sort
	@Test(expected=java.lang.NullPointerException.class)
	public void testHeapSortNull() {
		data=null;
		SortAlgos.heapSort(data);
	}
	
	//Test case for HeapSort
	@Test
	public void testHeapSort() {
		Item []ans = new Item[6];   
		ans[0]= new Item(0);
		ans[1]= new Item(1);
		ans[2]= new Item(2);
		ans[3]= new Item(3);
		ans[4]= new Item(4);
		ans[5]= new Item(8);

		SortAlgos.heapSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}
	
}