package it.etoken.base.model.market.entity;

import java.io.Serializable;
import java.util.Date;

public class PocketAsset implements Serializable{
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pocket_asset.id
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pocket_asset.name
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pocket_asset.icon
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	private String icon;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pocket_asset.contract_account
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	private String contractAccount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pocket_asset.create_date
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	private Date createDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pocket_asset.update_date
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	private Date updateDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pocket_asset.detail
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	private String detail;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pocket_asset.id
	 * @return  the value of pocket_asset.id
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pocket_asset.id
	 * @param id  the value for pocket_asset.id
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pocket_asset.name
	 * @return  the value of pocket_asset.name
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pocket_asset.name
	 * @param name  the value for pocket_asset.name
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pocket_asset.icon
	 * @return  the value of pocket_asset.icon
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pocket_asset.icon
	 * @param icon  the value for pocket_asset.icon
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pocket_asset.contract_account
	 * @return  the value of pocket_asset.contract_account
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	public String getContractAccount() {
		return contractAccount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pocket_asset.contract_account
	 * @param contractAccount  the value for pocket_asset.contract_account
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	public void setContractAccount(String contractAccount) {
		this.contractAccount = contractAccount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pocket_asset.create_date
	 * @return  the value of pocket_asset.create_date
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pocket_asset.create_date
	 * @param createDate  the value for pocket_asset.create_date
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pocket_asset.update_date
	 * @return  the value of pocket_asset.update_date
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pocket_asset.update_date
	 * @param updateDate  the value for pocket_asset.update_date
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pocket_asset.detail
	 * @return  the value of pocket_asset.detail
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pocket_asset.detail
	 * @param detail  the value for pocket_asset.detail
	 * @mbg.generated  Mon Jun 25 20:07:10 CST 2018
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 5619757381769716198L;
}