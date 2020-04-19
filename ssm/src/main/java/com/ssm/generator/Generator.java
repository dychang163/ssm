package com.ssm.generator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class Generator {
	@Test
	public void test() throws Exception{
		List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("D:\\SpringWorkSpace3\\ssm\\src\\main\\resources\\generator.xml");     //你的mybatis generator 配置文件名
        System.out.println("进入代码生成");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        System.out.println("cp:"+cp);
        Configuration config = cp.parseConfiguration(configFile);
        System.out.println("config:"+config);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        System.out.println("callback:"+callback);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        System.out.println("myBatisGenerator:"+myBatisGenerator);
        myBatisGenerator.generate(null);
        System.out.println("代码生成完成");
	}
}
