package com.marlette.nafis.StreamTest.stream;

import com.amazonaws.auth.EnvironmentVariableCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.kinesis.AmazonKinesis;
import com.amazonaws.services.kinesis.AmazonKinesisClient;
import com.amazonaws.services.kinesis.AmazonKinesisClientBuilder;
import com.marlette.nafis.StreamTest.model.StreamEvent;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class Connector {

    private final Log logger = LogFactory.getLog(getClass());
    private AmazonKinesis kinesis;

    Connector(){
        AmazonKinesis kinesis= AmazonKinesisClientBuilder.standard()
                .withRegion(Regions.US_EAST_1)
                .withCredentials(new EnvironmentVariableCredentialsProvider())
                .build();
    }

    public void processGetEvent(){

    }

    public void processCreateEvent(StreamEvent streamEvent){

    }
}
