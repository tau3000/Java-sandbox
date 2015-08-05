public class EffectiveJavaBuilder{
    public static void main(String[] args) {
        new People.Builder("Tom", 12).likeFood("Hamburger").hobby("BaseBall").build().call();
    }
}
// PeopleのBuilderはstaticなので、そのまま呼び出し可。
// あとはBuilder自身を返すメソッドをいれて、build()のreturnでPeopleをnewする。
// はじめにnewをいれていないと、call()を呼び出せない。
// Builder("Tom", 12)の引数以外をオプションにするのが慣例。

class People {
    private String name;
    private Integer age;
    private String hobby;
    private String food;

    static class Builder {
        private String name;
        private Integer age;
        private String hobby;
        private String food;

        Builder(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        Builder hobby(String hobby) {
            this.hobby = hobby;
            return this;
        }

        Builder likeFood(String food) {
            this.food = food;
            return this;
        }

        People build() {
            if (name == null || age == null) {
                throw new NullPointerException();
            }
            return new People(this);
        }
    }

    private People(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.hobby = builder.hobby;
        this.food = builder.food;
    }

    void call() {
        System.out.println("String:" + name);
        System.out.println("Integer:" +  age);
        System.out.println("String:" + hobby);
        System.out.println("String:" + food);
    }
}