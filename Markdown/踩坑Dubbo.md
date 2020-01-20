###### 踩坑Dubbo
1. 生产者与消费者问题：
    1. 在生产者中，在需要暴露的接口中可以只引入一个service注解
        1. dubbo 包下的service注解
        2. spring包中用于mvc的service注解  
     注：dubbo包下的service注解是必须要引入的，spring包下的service注解不引入也可以达到mvc的效果
     
    2. 在生产者中，dubbo包下的service注解，可以指定参数，
        1. 若指定了参数version，则需要在消费者中指定相同的参数version，否则报错
        2. 若不指定参数，则在消费者中可以指定参数，也可以不指定参数，但是不能指定version参数
    3. 在消费者中，在需要调用生产者的地方引入两个注解
        1. dubbo包下的servicec注解
        2. dubbo下的Reference注解  
     注：两个注解都为dubbo包下的，Reference注解是必须的，dubbo包下service注解可以不添加
        
        3. 若消费者是在service层调用生产者，则dubbo包下的service注解和spring包下的service注解二选一
        4. 若消费者是在其他层调用生产者，那么service层则正常引入spring包下的service注解
        5. 若生产者的dubbo包下的service注解，指定了参数version，那么消费者个Reference注解也必须指定相同的参数version
        6. 若生产者的dubbo包下的serviice注解，不指定参数，那么消费者个Reference可以指定参数，也可以不指定参数，但不能指定version参数，反过来亦可
        
   