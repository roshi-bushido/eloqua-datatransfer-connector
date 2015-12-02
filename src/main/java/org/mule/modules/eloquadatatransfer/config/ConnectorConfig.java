package org.mule.modules.eloquadatatransfer.config;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.components.WsdlProvider;
import org.mule.api.annotations.ws.WsdlServiceEndpoint;
import org.mule.api.annotations.ws.WsdlServiceRetriever;
import org.mule.devkit.api.ws.definition.DefaultServiceDefinition;
import org.mule.devkit.api.ws.definition.ServiceDefinition;
import org.mule.api.annotations.param.Default;

@WsdlProvider(friendlyName = "Configuration")
public class ConnectorConfig {

    @Configurable
    @Default("https://secure.p01.eloqua.com/API/1.2/DataTransferService.svc")
    private String endpoint;

    @WsdlServiceRetriever
    public ServiceDefinition getServiceDefinition() {
           return new DefaultServiceDefinition(
                "EloquaDataTransfer_EloquaDataTransferService",
                "DataTransferService.svc",
                "https://secure.eloqua.com/API/1.2/DataTransferService.svc?wsdl",
                "EloquaDataTransfer",
                "EloquaDataTransferService");
    }

    @WsdlServiceEndpoint
    public String getServiceEndpoint(ServiceDefinition definition) {
         return endpoint;
    }


    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

}