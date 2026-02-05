package bollocks;

import java.util.ArrayList;

public class testingArrays {

	public static void main(String[] args) {
		String [] testArray = new String[5];
        testArray[0] = "Derek";
        testArray[1] = "Kofi";
        testArray[2] = "Jonah";
        testArray[3] = "Jackson";
        testArray[4] = "Xan";

        ArrayList<String> nameList = new ArrayList<String>();
        for (String name : testArray) {
            nameList.add(name);
        }

        for (String name : nameList) {
            System.out.println(name);
        }
	}
}

