package pilecki.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIForm;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.model.ListDataModel;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;

import pilecki.project.*;
import pilecki.services.*;




@SessionScoped
@Named("gameBean")
public class AnimalFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Animals animals = new Animals("test", KiOfAnim.Mammals , 0, 0);

	private ListDataModel<Animals> animal = new ListDataModel<Animals>();

	@Inject
	private AnimalManager animalManager;

	public Animals getAnimal() {
		return animals;
	}

	public void setAnimal(Animals animals) {
		this.animals = animals;
	}

	public String addAnimal() {
		animals.setKiOfAnim(KiOfAnim.valueOf(animals.getKiOfAnimString()));
		animalManager.addAnimal(animals);
		return "showAnimals";
	}

	public ListDataModel<Animals> getAllAnimals() {
		animal.setWrappedData(animalManager.getAllAnimal());
		return animal;
	}


	public void deleteAnimal() {
		Animals animalToDelete = animal.getRowData();
		animalManager.deleteAnimal(animalManager.searchAnimalByName(animalToDelete.getName()));
	}

	

}
