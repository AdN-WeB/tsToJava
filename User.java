import java.util.Date;

import Adresse.Adresse;
import Photo.Photo;

public class User {
    private Date birthdate;
    private Number size;
    private Photo photos;
    private Adresse adress;

    public Date getDate() {
        return birthdate;
    }

    public void setDate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Number getSize() {
        return size;
    }

    public void setSize(Number size) {
        this.size = size;
    }

    public Photo gePhotos() {
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
