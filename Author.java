public class Author
{
    private String name;
    private String Bday;

    public Author(String name, String Bday){
        this.name = name;
        this.Bday = Bday;
    }
    public String getName(){
        return this.name; 
    }
    public String getBday(){
        return this.Bday; 
    }
}