package com.speckyfox.website.util;

import com.speckyfox.website.dto.SubscribeDto;
import com.speckyfox.website.model.Subscribe;

import java.util.Date;

public class SubscribeDtoToSubscribe {

    public static Subscribe convertDto(SubscribeDto subscribeDto)
    {
        Subscribe subscribe =new Subscribe();
        subscribe.setEmail(subscribeDto.getEmail()); //todo: validation checks need to be implemented
        subscribe.setSubscribed_on(new Date());
        return subscribe;
    }
}
