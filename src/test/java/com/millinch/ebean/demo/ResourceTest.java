package com.millinch.ebean.demo;

import com.millinch.ebean.demo.eternal.ResourceType;
import com.millinch.ebean.demo.domain.Resource;
import org.junit.Test;

/**
 * This guy is lazy,nothing left.
 *
 * @author John Zhang 2015/8/20
 */
public class ResourceTest extends Enhancer {

    @Test
    public void testInsert() {
        Resource resource = new Resource();
        resource.setName("editSth");
        resource.setType(ResourceType.BUTTON);
        resource.insert();
    }
}
