package de.gothaer.glsla.ber.application;

import de.gothaer.glsla.oniondemo.domain.aggregates.BerechnungsErgebnis;
import de.gothaer.glsla.oniondemo.domain.services.BerechnungsRepository;
import de.gothaer.glsla.oniondemo.domain.services.BerechnungsService;
import de.gothaer.glsla.oniondemo.domain.services.internal.BerechnungsServiceImpl;

import java.util.Optional;

public class BerechungsServiceProvider {

    public  static BerechnungsService createBerechungsService(){
        return new BerechnungsServiceImpl(new BerechnungsRepository() {
            public void save(BerechnungsErgebnis ergebnis) {
                //do Nothing
            }

            public Optional<BerechnungsErgebnis> findById(String uuid) {
                return Optional.empty();
            }
        });
    }

}
