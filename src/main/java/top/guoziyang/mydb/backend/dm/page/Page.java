package top.guoziyang.mydb.backend.dm.page;

/**
 * 页面
 */
public interface Page {

    // 锁
    void lock();

    // 解锁
    void unlock();

    // 释放
    void release();

    // 集脏
    void setDirty(boolean dirty);

    // 是否脏
    boolean isDirty();

    // 获取页码
    int getPageNumber();

    // 获取数据
    byte[] getData();
}
