package com.gvt.ruleengine;

import com.gvt.ruleengine.drool.FpmlMessage;
import com.gvt.ruleengine.drool.Server;
import com.gvt.ruleengine.drool.Validation;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.definition.KiePackage;
import org.kie.api.definition.rule.Rule;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

/**
 * http://www.mastertheboss.com/jboss-jbpm/drools/drools-and-maven-example-project
 * https://docs.jboss.org/drools/release/5.2.0.CR1/droolsjbpm-introduction-docs/html_single/
 */

public class DroolEngine
{
    static final Logger LOGGER = LoggerFactory.getLogger(DroolEngine.class);

    public static void main(String[] args)
    {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kContainer = kieServices.getKieClasspathContainer();
        LOGGER.info("Creating kieBase");
        KieBase kieBase = kContainer.getKieBase();
        LOGGER.info("There should be rules: ");
        for ( KiePackage kp : kieBase.getKiePackages() )
        {
            for (Rule rule : kp.getRules())
            {
                LOGGER.info("[ KP : " + kp + " | Rule : " + rule.getName()+" ]");
            }
        }
        LOGGER.info("Creating kieSession");
        KieSession session = kieBase.newKieSession();
        session.insert(new Validation(new FpmlMessage("nonpublicExecutionReport","Credit","Event.New","")));
        session.insert(new Validation(new FpmlMessage("nonpublicExecutionReport","Credit","Event","")));
        session.fireAllRules();

    }
}
