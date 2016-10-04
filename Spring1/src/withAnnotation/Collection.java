package withAnnotation;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service("serviceId")
public class Collection {
//	public tanýmlatýklarýmýzý inject ediyoruz.
	@Resource(name = "list")
	private List<Object> myList;
	@Resource(name = "map")
	private Map<String, Object> myMap;

	public List<Object> getMyList() {
		return myList;
	}

	public void setMyList(List<Object> myList) {
		this.myList = myList;
	}

	public Map<String, Object> getMyMap() {
		return myMap;
	}

	public void setMyMap(Map<String, Object> myMap) {
		this.myMap = myMap;
	}

	@Override
	public String toString() {
		return "Collection [myList=" + myList + ", myMap=" + myMap + "]";
	}

}
