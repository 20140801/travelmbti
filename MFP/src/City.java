public class City {
	String cityname;
	String nation;
	float activity;
	float budget;
	float weather;
	float cultural;
	float score;
	int index;
	City(int index,String cityname,float activity,float budget,
			float weather,float cultural, String nation,float score){
		this.index=index;
		this.cityname=cityname;
		this.activity=activity;
		this.budget=budget;
		this.weather=weather;
		this.cultural=cultural;
		this.nation=nation;
		this.score=score;
	}
}
