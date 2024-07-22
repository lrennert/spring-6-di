package guru.springframework.spring6di.controllers.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

//@ActiveProfiles({"EN", "prod"})
@SpringBootTest
class DatasourceControllerTest {

    @Autowired
    DatasourceController datasourceController;

    @Test
    void getDatasource() {
        System.out.println("Data source = " + datasourceController.getDatasource());
    }
}