package com.vcgoyo.bootstart.module;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.vcgoyo.bootstart.module.sys.domain.eneity.User;

@MappedSuperclass 
public  class DataEntity<T> implements Serializable{

	@Id
	@GeneratedValue
	protected long id;
	
	@Column(nullable=true)
	protected String remarks;	// 备注
	@Column
	protected User createBy;	// 创建者
	@Column
	protected Date createDate;	// 创建日期
	@Column
	protected User updateBy;	// 更新者
	@Column
	protected Date updateDate;	// 更新日期
	@Column
	protected String delFlag; 	// 删除标记（0：正常；1：删除；2：审核）
	public long getId() {
		return id;
	}
	public void setId(long id) {
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public User getCreateBy() {
		return createBy;
	}
	public void setCreateBy(User createBy) {
		this.createBy = createBy;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public User getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(User updateBy) {
		this.updateBy = updateBy;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
	
	
}
