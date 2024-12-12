package com.brihaspathee.sapphire.controller.impl;

import com.brihaspathee.sapphire.controller.interfaces.WelcomeAPI;
import com.brihaspathee.sapphire.model.WelcomeDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 11, December 2024
 * Time: 12:47 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.controller.interfaces
 * To change this template use File | Settings | File and Code Template
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public class WelcomeAPIImpl implements WelcomeAPI {

    /**
     * A welcome endpoint to test connectivity
     * @return - welcome message
     */
    @Override
    public ResponseEntity<WelcomeDto> getWelcomeMessage() {
        return ResponseEntity.ok(WelcomeDto.builder()
                        .welcomeMessage("Hello! Welcome to Sapphire's premium billing service! " +
                                "Your connectivity to this service is just fine")
                .build());
    }
}
