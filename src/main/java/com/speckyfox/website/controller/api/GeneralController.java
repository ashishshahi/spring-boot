package com.speckyfox.website.controller.api;

import com.speckyfox.website.dto.ContactDto;
import com.speckyfox.website.dto.SubscribeDto;
import com.speckyfox.website.service.ContactService;
import com.speckyfox.website.service.SubscribeService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller - this is used to return model and view
@RestController //- this is used to return json response or API response
public class GeneralController {

    @Autowired
    SubscribeService subscribeService;

    @PostMapping(value="/subscribe")
    public String subscribe(@RequestBody SubscribeDto subscribeDto)
    {
        System.out.println("This is SubscribeDto controller");
        return subscribeService.addSubscriber(subscribeDto);
    }

    @Autowired
    ContactService contactService;
    @PostMapping(value = "/contact")
    public String contact(@RequestBody ContactDto contactDto){
        System.out.println("This Is Contact Dto");
        return contactService.addContact(contactDto);
    }
}
