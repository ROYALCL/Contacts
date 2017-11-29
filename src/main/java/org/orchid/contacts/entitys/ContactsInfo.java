package org.orchid.contacts.entitys;

import java.util.Date;

/**
 * mysql database contacts table contactsinfo
 */
public class ContactsInfo {
    private Integer Id;
    private String ContactName;
    private String Sex;
    private Integer GroupId;
    private String OfficeTelephone;
    private String HomeTelephone;
    private String Mobile;
    private String SubMobile;
    private String QQ;
    private String Enail;
    private String Positions;
    private String Address;
    private String DescS;
    private Integer CreateId;
    private Date CreateDate;
    private Integer UpdateId;
    private Date UpdateDate;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public Integer getGroupId() {
        return GroupId;
    }

    public void setGroupId(Integer groupId) {
        GroupId = groupId;
    }

    public String getOfficeTelephone() {
        return OfficeTelephone;
    }

    public void setOfficeTelephone(String officeTelephone) {
        OfficeTelephone = officeTelephone;
    }

    public String getHomeTelephone() {
        return HomeTelephone;
    }

    public void setHomeTelephone(String homeTelephone) {
        HomeTelephone = homeTelephone;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getSubMobile() {
        return SubMobile;
    }

    public void setSubMobile(String subMobile) {
        SubMobile = subMobile;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getEnail() {
        return Enail;
    }

    public void setEnail(String enail) {
        Enail = enail;
    }

    public String getPositions() {
        return Positions;
    }

    public void setPositions(String positions) {
        Positions = positions;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDescS() {
        return DescS;
    }

    public void setDescS(String descS) {
        DescS = descS;
    }

    public Integer getCreateId() {
        return CreateId;
    }

    public void setCreateId(Integer createId) {
        CreateId = createId;
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }

    public Integer getUpdateId() {
        return UpdateId;
    }

    public void setUpdateId(Integer updateId) {
        UpdateId = updateId;
    }

    public Date getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(Date updateDate) {
        UpdateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "Id=" + Id +
                ", ContactName='" + ContactName + '\'' +
                ", Sex='" + Sex + '\'' +
                ", GroupId=" + GroupId +
                ", OfficeTelephone='" + OfficeTelephone + '\'' +
                ", HomeTelephone='" + HomeTelephone + '\'' +
                ", Mobile='" + Mobile + '\'' +
                ", SubMobile='" + SubMobile + '\'' +
                ", QQ='" + QQ + '\'' +
                ", Enail='" + Enail + '\'' +
                ", Positions='" + Positions + '\'' +
                ", Address='" + Address + '\'' +
                ", DescS='" + DescS + '\'' +
                ", CreateId=" + CreateId +
                ", CreateDate=" + CreateDate +
                ", UpdateId=" + UpdateId +
                ", UpdateDate=" + UpdateDate +
                '}';
    }
}
