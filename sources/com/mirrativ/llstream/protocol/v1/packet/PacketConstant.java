package com.mirrativ.llstream.protocol.v1.packet;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.List;
import jo.h;
import xn.s;

/* loaded from: classes4.dex */
public final class PacketConstant {
    public static final int PACKET_DEFAULT_DATA_SIZE = 16384;
    public static final int PACKET_HEADER_SIZE = 17;
    private static final byte[] TopicByteAudioAAC_ASC;
    private static final byte[] TopicByteAudioAAC_RAW;
    private static final byte[] TopicByteVideoAVC_IDR;
    private static final byte[] TopicByteVideoAVC_NDR;
    private static final byte[] TopicByteVideoAVC_PPS;
    private static final byte[] TopicByteVideoAVC_SEI;
    private static final byte[] TopicByteVideoAVC_SPS;
    private static final byte[] TopicBytesHLS_AACASC;
    private static final byte[] TopicBytesHLS_AVCDCR;
    private static final byte[] TopicBytesHLS_LHLS_CHUNK;
    private static final byte[] TopicBytesHLS_LHLS_SEQ;
    private static final byte[] TopicBytesHLS_TS;
    private static final byte[] TopicBytesPlain_META;
    private static final byte[] TopicBytesPlain_PTIME;
    private static final byte[] TopicBytesPlain_TEXT;
    private static final List<TopicPacket> topicPacketPair;
    public static final Companion Companion = new Companion(null);
    private static final byte[] SYNC_BYTE = {77, 82};

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final byte[] getSYNC_BYTE() {
            return PacketConstant.SYNC_BYTE;
        }

        public final byte[] getTopicByteAudioAAC_ASC() {
            return PacketConstant.TopicByteAudioAAC_ASC;
        }

        public final byte[] getTopicByteAudioAAC_RAW() {
            return PacketConstant.TopicByteAudioAAC_RAW;
        }

        public final byte[] getTopicByteVideoAVC_IDR() {
            return PacketConstant.TopicByteVideoAVC_IDR;
        }

        public final byte[] getTopicByteVideoAVC_NDR() {
            return PacketConstant.TopicByteVideoAVC_NDR;
        }

        public final byte[] getTopicByteVideoAVC_PPS() {
            return PacketConstant.TopicByteVideoAVC_PPS;
        }

        public final byte[] getTopicByteVideoAVC_SEI() {
            return PacketConstant.TopicByteVideoAVC_SEI;
        }

        public final byte[] getTopicByteVideoAVC_SPS() {
            return PacketConstant.TopicByteVideoAVC_SPS;
        }

        public final byte[] getTopicBytesHLS_AACASC() {
            return PacketConstant.TopicBytesHLS_AACASC;
        }

        public final byte[] getTopicBytesHLS_AVCDCR() {
            return PacketConstant.TopicBytesHLS_AVCDCR;
        }

        public final byte[] getTopicBytesHLS_LHLS_CHUNK() {
            return PacketConstant.TopicBytesHLS_LHLS_CHUNK;
        }

        public final byte[] getTopicBytesHLS_LHLS_SEQ() {
            return PacketConstant.TopicBytesHLS_LHLS_SEQ;
        }

        public final byte[] getTopicBytesHLS_TS() {
            return PacketConstant.TopicBytesHLS_TS;
        }

        public final byte[] getTopicBytesPlain_META() {
            return PacketConstant.TopicBytesPlain_META;
        }

        public final byte[] getTopicBytesPlain_PTIME() {
            return PacketConstant.TopicBytesPlain_PTIME;
        }

        public final byte[] getTopicBytesPlain_TEXT() {
            return PacketConstant.TopicBytesPlain_TEXT;
        }

