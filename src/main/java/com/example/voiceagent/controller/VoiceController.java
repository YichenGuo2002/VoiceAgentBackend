package com.example.voiceagent.controller;

import com.example.voiceagent.model.AgentResponse;
import com.example.voiceagent.service.VoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/voice")
public class VoiceController {

    @Autowired
    private VoiceService voiceService;

    // Upload audio file (WAV/MP3)
    @PostMapping(value = "/process", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public AgentResponse processVoice(@RequestParam("file") MultipartFile file) throws Exception {
        byte[] audioBytes = file.getBytes();
        return voiceService.processVoice(audioBytes);
    }

    // Simple text endpoint (if speech-to-text is done on client)
    @PostMapping("/text")
    public AgentResponse processText(@RequestBody String text) {
        // Here you could plug into NLP/LLM
        return new AgentResponse(text, "I understand: " + text);
    }
}
