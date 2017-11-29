package org.orchid.contacts.dao;

import org.orchid.contacts.entitys.GroupsInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupsInfoMapper {
    void create(GroupsInfo groupsInfo);
    List<GroupsInfo> retrieve(GroupsInfo groupsInfo);
    void delete(Integer id);
    void update(GroupsInfo groupInfo);
}
