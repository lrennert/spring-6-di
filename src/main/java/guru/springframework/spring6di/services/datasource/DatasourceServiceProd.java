package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("datasourceService")
public class DatasourceServiceProd implements DatasourceService {
    @Override
    public String getDatasource() {
        return "prod";
    }
}
