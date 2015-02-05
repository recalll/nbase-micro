import java.util.ArrayList;
import java.util.HashMap;


public class Main {
	public static void main(String[] args) {

		String query_inp = "I want to walk my dog";
		int cnt = 0, i = 0;
		ArrayList<String> query_list = new ArrayList<String>();
		ArrayList<String> stop_list = new ArrayList<String>();
		ArrayList<String> auxillary_list = new ArrayList<String>();


		//Filling sample stop words in stop list
		stop_list.add("and");
		stop_list.add("or");
		stop_list.add("at");
		stop_list.add("the");

		//Filling sample auxillary words
		auxillary_list.add("data scientist");
		auxillary_list.add("scientist");
		auxillary_list.add("engineer");
		auxillary_list.add("vehicle");


		String[] arr = query_inp.split(" ");    

		for ( String ss : arr) {

			query_list.add(ss);
			cnt++;
		}

		ArrayList<Integer> type_list = new ArrayList<Integer>(cnt);

		int window_size = cnt;
		StringBuilder grp_str = new StringBuilder();
		while (window_size != 0) {
			while(i+ window_size <= cnt) {
				for (int j = 0; j < window_size; j++) {
					grp_str.append(query_list.get(i+j)+" ");
				}
				System.out.println(grp_str);// we will call nbase api
				i++;
				grp_str.delete(0, grp_str.length());
			}
			i = 0;
			window_size--;
		}



		//Solve queries
		//person name parvinder 
		//person name prashana
		//engineers in iincore
		//person with degree MS
		//article of parvinder 
	}

	private HashMap<String, Type> search(String keyword) {
		HashMap<String, Type> nbase = this.nbase();
		HashMap<String, Type> auxL = new HashMap<String, Type>();
		HashMap<String, Type> keyList = new HashMap<String, Type>();
		//Check keyword for auxl
		
		//based on keyword perform search
		//person 
		
		
		
		return nbase;
	}
	
	private boolean isAux(HashMap<String, Type> auxL, String keyword){
		for(Type t : auxL.values()){
			if(t.getType().equals("type") || t.checkForProperty(keyword)){
				return true;
			}
		}
		return false;
	}

	private HashMap<String, Type> nbase(){
		//Create Type with properties
		HashMap<String, String> props1 = new HashMap<String, String>();
		props1.put("name", "Person");
		props1.put("type", "type");
		props1.put("value_for_properties", "type");
		Type person = new Type("Person", Type.types.TYPE.toString(), props1);

		/*HashMap<String, HashMap<String, String>> aux_words = new HashMap<String, HashMap<String, String>>();
				if (props1.get("type").equals("type")) {
					aux_words.put(props1.get("name"), props1);
				}*/

		HashMap<String, HashMap<String, String>> keyword_map = new HashMap<String, HashMap<String, String>>();
		HashMap<String, String> props_1 = new HashMap<String, String>();
		props_1.put("name", "Article");
		props_1.put("type", "type");
		props_1.put("value_for_properties", "type");
		Type article = new Type("Article", Type.types.TYPE.toString(), props_1);



		HashMap<String, String> propsA = new HashMap<String, String>();
		propsA.put("name", "Parvinder singh");
		propsA.put("type", "Article");
		propsA.put("description", "This is article about parvinder singh");
		propsA.put("website", "wikipedia");//reference to object

		Type parvinderA = new Type("Parvinder Singh", "Article", propsA);

		HashMap<String, String> props = new HashMap<String, String>();
		props.put("name", "Parvinder singh");
		props.put("type", "Person");
		props.put("age", "25");
		props.put("education", "ps_edu");//reference to object
		props.put("work experience", "ps_wx");//reference

		Type parvinder = new Type("Parvinder Singh", "Person", props);

		HashMap<String, String> props2 = new HashMap<String, String>();
		props2.put("name", "ps_edu");
		props2.put("type", "education");
		props2.put("school", "GJ University");
		props2.put("degree", "MCA");//reference to object
		props2.put("year", "2010");//reference

		Type psedu = new Type("ps_edu", "education", props2);

		HashMap<String, String> props3 = new HashMap<String, String>();
		props3.put("name", "ps_wx");
		props3.put("type", "work experience");
		props3.put("company", "IINCORE");
		props3.put("post", "Software Engineer");//reference to object

		Type pswx = new Type("ps_wx", "work experience", props3);

		HashMap<String, String> props4 = new HashMap<String, String>();
		props4.put("name", "Pratik Sharma");
		props4.put("type", "Person");
		props4.put("age", "27");
		props4.put("education", "pts_edu");//reference to object
		props4.put("work experience", "pts_wx");//reference

		Type pratik = new Type("Pratik Sharma", "Person", props4);

		HashMap<String, String> props5 = new HashMap<String, String>();
		props5.put("name", "pts_edu");
		props5.put("type", "education");
		props5.put("school", "Cornell University");
		props5.put("degree", "MS");//reference to object
		props5.put("year", "2012");//reference

		Type ptsedu = new Type("pts_edu", "education", props5);

		HashMap<String, String> props6 = new HashMap<String, String>();
		props6.put("name", "pts_wx");
		props6.put("type", "work experience");
		props6.put("company", "IINCORE");
		props6.put("post", "Software Engineer");//reference to object

		Type ptswx = new Type("pts_wx", "work experience", props6);

		HashMap<String, Type> typeList = new HashMap<String, Type>();
		typeList.put(person.getName(), person);
		typeList.put(parvinder.getName(), parvinder);
		typeList.put(pratik.getName(), pratik);
		typeList.put(psedu.getName(), psedu);
		typeList.put(pswx.getName(), pswx);
		typeList.put(ptsedu.getName(), ptsedu);
		typeList.put(ptswx.getName(), ptswx);
		typeList.put(article.getName(), article);
		typeList.put(parvinderA.getName(), parvinderA);		

		return typeList;
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}