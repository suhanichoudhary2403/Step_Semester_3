import java.util.Scanner;
class Character {
    private final int maxHealth;
    private int health;
    public Character(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }
    public void takeDamage(int amount) {
        health = health - amount;
        if (health < 0) {
            health = 0;
        }
        System.out.println("health = " + health);
    }
    public void heal(int amount) {
        health = health + amount;
        if (health > maxHealth) {
            health = maxHealth;
        }
        System.out.println("health = " + health);
    }
    public int getHealth() {
        return health;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character Max Health: ");
        int maxH = sc.nextInt();
        Character c = new Character(maxH);
        System.out.print("Enter damage amount: ");
        int dmg = sc.nextInt();
        c.takeDamage(dmg);
        System.out.print("Enter healing amount: ");
        int hl = sc.nextInt();
        c.heal(hl);
        System.out.print("Enter massive damage amount: ");
        int bigDmg = sc.nextInt();
        c.takeDamage(bigDmg);
        sc.close();
    }
}
