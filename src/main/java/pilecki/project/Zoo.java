package pilecki.project;

import java.util.*;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class Zoo {

	private String name;
	private String adress;
	private Date dateOfBuild = new Date();

	List<Animals> listOfAnimal = new ArrayList<Animals>();

	public Zoo(String name, String adress, Date dateOfBuild) {
		this.name = name;
		this.adress = adress;
		this.dateOfBuild = dateOfBuild;
		this.listOfAnimal = new ArrayList<Animals>();
	}

	@Size(min = 1)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Size(min = 1)
	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}	

	public List<Animals> getListOfAnimal() {
		return getListOfAnimal();
	}

	public void setListOfAnimal(List<Animals> listOfAnimal) {
		this.listOfAnimal = listOfAnimal;
	}

	@Past
	public Date getDateOfBuild() {
		return dateOfBuild;
	}

	public void setDateOfBuild(Date dateOfBuild) {
		this.dateOfBuild = dateOfBuild;
	}	



}
