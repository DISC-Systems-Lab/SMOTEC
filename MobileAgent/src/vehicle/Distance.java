package vehicle;


import java.lang.Math;
import java.util.List;

public class Distance {

	public Distance() {
	
	}

	private static int coordX;
	private static int coordY;
	private static double first;
	private static double second;
	private static double distance;
	

	
	/**
	 * @param edgeAgents
	 * @param veh
	 * @param closEgAg
	 * @return the three most closest EdgeAgents (access points) to itself
	 */
	public static int closestEdgeAgents(List<EdgeNode> edgeAgents, Vehicle veh, int[] closEgAg) {

		double min = Integer.MAX_VALUE;
		double firstmin = min;
        double secmin = min;
        double thirdmin = min;
        
        double dis;
		for (int i =0; i<edgeAgents.size(); i++) {
			 dis = calDistance(edgeAgents.get(i).getCoord(), veh.getCoord());
			    
			 if (dis < Constants.AP_COVERAGE) {
            	if (dis < firstmin)
	            {
					thirdmin = secmin;
	                secmin = firstmin;
	                firstmin = dis;
	                closEgAg[2] = closEgAg[1];
	                closEgAg[1] = closEgAg[0];
	                closEgAg[0] = edgeAgents.get(i).getMyId();
	                
	            }
				

	            else if (dis < secmin)
	            {
	                thirdmin = secmin;
	                secmin = dis;
	                closEgAg[2] = closEgAg[1];
	                closEgAg[1] = edgeAgents.get(i).getMyId();
	                
	            }
				

	            else if (dis < thirdmin) {
	                thirdmin = dis;
					closEgAg[2] = edgeAgents.get(i).getMyId();
	            
	            }
	         }	
		}
		
       if(closEgAg[0] == -1)
			return 0;
		else if(closEgAg[1] == -1)
			return 1;
		else if(closEgAg[2] == -1)
			return 2;
		return 3;
	
	
	}

	
	/**
	 * @param firstCoord
	 * @param secondCoord
	 * @return the distance between two locations
	 */
	public static double calDistance(Mobility firstCoord, Mobility secondCoord) {
		setFirst((double) Math.pow(firstCoord.getCoordX() - secondCoord.getCoordX(), 2));
		setSecond((double) Math.pow(firstCoord.getCoordY() - secondCoord.getCoordY(), 2));
		setDistance(Math.sqrt(getFirst() + getSecond()));
		return getDistance();
	}

	public static int getCoordX() {
		return coordX;
	}

	public static void setCoordX(int coordX) {
		Distance.coordX = coordX;
	}

	public static int getCoordY() {
		return coordY;
	}

	public static void setCoordY(int coordY) {
		Distance.coordY = coordY;
	}

	public static double getFirst() {
		return first;
	}

	public static void setFirst(double first) {
		Distance.first = first;
	}

	public static double getSecond() {
		return second;
	}

	public static void setSecond(double second) {
		Distance.second = second;
	}

	public static double getDistance() {
		return distance;
	}

	public static void setDistance(double distance) {
		Distance.distance = distance;
	}

	

}
