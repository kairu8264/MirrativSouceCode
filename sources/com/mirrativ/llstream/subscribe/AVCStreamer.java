package com.mirrativ.llstream.subscribe;

import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.mirrativ.llstream.decoder.AVCDecoder;
import com.mirrativ.llstream.decoder.AVCDecoderCallback;
import com.mirrativ.llstream.decoder.JitterCoordinator;
import com.mirrativ.llstream.decoder.PacketParser;
import com.mirrativ.llstream.decoder.VideoDecodeParams;
import com.mirrativ.llstream.decoder.a;
import com.mirrativ.llstream.protocol.v1.packet.PacketConstant;
import com.mirrativ.llstream.protocol.v1.packet.PacketUtil;
import com.mirrativ.llstream.protocol.v1.topic.Extend;
import com.mirrativ.llstream.subscribe.WebSocketStream;
import i7.e;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;
import jo.h;
import jo.p;
import po.i;
import po.n;
import uo.d2;
import uo.g1;
import uo.l;
import uo.q0;
import uo.r0;
import xn.o;

/* loaded from: classes4.dex */
public final class AVCStreamer implements PacketParser, AVCDecoderCallback, LLStreamer, WebSocketStreamListener {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AVCStreamer";
    private AVCStreamerCallback callback;
    private final JitterCoordinator coordinator;
    private final q0 coroutineScope;
    private final VideoDecodeParams decodeParams;
    private final AVCDecoder decoder;
    private final AtomicLong retryCount;
    private d2 retryJob;
    private final Surface surface;
    private final String url;
    private WebSocketStream webSocket;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final Extend nalType(byte[] bArr) {
            p.h(bArr, "bytes");
            PacketUtil.Companion companion = PacketUtil.Companion;
            PacketConstant.Companion companion2 = PacketConstant.Companion;
            if (companion.equalsByte(bArr, companion2.getTopicByteVideoAVC_SPS())) {
                return Extend.AVC_SPS;
            }
            if (companion.equalsByte(bArr, companion2.getTopicByteVideoAVC_PPS())) {
                return Extend.AVC_PPS;
            }
            if (companion.equalsByte(bArr, companion2.getTopicByteVideoAVC_SEI())) {
                return Extend.AVC_IDR;
            }
            if (companion.equalsByte(bArr, companion2.getTopicByteVideoAVC_IDR())) {
                return Extend.AVC_IDR;
            }
            if (companion.equalsByte(bArr, companion2.getTopicByteVideoAVC_NDR())) {
                return Extend.AVC_NDR;
            }
            return Extend.UNKNOWN;
        }
    }

    public AVCStreamer(String str, JitterCoordinator jitterCoordinator, Surface surface, VideoDecodeParams videoDecodeParams, q0 q0Var) {
        p.h(str, "url");
        p.h(jitterCoordinator, "coordinator");
        p.h(surface, "surface");
        p.h(videoDecodeParams, "decodeParams");
        p.h(q0Var, "coroutineScope");
        this.url = str;
        this.coordinator = jitterCoordinator;
        this.surface = surface;
        this.decodeParams = videoDecodeParams;
        this.coroutineScope = q0Var;
        this.decoder = new AVCDecoder(jitterCoordinator, surface, videoDecodeParams, q0Var);
        this.retryCount = new AtomicLong(0L);
    }

    @Override // com.mirrativ.llstream.subscribe.LLStreamer
    public void close() {
        WebSocketStream webSocketStream = this.webSocket;
        if (webSocketStream == null) {
            return;
        }
        webSocketStream.close();
        WebSocketStream webSocketStream2 = this.webSocket;
        if (webSocketStream2 != null) {
            webSocketStream2.release();
        }
        this.webSocket = null;
        this.decoder.release();
    }

    public final AVCStreamerCallback getCallback() {
        return this.callback;
    }

    public final JitterCoordinator getCoordinator() {
        return this.coordinator;
    }

    public final q0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final VideoDecodeParams getDecodeParams() {
        return this.decodeParams;
    }

    public final Surface getSurface() {
        return this.surface;
    }

    public final String getUrl() {
        return this.url;
    }

    @Override // com.mirrativ.llstream.subscribe.WebSocketStreamListener
    public void onChangeConnectionState(WebSocketStream webSocketStream, WebSocketStream.ConnectionState connectionState) {
        p.h(webSocketStream, "stream");
        p.h(connectionState, "state");
    }

    @Override // com.mirrativ.llstream.subscribe.WebSocketStreamListener
    public void onClosed(WebSocketStream webSocketStream, int i10, String str) {
        p.h(webSocketStream, "stream");
        p.h(str, "reason");
        if (1001 <= i10 && i10 < 1015) {
            retry();
        }
    }

    @Override // com.mirrativ.llstream.subscribe.WebSocketStreamListener
    public void onClosing(WebSocketStream webSocketStream, int i10, String str) {
        p.h(webSocketStream, "stream");
        p.h(str, "reason");
    }

    @Override // com.mirrativ.llstream.decoder.AVCDecoderCallback
    public void onError(Throwable th2) {
        p.h(th2, e.f36387u);
        AVCStreamerCallback aVCStreamerCallback = this.callback;
        if (aVCStreamerCallback != null) {
            aVCStreamerCallback.onAVCStreamerError(th2, null);
        }
    }

    @Override // com.mirrativ.llstream.decoder.AVCDecoderCallback
    public void onLoadingEnd() {
        AVCStreamerCallback aVCStreamerCallback = this.callback;
        if (aVCStreamerCallback != null) {
            aVCStreamerCallback.onLoadingEnd();
        }
    }

    @Override // com.mirrativ.llstream.decoder.AVCDecoderCallback
    public void onMediaCodecError(Exception exc, DecodeErrorInfo decodeErrorInfo) {
        p.h(exc, e.f36387u);
        p.h(decodeErrorInfo, "info");
        AVCStreamerCallback aVCStreamerCallback = this.callback;
        if (aVCStreamerCallback != null) {
            aVCStreamerCallback.onAVCStreamerError(exc, decodeErrorInfo);
        }
    }

    @Override // com.mirrativ.llstream.subscribe.WebSocketStreamListener
    public void onMessage(WebSocketStream webSocketStream, byte[] bArr) {
        p.h(webSocketStream, "stream");
        p.h(bArr, "data");
        parsePacket(bArr);
    }

    @Override // com.mirrativ.llstream.subscribe.WebSocketStreamListener
    public void onOpen(WebSocketStream webSocketStream) {
        p.h(webSocketStream, "stream");
        opened();
    }

    @Override // com.mirrativ.llstream.decoder.AVCDecoderCallback
    public void onOutputFormatChanged(MediaFormat mediaFormat) {
        p.h(mediaFormat, "format");
        AVCStreamerCallback aVCStreamerCallback = this.callback;
        if (aVCStreamerCallback != null) {
            aVCStreamerCallback.onVideoOutputFormatChanged(mediaFormat);
        }
    }

    @Override // com.mirrativ.llstream.decoder.AVCDecoderCallback
    public void onVideoRendered(int i10) {
        AVCStreamerCallback aVCStreamerCallback = this.callback;
        if (aVCStreamerCallback != null) {
            aVCStreamerCallback.onVideoRendered(i10);
        }
    }

    @Override // com.mirrativ.llstream.subscribe.LLStreamer
    public void open() {
        AVCStreamerCallback aVCStreamerCallback = this.callback;
        if (aVCStreamerCallback != null) {
            aVCStreamerCallback.onLoadingBegan();
        }
        this.decoder.setCallback(this);
        WebSocketStream webSocketStream = new WebSocketStream(this.coroutineScope, new URI(this.url), "", this);
        this.webSocket = webSocketStream;
        webSocketStream.open();
    }

    @Override // com.mirrativ.llstream.subscribe.LLStreamer
    public void opened() {
        this.retryCount.set(0L);
    }

    @Override // com.mirrativ.llstream.decoder.PacketParser
    public void parsePacket(byte[] bArr) {
        p.h(bArr, "bytes");
        if (bArr.length < 17) {
            if (Log.isLoggable(TAG, 4)) {
                Log.i(TAG, "is not MR Packet");
                return;
            }
            return;
        }
        this.coordinator.getVideoPacketLastArrived().set(System.currentTimeMillis());
        if (PacketUtil.Companion.equalsSyncByte(o.X(bArr, new i(0, 1)))) {
            byte[] X = o.X(bArr, new i(2, 4));
            long j10 = ByteBuffer.wrap(o.X(bArr, new i(9, 16))).getLong();
            byte[] X2 = o.X(bArr, n.t(17, bArr.length));
            if (X2.length == 0) {
                return;
            }
            Extend nalType = Companion.nalType(X);
            if (p.c(nalType.getValue(), "unknown")) {
                return;
            }
            l.d(this.coroutineScope, null, null, new AVCStreamer$parsePacket$1(this, X2, j10, nalType, null), 3, null);
        }
    }

    @Override // com.mirrativ.llstream.subscribe.LLStreamer
    public void retry() {
        d2 d10;
        if (this.webSocket == null) {
            return;
        }
        if (this.retryCount.getAndIncrement() <= 5) {
            d2 d2Var = this.retryJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            WebSocketStream webSocketStream = this.webSocket;
            if (webSocketStream != null) {
                webSocketStream.close();
            }
            if (Log.isLoggable(TAG, 3)) {
                StringBuilder a10 = a.a("reconnect to avc websocket retries=");
                a10.append(this.retryCount.get());
                Log.d(TAG, a10.toString());
            }
            WebSocketStream webSocketStream2 = this.webSocket;
            if (webSocketStream2 != null) {
                webSocketStream2.release();
            }
            this.webSocket = null;
            d10 = l.d(this.coroutineScope, null, null, new AVCStreamer$retry$1(this, null), 3, null);
            this.retryJob = d10;
            return;
        }
        AVCStreamerCallback aVCStreamerCallback = this.callback;
        if (aVCStreamerCallback != null) {
            aVCStreamerCallback.onAVCStreamerError(new LLStreamException("avc stream exceeded max retry count"), null);
        }
    }

    public final void setCallback(AVCStreamerCallback aVCStreamerCallback) {
        this.callback = aVCStreamerCallback;
    }

    @Override // com.mirrativ.llstream.subscribe.LLStreamer
    public void tick() {
        this.decoder.tick();
    }

    @Override // com.mirrativ.llstream.subscribe.WebSocketStreamListener
    public void onError(WebSocketStream webSocketStream, WebSocketStream.WebsocketStreamError websocketStreamError) {
        p.h(webSocketStream, "stream");
        p.h(websocketStreamError, MRLog.PAYLOAD_KEY_ERROR);
        retry();
    }

    public /* synthetic */ AVCStreamer(String str, JitterCoordinator jitterCoordinator, Surface surface, VideoDecodeParams videoDecodeParams, q0 q0Var, int i10, h hVar) {
        this(str, jitterCoordinator, surface, (i10 & 8) != 0 ? new VideoDecodeParams(0, 0, 0L, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 0L, 0, 0L, 0L, 0L, 0L, 0L, null, 131071, null) : videoDecodeParams, (i10 & 16) != 0 ? r0.a(g1.a()) : q0Var);
    }
}
