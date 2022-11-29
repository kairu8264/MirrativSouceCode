package com.mirrativ.llstream.protocol.v1.topic;

/* loaded from: classes4.dex */
public enum PacketType {
    VIDEO_AVC(TopicConstant.PACKET_TYPE_VIDEO_AVC),
    VIDEO_HEVC(TopicConstant.PACKET_TYPE_VIDEO_HEVC),
    VIDEO_XVC(TopicConstant.PACKET_TYPE_VIDEO_XVC),
    VIDEO_AV1("v1"),
    VIDEO_VP9(TopicConstant.PACKET_TYPE_VIDEO_VP9),
    AUDIO_AAC(TopicConstant.PACKET_TYPE_AUDIO_AAC),
    AUDIO_MP3(TopicConstant.PACKET_TYPE_AUDIO_MP3),
    AUDIO_SPEEX(TopicConstant.PACKET_TYPE_AUDIO_SPEEX),
    AUDIO_FLAC(TopicConstant.PACKET_TYPE_AUDIO_FLAC),
    AUDIO_OPUS(TopicConstant.PACKET_TYPE_AUDIO_OPUS),
    ANIMATION_PNG(TopicConstant.PACKET_TYPE_AUDIO_OPUS),
    ANIMATION_GIF(TopicConstant.PACKET_TYPE_ANIMATION_GIF),
    ANIMATION_WEBM(TopicConstant.PACKET_TYPE_ANIMATION_WEBM),
    LIPMETA(TopicConstant.PACKET_TYPE_LIPMETA),
    HLS(TopicConstant.PACKET_TYPE_HLS),
    TEXT(TopicConstant.PACKET_TYPE_TEXT),
    META(TopicConstant.PACKET_TYPE_META),
    PTIME(TopicConstant.PACKET_TYPE_PTIME);
    
    private final String value;

    PacketType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
