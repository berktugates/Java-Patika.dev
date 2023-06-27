public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2,int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){
        if(checkWeight()){
            while(this.f1.health > 0 && this.f2.health > 0){
                System.out.println("---- NEW ROUND ----");
                this.f2.health = this.f1.hit(this.f2);
                printScore();
                if(isWin()){
                    break;
                }
                this.f1.health = this.f2.hit(this.f1);
                printScore();
                if(isWin()){
                    break;
                }
            }
        }
        else{
            System.out.println("Dövüşcülerin kilosu eşleşme için uygun değil!");
        }
    }

    boolean checkWeight(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    void printScore(){
        System.out.println(this.f1.name + " kalan canı: " + f1.health);
        System.out.println(this.f2.name + " kalan canı: " + f2.health);
    }

    boolean isWin(){
        if(this.f1.health<=0){
            System.out.println(this.f2.name + " müsabakayı kazandı!");
            return true;
        }
        else if(this.f2.health<=0){
            System.out.println(this.f1.name + " müsabakayı kazandı!");
            return true;
        }
        return false;
    }

}
