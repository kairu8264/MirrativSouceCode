package com.mirrativ.llstream.protocol.v1.topic;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.mirrativ.llstream.protocol.v1.topic.TopicUtil;
import i7.e;
import java.util.List;
import jo.h;
import xn.s;

/* loaded from: classes4.dex */
public final class TopicConstant {
    public static final Companion Companion = new Companion(null);
    public static final String EVENT_TYPE = "evt";
    public static final String EVENT_TYPE_HEALTH = "health";
    public static final String EVENT_TYPE_OPERATION = "op";
    public static final String EVENT_TYPE_STREAM = "stream";
    public static final String EXTEND_AAC_ASC = "asc";
    public static final String EXTEND_AAC_RAW = "r";
    public static final String EXTEND_AVC_IDR = "i";
    public static final String EXTEND_AVC_NDR = "n";
    public static final String EXTEND_AVC_PPS = "pps";
    public static final String EXTEND_AVC_SEI = "sei";
    public static final String EXTEND_AVC_SPS = "sps";
    public static final String EXTEND_HLS_AACASC = "aacasc";
    public static final String EXTEND_HLS_AVCDCR = "avcdcr";
    public static final String EXTEND_HLS_LHLS_CHUNK = "c";
    public static final String EXTEND_HLS_LHLS_SEQ = "s";
    public static final String EXTEND_HLS_TS = "ts";
    public static final String EXTEND_LIPMETA_A = "a";
    public static final String EXTEND_LIPMETA_B = "b";
    public static final String EXTEND_LIPMETA_C = "c";
    public static final String MATCH_PREFIX = ">";
    public static final String MATCH_SINGLE = "*";
    public static final String PACKET_TYPE_ANIMATION_APNG = "da";
    public static final String PACKET_TYPE_ANIMATION_GIF = "dg";
    public static final String PACKET_TYPE_ANIMATION_WEBM = "dw";
    public static final String PACKET_TYPE_AUDIO_AAC = "ac";
    public static final String PACKET_TYPE_AUDIO_FLAC = "af";
    public static final String PACKET_TYPE_AUDIO_MP3 = "am";
    public static final String PACKET_TYPE_AUDIO_OPUS = "ao";
    public static final String PACKET_TYPE_AUDIO_SPEEX = "as";
    public static final String PACKET_TYPE_HLS = "hls";
    public static final String PACKET_TYPE_LIPMETA = "li";
    public static final String PACKET_TYPE_META = "m";
    public static final String PACKET_TYPE_PTIME = "ptm";
    public static final String PACKET_TYPE_TEXT = "t";
    public static final String PACKET_TYPE_VIDEO_AV1 = "v1";
    public static final String PACKET_TYPE_VIDEO_AVC = "va";
    public static final String PACKET_TYPE_VIDEO_HEVC = "ve";
    public static final String PACKET_TYPE_VIDEO_VP9 = "v9";
    public static final String PACKET_TYPE_VIDEO_XVC = "vx";
    private static final String PREFIX_EVENT;
    private static final String PREFIX_REQ_REPLY;
    private static final List<String> PREFIX_STREAM_KEYS;
    public static final String REQ_REPLY_TYPE = "rqrp";
    public static final String REQ_REPLY_TYPE_STREAM = "stream";
    public static final String SEPARATOR = ".";
    public static final String STREAM_EVENT_PUBLISH = "publish";
    public static final String STREAM_EVENT_UNPUBLISH = "unpublish";
    public static final String STREAM_TYPE = "s";
    private static final String SUFFIX_AUDIO_AAC_ASC;
    private static final String SUFFIX_AUDIO_AAC_RAW;
    private static final String SUFFIX_HLS_AACASC;
    private static final String SUFFIX_HLS_AVCDCR;
    private static final String SUFFIX_HLS_LHLS_CHUNK;
    private static final String SUFFIX_HLS_LHLS_SEQ;
    private static final String SUFFIX_HLS_TS;
    private static final String SUFFIX_LIPMETA_A;
    private static final String SUFFIX_LIPMETA_B;
    private static final String SUFFIX_LIPMETA_C;
    private static final String SUFFIX_MATCH_ANIMATION_APNG;
    private static final String SUFFIX_MATCH_ANIMATION_GIF;
    private static final String SUFFIX_MATCH_ANIMATION_WEBM;
    private static final String SUFFIX_MATCH_AUDIO_AAC;
    private static final String SUFFIX_MATCH_AUDIO_FLAC;
    private static final String SUFFIX_MATCH_AUDIO_MP3;
    private static final String SUFFIX_MATCH_AUDIO_OPUS;
    private static final String SUFFIX_MATCH_AUDIO_SPEEX;
    private static final String SUFFIX_MATCH_HLS;
    private static final String SUFFIX_MATCH_LIPMETA;
    private static final String SUFFIX_MATCH_VIDEO_AV1;
    private static final String SUFFIX_MATCH_VIDEO_AVC;
    private static final String SUFFIX_MATCH_VIDEO_HEVC;
    private static final String SUFFIX_MATCH_VIDEO_VP9;
    private static final String SUFFIX_MATCH_VIDEO_XVC;
    private static final String SUFFIX_META;
    private static final String SUFFIX_PTIME;
    private static final String SUFFIX_TEXT;
    private static final String SUFFIX_VIDEO_AVC_IDR;
    private static final String SUFFIX_VIDEO_AVC_NDR;
    private static final String SUFFIX_VIDEO_AVC_PPS;
    private static final String SUFFIX_VIDEO_AVC_SEI;
    private static final String SUFFIX_VIDEO_AVC_SPS;
    private static final String TOPIC_REQREPLY_AAC_ASC;
    private static final String TOPIC_REQREPLY_AVC_IDR;
    private static final String TOPIC_REQREPLY_AVC_PPS;
    private static final String TOPIC_REQREPLY_AVC_SEI;
    private static final String TOPIC_REQREPLY_AVC_SPS;
    private static final String TOPIC_REQREPLY_CURRENT_STREAM_KEYS;
    private static final String TOPIC_REQREPLY_HLS_AACASC;
    private static final String TOPIC_REQREPLY_HLS_AVCDCR;
    public static final String VERSION_CURRENT = "v1";

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final String getPREFIX_EVENT() {
            return TopicConstant.PREFIX_EVENT;
        }

