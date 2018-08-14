package com.sinnerschrader.aem.react.tsgenerator.fromclass;

import org.junit.Assert;
import org.junit.Test;

public class ClassBeanTest {

	@Test
	public void test() {
		ClassBean classBean = new ClassBean("nn.ff.Hallo");
		Assert.assertEquals("Hallo", classBean.getSimpleName());
		Assert.assertEquals("nn.ff.Hallo", classBean.getName());
	}

}
