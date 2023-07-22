package com.example.examplemod;

import net.minecraft.client.Minecraft;

import java.util.concurrent.CopyOnWriteArrayList;

public class Client {
    public static CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<>();

    public static void startup(){
        modules.add(new ChestEsp());
    }

    public static void keyPress(int key, int action){
        if(action == 1){
            for(Module m : modules){
                if(m.getKey() == key){
                    m.toggle();
                }
            }
        }
    }
}
