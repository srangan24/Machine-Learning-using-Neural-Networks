package functions;

public class HyperbolicTangent implements ActivationImplementation {

	@Override
	public float activate(double value) {
		// TODO Auto-generated method stub
		// formula for hyperbolic tangent graph
		return (float) ((1-Math.exp((-2)*value))/(1+Math.exp(2*value)));
	}

}
