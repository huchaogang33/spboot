package com.newt.boot.dal.tools;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CodeGenerator {

    private static final String dbName = "acquiring";
    private static final String driverClassName = "com.mysql.cj.jdbc.Driver";

    private static final String dbUrl = "jdbc:mysql://localhost:3306/upmp?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf8&useAffectedRows=true&autoReconnect=true";

    public static void main(String[] args) throws Exception {
        AutoGenerator mpg = new AutoGenerator();

        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/boot-dal/src/main/java");
        gc.setAuthor("hcg");
        gc.setOpen(false);
        gc.setFileOverride(true);

        gc.setIdType(IdType.ASSIGN_UUID);
        gc.setDateType(DateType.ONLY_DATE);
        gc.setSwagger2(false);
        gc.setActiveRecord(true);
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);
//        gc.setServiceImplName("%sServiceImpl");
//        gc.setServiceName("%sService");
//        gc.setMapperName("%Mapper");
//        gc.setXmlName("%sMapper");
//        gc.setControllerName("%sController");

        mpg.setGlobalConfig(gc);

        DataSourceConfig config = new DataSourceConfig();
//        config.setUrl("jdbc:mysql://128.1.96.184:3306/visitor_db?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf8&useAffectedRows=true&autoReconnect=true");
        config.setUrl(dbUrl);
        config.setDriverName(driverClassName);
        config.setUsername("root");
        config.setPassword("root");
        config.setDbType(DbType.MYSQL);

        mpg.setDataSource(config);

        PackageConfig pc = new PackageConfig();
        pc.setParent("com.newt.boot");
        pc.setModuleName("dal");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setXml("mapper");
        pc.setService("service");
        pc.setServiceImpl("impl");

        Map<String, String> pathMap = new HashMap<>();
        pathMap.put(ConstVal.ENTITY_PATH, projectPath + "/boot-dal/src/main/java/com/newt/boot/dal/entity");
        pathMap.put(ConstVal.MAPPER_PATH, projectPath + "/boot-dal/src/main/java/com/newt/boot/dal/mapper");
        pathMap.put(ConstVal.XML_PATH, projectPath + "/boot-dal/src/main/resources/mapper/upmp");
        pathMap.put(ConstVal.CONTROLLER_PATH, projectPath + "/boot-web/src/main/java/com/newt/boot/web/controller");
        pathMap.put(ConstVal.SERVICE_PATH, projectPath + "/boot-dal/src/main/java/com/newt/boot/dal/service");
        pathMap.put(ConstVal.SERVICE_IMPL_PATH, projectPath + "/boot-dal/src/main/java/com/newt/boot/dal/service/impl");
        pc.setPathInfo(pathMap);

        mpg.setPackageInfo(pc);

        StrategyConfig strategy = new StrategyConfig();
        //strategy.setInclude(getTables(dbName));
        //strategy.setInclude("t_register_info");
        strategy.setNaming(NamingStrategy.underline_to_camel);
        //strategy.setTablePrefix()
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(false);
        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true);

        mpg.setStrategy(strategy);

        TemplateConfig tc = new TemplateConfig();
        //tc.setController(null);
        //tc.setService(null);
        //tc.setServiceImpl(null);

        mpg.setTemplate(tc);

        mpg.execute();
    }

    private static String[] getTables(String dbName) throws Exception {
        List<String> tables = new ArrayList<>();

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(dbUrl, "acquiring_admin", "acquiring_admin");
            String sql = "select table_name from information_schema.tables where table_schema=?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, dbName);
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                tables.add(resultSet.getString("table_name"));
            }
            String[] result = tables.toArray(new String[tables.size()]);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        throw new Exception("数据库连接异常！");
    }
}