        public final String getPREFIX_REQ_REPLY() {
            return TopicConstant.PREFIX_REQ_REPLY;
        }

        public final List<String> getPREFIX_STREAM_KEYS() {
            return TopicConstant.PREFIX_STREAM_KEYS;
        }

        public final String getSUFFIX_AUDIO_AAC_ASC() {
            return TopicConstant.SUFFIX_AUDIO_AAC_ASC;
        }

        public final String getSUFFIX_AUDIO_AAC_RAW() {
            return TopicConstant.SUFFIX_AUDIO_AAC_RAW;
        }

        public final String getSUFFIX_HLS_AACASC() {
            return TopicConstant.SUFFIX_HLS_AACASC;
        }

        public final String getSUFFIX_HLS_AVCDCR() {
            return TopicConstant.SUFFIX_HLS_AVCDCR;
        }

        public final String getSUFFIX_HLS_LHLS_CHUNK() {
            return TopicConstant.SUFFIX_HLS_LHLS_CHUNK;
        }

        public final String getSUFFIX_HLS_LHLS_SEQ() {
            return TopicConstant.SUFFIX_HLS_LHLS_SEQ;
        }

        public final String getSUFFIX_HLS_TS() {
            return TopicConstant.SUFFIX_HLS_TS;
        }

        public final String getSUFFIX_LIPMETA_A() {
            return TopicConstant.SUFFIX_LIPMETA_A;
        }

        public final String getSUFFIX_LIPMETA_B() {
            return TopicConstant.SUFFIX_LIPMETA_B;
        }

        public final String getSUFFIX_LIPMETA_C() {
            return TopicConstant.SUFFIX_LIPMETA_C;
        }

        public final String getSUFFIX_MATCH_ANIMATION_APNG() {
            return TopicConstant.SUFFIX_MATCH_ANIMATION_APNG;
        }

