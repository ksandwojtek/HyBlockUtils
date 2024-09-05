package com.ksndq.features

import net.minecraftforge.client.event.ClientChatReceivedEvent
import net.minecraftforge.client.event.sound.SoundEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent

class EmeraldRingSilencer {

    @SubscribeEvent
    fun onSoundReceive(event: SoundEvent.SoundSourceEvent) {
        println("Sound: ${event.sound.soundLocation.resourcePath}, Pitch: ${event.sound.pitch}, Volume: ${event.sound.volume}")
    }
}
