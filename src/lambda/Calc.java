package lambda;

//this annotation is just marker interface... 
//just notify this interface will use only rambda
//you can write only one method...
@FunctionalInterface
public interface Calc {
	
	public Double calc(Double v1, Double v2);

}
