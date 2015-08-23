package com.millinch.ebean.demo.eternal;

/**
 * This guy is lazy, nothing left.
 *
 * @author 张劲航
 */
public enum ResourceType {

    MENU(1, "菜单"), BUTTON(2, "按钮"), URL(3, "URL");

    private Integer id;
    private String description;

    ResourceType(Integer id, String description) {
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

    public static ResourceType parse(String description) {
        ResourceType[] values = values();
        for (ResourceType value : values) {
            if (description.equals(value.getDescription())) {
                return value;
            }
        }
        throw new RuntimeException("未知的ResourceType id");
    }
}
