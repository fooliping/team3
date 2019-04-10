import java.util.Date;

public class TodoList {

	private int mID;
	
	private Date mDueDate;
	private boolean mCrossed;
	private String mMsg;
	private Integer mPriority;
	
	public int getID() {
		return mID;
	}
	public void setID(int mID) {
		this.mID = mID;
	}
	public Date getDueDate() {
		return mDueDate;
	}
	public void setDueDate(Date mDueDate) {
		this.mDueDate = mDueDate;
	}
	
	public boolean getCrossed() {
		return mCrossed;
	}
	public void setCrossed(boolean mCrossed) {
		this.mCrossed = mCrossed;
	}
	

	public String getMsg() {
		return mMsg;
	}
	public void setMsg(String mMsg) {
		this.mMsg = mMsg;
	}
	
	public boolean equals(Object obj)
	{
		if (obj instanceof TodoList)
		{
			TodoList tmp = (TodoList)obj;
			if ((tmp.getID()== mID) && (tmp.getDueDate().getTime()==mDueDate.getTime()) && (tmp.getCrossed()==mCrossed) && tmp.getMsg().equals(mMsg))
				return true;
		}
		return false;
	}
	public Integer getPriority() {
		return mPriority;
	}
	public void setPriority(Integer mPriority) {
		this.mPriority = mPriority;
	}
}
