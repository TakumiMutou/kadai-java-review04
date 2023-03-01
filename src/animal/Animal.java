package animal;

public class Animal {
    //名前、年齢
    private String name;
    private int age;
    //コンストラクタ
    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age =age;
    }
    //sayメソッド
    public void say() {
        System.out.println(this.name + "です。" + this.age + "歳です。");
    }

    //ゲッターセッター
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }



}
