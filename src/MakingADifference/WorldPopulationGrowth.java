package MakingADifference;

import java.util.Scanner;

public class WorldPopulationGrowth {
        public double calculateGrowthRate(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter current world population  -> ");
        long currentWorldPopulation = input.nextLong();

        System.out.println("Enter the previous popluatlion -> ");
        long previousPopulation = input.nextLong();


        double populationDifference = currentWorldPopulation - previousPopulation;
        double growthRate = (populationDifference / previousPopulation) * 100;
        return growthRate;
    }

      public double calculateNewPopulation(double growthRate,double oldPopulation){
            double populationIncrease = (growthRate  / 100) * (oldPopulation);
            double newPopulation = oldPopulation + populationIncrease;
            return newPopulation;
      }


      public static void main(String[] args) {
    WorldPopulationGrowth worldPopulationGrowth = new WorldPopulationGrowth();

    double population1 = worldPopulationGrowth.calculateNewPopulation(30, 1000);
    double population2 = worldPopulationGrowth.calculateNewPopulation(30, population1);
    double population3 = worldPopulationGrowth.calculateNewPopulation(30,population2);
    double population4 = worldPopulationGrowth.calculateNewPopulation(30,population3);
    double population5 = worldPopulationGrowth.calculateNewPopulation(30,population4);

          System.out.println("The population after year one " +population1);
          System.out.println("The population after year two " + population2);
          System.out.println("The population after year three " + population3);
          System.out.println("The population after year four " + population4);
          System.out.println("The population after year five " + population5);



}

}