        public final String getSUFFIX_MATCH_ANIMATION_GIF() {
            return TopicConstant.SUFFIX_MATCH_ANIMATION_GIF;
        }

        public final String getSUFFIX_MATCH_ANIMATION_WEBM() {
            return TopicConstant.SUFFIX_MATCH_ANIMATION_WEBM;
        }

        public final String getSUFFIX_MATCH_AUDIO_AAC() {
            return TopicConstant.SUFFIX_MATCH_AUDIO_AAC;
        }

        public final String getSUFFIX_MATCH_AUDIO_FLAC() {
            return TopicConstant.SUFFIX_MATCH_AUDIO_FLAC;
        }

        public final String getSUFFIX_MATCH_AUDIO_MP3() {
            return TopicConstant.SUFFIX_MATCH_AUDIO_MP3;
        }

        public final String getSUFFIX_MATCH_AUDIO_OPUS() {
            return TopicConstant.SUFFIX_MATCH_AUDIO_OPUS;
        }

        public final String getSUFFIX_MATCH_AUDIO_SPEEX() {
            return TopicConstant.SUFFIX_MATCH_AUDIO_SPEEX;
        }

        public final String getSUFFIX_MATCH_HLS() {
            return TopicConstant.SUFFIX_MATCH_HLS;
        }

        public final String getSUFFIX_MATCH_LIPMETA() {
            return TopicConstant.SUFFIX_MATCH_LIPMETA;
        }

        public final String getSUFFIX_MATCH_VIDEO_AV1() {
            return TopicConstant.SUFFIX_MATCH_VIDEO_AV1;
        }

        public final String getSUFFIX_MATCH_VIDEO_AVC() {
            return TopicConstant.SUFFIX_MATCH_VIDEO_AVC;
        }

        public final String getSUFFIX_MATCH_VIDEO_HEVC() {
            return TopicConstant.SUFFIX_MATCH_VIDEO_HEVC;
        }

        public final String getSUFFIX_MATCH_VIDEO_VP9() {
            return TopicConstant.SUFFIX_MATCH_VIDEO_VP9;
        }

        public final String getSUFFIX_MATCH_VIDEO_XVC() {
            return TopicConstant.SUFFIX_MATCH_VIDEO_XVC;
        }

        public final String getSUFFIX_META() {
            return TopicConstant.SUFFIX_META;
        }

        public final String getSUFFIX_PTIME() {
            return TopicConstant.SUFFIX_PTIME;
        }

        public final String getSUFFIX_TEXT() {
            return TopicConstant.SUFFIX_TEXT;
        }

        public final String getSUFFIX_VIDEO_AVC_IDR() {
            return TopicConstant.SUFFIX_VIDEO_AVC_IDR;
        }

        public final String getSUFFIX_VIDEO_AVC_NDR() {
            return TopicConstant.SUFFIX_VIDEO_AVC_NDR;
        }

        public final String getSUFFIX_VIDEO_AVC_PPS() {
            return TopicConstant.SUFFIX_VIDEO_AVC_PPS;
        }

        public final String getSUFFIX_VIDEO_AVC_SEI() {
            return TopicConstant.SUFFIX_VIDEO_AVC_SEI;
        }

        public final String getSUFFIX_VIDEO_AVC_SPS() {
            return TopicConstant.SUFFIX_VIDEO_AVC_SPS;
        }

        public final String getTOPIC_REQREPLY_AAC_ASC() {
            return TopicConstant.TOPIC_REQREPLY_AAC_ASC;
        }

        public final String getTOPIC_REQREPLY_AVC_IDR() {
            return TopicConstant.TOPIC_REQREPLY_AVC_IDR;
        }

        public final String getTOPIC_REQREPLY_AVC_PPS() {
            return TopicConstant.TOPIC_REQREPLY_AVC_PPS;
        }

        public final String getTOPIC_REQREPLY_AVC_SEI() {
            return TopicConstant.TOPIC_REQREPLY_AVC_SEI;
        }

        public final String getTOPIC_REQREPLY_AVC_SPS() {
            return TopicConstant.TOPIC_REQREPLY_AVC_SPS;
        }

