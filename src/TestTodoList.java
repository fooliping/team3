import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class TestTodoList {

	@Test
	public void testIsEquals() {
		//fail("Not yet implemented");
		TodoList ls1 = new TodoList();
		TodoList ls2 = new TodoList();
		ls1.setID(1);
		ls2.setID(1);
		ls1.setDueDate(new Date());
		ls2.setDueDate(new Date());
		
		assertTrue(ls1.equals(ls2));
	}

	@Test
	public void testNotEquals() {
		//fail("Not yet implemented");
		TodoList ls1 = new TodoList();
		TodoList ls2 = new TodoList();
		ls1.setID(1);
		ls2.setID(2);
		assertNotEquals(ls1,ls2);
	}
}
