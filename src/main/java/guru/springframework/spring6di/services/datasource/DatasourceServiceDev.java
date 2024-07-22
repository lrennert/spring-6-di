package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("datasourceService")
public class DatasourceServiceDev implements DatasourceService {
    @Override
    public String getDatasource() {
        return "dev";
    }
}
