import java.util.*;

public class ButtonConfiguration{

   private static ArrayList<String> buttonOrder = new ArrayList<>();

   private ButtonConfiguration(){
      this.buttonOrder.clear();
   }
   
   public ButtonConfiguration(String[] order){
      this.buttonOrder.addAll(Arrays.asList(order));
   }
   
   public void setButtonOrder(String[] order){
      this.buttonOrder.addAll(Arrays.asList(order));
   }
   
   public void printOutButtonConfig(){
         System.out.println(buttonOrder);
   }
   
   public static void main(String[] args){
      ButtonConfiguration buttonConfiguration = new ButtonConfiguration();
      String[] order = new String[]{"Left-Trigger", "Left-Bumper", "Right-Trigger", "Right-Bumper", "Left-Stick", "Right-Stick", "D-Pad", "A-Button", "B-Button", "Y-Button", "X-Button"};   
      buttonConfiguration.printOutButtonConfig();
      buttonConfiguration.setButtonOrder(order);
      buttonConfiguration.printOutButtonConfig();
      buttonOrder.add("SouthPaw-Configuration");
      buttonConfiguration.printOutButtonConfig();
      buttonOrder.clear();
      buttonConfiguration.printOutButtonConfig();
   }
}