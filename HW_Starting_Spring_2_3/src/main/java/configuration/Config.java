package configuration;

import models.Engine;
import models.Impl.CarHyundaiTucsonIml;
import models.Impl.Engine20MPIImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    @Qualifier("mpi20")
    public Engine engine() {
        return new Engine20MPIImpl("NU PE 2.0 MPI", 1999, 151);
    }

    @Bean ("tucson")
    public CarHyundaiTucsonIml tucson (@Qualifier("mpi20") Engine engine) {
        CarHyundaiTucsonIml car = new CarHyundaiTucsonIml(engine);
        car.init();
        car.setModel("Tucson");
        car.setCena(25500);
        return car;
    }

}