        public final String getTOPIC_REQREPLY_CURRENT_STREAM_KEYS() {
            return TopicConstant.TOPIC_REQREPLY_CURRENT_STREAM_KEYS;
        }

        public final String getTOPIC_REQREPLY_HLS_AACASC() {
            return TopicConstant.TOPIC_REQREPLY_HLS_AACASC;
        }

        public final String getTOPIC_REQREPLY_HLS_AVCDCR() {
            return TopicConstant.TOPIC_REQREPLY_HLS_AVCDCR;
        }
    }

    static {
        TopicUtil.Companion companion = TopicUtil.Companion;
        PREFIX_STREAM_KEYS = s.m(companion.toString("v1", "s", "0", MATCH_PREFIX), companion.toString("v1", "s", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, MATCH_PREFIX), companion.toString("v1", "s", "2", MATCH_PREFIX), companion.toString("v1", "s", "3", MATCH_PREFIX), companion.toString("v1", "s", "4", MATCH_PREFIX), companion.toString("v1", "s", "5", MATCH_PREFIX), companion.toString("v1", "s", "6", MATCH_PREFIX), companion.toString("v1", "s", "7", MATCH_PREFIX), companion.toString("v1", "s", "8", MATCH_PREFIX), companion.toString("v1", "s", "9", MATCH_PREFIX), companion.toString("v1", "s", EXTEND_LIPMETA_A, MATCH_PREFIX), companion.toString("v1", "s", "b", MATCH_PREFIX), companion.toString("v1", "s", "c", MATCH_PREFIX), companion.toString("v1", "s", "d", MATCH_PREFIX), companion.toString("v1", "s", e.f36387u, MATCH_PREFIX), companion.toString("v1", "s", "f", MATCH_PREFIX));
        PREFIX_EVENT = companion.toString("v1", EVENT_TYPE, MATCH_PREFIX);
        PREFIX_REQ_REPLY = companion.toString("v1", REQ_REPLY_TYPE, MATCH_PREFIX);
        SUFFIX_TEXT = companion.toString(PACKET_TYPE_TEXT);
        SUFFIX_META = companion.toString(PACKET_TYPE_META);
        SUFFIX_PTIME = companion.toString(PACKET_TYPE_PTIME);
        SUFFIX_MATCH_VIDEO_AVC = companion.toString(PACKET_TYPE_VIDEO_AVC, MATCH_PREFIX);
        SUFFIX_VIDEO_AVC_SPS = companion.toString(PACKET_TYPE_VIDEO_AVC, EXTEND_AVC_SPS);
        SUFFIX_VIDEO_AVC_PPS = companion.toString(PACKET_TYPE_VIDEO_AVC, EXTEND_AVC_PPS);
        SUFFIX_VIDEO_AVC_SEI = companion.toString(PACKET_TYPE_VIDEO_AVC, EXTEND_AVC_SEI);
        SUFFIX_VIDEO_AVC_IDR = companion.toString(PACKET_TYPE_VIDEO_AVC, EXTEND_AVC_IDR);
        SUFFIX_VIDEO_AVC_NDR = companion.toString(PACKET_TYPE_VIDEO_AVC, EXTEND_AVC_NDR);
        SUFFIX_MATCH_VIDEO_HEVC = companion.toString(PACKET_TYPE_VIDEO_HEVC, MATCH_PREFIX);
        SUFFIX_MATCH_VIDEO_XVC = companion.toString(PACKET_TYPE_VIDEO_XVC, MATCH_PREFIX);
        SUFFIX_MATCH_VIDEO_AV1 = companion.toString("v1", MATCH_PREFIX);
        SUFFIX_MATCH_VIDEO_VP9 = companion.toString(PACKET_TYPE_VIDEO_VP9, MATCH_PREFIX);
        SUFFIX_MATCH_AUDIO_AAC = companion.toString(PACKET_TYPE_AUDIO_AAC, MATCH_PREFIX);
        SUFFIX_AUDIO_AAC_ASC = companion.toString(PACKET_TYPE_AUDIO_AAC, EXTEND_AAC_ASC);
        SUFFIX_AUDIO_AAC_RAW = companion.toString(PACKET_TYPE_AUDIO_AAC, EXTEND_AAC_RAW);
        SUFFIX_MATCH_AUDIO_MP3 = companion.toString(PACKET_TYPE_AUDIO_MP3, MATCH_PREFIX);
        SUFFIX_MATCH_AUDIO_SPEEX = companion.toString(PACKET_TYPE_AUDIO_SPEEX, MATCH_PREFIX);
        SUFFIX_MATCH_AUDIO_FLAC = companion.toString(PACKET_TYPE_AUDIO_FLAC, MATCH_PREFIX);
        SUFFIX_MATCH_AUDIO_OPUS = companion.toString(PACKET_TYPE_AUDIO_OPUS, MATCH_PREFIX);
        SUFFIX_MATCH_ANIMATION_APNG = companion.toString(PACKET_TYPE_ANIMATION_APNG, MATCH_PREFIX);
        SUFFIX_MATCH_ANIMATION_GIF = companion.toString(PACKET_TYPE_ANIMATION_GIF, MATCH_PREFIX);
        SUFFIX_MATCH_ANIMATION_WEBM = companion.toString(PACKET_TYPE_ANIMATION_WEBM, MATCH_PREFIX);
        SUFFIX_MATCH_LIPMETA = companion.toString(PACKET_TYPE_LIPMETA, MATCH_PREFIX);
        SUFFIX_LIPMETA_A = companion.toString(PACKET_TYPE_LIPMETA, EXTEND_LIPMETA_A);
        SUFFIX_LIPMETA_B = companion.toString(PACKET_TYPE_LIPMETA, "b");
        SUFFIX_LIPMETA_C = companion.toString(PACKET_TYPE_LIPMETA, "c");
        SUFFIX_MATCH_HLS = companion.toString(PACKET_TYPE_HLS, MATCH_PREFIX);
        SUFFIX_HLS_AVCDCR = companion.toString(PACKET_TYPE_HLS, EXTEND_HLS_AVCDCR);
        SUFFIX_HLS_AACASC = companion.toString(PACKET_TYPE_HLS, EXTEND_HLS_AACASC);
        SUFFIX_HLS_TS = companion.toString(PACKET_TYPE_HLS, EXTEND_HLS_TS);
        SUFFIX_HLS_LHLS_CHUNK = companion.toString(PACKET_TYPE_HLS, "c");
        SUFFIX_HLS_LHLS_SEQ = companion.toString(PACKET_TYPE_HLS, "s");
        TOPIC_REQREPLY_CURRENT_STREAM_KEYS = companion.toString("v1", REQ_REPLY_TYPE, "stream", "current", "keys");
        TOPIC_REQREPLY_AVC_SPS = companion.toString("v1", REQ_REPLY_TYPE, "stream", PACKET_TYPE_VIDEO_AVC, EXTEND_AVC_SPS);
        TOPIC_REQREPLY_AVC_PPS = companion.toString("v1", REQ_REPLY_TYPE, "stream", PACKET_TYPE_VIDEO_AVC, EXTEND_AVC_PPS);
        TOPIC_REQREPLY_AVC_SEI = companion.toString("v1", REQ_REPLY_TYPE, "stream", PACKET_TYPE_VIDEO_AVC, EXTEND_AVC_SEI);
        TOPIC_REQREPLY_AVC_IDR = companion.toString("v1", REQ_REPLY_TYPE, "stream", PACKET_TYPE_VIDEO_AVC, EXTEND_AVC_IDR);
        TOPIC_REQREPLY_AAC_ASC = companion.toString("v1", REQ_REPLY_TYPE, "stream", PACKET_TYPE_AUDIO_AAC, EXTEND_AAC_ASC);
        TOPIC_REQREPLY_HLS_AVCDCR = companion.toString("v1", REQ_REPLY_TYPE, "stream", PACKET_TYPE_HLS, EXTEND_HLS_AVCDCR);
        TOPIC_REQREPLY_HLS_AACASC = companion.toString("v1", REQ_REPLY_TYPE, "stream", PACKET_TYPE_HLS, EXTEND_HLS_AACASC);
    }
}
