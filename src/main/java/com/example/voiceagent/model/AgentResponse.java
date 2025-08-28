package com.example.voiceagent.model;

public class AgentResponse {
    private String transcription;
    private String reply;

    public AgentResponse(String transcription, String reply) {
        this.transcription = transcription;
        this.reply = reply;
    }

    public String getTranscription() {
        return transcription;
    }

    public String getReply() {
        return reply;
    }
}
