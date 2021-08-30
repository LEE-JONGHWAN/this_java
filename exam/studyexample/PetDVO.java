package studyexample;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PetDVO implements Serializable { 
	private static final long serialVersionUID = 1L;
	private Integer id;
    private String name;
    private String owner;
    private String species;
    private char gender;  // 원하면 char 형으로 선언 DB 컬럼 형과 같게...
    private Date birth;
    private Date death;  

    String getDateStr(Date date) {
		String dateStr = "";
		if (this.death != null) {
			dateStr = new SimpleDateFormat("yyyy-MM-dd").format(this.death);
		}
		return dateStr;
    }
	@Override
	public String toString() {
		return "PetDVO [id=" + id + ", name=" + name + ", owner=" + owner 
				+ ", species=" + species + ", sex=" + gender
				+ ", birth=" + getDateStr(birth) + ", death=" 
				+ getDateStr(death) + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char sex) {
		this.gender = sex;
	}


	public Date getBirth() {
		return birth;
	}


	public void setBirth(Date birth) {
		this.birth = birth;
	}


	public Date getDeath() {
		return death;
	}


	public void setDeath(Date death) {
		this.death = death;
	}

}
