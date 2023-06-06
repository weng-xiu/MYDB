package top.guoziyang.mydb.backend.parser.statement;

/**
 * 关键字 update
 */
public class Update {
    // 表名
    public String tableName;
    // 字段名
    public String fieldName;
    // 字段值
    public String value;
    // 关键字 where
    public Where where;
}
