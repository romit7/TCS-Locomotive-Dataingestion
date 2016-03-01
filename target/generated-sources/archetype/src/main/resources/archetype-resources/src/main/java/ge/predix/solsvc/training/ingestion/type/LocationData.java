#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package}.ge.predix.solsvc.training.ingestion.type;

import javax.annotation.Generated;
import ${package}.google.gson.annotations.Expose;
import ${package}.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class LocationData {

    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("name")
    @Expose
    private String name;
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

 

}
