package org.mule.modules.eloquadatatransfer;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.modules.eloquadatatransfer.config.ConnectorConfig;

@Connector(name="eloqua-data-transfer", friendlyName="Eloqua Data Transfer", minMuleVersion = "3.7")
public class EloquaDataTransferConnector {

    @Config
    ConnectorConfig config;

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}