package ec.org.isspol.intranet.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "rti_cinco", schema = "rti")
public class RtiCinco implements Serializable {


    private static final long serialVersionUID = 7406171871966572399L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRtiCinco;

    @Column(name = "numero_formulario")
    private String numeroFormulario;

    @Column(name = "numero_documento_referencia")
    private String numeroDocumentoReferencia;

    @Column(name = "nombre_responsable_proceso")
    private String nombreResponsableProceso;

    @Column(name = "cargo_responsable_proceso")
    private String cargoResponsableProceso;

    @Column(name = "fecha_formulario")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFormulario;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_solicitud")
    private Date fechaSolicitud;

    public Integer getIdRtiCinco() {
        return idRtiCinco;
    }

    public void setIdRtiCinco(Integer idRtiCinco) {
        this.idRtiCinco = idRtiCinco;
    }

    public String getNumeroFormulario() {
        return numeroFormulario;
    }

    public void setNumeroFormulario(String numeroFormulario) {
        this.numeroFormulario = numeroFormulario;
    }

    public String getNumeroDocumentoReferencia() {
        return numeroDocumentoReferencia;
    }

    public void setNumeroDocumentoReferencia(String numeroDocumentoReferencia) {
        this.numeroDocumentoReferencia = numeroDocumentoReferencia;
    }

    public String getNombreResponsableProceso() {
        return nombreResponsableProceso;
    }

    public void setNombreResponsableProceso(String nombreResponsableProceso) {
        this.nombreResponsableProceso = nombreResponsableProceso;
    }

    public String getCargoResponsableProceso() {
        return cargoResponsableProceso;
    }

    public void setCargoResponsableProceso(String cargoResponsableProceso) {
        this.cargoResponsableProceso = cargoResponsableProceso;
    }

    public Date getFechaFormulario() {
        return fechaFormulario;
    }

    public void setFechaFormulario(Date fechaFormulario) {
        this.fechaFormulario = fechaFormulario;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }
}
