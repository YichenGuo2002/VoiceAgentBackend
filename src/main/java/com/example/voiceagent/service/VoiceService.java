package com.example.voiceagent.service;

import com.example.voiceagent.model.AgentResponse;
import org.springframework.stereotype.Service;

@Service
public class VoiceService {

    public AgentResponse processVoice(byte[] audioData) {
        // For now: fake transcription
        String transcription = "Hello, I need help with my order.";
        
        // Simple agent reply logic
        String reply = "Sure, I can help with your order. Could you give me your order number?";
        
        return new AgentResponse(transcription, reply);
    }
}
