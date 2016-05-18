package com.capella;

import org.apache.camel.Exchange;
import org.apache.camel.Predicate;

import java.io.InputStream;
import java.util.Map;

/**
 * Created by ramesh on 18/05/2016.
 */
public class TemplateAggregationPredicate implements Predicate {

    @Override
    public boolean matches(Exchange exchange) {
        Map<String, InputStream> inputStreams = (Map<String, InputStream>) exchange.getProperty("inputStreams");
        System.out.printf("size : " + inputStreams.size());
        return inputStreams.size() == 3;
    }
}
