package edu.nf.ch20.job;

import edu.nf.ch20.service.TaskService;

/**
 * 定时任务处理
 */
public class DemoTask {

    private TaskService taskService;


    /**
     * 定时任务需要反复执行taskService业务逻辑处理，
     * 因此将他注入进来
     * @param taskService
     */
    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }

    /**
     * 定时备份
     */
    public void executeBackup(){
        taskService.backup();
    }

    /**
     * 定时清理
     */
    public void executeClean(){
        taskService.clean();
    }
}
