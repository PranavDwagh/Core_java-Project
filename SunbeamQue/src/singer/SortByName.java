package singer;

import java.util.Comparator;

public class SortByName implements Comparator<Singer>{

	@Override
	public int compare(Singer o1, Singer o2) {

		return o1.getName() .compareTo(o2.getName());
	}

}
