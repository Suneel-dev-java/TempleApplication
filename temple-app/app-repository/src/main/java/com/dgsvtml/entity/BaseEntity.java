package com.dgsvtml.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

	@Column(name = "created_on", nullable = false, updatable = false)
	private LocalDateTime createdOn;

	@LastModifiedDate
	@Column(name = "modified_on")
	private LocalDateTime modifiedOn;

	@Column(name = "created_by", nullable = false)
	private String createdBy;

	@Column(name = "modified_by", nullable = false)
	private String modifiedBy;

	@Version
	@Column(name = "version")
	private Long version;

	@Column(name = "trace_id", nullable = false)
	private String traceId;

	@Column(name = "span_id", nullable = false)
	private String spanId;

	@PrePersist
	protected void onCreate() {
		LocalDateTime now = LocalDateTime.now();
		createdOn = now;
		modifiedOn = now;
		createdBy = "SYSTEM";
		modifiedBy = "SYSTEM";
		traceId = UUID.randomUUID().toString(); // Generate a unique trace ID
		spanId = UUID.randomUUID().toString(); // Generate a unique span ID

	}

	@PreUpdate
	protected void onUpdate() {
		modifiedOn = LocalDateTime.now();
	}
}
