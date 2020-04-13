package my.blog.account.api.clients;

import my.blog.account.api.model.UserModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient 标识服务
@FeignClient("accountservice")
public interface AccountClient {

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/user/findById/{userId}",
            consumes = "application/json"
    )
    UserModel findUserById(@PathVariable("userId") String userId);
}
