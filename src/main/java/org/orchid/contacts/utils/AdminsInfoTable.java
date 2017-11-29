package org.orchid.contacts.utils;

public enum  AdminsInfoTable {
    CONTACTSINFOID("ContactsInfoId","contactsinfo_id"),
    LOGINNAME("LoginName","login_name"),
    PASSWD("PassWd","passwd"),
    EMAIL("Email","email"),
    COPYRIGHT("CopyRight","copyright"),
    DESCS("DescS","descs");

    private String key,value;
    AdminsInfoTable(String key, String value) {
        this.key=key;
        this.value=value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
