package animal;

public class Human extends Animal implements Thinkable {
    //趣味
    private String hobby;
    //コンストラクタ
    public Human() {
    }

    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }
    //thinkメソッド
    @Override
    public void think() {
        System.out.println("私は" + this.hobby + "について考えています。");

    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

}
