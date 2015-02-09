
public class Triple {
	String _type = "";
	String _property = "";
	String _value = "";
	
	public Triple(String t, String p, String v){
		this._type = t;
		this._property = p;
		this._value = v;
	}

	public String get_type() {
		return _type;
	}

	public void set_type(String _type) {
		this._type = _type;
	}

	public String get_property() {
		return _property;
	}

	public void set_property(String _property) {
		this._property = _property;
	}

	public String get_value() {
		return _value;
	}

	public void set_value(String _value) {
		this._value = _value;
	}
	
	
	
}
