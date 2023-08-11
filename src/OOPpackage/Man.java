package OOPpackage;

public class Man extends Human{

   private String name;
   private String age;
   private HumanColour colour;

   public String getName() {
      return name;
   }


   public void setName(String name) {
      this.name = name;
   }

   public String getAge() {
      return age;
   }

   public void setAge(String age) {
      this.age = age;
   }

   public HumanColour getColour() {
      return colour;
   }

   public void setColour(HumanColour colour) {
      this.colour = colour;
   }
}
