package com.capella;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ramesh on 18/05/2016.
 */
public class TemplateAggregationStrategy implements AggregationStrategy {
    private Map<String, InputStream> inputStreams = new HashMap<>();
    private int fileCount = 1;

    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        InputStream newBody = newExchange.getIn().getBody(InputStream.class);
        inputStreams.put(newExchange.getIn().getHeader("CamelFileName").toString(), newBody);
        newExchange.setProperty("inputStreams", inputStreams);
        return newExchange;
    }


}
