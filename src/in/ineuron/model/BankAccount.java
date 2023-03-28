package in.ineuron.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@DynamicInsert(value = true)
@DynamicUpdate(value = true)
public class BankAccount implements Serializable {
	@Id
	private Long accNo;
	private String accHolderName;
	private String accBranch;
	private String bankName;
	private Float accBal;
	@CreationTimestamp
	private LocalDateTime accOpened;
	@UpdateTimestamp
	private LocalDateTime accUpdated;
	@Version
	private Integer versionCount;

	public Integer getVersionCount() {
		return versionCount;
	}

	public void setVersionCount(Integer versionCount) {
		this.versionCount = versionCount;
	}

	public Long getAccNo() {
		return accNo;
	}

	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getAccBranch() {
		return accBranch;
	}

	public void setAccBranch(String accBranch) {
		this.accBranch = accBranch;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Float getAccBal() {
		return accBal;
	}

	public void setAccBal(Float accBal) {
		this.accBal = accBal;
	}

	public LocalDateTime getAccOpened() {
		return accOpened;
	}

	public void setAccOpened(LocalDateTime accOpened) {
		this.accOpened = accOpened;
	}

	public LocalDateTime getAccUpdated() {
		return accUpdated;
	}

	public void setAccUpdated(LocalDateTime accUpdated) {
		this.accUpdated = accUpdated;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accHolderName=" + accHolderName + ", accBranch=" + accBranch
				+ ", bankName=" + bankName + ", accBal=" + accBal + ", accOpened=" + accOpened + ", accUpdated="
				+ accUpdated + ", versionCount=" + versionCount + "]";
	}

}
