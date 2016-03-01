#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ge.predix.solsvc.training.ingestion.handler;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

import javax.activation.DataHandler;
import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ${package}.ge.predix.solsvc.bootstrap.ams.dto.Asset;
import ${package}.ge.predix.solsvc.bootstrap.ams.factories.AssetFactory;

/**
 * 
 * @author predix -
 */
@Component
public class DataIngestionHandler
{
    private static Logger          log = Logger.getLogger(DataHandler.class);
    @Autowired
    private AssetFactory           assetFactory;

    @Autowired
    private TimeSeriesDataIngestionHandler timeSeriesDataIngestionHandler;

    /**
     * 
     */
    @Autowired
    private AssetDataHandler     assetDataHandler;

    /**
     *  -
     */
    @SuppressWarnings("nls")
    @PostConstruct
    public void intilizeDataIngestionHandler()
    {
        log.info("*******************DataIngestionHandler Initialization ${package}plete*********************");
    }

    /**
     * @param tenantId -
     * @param controllerId -
     * @param data -
     * @param authorization -
     * @return -
     */
    @SuppressWarnings("nls")
    public String handleData(String tenantId, String controllerId, String data, String authorization)
    {
        this.timeSeriesDataIngestionHandler.handleData(tenantId, controllerId, data, authorization);
        return "SUCCESS";
    }

    /**
     * @return -
     */
    public String listAssets()
    {
        List<Asset> assets = this.assetDataHandler.getAllAssets();
        ObjectMapper mapper = new ObjectMapper();
        StringWriter writer = new StringWriter();
        try
        {
            mapper.writeValue(writer, assets);
        }
        catch (JsonGenerationException e)
        {
            throw new RuntimeException(e);
        }
        catch (JsonMappingException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        return writer.toString();
    }

    /**
     * @return -
     */
    @SuppressWarnings("nls")
    public String retrieveAsset(String tag)
    {
      return this.assetDataHandler.retrieveAsset(null, "cargox" , tag,null);
       
       
    }
}
