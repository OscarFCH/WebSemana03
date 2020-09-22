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
@Table(name="pais")
public class Pais implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMotor;
	
	@Column(name="nombreMotor", nullable=false, length=30)
	private String nombreMotor;
	
	private Date fechaMotor;

	public Pais() {
		super();
	}

	public Pais(int idMotor, String nombreMotor, Date fechaMotor) {
		super();
		this.idMotor = idMotor;
		this.nombreMotor = nombreMotor;
		this.fechaMotor = fechaMotor;
	}

	public int getIdMotor() {
		return idMotor;
	}

	public void setIdMotor(int idMotor) {
		this.idMotor = idMotor;
	}

	public String getNombreMotor() {
		return nombreMotor;
	}

	public void setNombreMotor(String nombreMotor) {
		this.nombreMotor = nombreMotor;
	}

	public Date getFechaMotor() {
		return fechaMotor;
	}

	public void setFechaMotor(Date fechaMotor) {
		this.fechaMotor = fechaMotor;
	}
	
}
