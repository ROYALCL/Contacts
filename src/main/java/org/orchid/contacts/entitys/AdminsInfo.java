package org.orchid.contacts.entitys;

/**
 * mysql database contacts table adminsinfo
 */
public class AdminsInfo {
    private Integer Id;
    private Integer ContactsInfoId;
    private String LoginName;
    private String PassWd;
    private String Email;
    private Integer CopyRight;
    private String DescS;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getContactsInfoId() {
        return ContactsInfoId;
    }

    public void setContactsInfoId(Integer contactsInfoId) {
        ContactsInfoId = contactsInfoId;
    }

    public String getLoginName() {
        return LoginName;
    }

    public void setLoginName(String loginName) {
        LoginName = loginName;
    }

    public String getPassWd() {
        return PassWd;
    }

    public void setPassWd(String passWd) {
        PassWd = passWd;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getCopyRight() {
        return CopyRight;
    }

    public void setCopyRight(Integer copyRight) {
        CopyRight = copyRight;
    }

    public String getDescS() {
        return DescS;
    }

    public void setDescS(String descS) {
        DescS = descS;
    }

    @Override
    public String toString() {
        return "Adminsinfo{" +
                "Id=" + Id +
                ", ContactsInfoId=" + ContactsInfoId +
                ", LoginName='" + LoginName + '\'' +
                ", PassWd='" + PassWd + '\'' +
                ", Email='" + Email + '\'' +
                ", CopyRight=" + CopyRight +
                ", DescS='" + DescS + '\'' +
                '}';
    }
}
