package edu.nf.ch21.job;

import edu.nf.ch21.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务处理
 */
@Component
public class DemoTask {
    /**
     * 定时任务需要反复执行taskService业务逻辑处理，
     * 因此将他注入进来
     * @param taskService
     */
    @Autowired
    private TaskService taskService;

    /**
     * 定时备份
     */
    @Scheduled(cron = "0/3 * * * * ?")
    public void executeBackup(){
        taskService.backup();
    }

    /**
     * 定时清理
     */
    @Scheduled(cron = "0/2 * * * * ?")
    public void executeClean(){
        taskService.clean();
    }
}
