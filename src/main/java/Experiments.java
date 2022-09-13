public class Experiments {

    int rabbit = 0;
    int rat = 0;
    int frog = 0;
    int animals = 0;

    Experiments(){
    }

    void calculateCobaias(int amount, String type){
        switch (type) {
            case "C":
                this.rabbit += amount;
                break;
            case "R":
                this.rat += amount;
                break;
            case "S":
                this.frog += amount;
                break;
        }
        this.animals += amount;
    }

    double calculatePercentage(int amount, int cobaias){
        return (amount * 100) / (double) cobaias;
    }

    void output(){
        System.out.println("Total: " + this.animals +" cobaias");
        System.out.println("Total de coelhos: " + this.rabbit);
        System.out.println("Total de ratos: " + this.rat);
        System.out.println("Total de sapos: " + this.frog);
        System.out.println("Percentual de coelhos: " + this.calculatePercentage(this.rabbit, this.animals) + " %");
        System.out.println("Percentual de ratos: " + this.calculatePercentage(this.rat, this.animals) + " %");
        System.out.print("Percentual de sapos: " + this.calculatePercentage(this.frog, this.animals) + " %");
    }
}
