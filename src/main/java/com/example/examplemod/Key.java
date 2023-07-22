package com.example.examplemod;

import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Key {
    @SubscribeEvent
    public void onKey(InputEvent.KeyInputEvent event){
        Client.keyPress(event.getKey(), event.getAction());
    }
}
