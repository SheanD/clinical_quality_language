package org.cqframework.cql.cql2elm.model;

import org.cqframework.cql.cql2elm.ModelInfoProvider;
import org.hl7.elm_modelinfo.r1.ModelInfo;

import javax.xml.bind.JAXB;
import java.io.InputStream;

public class GentestModelInfoProvider implements ModelInfoProvider {
    @Override
    public ModelInfo load() {
        InputStream is = GentestModelInfoProvider.class.getResourceAsStream("/org/cqframework/cql/cql2elm/ModelTests/test-modelinfowithgenerics-happy.xml");
        return JAXB.unmarshal(is, ModelInfo.class);
    }
}
