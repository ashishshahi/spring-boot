package com.speckyfox.website.service;

import com.speckyfox.website.dto.SubscribeDto;
import com.speckyfox.website.repository.SubscribeRepository;
import com.speckyfox.website.util.SubscribeDtoToSubscribe;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscribeService {

    private SubscribeRepository subscribeRepository;

    @Autowired
    SubscribeService(SubscribeRepository subscribeRepository)
    {
        this.subscribeRepository = subscribeRepository;
    }

    public String addSubscriber(SubscribeDto subscribeDto)
    { //JSONObject obj=new JSONObject();
        System.out.print(subscribeDto.getEmail());
        subscribeRepository.save(SubscribeDtoToSubscribe.convertDto(subscribeDto));
        //obj.put("data",subscribeDto.getEmail());
        return "Sucess";
    }


}
