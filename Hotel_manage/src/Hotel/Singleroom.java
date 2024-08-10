package Hotel;
import java.util.ArrayList ;
import java.io.Serializable ;
public class Singleroom implements Serializable {

    String name;
    String contact;
    String gender ;
    ArrayList <Food> food = new ArrayList<>() ;

    Singleroom()
    {
        this.name = "" ;
        this.contact = "" ;
        this.gender = "" ;
    }

    Singleroom(String name, String contact, String gender)
    {
        this.name = name ;
        this.contact = contact ;
        this.gender = gender ;
    }

    public String getName() {
        return name;
    }
    public String getContact() {
        return contact;
    }
    public String getGender() {
        return gender;
    }

}
