package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ciudad")
public class Ciudad implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCiudad;
	
	@Column(name="nombreCiudad", nullable=false, length=30)
	private String nombreCiudad;
	
	private Date fechaMotor;

	public Ciudad() {
		super();
	}

	public Ciudad(int idCiudad, String nombreCiudad, Date fechaMotor) {
		super();
		this.idCiudad = idCiudad;
		this.nombreCiudad = nombreCiudad;
		this.fechaMotor = fechaMotor;
	}

	public int getidCiudad() {
		return idCiudad;
	}

	public void setidCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getnombreCiudad() {
		return nombreCiudad;
	}

	public void setnombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public Date getFechaMotor() {
		return fechaMotor;
	}

	public void setFechaMotor(Date fechaMotor) {
		this.fechaMotor = fechaMotor;
	}
	
}
