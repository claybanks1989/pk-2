package pokemon.pokemon.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity (name="Pokemon") //the "name" property takes the actual name of the Database column name. If this was named anything else, it would create a table with that name
//@Table (name="Pokemon2") //creates a separated Table 
//@Temporal (TemporalType.DATE) //saves Date without TimeStamp
//@Transient //doesn't persist property to the database
//@Column (name="name") //can be set on variables as well as get methods
//@Lob Supports large amount of characters
public class Pokemon {
	@Id

	private int p_id;
	private String name;
	private String type;
	private Date dateAdded;
	
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Transient
	public Date getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}
	
	
}
