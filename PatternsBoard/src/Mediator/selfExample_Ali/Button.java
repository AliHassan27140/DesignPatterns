package Mediator.selfExample_Ali;

public class Button {
    private Mediator mediator;

    public Button(Mediator mediator) {
    	this.mediator = mediator;
	}
    
    public void press() {
        //Instead of sending request directly to TV or Display object, i am 
        //sending request to the mediator
        //this helps us to not bound a button to TV only, we
        //may also have air conditioning or any thing else
        mediator.press();
    }
}
