package tr.edu.izu.yam.core.entype;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="core_entity_type")
public class CoreEntityType implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Basic
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	@Basic
	@Column(name="entity_type",length=200,nullable=true)
	private String entityType;
	
	@Basic
	@Column(name="class_name",length=250,nullable=true)
	private String className;
	
	@Basic
	@Column(name="owner_id",nullable=true)
	private Long ownerId;
	
	@Basic
	@Column(name="orderno",nullable=true)
	private int orderNo;
	
	@Basic
	@Column(name="name",length=200,nullable=true)
	private String name;
	
	@Basic
	@Column(name="status",length=1)
	private int status;
	
	@Basic
	@Column(name="description",length=250,nullable=true)
	private String description;
	
	@Basic
	@Column(name="string_elements",length=200,nullable=true)
	private String stringElements;
	
	@Basic
	@Column(name="search_restriction",length=1,nullable=true)
	private String searchRestriction;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStringElements() {
		return stringElements;
	}

	public void setStringElements(String stringElements) {
		this.stringElements = stringElements;
	}

	public String getSearchRestriction() {
		return searchRestriction;
	}

	public void setSearchRestriction(String searchRestriction) {
		this.searchRestriction = searchRestriction;
	}
	
	
	
	
	
	
	

}
