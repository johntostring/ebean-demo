package com.millinch.ebean.demo.eternal;

/**
 * This guy is lazy, nothing left.
 *
 * @author 张劲航
 */
public enum UserStatus {
    DISABLED(0, "禁用"), ENABLED(1, "正常");

    private Integer id;
    private String description;

    UserStatus(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static UserStatus parse(int id){
        UserStatus[] values = values();
        for (UserStatus value : values) {
            if(value.getId() == id){
                return value;
            }
        }
        return null;
    }
}
