public class Fighter {
    String name;
    int damage;
    int health;
    int weight;

    Fighter(String name, int damage, int health, int weight){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
    }

    int hit(Fighter fighter){
        System.out.println(this.name + " " + fighter.name + " 'a " + this.damage + " hasar yarattı.");
        if(fighter.health - this.damage < 0){
            return fighter.health=0;
        }
        return fighter.health - this.damage;
    }

    void fighterInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Weight: " + this.weight);
        System.out.println("Damage: " + this.damage);
        System.out.println("Health: " + this.health);
    }

}
