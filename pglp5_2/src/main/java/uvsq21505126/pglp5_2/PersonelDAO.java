package uvsq21505126.exo5_1;

import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class PersonelDAO implements DAO<Personel>{
	
	ArrayList<Personel> p;

	public List getAllStudents() {
		  open();
		try {
			PreparedStatement prepare = connect.prepareStatement(
					"INSERT INTO Personnel(nom, prenom, fonction, date) VALUES(?, ?, ?, ?)");
			prepare.setString(1, obj.getNom);
			prepare.setString(2, obj.getPrenom);	
			prepare.setString(3, obj.getFonction);
			prepare.setString(4,obj.getDate);
		}
		catch (SQLException throwables) {
		      throwables.printStackTrace();
		    }
		close();
		return null;
	}

	public Personel getPersonel(int pe) {
		return p;
	}

	public void updatePersonel(Personel p) {
		
		
	}

	public void deletePersonel(Personel p) {
		open();
	    try {
	      PreparedStatement deletePersonel =
	          this.connect.prepareStatement("DELETE FROM Personnel WHERE nom = ?");
	      deletePersonel.setString(1, nom);
	      deletePersonel.execute();
	    } catch (SQLException throwables) {
	      throwables.printStackTrace();
	    }

	   close();
	}


}
