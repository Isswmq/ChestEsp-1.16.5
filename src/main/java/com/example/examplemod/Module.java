package com.example.examplemod;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

public class Module {
    public String name;
    public boolean toggled;
    public int keyCode;
    public Minecraft mc = Minecraft.getInstance();


    public Module(String name, int key){
        this.name = name;
        this.keyCode = key;
    }

    public void onEnabled(){
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void onDisable(){
        MinecraftForge.EVENT_BUS.unregister(this);
    }

    public void toggle(){
        toggled = !toggled;
        if(toggled){
            this.onEnabled();
        }else{
            this.onDisable();
        }
    }

    public int getKey(){
        return keyCode;
    }
}
