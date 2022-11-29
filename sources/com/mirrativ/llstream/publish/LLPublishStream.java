package com.mirrativ.llstream.publish;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.mirrativ.llstream.decoder.a;
import com.mirrativ.llstream.encoder.AACEncoder;
import com.mirrativ.llstream.encoder.AVCEncoder;
import com.mirrativ.llstream.encoder.AudioEncoder;
import com.mirrativ.llstream.encoder.AudioEncoderListener;
import com.mirrativ.llstream.encoder.AudioEncoderSetting;
import com.mirrativ.llstream.encoder.VideoEncoder;
import com.mirrativ.llstream.encoder.VideoEncoderListener;
import com.mirrativ.llstream.encoder.VideoEncoderSetting;
import com.mirrativ.llstream.protocol.v1.packet.Packet;
import com.mirrativ.llstream.protocol.v1.topic.Extend;
import com.mirrativ.llstream.protocol.v1.topic.StreamTopic;
import com.mirrativ.llstream.publish.LLStreamPacketizer;
import com.mirrativ.llstream.publish.WebSocketPublishStream;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import jo.h;
import jo.p;
import po.n;
import uo.d2;
import uo.g1;
import uo.l;
import uo.q0;
import uo.r0;
import wn.r;
import xn.o;

/* loaded from: classes4.dex */
public final class LLPublishStream implements LLStreamPacketizerListener, WebSocketPublishStreamListener, AudioEncoderListener, VideoEncoderListener {
    public static final String TAG = "LLPublishStream";
    private final AudioEncoder audioEncoder;
    private Map<Extend, Packet> cache;
    private d2 checkTicker;
    private final q0 coroutineScope;
    private boolean isPublished;
    private Map<Extend, Boolean> isSent;
    private LLPublishStreamListener listener;
    private final LLStreamPacketizer llStreamPacketizer;
    private final LLPublishStreamParams params;
    private byte[] pps;
    private WebSocketPublishStream publishStream;
    private byte[] sps;
    private URI url;
    private final VideoEncoder videoEncoder;
    public static final Companion Companion = new Companion(null);
    private static int maxDelayFrameCount = 80;

    /* loaded from: classes4.dex */
    public enum AVMediaType {
        VIDEO,
        AUDIO
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final int getMaxDelayFrameCount() {
            return LLPublishStream.maxDelayFrameCount;
        }

