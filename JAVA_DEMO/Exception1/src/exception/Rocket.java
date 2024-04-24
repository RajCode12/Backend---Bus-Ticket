package exception;

public class Rocket {
	public static void main(String[] args) {
		RocketLaunch r = null;
		try {
			r = new RocketLaunch();
			System.out.println("Rocket Ignite Successfully...");
		} catch(IgnitionException e) {
			e.printStackTrace();
		}
		if(r != null) {
			while(true) {
				try {
					r.launch();
				} catch(GravityException e) {
					e.printStackTrace();
				}
				if(r.dist >= 10000) {
					System.out.println("Mission Completed...");
					break;
				}
			}
		}
	}
}
class RocketLaunch {
	int dist = 1000;
	RocketLaunch() throws IgnitionException {
		Double d = Math.random();
		if(d <= 0.5) {
			throw new IgnitionException("Rocket Not Launch Successfully...");
		}
	}
	void launch() {
		for(int i = dist; i <= 10000; i+=1000) {
			double random = Math.random();
			if(random <= 0.5) {
				throw new GravityException("Gravity Not Found...");
			}
			System.out.println("Distance Travelled : " + dist);
			dist += 1000;
		}
	}
}
