#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package}.ge.predix.solsvc.training.ingestion.type;

import javax.annotation.Generated;
import ${package}.google.gson.annotations.Expose;
import ${package}.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class TorqueData {

    @SerializedName("torque")
    @Expose
    private Double torque;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * 
     * @return
     *     The Engine Torque
     */
    public Double getTorque() {
        return torque;
    }

    /**
     * 
     * @param torque
     *     The torque
     */
    public void setTorque(Double torque) {
        this.torque = torque;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

}
