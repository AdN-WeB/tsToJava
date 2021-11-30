package fromTstoJava;

import java.util.Date;

public class Adresse {
	private Date birthdate;
    private int size;
    private Photo photos;
    private Adresse adress;
    
    
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Photo getPhotos() {
		return photos;
	}
	public void setPhotos(Photo photos) {
		this.photos = photos;
	}
	public Adresse getAdress() {
		return adress;
	}
	public void setAdress(Adresse adress) {
		this.adress = adress;
	}
}
