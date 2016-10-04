package ListWithXml;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {

	private List<Object> list;
	private Set<Object> set;
	private Map<String, Object> map;
	private List<Car> listCar;
	private Properties pro;
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	public Set<Object> getSet() {
		return set;
	}
	public void setSet(Set<Object> set) {
		this.set = set;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public List<Car> getListCar() {
		return listCar;
	}
	public void setListCar(List<Car> listCar) {
		this.listCar = listCar;
	}
	public Properties getPro() {
		return pro;
	}
	public void setPro(Properties pro) {
		this.pro = pro;
	}
	@Override
	public String toString() {
		return "Person [list=" + list + ", set=" + set + ", map=" + map + ", listCar=" + listCar
				+ ", pro=" + pro + "]";
	}
	
}
