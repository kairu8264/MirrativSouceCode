package com.mirrativ.llstream.protocol.v1.topic;

/* loaded from: classes4.dex */
public enum Extend {
    AVC_SPS(TopicConstant.EXTEND_AVC_SPS),
    AVC_PPS(TopicConstant.EXTEND_AVC_PPS),
    AVC_SEI(TopicConstant.EXTEND_AVC_SEI),
    AVC_IDR(TopicConstant.EXTEND_AVC_IDR),
    AVC_NDR(TopicConstant.EXTEND_AVC_NDR),
    AAC_ASC(TopicConstant.EXTEND_AAC_ASC),
    AAC_RAW(TopicConstant.EXTEND_AAC_RAW),
    LIPMETA_A(TopicConstant.EXTEND_LIPMETA_A),
    LIPMETA_B("b"),
    LIPMETA_C("c"),
    HLS_AVCDCR(TopicConstant.EXTEND_HLS_AVCDCR),
    HLS_AACASC(TopicConstant.EXTEND_HLS_AACASC),
    HLS_TS(TopicConstant.EXTEND_HLS_TS),
    HLS_LHLS_CHUNK("c"),
    HLS_LHLS_SEQ("s"),
    UNKNOWN("unknown");
    
    private final String value;

    Extend(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
