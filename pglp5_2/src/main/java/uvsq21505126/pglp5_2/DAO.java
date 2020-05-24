package uvsq21505126.exo5_1;

import java.awt.List;

public interface DAO<T>{
	   public List getAllStudents();
	   public T getPersonel(int p);
	   public void updatePersonel(T p);
	   public void deletePersonel(T p);
	   
	   public void open() {
		
		String url = "jdbc:derby:DrawingTest;create=true";
	    try {
	      Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
	    } catch (ClassNotFoundException e) {
	      e.printStackTrace();
	    }
	    try {
	      connect = DriverManager.getConnection(url);
	    } catch (SQLException throwables) {
	      throwables.printStackTrace();
	    }
	  }

	  public void close() {
	    try {
	      connect.close();
	    } catch (SQLException throwables) {
	      throwables.printStackTrace();
	    }
	  }
}
