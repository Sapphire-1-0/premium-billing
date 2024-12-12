package com.brihaspathee.sapphire.controller.interfaces;

import com.brihaspathee.sapphire.model.WelcomeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 11, December 2024
 * Time: 12:35 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.controller.interfaces
 * To change this template use File | Settings | File and Code Template
 */
@RequestMapping("/api/v1/sapphire/premium-billing")
@Validated
public interface WelcomeAPI {

    /**
     * Welcome endpoint to check for connectivity
     * @return - Welcome message
     */
    @GetMapping("/welcome")
    ResponseEntity<WelcomeDto> getWelcomeMessage();

}
