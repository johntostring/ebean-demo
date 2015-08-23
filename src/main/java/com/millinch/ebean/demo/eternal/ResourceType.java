package com.millinch.ebean.demo.eternal;

import com.avaje.ebean.annotation.EnumValue;

/**
 * This guy is lazy, nothing left.
 *
 * @author 张劲航
 */
public enum ResourceType {

    @EnumValue("菜单") MENU,
    @EnumValue("按钮") BUTTON,
    @EnumValue("URL") URL;

}
