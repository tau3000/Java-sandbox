public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world.");
        Name name1 = Name.newInstanceForFullName("ueki yoshihiro");
        Name name2 = Name.newInstanceForLastNameAndFirstName("abc", "def");
        name1.say();
        name2.say();
    }
}

class Name {
    private final String value;

    private Name(String value){
        this.value = value;
    }

    public static Name newInstanceForFullName(String fullName){
        return new Name(fullName);
    }

    public static Name newInstanceForLastNameAndFirstName(String lastName, String firstName){
        return new Name(lastName + " " + firstName);
    }
    public void say(){
        System.out.println(value);
    }
}