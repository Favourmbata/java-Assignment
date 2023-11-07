package OOPpackage.pizzaRecommendingApp;

public class PizzaRecommendingApp {

    private  int hungryPeople =  2;
    private int  superHungryPeople = 4;
    private  int classicPeople = 1;

    public Pizza mediumPizzaBox(){
        Pizza pizza = new Pizza();
        pizza.setPizzaSlizes(6);
        pizza.setPizzaSizePrice(3000);
        pizza.setPizzaSize("medium");
        return pizza;
    }

    public Pizza largePizzaBox(){
        Pizza pizza = new Pizza();
        pizza.setPizzaSize("large");
        pizza.setPizzaSlizes(10);
        pizza.setPizzaSizePrice(5000);
        return pizza;
    }
    private PizzaPrediction prediction(){
        return new PizzaPrediction();
    }

    public Pizza smallPizzaBox(){
        Pizza pizza = new Pizza();
        pizza.setPizzaSize("small");
        pizza.setPizzaSlizes(2);
        pizza.setPizzaSizePrice(1200);
        return pizza;
    }
    public  PizzaPrediction hungryPeoplePizzaBoxCalculator(int numberOfHungryPeople){
        PizzaPrediction prediction = prediction();

        if (numberOfHungryPeople % mediumPizzaBox().getPizzaSlizes() == 0) {
            prediction.setNumberOfBoxesToGet(numberOfHungryPeople / mediumPizzaBox().getPizzaSlizes ());
        }
        prediction.setNumberOfBoxesToGet(numberOfHungryPeople / mediumPizzaBox().getPizzaSlizes()+1);

        prediction.setNumberOfSlizesRemaining( mediumPizzaBox().getPizzaSlizes() - prediction.getNumberOfBoxesToGet() );

        prediction.setTotalPrice((long) mediumPizzaBox().getPizzaSizePrice() * prediction.getNumberOfBoxesToGet());
        return prediction;
  }
     public PizzaPrediction superHungryPeopleBoxCalculator(int numberOfSuperHungry){
        PizzaPrediction prediction = prediction();
        if (numberOfSuperHungry % largePizzaBox().getPizzaSlizes() == 0){
            prediction.setNumberOfBoxesToGet(numberOfSuperHungry / largePizzaBox().getPizzaSlizes() + 1);
            prediction.setNumberOfSlizesRemaining(largePizzaBox().getPizzaSlizes() * prediction.getNumberOfBoxesToGet());
            prediction.setTotalPrice((long)largePizzaBox().getPizzaSlizes() - prediction.getNumberOfBoxesToGet());
            prediction.setAmountOfPizza(largePizzaBox().getPizzaSlizes()+ prediction.getNumberOfBoxesToGet());
        }
        return prediction;
     }

        public String classicPeopleBoxCalculator(int numberOfClassic){
            PizzaPrediction prediction = prediction();
            if (numberOfClassic % smallPizzaBox().getPizzaSlizes() == 0){
                prediction.setNumberOfBoxesToGet(numberOfClassic / 2 );
                prediction.setNumberOfSlizesRemaining(smallPizzaBox().getPizzaSlizes() / prediction.getNumberOfBoxesToGet());
                prediction.setTotalPrice((long)smallPizzaBox().getPizzaSlizes() *  prediction.getAmountOfPizza());

            }


            return "\uD83E\uDD14\uD83E\uDD14\uD83E\uDD14\uD83E\uDD14\uD83E\uDD14\uD83E\uDD14 for "+ numberOfClassic+" classic people \n " +
                    "you'll have to get "+prediction.getNumberOfBoxesToGet()+" and "
                +(prediction.getNumberOfSlizesRemaining() == 0 ?
                "and that will do the trick"+ "\uD83E\uDD73\uD83E\uDD73\uD83E\uDD73\uD83E\uDD73 and the total will cost will be "+prediction.getTotalPrice(): " and you'll be having the" +
            " "+prediction.getNumberOfSlizesRemaining()+"" +
                    " remaining piece left, to enjoy yourself, \n" +
                    "\uD83E\uDD73\uD83E\uDD73\uD83E\uDD73\uD83E\uDD73 and the total cost of pizza box will be " + prediction.getAmountOfPizza());
        }

        }

