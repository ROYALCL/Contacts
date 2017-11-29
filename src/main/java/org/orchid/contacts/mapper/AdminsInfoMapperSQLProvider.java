package org.orchid.contacts.mapper;

import org.apache.ibatis.jdbc.SQL;
import org.orchid.contacts.entitys.AdminsInfo;
import org.orchid.contacts.utils.AdminsInfoTable;

import java.util.Map;

import static org.orchid.contacts.utils.Contacts.ADMINSINFO;

public class AdminsInfoMapperSQLProvider {
    public String select(final Map<String, Object> params) {
        return new SQL() {
            {
                SELECT("*");
                FROM(ADMINSINFO);
                if (params.get("adminsInfo") != null) {
                    AdminsInfo adminsInfo = (AdminsInfo) params.get("adminsInfo");
                    if (adminsInfo.getLoginName() != null && !adminsInfo.getLoginName().equals("")) {
                        WHERE(AdminsInfoTable.LOGINNAME.getValue()+" LIKE CONCAT ('%',#{adminsInfo.LoginName},'%') ");
                    }
                    if (adminsInfo.getEmail() != null && !adminsInfo.getEmail().equals("")) {
                        WHERE(AdminsInfoTable.EMAIL.getValue()+" LIKE CONCAT ('%',#{adminsInfo.Email},'%') ");
                    }
                    if (adminsInfo.getCopyRight() != null && !adminsInfo.getCopyRight().equals("")) {
                        WHERE(AdminsInfoTable.COPYRIGHT.getValue()+" LIKE CONCAT ('%',#{adminsInfo.CopyRight},'%') ");
                    }
                }
            }
        }.toString();
    }


    public String create(final AdminsInfo adminsInfo) {
        return new SQL() {
            {
                INSERT_INTO(ADMINSINFO);
                if (adminsInfo.getContactsInfoId() != null) {
                    VALUES(AdminsInfoTable.CONTACTSINFOID.getValue(), "#{ConstatsInfo.Id}");
                }
                if (adminsInfo.getLoginName()!= null) {
                    VALUES(AdminsInfoTable.LOGINNAME.getValue(), "#{LoginName}");
                }
                if (adminsInfo.getPassWd() != null) {
                    VALUES(AdminsInfoTable.PASSWD.getValue(), "#{PassWd}");
                }
                if (adminsInfo.getEmail() != null) {
                    VALUES(AdminsInfoTable.EMAIL.getValue(), "#{Email}");
                }
                if (adminsInfo.getCopyRight() != null) {
                    VALUES(AdminsInfoTable.COPYRIGHT.getValue(), "#{GroupsInfo.Id}");
                }
                if (adminsInfo.getDescS() != null) {
                    VALUES(AdminsInfoTable.DESCS.getValue(), "#{DescS}");
                }
            }
        }.toString();
    }
    public String update(final AdminsInfo adminsInfo) {
        return new SQL() {
            {
                UPDATE(ADMINSINFO);
                if (adminsInfo.getContactsInfoId() != null) {
                    SET(AdminsInfoTable.CONTACTSINFOID.getValue()+"=#{ContactsInfo.Id}");
                }
                if (adminsInfo.getLoginName()!= null) {
                    SET(AdminsInfoTable.LOGINNAME.getValue()+"=#{LoginName}");
                }
                if (adminsInfo.getPassWd() != null) {
                    SET(AdminsInfoTable.PASSWD.getValue()+"=#{PassWd}");
                }
                if (adminsInfo.getEmail() != null) {
                    SET(AdminsInfoTable.EMAIL.getValue()+"=#{Email}");
                }
                if (adminsInfo.getCopyRight() != null) {
                    SET(AdminsInfoTable.COPYRIGHT.getValue()+"=#{GroupsInfo.Id}");
                }
                if (adminsInfo.getDescS() != null) {
                    SET(AdminsInfoTable.DESCS.getValue()+"=#{DescS}");
                }
                WHERE(adminsInfo.getId()+"=#{Id}");
            }
        }.toString();
    }

}
