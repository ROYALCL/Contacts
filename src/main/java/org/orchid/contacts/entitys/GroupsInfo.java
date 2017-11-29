package org.orchid.contacts.entitys;

import java.util.Date;

/**
 * mysql database contacts table groupsinfo
 */
public class GroupsInfo {
    private Integer Id;
    private Integer ParentId;
    private String GroupName;
    private Integer BossId;
    private String DescS;
    private Integer CreateId;
    private Date CreateDate;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getParentId() {
        return ParentId;
    }

    public void setParentId(Integer parentId) {
        ParentId = parentId;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public Integer getBossId() {
        return BossId;
    }

    public void setBossId(Integer bossId) {
        BossId = bossId;
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

    @Override
    public String toString() {
        return "GroupInfo{" +
                "Id=" + Id +
                ", ParentId=" + ParentId +
                ", GroupName='" + GroupName + '\'' +
                ", BossId=" + BossId +
                ", DescS='" + DescS + '\'' +
                ", CreateId=" + CreateId +
                ", CreateDate=" + CreateDate +
                '}';
    }
}
