package hellojpa;

import java.time.LocalDateTime;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {

	private String createdBy;
	private LocalDateTime createdDate;
	private String lastModifiedBy;
	private LocalDateTime lastModifiedDate;

	public String getCreatedBy() {
		return createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public LocalDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

}
