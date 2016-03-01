#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ge.predix.solsvc.training.ingestion.handler;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import ${package}.ge.predix.solsvc.bootstrap.ams.${package}mon.AssetRestConfig;
import ${package}.ge.predix.solsvc.bootstrap.tsb.client.TimeseriesRestConfig;
import ${package}.ge.predix.solsvc.restclient.config.IOauthRestConfig;
import ${package}.ge.predix.solsvc.restclient.impl.CxfAwareRestClient;


/**
 * 
 * @author 212421693
 *
 */
public abstract class BaseFactoryIT {
	@SuppressWarnings("unused")
    private static Logger log = Logger.getLogger(BaseFactoryIT.class);
	// private static final Map<String, String> tenantUserMap = ImmutableMap.of(
	// "411", "demo:Demo,135", "777", "777_user:777_user", "511",
	// "511_user:511_user");

    /**
     * 
     */
    @Autowired
    protected IOauthRestConfig restConfig;

	
	/**
	 * 
	 */
	@Value("${symbol_dollar}{predix.restHost:localhost}")
	protected String restHost;
	/**
	 * 
	 */
	@Value("${symbol_dollar}{predix.restPort:9093}")
	protected String restPort;
	/**
	 * 
	 */
	@Value("${symbol_dollar}{predix.restBaseResource:service}")
	protected String restBaseResource;
	
	
	/**
	 * 
	 */
	@Value("${symbol_dollar}{predix.timeseries.retry.count}")
	protected int retryCount;
	
	/**
	 * 
	 */
	@Autowired
	protected CxfAwareRestClient restClient;

	/**
	 * 
	 */
	@Autowired
	protected AssetRestConfig assetRestConfig;

	/**
	 * 
	 */
	@Autowired
	protected TimeseriesRestConfig timeSeriesRestConfig;
	
//	public String getAssetUrl() {
//		return predixAssetUrl;
//	}
	
	/**
	 * @return -
	 */
	protected String getPredixAssetUrl() {
		return this.assetRestConfig.getAssetUri();
	}

	

	/**
	 * @return -
	 */
	public CxfAwareRestClient getRestClient() {
		return this.restClient;
	}


	/**
	 * @param restClient -
	 */
	public void setRestClient(CxfAwareRestClient restClient) {
		this.restClient = restClient;
	}

    /**
     * @param tenantId -
     * @param controllerId -
     * @param data -
     * @param authorization -
     */
    public void handlesData(String tenantId, String controllerId, String data, String authorization)
    {
        //
    }

    /**
     * @param tenantId -
     * @param controllerId -
     * @param data -
     * @param authorization -
     */
    public void handleData(String tenantId, String controllerId, String data, String authorization)
    {
        // TODO Auto-generated method stub
        
    }

}
