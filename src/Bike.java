public class Bike {

    private boolean powerMode;

    private int speed;

    private int gear;

    public Bike() {
        this.powerMode = false;
        this.speed = 0;
        this.gear = 1;
    }

    public void turnOnOrTurnOff() {
        if (this.powerMode == false) {
            this.powerMode = true;
        }
        else {
            this.powerMode = false;
        }
    }

    public void accelerate() {
        if (this.gear == 1) {
            this.speed = this.speed + 1;
        } else if (this.gear == 2) {
            this.speed = this.speed + 2;
        } else if (this.gear == 3) {
            this.speed = this.speed + 3;
        }
        else if (this.gear == 4) {
            this.speed = this.speed + 4;
        }

        if (this.speed >= 0 || this.speed <= 20) {
            this.gear = 1;
        }
        else if (this.speed >= 21 || this.speed <= 30) {
            this.gear = 2;
        }
        else if (this.speed >= 31 || this.speed <= 40) {
            this.gear = 3;
        }
        else if (this.speed >= 41) {
            this.gear = 4;
        }

    }

    public void decelerate() {
        if (this.speed == 0) {
            this.speed = 0;
        }
    else if(this.gear == 1){
        this.speed = this.speed - 1;
    }
   else if(this.gear == 2){
       this.speed = this.speed -2;
    }
     else if (this.gear == 3){
         this.speed = this.speed -3;
     }
    else if(this.gear == 4){
        this.speed = this.speed -4;
    }

        if (this.speed >= 0 || this.speed <= 20) {
            this.gear = 1;
        }
        else if (this.speed >= 21 || this.speed <= 30) {
            this.gear = 2;
        }
        else if (this.speed >= 31 || this.speed <= 40) {
            this.gear = 3;
        }
        else if (this.speed >= 41) {
            this.gear = 4;
        }

    }


}
