package kuroneko.fun.system.platform.admin.controller;

import kuroneko.fun.system.platform.admin.sevice.SysLogService;
import kuroneko.fun.system.platform.core.http.HttpResult;
import kuroneko.fun.system.platform.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 日志控制器 */
@RestController
@RequestMapping("log")
public class SysLogController {

  @Autowired private SysLogService sysLogService;

  @PreAuthorize("hasAuthority('sys:log:view')")
  @PostMapping(value = "/findPage")
  public HttpResult findPage(@RequestBody PageRequest pageRequest) {
    return HttpResult.ok(sysLogService.findPage(pageRequest));
  }
}
