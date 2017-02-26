public class Controller{

   private ButtonConfiguration buttonConfig = new ButtonConfiguration(null);
   private BatteryPack batteryPack = new BatteryPack();
   
   private Controller(){
      buttonConfig = null;
      batteryPack = null;
   }
   
   public Controller(ButtonConfiguration buttonConfig, BatteryPack batteryPack){
      this.buttonConfig = buttonConfig;
      this.batteryPack = batteryPack;
   }
   
   public void setButtonConfig(ButtonConfiguration buttonConfig){
      this.buttonConfig = buttonConfig;
   }
   
   public ButtonConfiguration getButtonConfig(){
      return this.buttonConfig;
   }
   
   public void setBatteryPack(BatteryPack batteryPack){
      this.batteryPack = batteryPack;
   }
   
   public BatteryPack getBatteryPack(){
      return this.batteryPack;
   }
}