package edu.nf.ch21.service;

/**
 * 定时处理任务
 */
public interface TaskService {
    /**
     * 定时备份
     */
    void backup();

    /**
     * 定时清理
     */
    void clean();
}
