class People {
    private String name;
    private Integer age;
    private String hobby;

    Peple(String name, Integer age, String hobby) {
        if (name == null || age == null) {
            throw new NullPointerException();
        }
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // getter,setter...
    String hello() {
        //...
    }
}
