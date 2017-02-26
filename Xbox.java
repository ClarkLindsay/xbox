class Xbox{

   private Controller controller = new Controller(null, null);
   private Kinect kinect = new Kinect(null, null);
   
   private Xbox(){
      this.controller = null;
      this.kinect = null;
   }
   
   public Xbox(Controller controller, Kinect kinect){
      this.controller = controller;
      this.kinect = kinect;
   }
   
   public void setController(Controller controller){
      this.controller = controller;
   }
   
   public Controller getController(){
      return this.controller;
   }
   
   public void setKinect(Kinect kinect){
      this.kinect = kinect;
   }
   
   public Kinect getKinect(){
      return this.kinect;
   }
}