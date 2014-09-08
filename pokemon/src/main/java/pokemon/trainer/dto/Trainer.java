package pokemon.trainer.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainer {

	@Id
	private int t_id;
	private String name;
	private String hometown;
	
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	
	
}
