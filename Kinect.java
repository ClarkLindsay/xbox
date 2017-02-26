public class Kinect{

   private Camera camera = new Camera();
   private Microphone microphone = new Microphone();
   
   private Kinect(){
      this.camera = null;
      this.microphone = null;
   }
   
   public Kinect(Camera camera, Microphone microphone){
      this.camera = camera;
      this.microphone = microphone;
   }

   public void setCamera(Camera camera){
      this.camera = camera; 
   }

   public Camera getCamera(){
      return this.camera;
   }

   public void setMicrophone(Microphone microphone){
      this.microphone = microphone;
   }

   public Microphone getMicrophone(){
      return this.microphone;
   }
}