package DailyProgram;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory;

public class testCollection {
	
void test(){
	
	//start of method
	ArrayList AL=new ArrayList();
	AL.add("ABC");
	AL.add("zyx");
	AL.add("2");
	AL.add("1");
	AL.add("saj");
	System.out.println(AL);
	Collections.sort(AL);
	System.out.println(AL);
}
public static void main(String []arg) {
	testCollection t=new testCollection();
	t.test();
}
	
}
