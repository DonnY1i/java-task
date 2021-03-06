package jeyson.task.springtask;

import jeyson.utils.DateUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;


/**
 * Created by  liujishuai
 * Create Date: 2017/7/28 16:43
 * Description: 注解式实现springtask
 */
@Service
public class AutoSpringTask {
    @Scheduled(cron = "* * 9 * * ?")
    public void job(){
        System.out.println("注解式定时任务："+ DateUtil.getFormatTime(LocalDateTime.now(),DateUtil.standFomtter));
    }
}
