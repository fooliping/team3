import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.HashMap;
public class TodoListDB {
	
	private HashMap<Integer, TodoList> mDB = new HashMap<Integer,TodoList>();
	
	
	public void Add(TodoList item)
	{
		mDB.put(item.getID(),item);
	}

	public boolean IsInList(Integer id)
	{
		if (mDB.containsKey(id))
			return true;
		return false;
	}
	
	public boolean Remove(Integer id)
	{
		if (IsInList(id))
		{
			mDB.remove(id);
			return true;
		}
		return false;
	}
	
	public TodoList Get(Integer id)
	{
		return (TodoList)mDB.get(id);
	}
	
	//public void printAll(Integer id)
	//{
		//return (TodoList)mDB.get(id);
	//}
	
	public void testDate()
	{
		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		Date tmpDate = new Date();
		System.out.println(sdf.format( tmpDate));
	}
	
	public void printList()
	{
	
		for(Integer key: mDB.keySet())
		{
			System.out.println("Task id: " + mDB.get(key).getID());
			System.out.println("Task Msg: " + mDB.get(key).getMsg());
		}
	}
}
