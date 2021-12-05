package Mediator.selfExample_Ali;

public class Demo {
	//IN this example we are implementing video example of turn the tv on and off with one button
        //on remote control
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
                //After creating mediator object 
                //Link the mediator object with all other type of objects via the constructor paramerter
                //Now all the other type objects know mediator and mediator know other type objects.
		Tv tv = new Tv(mediator);
		Button remoteControlButton = new Button(mediator);
		Display display = new Display(mediator);
		
		mediator.setTv(tv);
		mediator.setPowerDisplay(display);
		
		System.out.println("TV.isOn(): " + tv.isOn());
		
		remoteControlButton.press();
		System.out.println("TV.isOn(): " + tv.isOn());
		
		remoteControlButton.press();
		System.out.println("TV.isOn(): " + tv.isOn());
	}

}
