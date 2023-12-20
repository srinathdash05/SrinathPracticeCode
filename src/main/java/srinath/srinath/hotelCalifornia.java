package srinath.srinath;

import java.util.HashMap;

public class hotelCalifornia {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		HashMap<Integer, Boolean> guest = new HashMap<Integer, Boolean>();
		guest.put(1, false);
		guest.put(2, false);
		guest.put(3, true);
		for(Integer key: guest.keySet()) {
			if(guest.get(key)==false) {
				System.out.println("Room" + key + " availability :" +guest.get(key));
			}
		}
		
	}

}
