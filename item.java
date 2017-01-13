public class item{

    String name;
    String category;
    float price;

    public item(String nam, String cat, float pri){
        name = nam;
        category = cat;
        price = pri;

    }
    public void setname(String nam){
        name = nam;
    }

    public String getname(){
        return name;
    }
    public void setcategory(String cat){
        category = cat;
    }
    public String getcategory(){
        return category;
    }
    public void setprice(int pri){
        price = pri;
    }
    public float getprice(){
        return price;
    }
}
