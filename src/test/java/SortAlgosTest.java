package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class SortAlgosTest {
	SortAlgos sa= new SortAlgos();
	Item [] data = new Item[6];
	@Test
	public void testBubbleSort() {	
		Item []ans = new Item[6];   
		ans[0]= new Item(0);
		ans[1]= new Item(1);
		ans[2]= new Item(2);
		ans[3]= new Item(3);
		ans[4]= new Item(4);
		ans[5]= new Item(8);

		sa.bubbleSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}

	@Test
	public void testSelectionSort() {
		Item []ans = new Item[6];   
		ans[0]= new Item(0);
		ans[1]= new Item(1);
		ans[2]= new Item(2);
		ans[3]= new Item(3);
		ans[4]= new Item(4);
		ans[5]= new Item(8);

		sa.selectionSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}

	@Test
	public void testInsertionSort() {
		Item []ans = new Item[6];   
		ans[0]= new Item(0);
		ans[1]= new Item(1);
		ans[2]= new Item(2);
		ans[3]= new Item(3);
		ans[4]= new Item(4);
		ans[5]= new Item(8);

		sa.insertionSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}

	@Test
	public void testMergeSort() {
		Item []ans = new Item[6];   
		ans[0]= new Item(0);
		ans[1]= new Item(1);
		ans[2]= new Item(2);
		ans[3]= new Item(3);
		ans[4]= new Item(4);
		ans[5]= new Item(8);

		sa.mergeSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}

	@Test
	public void testQuickSort() {
		Item []ans = new Item[6];   
		ans[0]= new Item(0);
		ans[1]= new Item(1);
		ans[2]= new Item(2);
		ans[3]= new Item(3);
		ans[4]= new Item(4);
		ans[5]= new Item(8);

		sa.quickSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}

	@Test
	public void testHeapSort() {
		Item []ans = new Item[6];   
		ans[0]= new Item(0);
		ans[1]= new Item(1);
		ans[2]= new Item(2);
		ans[3]= new Item(3);
		ans[4]= new Item(4);
		ans[5]= new Item(8);

		sa.heapSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}

	@Before
	public void resetData() {
		data[0]= new Item(1);
		data[1]= new Item(3);
		data[2]= new Item(0);
		data[3]= new Item(2);
		data[4]= new Item(8);
		data[5]= new Item(4);
	}
	
	@Test(expected=java.lang.NullPointerException.class)
	public void testBubbleSortEmpty() {
		data=null;
		sa.bubbleSort(data);
	}
	
	@Test(expected=java.lang.NullPointerException.class)
	public void testHeapSortEmpty() {
		data=null;
		sa.heapSort(data);
	}
	
	@Test(expected=java.lang.NullPointerException.class)
	public void testMergeSortEmpty() {
		data=null;
		sa.mergeSort(data);
	}
	
	@Test(expected=java.lang.NullPointerException.class)
	public void testInsertionSortEmpty() {
		data=null;
		sa.insertionSort(data);
	}
	
	@Test(expected=java.lang.NullPointerException.class)
	public void testSelectionSortEmpty() {
		data=null;
		sa.selectionSort(data);
	}
	
	@Test(expected=java.lang.NullPointerException.class)
	public void testQuickSortEmpty() {
		data=null;
		sa.quickSort(data);
	}
}