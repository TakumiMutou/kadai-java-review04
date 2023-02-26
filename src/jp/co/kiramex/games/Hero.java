package jp.co.kiramex.games;

public class Hero extends Character {
    private int weapon; //武器の強さ

    //getter
    public int getWeapon() {
        return weapon;
    }
    //setter
    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    //引数なしのコンストラクタ
    public Hero() {
    }

    //引数ありのコンストラクタ
    public Hero(String name, int hp, int offense, int defense, int weapon) {
        super(name, hp, offense, defense); //スーパークラス（Character）のコンストラクタを呼び出し
        this.weapon = weapon;
    }

}
