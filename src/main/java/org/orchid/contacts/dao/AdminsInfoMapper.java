package org.orchid.contacts.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.orchid.contacts.entitys.AdminsInfo;
import org.orchid.contacts.mapper.AdminsInfoMapperSQLProvider;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import static org.orchid.contacts.utils.Contacts.ADMINSINFO;

@Repository
public interface AdminsInfoMapper {
    @InsertProvider(type = AdminsInfoMapperSQLProvider.class, method = "create")
    @Results({
            @Result(id=true,column = "id",property = "Id"),
            @Result(column = "contactsinfo_id",property = "ContactsInfo",one = @One(select = "org.orchid.contacts.dao.ContactsInfoMapper.selectById", fetchType = FetchType.EAGER)),
            @Result(column = "login_name",property = "LoginName"),
            @Result(column = "passwd",property = "PassWd"),
            @Result(column = "email",property = "Email"),
            @Result(column = "copyright",property = "CopyRight",one = @One(select = "org.orchid.contacts.dao.GroupsInfoMapper.selectById", fetchType = FetchType.EAGER)),
            @Result(column = "descs",property = "DescS")
    })
    void create(AdminsInfo adminsInfo);

    @SelectProvider(type = AdminsInfoMapperSQLProvider.class, method = "retrieve")
    @Results({
            @Result(id=true,column = "id",property = "Id"),
            @Result(column = "contactsinfo_id",property = "ContactsInfo",one = @One(select = "org.orchid.contacts.dao.ContactsInfoMapper.selectById", fetchType = FetchType.EAGER)),
            @Result(column = "login_name",property = "LoginName"),
            @Result(column = "passwd",property = "PassWd"),
            @Result(column = "email",property = "Email"),
            @Result(column = "copyright",property = "CopyRight",one = @One(select = "org.orchid.contacts.dao.GroupsInfoMapper.selectById", fetchType = FetchType.EAGER)),
            @Result(column = "descs",property = "DescS")
    })
    AdminsInfo retrieve(AdminsInfo adminsInfo);

    @SelectProvider(type = AdminsInfoMapperSQLProvider.class, method = "select")
    @Results({
            @Result(id=true,column = "id",property = "Id"),
            @Result(column = "contactsinfo_id",property = "ContactsInfo",one = @One(select = "org.orchid.contacts.dao.ContactsInfoMapper.selectById", fetchType = FetchType.EAGER)),
            @Result(column = "login_name",property = "LoginName"),
            @Result(column = "passwd",property = "PassWd"),
            @Result(column = "email",property = "Email"),
            @Result(column = "copyright",property = "CopyRight",one = @One(select = "org.orchid.contacts.dao.GroupsInfoMapper.selectById", fetchType = FetchType.EAGER)),
            @Result(column = "descs",property = "DescS")
    })
    List<AdminsInfo> select(Map<String, Object> params);

    @Delete("DELETE FROM " + ADMINSINFO + " WHERE id=#{id}")
    void delete(Integer id);

    @UpdateProvider(type = AdminsInfoMapperSQLProvider.class, method = "update")
    @Results({
            @Result(id=true,column = "id",property = "Id"),
            @Result(column = "contactsinfo_id",property = "ContactsInfo",one = @One(select = "org.orchid.contacts.dao.ContactsInfoMapper.selectById", fetchType = FetchType.EAGER)),
            @Result(column = "login_name",property = "LoginName"),
            @Result(column = "passwd",property = "PassWd"),
            @Result(column = "email",property = "Email"),
            @Result(column = "copyright",property = "CopyRight",one = @One(select = "org.orchid.contacts.dao.GroupsInfoMapper.selectById", fetchType = FetchType.EAGER)),
            @Result(column = "descs",property = "DescS")
    })
    void update(AdminsInfo adminsInfo);
}
