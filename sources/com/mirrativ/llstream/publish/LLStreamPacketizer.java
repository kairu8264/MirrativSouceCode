package com.mirrativ.llstream.publish;

import android.media.MediaCodec;
import android.util.Log;
import com.mirrativ.llstream.decoder.a;
import com.mirrativ.llstream.extension.UintKt;
import com.mirrativ.llstream.protocol.v1.packet.Packet;
import com.mirrativ.llstream.protocol.v1.packet.PacketConstant;
import com.mirrativ.llstream.protocol.v1.tag.DefUnTag;
import com.mirrativ.llstream.protocol.v1.time.PacketTime;
import com.mirrativ.llstream.protocol.v1.time.TimeContext;
import com.mirrativ.llstream.protocol.v1.topic.Extend;
import com.mirrativ.llstream.protocol.v1.topic.PacketType;
import com.mirrativ.llstream.protocol.v1.topic.StreamTopic;
import com.mirrativ.llstream.protocol.v1.topic.StreamTopicBuilder;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.ArrayList;
import jo.h;
import jo.p;
import po.n;
import wn.s;
import xn.o;

/* loaded from: classes4.dex */
public final class LLStreamPacketizer {
    private static final int MIN_START_CODE_LEN = 3;
    private static final int SIZE_LEN = 4;
    public static final String TAG = "LLStreamPacketizer";
    private static final StreamTopic aacTopic;
    private static final StreamTopic ascTopic;
    private static final StreamTopic idrTopic;
    private static final StreamTopic ndrTopic;
    private static final StreamTopic ppsTopic;
    private static final StreamTopic seiTopic;
    private static final StreamTopic spsTopic;
    private LLStreamPacketizerListener listener;
    private boolean useCurrentTimestampAsPacketTime;
    public static final Companion Companion = new Companion(null);
    private static final double oneDayBeforeUs = (Instant.now().getEpochSecond() - 86400) * 1000000.0d;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final StreamTopic getAacTopic() {
            return LLStreamPacketizer.aacTopic;
        }

        public final StreamTopic getAscTopic() {
            return LLStreamPacketizer.ascTopic;
        }

        public final StreamTopic getIdrTopic() {
            return LLStreamPacketizer.idrTopic;
        }

        public final StreamTopic getNdrTopic() {
            return LLStreamPacketizer.ndrTopic;
        }

        public final StreamTopic getPpsTopic() {
            return LLStreamPacketizer.ppsTopic;
        }

        public final StreamTopic getSeiTopic() {
            return LLStreamPacketizer.seiTopic;
        }

        public final StreamTopic getSpsTopic() {
            return LLStreamPacketizer.spsTopic;
        }

