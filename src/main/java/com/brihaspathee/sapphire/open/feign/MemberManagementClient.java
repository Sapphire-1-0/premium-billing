package com.brihaspathee.sapphire.open.feign;

import com.brihaspathee.sapphire.model.WelcomeDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 13, December 2024
 * Time: 5:04 AM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.open.feign
 * To change this template use File | Settings | File and Code Template
 */
@FeignClient(
        name = "member-management",
        url = "${application.config.member-management-url}"
)
public interface MemberManagementClient {

    @GetMapping("/welcome")
    WelcomeDto welcomeMessage();
}
