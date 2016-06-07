// Uou also don’t need to prefix member variables with m_ anymore. Your classes and func- tions should be small enough that you don’t need them. And you should be using an edit- ing environment that highlights or colorizes members to make them distinct.

// Bad Code
public class Part {
    private String m_dsc; //The textrual decription
    void setName(String name) {
        m_dsc = name;
    }
}

// Good Code
public class Part {
    String description;
    void setDescription (String description) {
        this.description = description;
    }
}