        public final boolean isMatchBytes(byte[] bArr, byte[] bArr2, int i10) {
            p.h(bArr, "pattern");
            p.h(bArr2, "inputByteArray");
            int length = bArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (bArr2[i10 + i11] != bArr[i11]) {
                    return false;
                }
            }
            return true;
        }

        public final ByteBuffer transformAnnexBtoAVCC(ByteBuffer byteBuffer) {
            int i10;
            p.h(byteBuffer, "buffer");
            byte[] array = byteBuffer.array();
            int length = array.length;
            if (length < 3) {
                return byteBuffer;
            }
            ArrayList<byte[]> arrayList = new ArrayList();
            byte[] bArr = {0, 0, 0, 1};
            byte[] bArr2 = {0, 0, 1};
            int i11 = 4;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            while (i14 < length - 4) {
                p.g(array, "byteArray");
                if (isMatchBytes(bArr, array, i14)) {
                    i10 = i14 + 4;
                    i11 = 4;
                } else if (isMatchBytes(bArr2, array, i14)) {
                    i10 = i14 + 3;
                    i11 = 3;
                } else {
                    i14++;
                }
                if (i13 >= 0) {
                    byte[] X = o.X(array, n.t(i13 + i11, i14));
                    arrayList.add(X);
                    i15 = X.length + 4 + i15;
                }
                i12 = i14;
                i13 = i12;
                i14 = i10;
            }
            if (i12 == -1) {
                return byteBuffer;
            }
            if (!arrayList.isEmpty()) {
                i11 += i13;
            }
            p.g(array, "byteArray");
            byte[] X2 = o.X(array, n.t(i11, length));
            arrayList.add(X2);
            ByteBuffer allocate = ByteBuffer.allocate(X2.length + 4 + i15);
            allocate.position(0);
            for (byte[] bArr3 : arrayList) {
                allocate.put(o.U(UintKt.m27toByteArrayWZ4Q5Ns(s.a(bArr3.length))));
                allocate.put(bArr3);
            }
            p.g(allocate, "byteStreamBuffer");
            return allocate;
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Extend.values().length];
            iArr[Extend.AAC_ASC.ordinal()] = 1;
            iArr[Extend.AAC_RAW.ordinal()] = 2;
            iArr[Extend.AVC_SPS.ordinal()] = 3;
            iArr[Extend.AVC_PPS.ordinal()] = 4;
            iArr[Extend.AVC_IDR.ordinal()] = 5;
            iArr[Extend.AVC_NDR.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        StreamTopicBuilder anyStream = new StreamTopicBuilder().setAnyStream();
        PacketType packetType = PacketType.AUDIO_AAC;
        ascTopic = anyStream.setPacketType(packetType).setExtend(Extend.AAC_ASC).build();
        aacTopic = new StreamTopicBuilder().setAnyStream().setPacketType(packetType).setExtend(Extend.AAC_RAW).build();
        StreamTopicBuilder anyStream2 = new StreamTopicBuilder().setAnyStream();
        PacketType packetType2 = PacketType.VIDEO_AVC;
        spsTopic = anyStream2.setPacketType(packetType2).setExtend(Extend.AVC_SPS).build();
        ppsTopic = new StreamTopicBuilder().setAnyStream().setPacketType(packetType2).setExtend(Extend.AVC_PPS).build();
        seiTopic = new StreamTopicBuilder().setAnyStream().setPacketType(packetType2).setExtend(Extend.AVC_SEI).build();
        idrTopic = new StreamTopicBuilder().setAnyStream().setPacketType(packetType2).setExtend(Extend.AVC_IDR).build();
        ndrTopic = new StreamTopicBuilder().setAnyStream().setPacketType(packetType2).setExtend(Extend.AVC_NDR).build();
    }

    public final LLStreamPacketizerListener getListener() {
        return this.listener;
    }

    public final boolean getUseCurrentTimestampAsPacketTime() {
        return this.useCurrentTimestampAsPacketTime;
    }

    public final void packetizeAAC(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer, Extend extend) {
        PacketTime now;
        p.h(bufferInfo, "info");
        p.h(byteBuffer, "buffer");
        p.h(extend, "extend");
        if (!this.useCurrentTimestampAsPacketTime && bufferInfo.presentationTimeUs >= oneDayBeforeUs) {
            now = new PacketTime(bufferInfo.presentationTimeUs / 1000, TimeContext.Companion.getShared().incrementAndGet());
        } else {
            now = PacketTime.Companion.now();
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[extend.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity() + 17);
            allocate.put(PacketConstant.Companion.getSYNC_BYTE());
            p.g(allocate, "audioData");
            Packet packet = new Packet(allocate);
            StreamTopic streamTopic = aacTopic;
            DefUnTag shared = DefUnTag.Companion.getShared();
            byte[] array = byteBuffer.array();
            p.g(array, "buffer.array()");
            packet.write(now, streamTopic, shared, array);
            LLStreamPacketizerListener lLStreamPacketizerListener = this.listener;
            if (lLStreamPacketizerListener != null) {
                lLStreamPacketizerListener.onPacketize(this, streamTopic, packet);
                return;
            }
            return;
        }
        ByteBuffer allocate2 = ByteBuffer.allocate(byteBuffer.capacity() + 17);
        allocate2.put(PacketConstant.Companion.getSYNC_BYTE());
        p.g(allocate2, "audioData");
        Packet packet2 = new Packet(allocate2);
        if (Log.isLoggable(TAG, 3)) {
            StringBuilder a10 = a.a("asc: ");
            byte[] array2 = byteBuffer.array();
            p.g(array2, "buffer.array()");
            a10.append(o.c0(array2));
            Log.d(TAG, a10.toString());
        }
        StreamTopic streamTopic2 = ascTopic;
        DefUnTag shared2 = DefUnTag.Companion.getShared();
        byte[] array3 = byteBuffer.array();
        p.g(array3, "buffer.array()");
        packet2.write(now, streamTopic2, shared2, array3);
        LLStreamPacketizerListener lLStreamPacketizerListener2 = this.listener;
        if (lLStreamPacketizerListener2 != null) {
            lLStreamPacketizerListener2.onPacketize(this, streamTopic2, packet2);
        }
    }

    public final void packetizeAVC(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer, Extend extend) {
        PacketTime now;
        p.h(bufferInfo, "info");
        p.h(byteBuffer, "buffer");
        p.h(extend, "extend");
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity() + 17);
        allocate.put(PacketConstant.Companion.getSYNC_BYTE());
        p.g(allocate, "videoData");
        Packet packet = new Packet(allocate);
        if (!this.useCurrentTimestampAsPacketTime && bufferInfo.presentationTimeUs >= oneDayBeforeUs) {
            now = new PacketTime(bufferInfo.presentationTimeUs / 1000, TimeContext.Companion.getShared().incrementAndGet());
        } else {
            now = PacketTime.Companion.now();
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[extend.ordinal()];
        if (i10 == 3) {
            StreamTopic streamTopic = spsTopic;
            DefUnTag shared = DefUnTag.Companion.getShared();
            byte[] array = byteBuffer.array();
            p.g(array, "buffer.array()");
            packet.write(now, streamTopic, shared, array);
            LLStreamPacketizerListener lLStreamPacketizerListener = this.listener;
            if (lLStreamPacketizerListener != null) {
                lLStreamPacketizerListener.onPacketize(this, streamTopic, packet);
            }
        } else if (i10 == 4) {
            StreamTopic streamTopic2 = ppsTopic;
            DefUnTag shared2 = DefUnTag.Companion.getShared();
            byte[] array2 = byteBuffer.array();
            p.g(array2, "buffer.array()");
            packet.write(now, streamTopic2, shared2, array2);
            LLStreamPacketizerListener lLStreamPacketizerListener2 = this.listener;
            if (lLStreamPacketizerListener2 != null) {
                lLStreamPacketizerListener2.onPacketize(this, streamTopic2, packet);
            }
        } else if (i10 == 5) {
            ByteBuffer transformAnnexBtoAVCC = Companion.transformAnnexBtoAVCC(byteBuffer);
            StreamTopic streamTopic3 = idrTopic;
            DefUnTag shared3 = DefUnTag.Companion.getShared();
            byte[] array3 = transformAnnexBtoAVCC.array();
            p.g(array3, "transformedBuffer.array()");
            packet.write(now, streamTopic3, shared3, array3);
            LLStreamPacketizerListener lLStreamPacketizerListener3 = this.listener;
            if (lLStreamPacketizerListener3 != null) {
                lLStreamPacketizerListener3.onPacketize(this, streamTopic3, packet);
            }
        } else if (i10 != 6) {
            Log.w(TAG, "unknown extend");
        } else {
            ByteBuffer transformAnnexBtoAVCC2 = Companion.transformAnnexBtoAVCC(byteBuffer);
            StreamTopic streamTopic4 = ndrTopic;
            DefUnTag shared4 = DefUnTag.Companion.getShared();
            byte[] array4 = transformAnnexBtoAVCC2.array();
            p.g(array4, "transformedBuffer.array()");
            packet.write(now, streamTopic4, shared4, array4);
            LLStreamPacketizerListener lLStreamPacketizerListener4 = this.listener;
            if (lLStreamPacketizerListener4 != null) {
                lLStreamPacketizerListener4.onPacketize(this, streamTopic4, packet);
            }
        }
    }

    public final void setListener(LLStreamPacketizerListener lLStreamPacketizerListener) {
        this.listener = lLStreamPacketizerListener;
    }

    public final void setUseCurrentTimestampAsPacketTime(boolean z10) {
        this.useCurrentTimestampAsPacketTime = z10;
    }
}
