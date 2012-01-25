package pilecki.web;

import java.io.Serializable;
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
@Named("customerBean")
public class ZooFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	Zoo zoo = new Zoo(null, null, null);

	ListDataModel<Zoo>  zoo1 = new ListDataModel<Zoo>();

	@Inject
	ZooManager zooManager = new ZooManager();

	public Zoo getZoo() {
		return zoo;
	}

	public void setZoo(Zoo zoo) {
		this.zoo = zoo;
	}

	public String addZoo() {
		zooManager.addZoo(zoo);
		return "showZoo";
	}

	public ListDataModel<Zoo> getAllZoo() {
		zoo1.setWrappedData(zooManager.getAllZoo());
		return zoo1;
	}


	public void deleteZoo() {
		Zoo zooToDelete = zoo1.getRowData();
		zooManager.deleteZoo(zooManager.searchZoobyAdress(zooToDelete.getAdress()));
	}



}