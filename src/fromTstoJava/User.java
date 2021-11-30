package fromTstoJava;

import java.util.Date;
import java.util.List;

public class User {
	
	private Date birthDate;
	private int size;
	private List<Photo> photos;
	private List<Adresse> adress;
	
	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public List<Photo> getPhotos() {
		return photos;
	}
	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}
	public List<Adresse> getAdress() {
		return adress;
	}
	public void setAdress(List<Adresse> adress) {
		this.adress = adress;
	}
	
}
