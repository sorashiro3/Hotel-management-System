package Hotel;

public class Doubleroom extends Singleroom {

    String name2;
    String contact2;
    String gender2;

    Doubleroom()
    {
        this.name = "" ;
        this.name2 = "" ;
        this.contact = "" ;
        this.contact2 = "" ;
        this.gender = "" ;
        this.gender2 = "" ;
    }
    Doubleroom(String name,String contact,String gender,String name2,String contact2,String gender2)
    {
        this.name=name;
        this.contact=contact;
        this.gender=gender;
        this.name2=name2;
        this.contact2=contact2;
        this.gender2=gender2;
    }

    public String getName2() { return name2; }
    public String getContact2() {
        return contact2;
    }
    public String getGender2() { return gender2; }

}

