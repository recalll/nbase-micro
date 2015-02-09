import java.util.HashMap;


public class Type {
	String name = "";
	String type = "";
	HashMap<String, Triple> properties = new HashMap<String, Triple>();
	
	public Type(String name, String type, HashMap<String, String> props){
		this.name = name;
		this.type = type;
		this.createTriples(props);
	}
	
	public void createTriples(HashMap<String, String> props){
		for(String key: props.keySet()){
			Triple t = new Triple(this.name, key, props.get(key));
			this.properties.put(this.name, t);
		}
	}
	
	public boolean checkForProperty(String k){
		for(Triple tl : this.properties.values()){
			if(tl._property.equals(k)){
				return true;
			}
		}
		return false;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public HashMap<String, Triple> getProperties() {
		return properties;
	}

	public void setProperties(HashMap<String, Triple> properties) {
		this.properties = properties;
	}

	public enum types{
		TYPE("type"), //if type is type den Aux
		PROPERTY("property"),//if type is property den Aux
		TOPIC("topic");//if type is topic den keyword

		private String type;
		private types(String name){
			this.type = name;
		}
		
		@Override
		public String toString(){
			return this.type;
		}		
	}
}
