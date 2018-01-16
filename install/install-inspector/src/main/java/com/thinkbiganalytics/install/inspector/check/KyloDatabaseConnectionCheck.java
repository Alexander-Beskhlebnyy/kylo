package com.thinkbiganalytics.install.inspector.check;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class KyloDatabaseConnectionCheck extends DisabledConfigCheck {

    private final Logger log = LoggerFactory.getLogger(KyloDatabaseConnectionCheck.class);

    @Override
    public String getName() {
        return "Kylo Database Connection Check";
    }

    @Override
    public String getDescription() {
        return "Checks whether Kylo can connect to its own database";
    }

}
