package com.newt.boot.service.biz.impl;

import com.newt.boot.service.dto.UserDto;
import org.junit.Test;

import java.util.concurrent.*;

/**
 * @author Hcg
 * @version 1.0
 * @date 2022/7/20
 */
public class ComputeTask  implements Callable {
    private String taskName;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ComputeTask(String taskName){
        this.taskName=taskName;
    }
    @Override
    public Object call() throws Exception {
        long id = Thread.currentThread().getId();
      //  Thread.sleep(3000);
        System.out.println("taskid:"+id);
        UserDto user=new UserDto();
        user.setLogin("2342342");
        System.out.println("成功------");
        return user;
    }

  /*  @Override
    public void run() {

        try {
            //Thread.sleep(3000);
            long id = Thread.currentThread().getId();
            System.out.println("runtaskid:"+id);
            UserDto user=new UserDto();
            user.setLogin("2342342");
            System.out.println("成功------");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //return user;
    }*/


}
