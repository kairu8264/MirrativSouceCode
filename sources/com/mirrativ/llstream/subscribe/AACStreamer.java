package com.mirrativ.llstream.subscribe;

import android.util.Log;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.mirrativ.llstream.decoder.AACDecoder;
import com.mirrativ.llstream.decoder.AACDecoderCallback;
import com.mirrativ.llstream.decoder.AudioDecodeParams;
import com.mirrativ.llstream.decoder.JitterCoordinator;
import com.mirrativ.llstream.decoder.PacketParser;
import com.mirrativ.llstream.decoder.a;
import com.mirrativ.llstream.protocol.v1.packet.PacketConstant;
import com.mirrativ.llstream.protocol.v1.packet.PacketUtil;
import com.mirrativ.llstream.protocol.v1.topic.Extend;
import com.mirrativ.llstream.subscribe.WebSocketStream;
import i7.e;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
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
public final class AACStreamer implements PacketParser, AACDecoderCallback, LLStreamer, WebSocketStreamListener {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AACStreamer";
    private AACStreamerCallback callback;
    private final JitterCoordinator coordinator;
    private final q0 coroutineScope;
    private final AudioDecodeParams decodeParams;
    private final AACDecoder decoder;
    private final AtomicInteger retryCount;
    private d2 retryJob;
    private final String url;
    private WebSocketStream webSocket;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final Extend extend(byte[] bArr) {
            p.h(bArr, "bytes");
            PacketUtil.Companion companion = PacketUtil.Companion;
            PacketConstant.Companion companion2 = PacketConstant.Companion;
            if (companion.equalsByte(bArr, companion2.getTopicByteAudioAAC_ASC())) {
                return Extend.AAC_ASC;
            }
            if (companion.equalsByte(bArr, companion2.getTopicByteAudioAAC_RAW())) {
                return Extend.AAC_RAW;
            }
            return Extend.UNKNOWN;
        }
    }

    public AACStreamer(String str, JitterCoordinator jitterCoordinator, AudioDecodeParams audioDecodeParams, q0 q0Var) {
        p.h(str, "url");
        p.h(jitterCoordinator, "coordinator");
        p.h(audioDecodeParams, "decodeParams");
        p.h(q0Var, "coroutineScope");
        this.url = str;
        this.coordinator = jitterCoordinator;
        this.decodeParams = audioDecodeParams;
        this.coroutineScope = q0Var;
        this.decoder = new AACDecoder(jitterCoordinator, audioDecodeParams, q0Var);
        this.retryCount = new AtomicInteger(0);
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

    public final AACStreamerCallback getCallback() {
        return this.callback;
    }

    public final JitterCoordinator getCoordinator() {
        return this.coordinator;
    }

    public final q0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final AudioDecodeParams getDecodeParams() {
        return this.decodeParams;
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

    @Override // com.mirrativ.llstream.decoder.AACDecoderCallback
    public void onError(Throwable th2) {
        p.h(th2, e.f36387u);
        AACStreamerCallback aACStreamerCallback = this.callback;
        if (aACStreamerCallback != null) {
            aACStreamerCallback.onAACStreamerError(th2);
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

    @Override // com.mirrativ.llstream.subscribe.LLStreamer
    public void open() {
        WebSocketStream webSocketStream = new WebSocketStream(this.coroutineScope, new URI(this.url), "", this);
        this.webSocket = webSocketStream;
        webSocketStream.open();
    }

    @Override // com.mirrativ.llstream.subscribe.LLStreamer
    public void opened() {
        this.retryCount.set(0);
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
        this.coordinator.getAudioPacketLastArrived().set(System.currentTimeMillis());
        if (PacketUtil.Companion.equalsSyncByte(o.X(bArr, new i(0, 1)))) {
            byte[] X = o.X(bArr, new i(2, 4));
            long j10 = ByteBuffer.wrap(o.X(bArr, new i(9, 16))).getLong();
            byte[] X2 = o.X(bArr, n.t(17, bArr.length));
            if (X2.length == 0) {
                return;
            }
            Extend extend = Companion.extend(X);
            if (p.c(extend.getValue(), "unknown")) {
                return;
            }
            l.d(this.coroutineScope, null, null, new AACStreamer$parsePacket$1(this, X2, j10, extend, null), 3, null);
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
                StringBuilder a10 = a.a("reconnect to aac websocket retries=");
                a10.append(this.retryCount.get());
                Log.d(TAG, a10.toString());
            }
            WebSocketStream webSocketStream2 = this.webSocket;
            if (webSocketStream2 != null) {
                webSocketStream2.release();
            }
            this.webSocket = null;
            d10 = l.d(this.coroutineScope, null, null, new AACStreamer$retry$1(this, null), 3, null);
            this.retryJob = d10;
            return;
        }
        AACStreamerCallback aACStreamerCallback = this.callback;
        if (aACStreamerCallback != null) {
            aACStreamerCallback.onAACStreamerError(new LLStreamException("avc stream exceeded max retry count"));
        }
    }

    public final void setCallback(AACStreamerCallback aACStreamerCallback) {
        this.callback = aACStreamerCallback;
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

    public /* synthetic */ AACStreamer(String str, JitterCoordinator jitterCoordinator, AudioDecodeParams audioDecodeParams, q0 q0Var, int i10, h hVar) {
        AACStreamer aACStreamer;
        String str2;
        JitterCoordinator jitterCoordinator2;
        q0 q0Var2;
        AudioDecodeParams audioDecodeParams2 = (i10 & 4) != 0 ? new AudioDecodeParams(0, 0.0d, false, 0, 0, 0L, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, 0L, 0L, 0L, 0L, 65535, null) : audioDecodeParams;
        if ((i10 & 8) != 0) {
            q0Var2 = r0.a(g1.a());
            aACStreamer = this;
            str2 = str;
            jitterCoordinator2 = jitterCoordinator;
        } else {
            aACStreamer = this;
            str2 = str;
            jitterCoordinator2 = jitterCoordinator;
            q0Var2 = q0Var;
        }
        new AACStreamer(str2, jitterCoordinator2, audioDecodeParams2, q0Var2);
    }
}
