package kuroneko.fun.system.platform.consul.monitor.notify;

import de.codecentric.boot.admin.server.domain.entities.Instance;
import de.codecentric.boot.admin.server.domain.entities.InstanceRepository;
import de.codecentric.boot.admin.server.domain.events.InstanceEvent;
import de.codecentric.boot.admin.server.domain.events.InstanceStatusChangedEvent;
import de.codecentric.boot.admin.server.domain.values.InstanceId;
import de.codecentric.boot.admin.server.notify.AbstractEventNotifier;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * 自定义服务状态通知类
 *
 * @author kuroneko
 */
@Slf4j
@Service
public class CustomNotifier extends AbstractEventNotifier {

  public CustomNotifier(InstanceRepository repository) {
    super(repository);
  }

  @Override
  protected Mono<Void> doNotify(InstanceEvent event, Instance instance) {
    // TODO: 2021/3/12 自定义通知 根据以下实现自己想要的通知业务
    return Mono.fromRunnable(
        () -> {
          if (event instanceof InstanceStatusChangedEvent) {
            log.info(
                "Instance {} ({}) is {}",
                instance.getRegistration().getName(),
                event.getInstance(),
                ((InstanceStatusChangedEvent) event).getStatusInfo().getStatus());

            // 实例名
            String instanceName = instance.getRegistration().getName();
            // 实例id
            InstanceId instanceId = event.getInstance();
            // 实例状态
            String instanceStatus =
                ((InstanceStatusChangedEvent) event).getStatusInfo().getStatus();
            switch (instanceStatus) {
                // 健康检查没通过
              case "DOWN":
                log.info("{}健康检查未通过 ", instanceName);

                break;
                // 服务离线
              case "OFFLINE":
                log.info("{}服务离线", instanceName);

                break;
                // 服务上线
              case "UP":
                log.info("{}服务上线", instanceName);

                break;
                // 服务未知异常
              case "UNKNOWN":
                log.info("{}服务未知异常", instanceName);

                break;
              default:
                break;
            }

          } else {
            log.info(
                "Instance {} ({}) {}",
                instance.getRegistration().getName(),
                event.getInstance(),
                event.getType());
          }
        });
  }
}
