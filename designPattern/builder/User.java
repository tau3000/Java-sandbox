package builder;

import lombok.Getter;

public class User {
    @Getter private String name;
    @Getter private Integer age;
    @Getter private String title;

    static class Builder {
        private String name;
        private Integer age;
        private String title;

        public Builder(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.title = builder.title;
    }

    @Override
    public String toString() {
        return "name:\t" + name + "\nage:\t" + age + "\ntitle:\t" + title;
    }
}
