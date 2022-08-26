package ec.org.isspol.intranet.persistence.services;

import ec.org.isspol.intranet.persistence.dao.RtiCincoDao;
import ec.org.isspol.intranet.persistence.entities.RtiCinco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IRtiCincoServiceImpl implements IRtiCincoService {

    @Autowired
    private RtiCincoDao rtiCincoDao;

    @Override
    @Transactional(readOnly = true)
    public List<RtiCinco> findAll() {
        return (List<RtiCinco>) rtiCincoDao.findAll();
    }

    @Override
    public RtiCinco findById(Integer id) {
        return rtiCincoDao.findById(id).get();
    }
}