        public final List<TopicPacket> getTopicPacketPair() {
            return PacketConstant.topicPacketPair;
        }
    }

    static {
        byte[] bArr = {1, 0, 1};
        TopicByteVideoAVC_SPS = bArr;
        byte[] bArr2 = {1, 0, 2};
        TopicByteVideoAVC_PPS = bArr2;
        byte[] bArr3 = {1, 0, 3};
        TopicByteVideoAVC_SEI = bArr3;
        byte[] bArr4 = {1, 0, 4};
        TopicByteVideoAVC_IDR = bArr4;
        byte[] bArr5 = {1, 0, 5};
        TopicByteVideoAVC_NDR = bArr5;
        byte[] bArr6 = {2, 0, 1};
        TopicByteAudioAAC_ASC = bArr6;
        byte[] bArr7 = {2, 0, 2};
        TopicByteAudioAAC_RAW = bArr7;
        byte[] bArr8 = {5, 0, 1};
        TopicBytesHLS_AVCDCR = bArr8;
        byte[] bArr9 = {5, 1, 1};
        TopicBytesHLS_AACASC = bArr9;
        byte[] bArr10 = {5, 2, 1};
        TopicBytesHLS_TS = bArr10;
        byte[] bArr11 = {5, 2, 2};
        TopicBytesHLS_LHLS_CHUNK = bArr11;
        byte[] bArr12 = {5, 2, 3};
        TopicBytesHLS_LHLS_SEQ = bArr12;
        byte[] bArr13 = {0, 0, 1};
        TopicBytesPlain_TEXT = bArr13;
        byte[] bArr14 = {0, 0, 2};
        TopicBytesPlain_META = bArr14;
        byte[] bArr15 = {0, 0, 3};
        TopicBytesPlain_PTIME = bArr15;
        TopicConstant.Companion companion = TopicConstant.Companion;
        topicPacketPair = s.m(new TopicPacket(companion.getSUFFIX_TEXT(), bArr13), new TopicPacket(companion.getSUFFIX_META(), bArr14), new TopicPacket(companion.getSUFFIX_PTIME(), bArr15), new TopicPacket(companion.getSUFFIX_MATCH_VIDEO_AVC(), new byte[]{1, 0, 0}), new TopicPacket(companion.getSUFFIX_VIDEO_AVC_SPS(), bArr), new TopicPacket(companion.getSUFFIX_VIDEO_AVC_PPS(), bArr2), new TopicPacket(companion.getSUFFIX_VIDEO_AVC_SEI(), bArr3), new TopicPacket(companion.getSUFFIX_VIDEO_AVC_IDR(), bArr4), new TopicPacket(companion.getSUFFIX_VIDEO_AVC_NDR(), bArr5), new TopicPacket(companion.getSUFFIX_MATCH_VIDEO_HEVC(), new byte[]{1, 1, 0}), new TopicPacket(companion.getSUFFIX_MATCH_VIDEO_XVC(), new byte[]{1, 2, 0}), new TopicPacket(companion.getSUFFIX_MATCH_VIDEO_AV1(), new byte[]{1, 3, 0}), new TopicPacket(companion.getSUFFIX_MATCH_VIDEO_VP9(), new byte[]{1, 4, 0}), new TopicPacket(companion.getSUFFIX_MATCH_AUDIO_AAC(), new byte[]{2, 0, 0}), new TopicPacket(companion.getSUFFIX_AUDIO_AAC_ASC(), bArr6), new TopicPacket(companion.getSUFFIX_AUDIO_AAC_RAW(), bArr7), new TopicPacket(companion.getSUFFIX_MATCH_AUDIO_MP3(), new byte[]{2, 1, 0}), new TopicPacket(companion.getSUFFIX_MATCH_AUDIO_SPEEX(), new byte[]{2, 2, 0}), new TopicPacket(companion.getSUFFIX_MATCH_AUDIO_FLAC(), new byte[]{2, 3, 0}), new TopicPacket(companion.getSUFFIX_MATCH_AUDIO_OPUS(), new byte[]{2, 4, 0}), new TopicPacket(companion.getSUFFIX_MATCH_ANIMATION_APNG(), new byte[]{3, 0, 0}), new TopicPacket(companion.getSUFFIX_MATCH_ANIMATION_GIF(), new byte[]{3, 1, 0}), new TopicPacket(companion.getSUFFIX_MATCH_ANIMATION_WEBM(), new byte[]{3, 2, 0}), new TopicPacket(companion.getSUFFIX_MATCH_LIPMETA(), new byte[]{4, 0, 0}), new TopicPacket(companion.getSUFFIX_LIPMETA_A(), new byte[]{4, 0, 1}), new TopicPacket(companion.getSUFFIX_LIPMETA_B(), new byte[]{4, 0, 2}), new TopicPacket(companion.getSUFFIX_LIPMETA_C(), new byte[]{4, 0, 3}), new TopicPacket(companion.getSUFFIX_HLS_AVCDCR(), bArr8), new TopicPacket(companion.getSUFFIX_HLS_AACASC(), bArr9), new TopicPacket(companion.getSUFFIX_HLS_TS(), bArr10), new TopicPacket(companion.getSUFFIX_HLS_LHLS_CHUNK(), bArr11), new TopicPacket(companion.getSUFFIX_HLS_LHLS_SEQ(), bArr12));
    }
}
