package sg.edu.np.mad.madpractical;

public class User {
    String Name;
    String Description;
    Integer Id;
    Boolean Followed;

    public User(String name, String description, int id, boolean followed) {
        this.Name = name;
        this.Description = description;
        this.Id = id;
        this.Followed = followed;
    }
}
