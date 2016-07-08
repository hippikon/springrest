package digital.places.woot;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Member {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