        public final void setMaxDelayFrameCount(int i10) {
            LLPublishStream.maxDelayFrameCount = i10;
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[AVMediaType.values().length];
            iArr[AVMediaType.VIDEO.ordinal()] = 1;
            iArr[AVMediaType.AUDIO.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Extend.values().length];
            iArr2[Extend.AAC_ASC.ordinal()] = 1;
            iArr2[Extend.AVC_SPS.ordinal()] = 2;
            iArr2[Extend.AVC_PPS.ordinal()] = 3;
            iArr2[Extend.AVC_IDR.ordinal()] = 4;
            iArr2[Extend.AAC_RAW.ordinal()] = 5;
            iArr2[Extend.AVC_NDR.ordinal()] = 6;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[WebSocketPublishStream.ConnectionState.values().length];
            iArr3[WebSocketPublishStream.ConnectionState.OPENING.ordinal()] = 1;
            iArr3[WebSocketPublishStream.ConnectionState.OPENED.ordinal()] = 2;
            iArr3[WebSocketPublishStream.ConnectionState.CLOSING.ordinal()] = 3;
            iArr3[WebSocketPublishStream.ConnectionState.CLOSED.ordinal()] = 4;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public LLPublishStream() {
        this(null, null, 3, null);
    }

    public LLPublishStream(q0 q0Var, LLPublishStreamParams lLPublishStreamParams) {
        p.h(q0Var, "coroutineScope");
        p.h(lLPublishStreamParams, "params");
        this.coroutineScope = q0Var;
        this.params = lLPublishStreamParams;
        this.isSent = new LinkedHashMap();
        this.cache = new LinkedHashMap();
        this.sps = new byte[0];
        this.pps = new byte[0];
        LLStreamPacketizer lLStreamPacketizer = new LLStreamPacketizer();
        this.llStreamPacketizer = lLStreamPacketizer;
        lLStreamPacketizer.setUseCurrentTimestampAsPacketTime(lLPublishStreamParams.getUseCurrentTimestampAsPacketTime());
        lLStreamPacketizer.setListener(this);
        this.videoEncoder = new AVCEncoder(q0Var);
        this.audioEncoder = new AACEncoder(q0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void appendSampleBuffer$default(LLPublishStream lLPublishStream, ByteBuffer byteBuffer, AVMediaType aVMediaType, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = new HashMap();
        }
        lLPublishStream.appendSampleBuffer(byteBuffer, aVMediaType, map);
    }

    private final boolean getAudioStreamInitialized() {
        return this.isSent.getOrDefault(Extend.AAC_ASC, Boolean.FALSE).booleanValue();
    }

    private final boolean getVideoStreamFirstKeyframeSent() {
        return this.isSent.getOrDefault(Extend.AVC_IDR, Boolean.FALSE).booleanValue();
    }

    private final boolean getVideoStreamInitialized() {
        Map<Extend, Boolean> map = this.isSent;
        Extend extend = Extend.AVC_SPS;
        Boolean bool = Boolean.FALSE;
        return map.getOrDefault(extend, bool).booleanValue() && this.isSent.getOrDefault(Extend.AVC_PPS, bool).booleanValue();
    }

    private final void parseSPSPPS(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        int i10;
        byte[] array = byteBuffer.array();
        ArrayList arrayList = new ArrayList();
        p.g(array, "array");
        for (byte b10 : array) {
            arrayList.add(r.a(r.c(b10)));
        }
        byte[] bArr = {0, 0, 0, 1};
        byte[] bArr2 = {0, 0, 1};
        ArrayList arrayList2 = new ArrayList();
        int i11 = 4;
        int i12 = 0;
        int i13 = -1;
        int i14 = -1;
        while (i12 < bufferInfo.size - 4) {
            LLStreamPacketizer.Companion companion = LLStreamPacketizer.Companion;
            if (companion.isMatchBytes(bArr, array, i12)) {
                i10 = i12 + 4;
                i11 = 4;
            } else if (companion.isMatchBytes(bArr2, array, i12)) {
                i10 = i12 + 3;
                i11 = 3;
            } else {
                i12++;
            }
            if (i14 != -1) {
                arrayList2.add(o.X(array, n.t(i14 + i11, i12)));
            }
            i14 = i12;
            i12 = i10;
            i13 = i14;
        }
        if (i13 == -1) {
            LLPublishStreamListener lLPublishStreamListener = this.listener;
            if (lLPublishStreamListener != null) {
                lLPublishStreamListener.onLLStreamError(this, new IllegalStateException("Failed to parse sps/pps"));
                return;
            }
            return;
        }
        arrayList2.add(o.X(array, n.t(i14 + i11, array.length)));
        if (arrayList2.size() != 2) {
            LLPublishStreamListener lLPublishStreamListener2 = this.listener;
            if (lLPublishStreamListener2 != null) {
                lLPublishStreamListener2.onLLStreamError(this, new IllegalStateException("Failed to parse sps/pps"));
                return;
            }
            return;
        }
        this.sps = (byte[]) arrayList2.get(0);
        if (Log.isLoggable(TAG, 3)) {
            StringBuilder a10 = a.a("sps: ");
            a10.append(o.c0(this.sps));
            Log.d(TAG, a10.toString());
        }
        this.pps = (byte[]) arrayList2.get(1);
        if (Log.isLoggable(TAG, 3)) {
            StringBuilder a11 = a.a("pps: ");
            a11.append(o.c0(this.pps));
            Log.d(TAG, a11.toString());
        }
        LLStreamPacketizer lLStreamPacketizer = this.llStreamPacketizer;
        ByteBuffer wrap = ByteBuffer.wrap(this.sps);
        p.g(wrap, "wrap(sps)");
        lLStreamPacketizer.packetizeAVC(bufferInfo, wrap, Extend.AVC_SPS);
        LLStreamPacketizer lLStreamPacketizer2 = this.llStreamPacketizer;
        ByteBuffer wrap2 = ByteBuffer.wrap(this.pps);
        p.g(wrap2, "wrap(pps)");
        lLStreamPacketizer2.packetizeAVC(bufferInfo, wrap2, Extend.AVC_PPS);
    }

    private final void sendAAC(Packet packet) {
        if (!getAudioStreamInitialized()) {
            sendASC();
        }
        if (getAudioStreamInitialized()) {
            WebSocketPublishStream webSocketPublishStream = this.publishStream;
            if (webSocketPublishStream != null) {
                webSocketPublishStream.send(packet);
                return;
            }
            return;
        }
        Log.w(TAG, "audio stream is not initialized");
    }

    private final void sendASC() {
        Map<Extend, Packet> map = this.cache;
        Extend extend = Extend.AAC_ASC;
        Packet packet = map.get(extend);
        if (packet == null) {
            return;
        }
        Map<Extend, Boolean> map2 = this.isSent;
        WebSocketPublishStream webSocketPublishStream = this.publishStream;
        map2.put(extend, Boolean.valueOf(webSocketPublishStream != null ? webSocketPublishStream.send(packet) : false));
    }

    private final void sendIDR() {
        if (!getVideoStreamInitialized()) {
            sendSPS();
            sendPPS();
        }
        if (getVideoStreamInitialized()) {
            Map<Extend, Packet> map = this.cache;
            Extend extend = Extend.AVC_IDR;
            Packet packet = map.get(extend);
            if (packet == null) {
                return;
            }
            Map<Extend, Boolean> map2 = this.isSent;
            WebSocketPublishStream webSocketPublishStream = this.publishStream;
            map2.put(extend, Boolean.valueOf(webSocketPublishStream != null ? webSocketPublishStream.send(packet) : false));
        }
    }

    private final void sendNDR(Packet packet) {
        if (!getVideoStreamFirstKeyframeSent()) {
            sendIDR();
        }
        if (getVideoStreamFirstKeyframeSent()) {
            Map<Extend, Boolean> map = this.isSent;
            Extend extend = Extend.AVC_IDR;
            WebSocketPublishStream webSocketPublishStream = this.publishStream;
            map.put(extend, Boolean.valueOf(webSocketPublishStream != null ? webSocketPublishStream.send(packet) : false));
            if (p.c(this.isSent.get(extend), Boolean.TRUE)) {
                return;
            }
            this.cache.remove(extend);
            return;
        }
        Log.w(TAG, "video idr is not sent yet");
    }

    private final void sendPPS() {
        Map<Extend, Packet> map = this.cache;
        Extend extend = Extend.AVC_PPS;
        Packet packet = map.get(extend);
        if (packet == null) {
            return;
        }
        Map<Extend, Boolean> map2 = this.isSent;
        WebSocketPublishStream webSocketPublishStream = this.publishStream;
        map2.put(extend, Boolean.valueOf(webSocketPublishStream != null ? webSocketPublishStream.send(packet) : false));
    }

    private final void sendSPS() {
        Map<Extend, Packet> map = this.cache;
        Extend extend = Extend.AVC_SPS;
        Packet packet = map.get(extend);
        if (packet == null) {
            return;
        }
        Map<Extend, Boolean> map2 = this.isSent;
        WebSocketPublishStream webSocketPublishStream = this.publishStream;
        map2.put(extend, Boolean.valueOf(webSocketPublishStream != null ? webSocketPublishStream.send(packet) : false));
    }

    public final void appendSampleBuffer(ByteBuffer byteBuffer, AVMediaType aVMediaType, Map<String, ? extends Object> map) {
        p.h(byteBuffer, "buffer");
        p.h(aVMediaType, "type");
        p.h(map, "options");
        if (WhenMappings.$EnumSwitchMapping$0[aVMediaType.ordinal()] != 2) {
            return;
        }
        AudioEncoder audioEncoder = this.audioEncoder;
        byte[] array = byteBuffer.array();
        p.g(array, "buffer.array()");
        audioEncoder.enqueueSampleBuffer(array);
    }

    public final void close() {
        WebSocketPublishStream webSocketPublishStream = this.publishStream;
        if (webSocketPublishStream != null) {
            webSocketPublishStream.close();
        }
        WebSocketPublishStream webSocketPublishStream2 = this.publishStream;
        if (webSocketPublishStream2 != null) {
            webSocketPublishStream2.release();
        }
        stopEncoders();
        d2 d2Var = this.checkTicker;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.checkTicker = null;
    }

    public final void connect(URI uri) {
        p.h(uri, "url");
        this.url = uri;
        WebSocketPublishStream webSocketPublishStream = new WebSocketPublishStream(this.coroutineScope, uri, this.params.getUserAgent(), this);
        this.publishStream = webSocketPublishStream;
        webSocketPublishStream.open();
    }

    public final void forceClose() {
        WebSocketPublishStream webSocketPublishStream = this.publishStream;
        if (webSocketPublishStream != null) {
            webSocketPublishStream.forceClose();
        }
        WebSocketPublishStream webSocketPublishStream2 = this.publishStream;
        if (webSocketPublishStream2 != null) {
            webSocketPublishStream2.release();
        }
        stopEncoders();
        d2 d2Var = this.checkTicker;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.checkTicker = null;
    }

    public final AudioEncoder getAudioEncoder() {
        return this.audioEncoder;
    }

    public final AudioEncoderSetting getAudioSetting() {
        return this.audioEncoder.getSetting();
    }

    public final q0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final LLPublishStreamListener getListener() {
        return this.listener;
    }

    public final WebSocketPublishStream getPublishStream() {
        return this.publishStream;
    }

    public final Surface getSurface() {
        return this.videoEncoder.getSurface();
    }

    public final long getTotalOutBytes() {
        AtomicLong totalBytesOut;
        WebSocketPublishStream webSocketPublishStream = this.publishStream;
        if (webSocketPublishStream == null || (totalBytesOut = webSocketPublishStream.getTotalBytesOut()) == null) {
            return 0L;
        }
        return totalBytesOut.get();
    }

    public final long getTotalOutCount() {
        AtomicLong totalOutCount;
        WebSocketPublishStream webSocketPublishStream = this.publishStream;
        if (webSocketPublishStream == null || (totalOutCount = webSocketPublishStream.getTotalOutCount()) == null) {
            return 0L;
        }
        return totalOutCount.get();
    }

    public final long getTotalQueuedOutBytes() {
        AtomicLong queuedBytesOut;
        WebSocketPublishStream webSocketPublishStream = this.publishStream;
        if (webSocketPublishStream == null || (queuedBytesOut = webSocketPublishStream.getQueuedBytesOut()) == null) {
            return 0L;
        }
        return queuedBytesOut.get();
    }

    public final long getTotalQueuedOutCount() {
        AtomicLong queuedOutCount;
        WebSocketPublishStream webSocketPublishStream = this.publishStream;
        if (webSocketPublishStream == null || (queuedOutCount = webSocketPublishStream.getQueuedOutCount()) == null) {
            return 0L;
        }
        return queuedOutCount.get();
    }

    public final URI getUrl() {
        return this.url;
    }

    public final VideoEncoder getVideoEncoder() {
        return this.videoEncoder;
    }

    public final VideoEncoderSetting getVideoSetting() {
        return this.videoEncoder.getSetting();
    }

    public final boolean isPublished() {
        return this.isPublished;
    }

    @Override // com.mirrativ.llstream.encoder.AudioEncoderListener
    public void onAudioEncoderError(Throwable th2) {
        p.h(th2, "throwable");
        LLPublishStreamListener lLPublishStreamListener = this.listener;
        if (lLPublishStreamListener != null) {
            lLPublishStreamListener.onLLStreamError(this, th2);
        }
    }

    @Override // com.mirrativ.llstream.encoder.AudioEncoderListener
    public void onAudioSampleOutput(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        p.h(bufferInfo, "info");
        p.h(byteBuffer, "data");
        if ((bufferInfo.flags & 2) != 0) {
            this.llStreamPacketizer.packetizeAAC(bufferInfo, byteBuffer, Extend.AAC_ASC);
        } else {
            this.llStreamPacketizer.packetizeAAC(bufferInfo, byteBuffer, Extend.AAC_RAW);
        }
    }

    @Override // com.mirrativ.llstream.encoder.AudioEncoderListener
    public void onChangeAudioFormat(MediaFormat mediaFormat) {
        p.h(mediaFormat, "format");
        Log.i(TAG, "onChangeAudioFormat " + mediaFormat);
    }

    @Override // com.mirrativ.llstream.publish.WebSocketPublishStreamListener
    public void onChangeConnectionState(WebSocketPublishStream webSocketPublishStream, WebSocketPublishStream.ConnectionState connectionState) {
        LLPublishStreamListener lLPublishStreamListener;
        p.h(webSocketPublishStream, "stream");
        p.h(connectionState, "state");
        if (Log.isLoggable(TAG, 4)) {
            StringBuilder a10 = a.a("onChangeConnectionState state=");
            a10.append(connectionState.name());
            Log.i(TAG, a10.toString());
        }
        int i10 = WhenMappings.$EnumSwitchMapping$2[connectionState.ordinal()];
        if (i10 != 2) {
            if (i10 == 4 && (lLPublishStreamListener = this.listener) != null) {
                lLPublishStreamListener.onLLStreamDisconnected(this);
                return;
            }
            return;
        }
        Map<Extend, Boolean> map = this.isSent;
        Extend extend = Extend.AVC_SPS;
        Boolean bool = Boolean.FALSE;
        map.put(extend, bool);
        this.isSent.put(Extend.AVC_PPS, bool);
        this.isSent.put(Extend.AVC_SEI, bool);
        this.isSent.put(Extend.AVC_IDR, bool);
        this.isSent.put(Extend.AAC_ASC, bool);
        LLPublishStreamListener lLPublishStreamListener2 = this.listener;
        if (lLPublishStreamListener2 != null) {
            lLPublishStreamListener2.onLLStreamConnected(this);
        }
    }

    @Override // com.mirrativ.llstream.encoder.VideoEncoderListener
    public void onChangeVideoFormat(MediaFormat mediaFormat) {
        p.h(mediaFormat, "videoFormat");
        Log.i(TAG, "onChangeVideoFormat");
    }

    @Override // com.mirrativ.llstream.publish.WebSocketPublishStreamListener
    public void onError(WebSocketPublishStream webSocketPublishStream, WebSocketPublishStream.WebSocketStreamError webSocketStreamError) {
        p.h(webSocketPublishStream, "stream");
        p.h(webSocketStreamError, MRLog.PAYLOAD_KEY_ERROR);
        Log.i(TAG, "onError error=" + webSocketStreamError.getMessage());
        LLPublishStreamListener lLPublishStreamListener = this.listener;
        if (lLPublishStreamListener != null) {
            lLPublishStreamListener.onLLStreamError(this, webSocketStreamError);
        }
    }

    @Override // com.mirrativ.llstream.publish.WebSocketPublishStreamListener
    public void onExceededMaxReconnectCount(WebSocketPublishStream webSocketPublishStream, int i10) {
        p.h(webSocketPublishStream, "stream");
        Log.i(TAG, "onExceededMaxReconnectCount retryCount=" + i10);
    }

    @Override // com.mirrativ.llstream.publish.LLStreamPacketizerListener
    public void onPacketize(LLStreamPacketizer lLStreamPacketizer, StreamTopic streamTopic, Packet packet) {
        AtomicInteger noSentCount;
        p.h(lLStreamPacketizer, "packetizer");
        p.h(streamTopic, "topic");
        p.h(packet, "packet");
        WebSocketPublishStream webSocketPublishStream = this.publishStream;
        if (((webSocketPublishStream == null || (noSentCount = webSocketPublishStream.getNoSentCount()) == null) ? 0 : noSentCount.get()) > 0) {
            Map<Extend, Boolean> map = this.isSent;
            Extend extend = Extend.AVC_IDR;
            map.put(extend, Boolean.FALSE);
            this.cache.remove(extend);
        }
        Extend extend2 = streamTopic.getExtend();
        if (extend2 == null) {
            return;
        }
        int[] iArr = WhenMappings.$EnumSwitchMapping$1;
        int i10 = iArr[extend2.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            this.cache.put(extend2, packet);
        }
        switch (iArr[extend2.ordinal()]) {
            case 1:
                sendASC();
                return;
            case 2:
                sendSPS();
                return;
            case 3:
                sendPPS();
                return;
            case 4:
                sendIDR();
                return;
            case 5:
                sendAAC(packet);
                return;
            case 6:
                sendNDR(packet);
                return;
            default:
                return;
        }
    }

    @Override // com.mirrativ.llstream.publish.WebSocketPublishStreamListener
    public void onPublishStreamStalled(WebSocketPublishStream webSocketPublishStream) {
        p.h(webSocketPublishStream, "stream");
        Log.i(TAG, "onPublishStreamStalled stalled");
        LLPublishStreamListener lLPublishStreamListener = this.listener;
        if (lLPublishStreamListener != null) {
            lLPublishStreamListener.onPublishStreamStalled(this);
        }
    }

    @Override // com.mirrativ.llstream.publish.WebSocketPublishStreamListener
    public void onRetryToConnect(WebSocketPublishStream webSocketPublishStream, int i10) {
        p.h(webSocketPublishStream, "stream");
        Log.i(TAG, "onRetryToConnect retryCount=" + i10);
    }

    @Override // com.mirrativ.llstream.encoder.VideoEncoderListener
    public void onVideoEncoderError(Throwable th2) {
        p.h(th2, "throwable");
        LLPublishStreamListener lLPublishStreamListener = this.listener;
        if (lLPublishStreamListener != null) {
            lLPublishStreamListener.onLLStreamError(this, th2);
        }
    }

    @Override // com.mirrativ.llstream.encoder.VideoEncoderListener
    public void onVideoSampleOutput(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        p.h(bufferInfo, "info");
        p.h(byteBuffer, "buffer");
        int i10 = bufferInfo.flags;
        if ((i10 & 2) != 0) {
            parseSPSPPS(bufferInfo, byteBuffer);
        } else if ((i10 & 1) != 0) {
            this.llStreamPacketizer.packetizeAVC(bufferInfo, byteBuffer, Extend.AVC_IDR);
        } else {
            this.llStreamPacketizer.packetizeAVC(bufferInfo, byteBuffer, Extend.AVC_NDR);
        }
    }

    public final void prepare() {
        this.videoEncoder.prepare();
        this.audioEncoder.prepare();
    }

    public final void publish() {
        d2 d10;
        if (this.isPublished) {
            return;
        }
        this.audioEncoder.setListener(this);
        this.audioEncoder.startRunning();
        this.videoEncoder.setListener(this);
        this.videoEncoder.startRunning();
        this.isPublished = true;
        d10 = l.d(this.coroutineScope, null, null, new LLPublishStream$publish$1(this, null), 3, null);
        this.checkTicker = d10;
    }

    public final void reconnect() {
        WebSocketPublishStream webSocketPublishStream = this.publishStream;
        if (webSocketPublishStream != null) {
            webSocketPublishStream.reconnect();
        }
    }

    public final void setListener(LLPublishStreamListener lLPublishStreamListener) {
        this.listener = lLPublishStreamListener;
    }

    public final void setPublishStream(WebSocketPublishStream webSocketPublishStream) {
        this.publishStream = webSocketPublishStream;
    }

    public final void setPublished(boolean z10) {
        this.isPublished = z10;
    }

    public final void setUrl(URI uri) {
        this.url = uri;
    }

    public final void stopEncoders() {
        this.audioEncoder.stopRunning();
        this.audioEncoder.setListener(null);
        this.videoEncoder.stopRunning();
        this.videoEncoder.setListener(null);
    }

    public /* synthetic */ LLPublishStream(q0 q0Var, LLPublishStreamParams lLPublishStreamParams, int i10, h hVar) {
        this((i10 & 1) != 0 ? r0.a(g1.a()) : q0Var, (i10 & 2) != 0 ? new LLPublishStreamParams(null, false, 3, null) : lLPublishStreamParams);
    }
}
