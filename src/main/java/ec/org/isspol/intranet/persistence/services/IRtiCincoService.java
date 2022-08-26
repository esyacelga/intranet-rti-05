package ec.org.isspol.intranet.persistence.services;

import ec.org.isspol.intranet.persistence.entities.RtiCinco;

import java.util.List;

public interface IRtiCincoService {

    public List<RtiCinco> findAll();

    public RtiCinco findById(Integer id);
}
