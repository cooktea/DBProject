package com.kiwi.dbproject.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class MPGenerator {

    public static void main(String[] args) {
        AutoGenerator generator = new AutoGenerator();
        generator.setTemplateEngine(new FreemarkerTemplateEngine());

        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setAuthor("kiwi");
        globalConfig.setOutputDir("C:\\Users\\62328\\Desktop\\db-project\\src\\main\\java");
        generator.setGlobalConfig(globalConfig);
        globalConfig.setDateType(DateType.ONLY_DATE);

        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.kiwi.dbproject");
        generator.setPackageInfo(packageConfig);

        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("1228");
        dataSourceConfig.setUrl("jdbc:mysql://134.175.104.191:3306/DBProject?useUnicode=true&characterEncoding=utf8");
        generator.setDataSource(dataSourceConfig);

        StrategyConfig strategy = new StrategyConfig();
        strategy.setEntityBuilderModel(true);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setRestControllerStyle(true);
        strategy.setEntityTableFieldAnnotationEnable(true);
        generator.setStrategy(strategy);

        generator.execute();
    }
}
