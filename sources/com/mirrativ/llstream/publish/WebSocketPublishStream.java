package com.mirrativ.llstream.publish;

import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.mirrativ.llstream.decoder.a;
import com.mirrativ.llstream.protocol.v1.packet.Packet;
import com.neovisionaries.ws.client.WebSocketException;
import hn.l0;
import hn.n0;
import hn.r0;
import hn.t0;
import hn.v0;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import jo.h;
import jo.p;
import uo.d2;
import uo.l;
import uo.q0;

/* loaded from: classes4.dex */
public final class WebSocketPublishStream extends ConnectivityManager.NetworkCallback implements t0 {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_RETRY_COUNT = 9;
    public static final int RECONNECT_THRESHOLD_OF_SENT_COUNT = 10;
    public static final String TAG = "WebsocketPublishStream";
    private d2 checkJob;
    private final q0 coroutineScope;
    private long firstSentAt;
    private AtomicBoolean isActive;
    private AtomicBoolean isNetworkAvailable;
    private long lastSentAt;
    private final WebSocketPublishStreamListener listener;
    private AtomicInteger noSentCount;
    private AtomicLong previousQueuedBytesOut;
    private AtomicLong previousTotalBytesOut;
    private AtomicLong queuedBytesOut;
    private AtomicLong queuedOutCount;
    private d2 reconnectJob;
    private int retryCount;
    private AtomicReference<ConnectionState> state;
    private AtomicLong totalBytesIn;
    private AtomicLong totalBytesOut;
    private AtomicLong totalInCount;
    private AtomicLong totalOutCount;
    private final URI url;
    private final String userAgent;
    private AtomicBoolean waitUntilNetworkIsAvailable;
    private n0 websocket;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public enum ConnectionState {
        OPENING,
        OPENED,
        CLOSING,
        CLOSED
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[v0.values().length];
            iArr[v0.CREATED.ordinal()] = 1;
            iArr[v0.CONNECTING.ordinal()] = 2;
            iArr[v0.OPEN.ordinal()] = 3;
            iArr[v0.CLOSING.ordinal()] = 4;
            iArr[v0.CLOSED.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ WebSocketPublishStream(q0 q0Var, URI uri, String str, WebSocketPublishStreamListener webSocketPublishStreamListener, int i10, h hVar) {
        this(q0Var, uri, str, (i10 & 8) != 0 ? null : webSocketPublishStreamListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkSent() {
        long j10 = this.queuedBytesOut.get() - this.totalBytesOut.get();
        long j11 = this.totalBytesOut.get() - this.previousTotalBytesOut.get();
        this.previousQueuedBytesOut.set(this.queuedBytesOut.get());
        this.previousTotalBytesOut.set(this.totalBytesOut.get());
        if (j10 > 0 && j11 == 0) {
            this.noSentCount.incrementAndGet();
            WebSocketPublishStreamListener webSocketPublishStreamListener = this.listener;
            if (webSocketPublishStreamListener != null) {
                webSocketPublishStreamListener.onPublishStreamStalled(this);
            }
        } else {
            this.noSentCount.set(0);
        }
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "checkSent queued=" + j10 + " written=" + j11 + " noSentCount=" + this.noSentCount.get());
        }
    }

    private final void createWebsocket() {
        try {
            n0 e10 = new hn.q0().e(this.url);
            this.websocket = e10;
            if (e10 != null) {
                e10.b(this);
            }
            n0 n0Var = this.websocket;
            if (n0Var != null) {
                n0Var.a("User-Agent", this.userAgent);
            }
        } catch (IllegalArgumentException e11) {
            WebSocketPublishStreamListener webSocketPublishStreamListener = this.listener;
            if (webSocketPublishStreamListener != null) {
                webSocketPublishStreamListener.onError(this, new WebSocketStreamError(e11.getMessage(), new Exception(e11)));
            }
        }
    }

    private final boolean getShouldRetry() {
        return this.retryCount <= 9;
    }

    private final void resetCounters() {
        this.totalBytesIn.set(0L);
        this.totalBytesOut.set(0L);
        this.queuedBytesOut.set(0L);
        this.totalInCount.set(0L);
        this.totalOutCount.set(0L);
        this.queuedOutCount.set(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetWebsocket() {
        n0 n0Var = this.websocket;
        if (n0Var != null) {
            n0Var.i(AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE, "Connection reset", 0L);
        }
        n0 n0Var2 = this.websocket;
        if (n0Var2 != null) {
            n0Var2.L(this);
        }
        resetCounters();
        this.isActive.set(false);
        d2 d2Var = this.checkJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        createWebsocket();
    }

    private final void setReconnectJob(d2 d2Var) {
        d2 d2Var2 = this.reconnectJob;
        if (d2Var2 != null) {
            d2.a.a(d2Var2, null, 1, null);
        }
        this.reconnectJob = d2Var;
    }

    public final void close() {
        StringBuilder a10 = a.a("close url = ");
        a10.append(this.url);
        Log.i(TAG, a10.toString());
        d2 d2Var = this.reconnectJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        n0 n0Var = this.websocket;
        if (n0Var != null) {
            n0Var.h(1000, "Close normally");
        }
        n0 n0Var2 = this.websocket;
        if (n0Var2 != null) {
            n0Var2.L(this);
        }
        this.websocket = null;
        this.isActive.set(false);
        d2 d2Var2 = this.checkJob;
        if (d2Var2 != null) {
            d2.a.a(d2Var2, null, 1, null);
        }
        resetCounters();
    }

    public final void forceClose() {
        StringBuilder a10 = a.a("forceClose url = ");
        a10.append(this.url);
        Log.i(TAG, a10.toString());
        n0 n0Var = this.websocket;
        if (n0Var != null) {
            n0Var.i(AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE, "Close normally", 0L);
        }
        n0 n0Var2 = this.websocket;
        if (n0Var2 != null) {
            n0Var2.L(this);
        }
        this.websocket = null;
        this.isActive.set(false);
        d2 d2Var = this.checkJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        resetCounters();
    }

    public final q0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final WebSocketPublishStreamListener getListener() {
        return this.listener;
    }

    public final AtomicInteger getNoSentCount() {
        return this.noSentCount;
    }

    public final AtomicLong getQueuedBytesOut() {
        return this.queuedBytesOut;
    }

    public final AtomicLong getQueuedOutCount() {
        return this.queuedOutCount;
    }

    public final AtomicLong getTotalBytesIn() {
        return this.totalBytesIn;
    }

    public final AtomicLong getTotalBytesOut() {
        return this.totalBytesOut;
    }

    public final AtomicLong getTotalInCount() {
        return this.totalInCount;
    }

    public final AtomicLong getTotalOutCount() {
        return this.totalOutCount;
    }

    public final URI getUrl() {
        return this.url;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    @Override // hn.t0
    public void handleCallbackError(n0 n0Var, Throwable th2) {
        StringBuilder a10 = a.a("handleCallbackError: message = ");
        a10.append(th2 != null ? th2.getMessage() : null);
        Log.e(TAG, a10.toString(), th2);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        p.h(network, "network");
        super.onAvailable(network);
        boolean z10 = true;
        this.isNetworkAvailable.set(true);
        if (this.waitUntilNetworkIsAvailable.get()) {
            this.waitUntilNetworkIsAvailable.set(false);
            reconnect();
            return;
        }
        n0 n0Var = this.websocket;
        if (n0Var == null || !n0Var.B()) {
            z10 = false;
        }
        if (z10) {
            reconnect();
        }
    }

    @Override // hn.t0
    public void onBinaryFrame(n0 n0Var, r0 r0Var) {
    }

    @Override // hn.t0
    public void onBinaryMessage(n0 n0Var, byte[] bArr) {
    }

    @Override // hn.t0
    public void onCloseFrame(n0 n0Var, r0 r0Var) {
    }

    @Override // hn.t0
    public void onConnectError(n0 n0Var, WebSocketException webSocketException) {
        StringBuilder a10 = a.a("onConnectError: message = ");
        a10.append(webSocketException != null ? webSocketException.getMessage() : null);
        Log.e(TAG, a10.toString(), webSocketException);
        WebSocketPublishStreamListener webSocketPublishStreamListener = this.listener;
        if (webSocketPublishStreamListener != null) {
            webSocketPublishStreamListener.onError(this, new WebSocketStreamError(webSocketException != null ? webSocketException.getMessage() : null, new Exception(webSocketException)));
        }
    }

    @Override // hn.t0
    public void onConnected(n0 n0Var, Map<String, List<String>> map) {
        Log.i(TAG, "onConnected: headers = " + map);
    }

    @Override // hn.t0
    public void onContinuationFrame(n0 n0Var, r0 r0Var) {
    }

    @Override // hn.t0
    public void onDisconnected(n0 n0Var, r0 r0Var, r0 r0Var2, boolean z10) {
        Log.i(TAG, "onDisconnected: serverCloseFrame = " + r0Var + ", clientCloseFrame = " + r0Var2 + ", closedByServer = " + z10);
        boolean z11 = false;
        boolean z12 = true;
        if (z10) {
            if (r0Var != null && r0Var.p() == 1011) {
                if (this.totalOutCount.get() < 10) {
                    WebSocketPublishStreamListener webSocketPublishStreamListener = this.listener;
                    if (webSocketPublishStreamListener != null) {
                        webSocketPublishStreamListener.onError(this, new WebSocketStreamError("closed by server", new Exception(r0Var.w())));
                        return;
                    }
                    return;
                }
                z11 = true;
            }
        }
        if (r0Var == null && r0Var2 == null && !z10) {
            z11 = true;
        }
        if (r0Var2 == null || r0Var2.p() != 1008) {
            z12 = z11;
        }
        if (z12) {
            reconnect();
            return;
        }
        WebSocketPublishStreamListener webSocketPublishStreamListener2 = this.listener;
        if (webSocketPublishStreamListener2 != null) {
            webSocketPublishStreamListener2.onError(this, new WebSocketStreamError("disconnected: serverCloseFrame=" + r0Var + " clientCloseFrame=" + r0Var2 + " closedByServer=" + z10, null, 2, null));
        }
    }

    @Override // hn.t0
    public void onError(n0 n0Var, WebSocketException webSocketException) {
        StringBuilder a10 = a.a("onError: message = ");
        a10.append(webSocketException != null ? webSocketException.getMessage() : null);
        Log.e(TAG, a10.toString(), webSocketException);
    }

    @Override // hn.t0
    public void onFrame(n0 n0Var, r0 r0Var) {
    }

    @Override // hn.t0
    public void onFrameError(n0 n0Var, WebSocketException webSocketException, r0 r0Var) {
        StringBuilder a10 = a.a("onFrameError: message = ");
        a10.append(webSocketException != null ? webSocketException.getMessage() : null);
        Log.e(TAG, a10.toString(), webSocketException);
    }

    @Override // hn.t0
    public void onFrameSent(n0 n0Var, r0 r0Var) {
        if (r0Var != null && r0Var.u() != null) {
            this.totalBytesOut.addAndGet(r0Var.u().length);
            this.totalOutCount.incrementAndGet();
        }
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        if (this.firstSentAt == -1) {
            this.firstSentAt = currentTimeMillis;
        }
        this.lastSentAt = currentTimeMillis;
        this.retryCount = 0;
    }

    @Override // hn.t0
    public void onFrameUnsent(n0 n0Var, r0 r0Var) {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        p.h(network, "network");
        super.onLost(network);
        this.isNetworkAvailable.set(false);
    }

    @Override // hn.t0
    public void onMessageDecompressionError(n0 n0Var, WebSocketException webSocketException, byte[] bArr) {
        StringBuilder a10 = a.a("onMessageDecompressionError: message = ");
        a10.append(webSocketException != null ? webSocketException.getMessage() : null);
        Log.e(TAG, a10.toString(), webSocketException);
    }

    @Override // hn.t0
    public void onMessageError(n0 n0Var, WebSocketException webSocketException, List<r0> list) {
        StringBuilder a10 = a.a("onMessageError: message = ");
        a10.append(webSocketException != null ? webSocketException.getMessage() : null);
        Log.e(TAG, a10.toString(), webSocketException);
    }

    @Override // hn.t0
    public void onPingFrame(n0 n0Var, r0 r0Var) {
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "onPingFrame");
        }
    }

    @Override // hn.t0
    public void onPongFrame(n0 n0Var, r0 r0Var) {
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "onPongFrame");
        }
    }

    @Override // hn.t0
    public void onSendError(n0 n0Var, WebSocketException webSocketException, r0 r0Var) {
        StringBuilder a10 = a.a("onSendError: message = ");
        a10.append(webSocketException != null ? webSocketException.getMessage() : null);
        Log.e(TAG, a10.toString(), webSocketException);
    }

    @Override // hn.t0
    public void onSendingFrame(n0 n0Var, r0 r0Var) {
    }

    @Override // hn.t0
    public void onSendingHandshake(n0 n0Var, String str, List<String[]> list) {
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "onSendingHandshake: requestLine = " + str + ", headers = " + list);
        }
    }

    @Override // hn.t0
    public void onStateChanged(n0 n0Var, v0 v0Var) {
        StringBuilder a10 = a.a("onStateChanged: newState = ");
        a10.append(v0Var != null ? v0Var.name() : null);
        Log.i(TAG, a10.toString());
        int i10 = v0Var == null ? -1 : WhenMappings.$EnumSwitchMapping$0[v0Var.ordinal()];
        if (i10 == 1) {
            this.state.set(ConnectionState.CLOSED);
        } else if (i10 == 2) {
            this.state.set(ConnectionState.OPENING);
            WebSocketPublishStreamListener webSocketPublishStreamListener = this.listener;
            if (webSocketPublishStreamListener != null) {
                ConnectionState connectionState = this.state.get();
                p.g(connectionState, "state.get()");
                webSocketPublishStreamListener.onChangeConnectionState(this, connectionState);
            }
        } else if (i10 == 3) {
            this.state.set(ConnectionState.OPENED);
            WebSocketPublishStreamListener webSocketPublishStreamListener2 = this.listener;
            if (webSocketPublishStreamListener2 != null) {
                ConnectionState connectionState2 = this.state.get();
                p.g(connectionState2, "state.get()");
                webSocketPublishStreamListener2.onChangeConnectionState(this, connectionState2);
            }
        } else if (i10 == 4) {
            this.state.set(ConnectionState.CLOSING);
            WebSocketPublishStreamListener webSocketPublishStreamListener3 = this.listener;
            if (webSocketPublishStreamListener3 != null) {
                ConnectionState connectionState3 = this.state.get();
                p.g(connectionState3, "state.get()");
                webSocketPublishStreamListener3.onChangeConnectionState(this, connectionState3);
            }
        } else if (i10 != 5) {
        } else {
            this.state.set(ConnectionState.CLOSED);
            WebSocketPublishStreamListener webSocketPublishStreamListener4 = this.listener;
            if (webSocketPublishStreamListener4 != null) {
                ConnectionState connectionState4 = this.state.get();
                p.g(connectionState4, "state.get()");
                webSocketPublishStreamListener4.onChangeConnectionState(this, connectionState4);
            }
            if (n0Var != null) {
                n0Var.g();
            }
            this.isActive.set(false);
            d2 d2Var = this.checkJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
        }
    }

    @Override // hn.t0
    public void onTextFrame(n0 n0Var, r0 r0Var) {
    }

    @Override // hn.t0
    public void onTextMessage(n0 n0Var, String str) {
    }

    @Override // hn.t0
    public void onTextMessage(n0 n0Var, byte[] bArr) {
    }

    @Override // hn.t0
    public void onTextMessageError(n0 n0Var, WebSocketException webSocketException, byte[] bArr) {
        StringBuilder a10 = a.a("onTextMessageError: message = ");
        a10.append(webSocketException != null ? webSocketException.getMessage() : null);
        Log.e(TAG, a10.toString(), webSocketException);
    }

    @Override // hn.t0
    public void onThreadCreated(n0 n0Var, l0 l0Var, Thread thread) {
        if (Log.isLoggable(TAG, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onThreadCreated ");
            sb2.append(l0Var);
            sb2.append(' ');
            sb2.append(thread != null ? thread.getName() : null);
            Log.d(TAG, sb2.toString());
        }
    }

    @Override // hn.t0
    public void onThreadStarted(n0 n0Var, l0 l0Var, Thread thread) {
        if (Log.isLoggable(TAG, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onThreadStarted ");
            sb2.append(l0Var);
            sb2.append(' ');
            sb2.append(thread != null ? thread.getName() : null);
            Log.d(TAG, sb2.toString());
        }
    }

    @Override // hn.t0
    public void onThreadStopping(n0 n0Var, l0 l0Var, Thread thread) {
        if (Log.isLoggable(TAG, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onThreadStopping ");
            sb2.append(l0Var);
            sb2.append(' ');
            sb2.append(thread != null ? thread.getName() : null);
            Log.d(TAG, sb2.toString());
        }
    }

    @Override // hn.t0
    public void onUnexpectedError(n0 n0Var, WebSocketException webSocketException) {
        StringBuilder a10 = a.a("onUnexpectedError: message = ");
        a10.append(webSocketException != null ? webSocketException.getMessage() : null);
        Log.e(TAG, a10.toString(), webSocketException);
    }

    public final void open() {
        d2 d10;
        if (this.state.get().equals(ConnectionState.CLOSED)) {
            this.state.set(ConnectionState.OPENING);
            WebSocketPublishStreamListener webSocketPublishStreamListener = this.listener;
            if (webSocketPublishStreamListener != null) {
                ConnectionState connectionState = this.state.get();
                p.g(connectionState, "state.get()");
                webSocketPublishStreamListener.onChangeConnectionState(this, connectionState);
            }
            StringBuilder a10 = a.a("llstream publish url = ");
            a10.append(this.url);
            Log.i(TAG, a10.toString());
            try {
                n0 n0Var = this.websocket;
                if (n0Var != null) {
                    n0Var.f();
                }
                this.isActive.set(true);
                d10 = l.d(this.coroutineScope, null, null, new WebSocketPublishStream$open$1(this, null), 3, null);
                this.checkJob = d10;
            } catch (IOException e10) {
                WebSocketPublishStreamListener webSocketPublishStreamListener2 = this.listener;
                if (webSocketPublishStreamListener2 != null) {
                    webSocketPublishStreamListener2.onError(this, new WebSocketStreamError(e10.getMessage(), e10));
                }
            } catch (IllegalArgumentException e11) {
                WebSocketPublishStreamListener webSocketPublishStreamListener3 = this.listener;
                if (webSocketPublishStreamListener3 != null) {
                    webSocketPublishStreamListener3.onError(this, new WebSocketStreamError(e11.getMessage(), e11));
                }
            }
        }
    }

    public final void reconnect() {
        d2 d10;
        if (!getShouldRetry()) {
            if (Log.isLoggable(TAG, 3) && Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "should not retry");
                return;
            }
            return;
        }
        n0 n0Var = this.websocket;
        if ((n0Var != null ? n0Var.u() : null) == v0.OPEN) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "already open");
                return;
            }
            return;
        }
        d2 d2Var = this.reconnectJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        d10 = l.d(this.coroutineScope, null, null, new WebSocketPublishStream$reconnect$1(this, null), 3, null);
        setReconnectJob(d10);
    }

    public final void release() {
        close();
    }

    public final boolean send(Packet packet) {
        p.h(packet, "packet");
        if (this.queuedBytesOut.get() > 0 && this.noSentCount.get() > 0) {
            StringBuilder a10 = a.a("skipped to send packet noSentCount=");
            a10.append(this.noSentCount.get());
            Log.w(TAG, a10.toString());
            return false;
        }
        byte[] bytes = packet.getBytes();
        n0 n0Var = this.websocket;
        if (n0Var != null && n0Var.B()) {
            this.queuedBytesOut.addAndGet(bytes.length);
            this.queuedOutCount.incrementAndGet();
            n0 n0Var2 = this.websocket;
            if (n0Var2 != null) {
                n0Var2.M(bytes);
            }
            return true;
        }
        return false;
    }

    public final void setNoSentCount(AtomicInteger atomicInteger) {
        p.h(atomicInteger, "<set-?>");
        this.noSentCount = atomicInteger;
    }

    public final void setQueuedBytesOut(AtomicLong atomicLong) {
        p.h(atomicLong, "<set-?>");
        this.queuedBytesOut = atomicLong;
    }

    public final void setQueuedOutCount(AtomicLong atomicLong) {
        p.h(atomicLong, "<set-?>");
        this.queuedOutCount = atomicLong;
    }

    public final void setTotalBytesIn(AtomicLong atomicLong) {
        p.h(atomicLong, "<set-?>");
        this.totalBytesIn = atomicLong;
    }

    public final void setTotalBytesOut(AtomicLong atomicLong) {
        p.h(atomicLong, "<set-?>");
        this.totalBytesOut = atomicLong;
    }

    public final void setTotalInCount(AtomicLong atomicLong) {
        p.h(atomicLong, "<set-?>");
        this.totalInCount = atomicLong;
    }

    public final void setTotalOutCount(AtomicLong atomicLong) {
        p.h(atomicLong, "<set-?>");
        this.totalOutCount = atomicLong;
    }

    /* loaded from: classes4.dex */
    public static final class WebSocketStreamError extends Throwable {
        private final Throwable cause;
        private final String message;

        public /* synthetic */ WebSocketStreamError(String str, Throwable th2, int i10, h hVar) {
            this(str, (i10 & 2) != 0 ? new Error(str) : th2);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public WebSocketStreamError(String str, Throwable th2) {
            p.h(th2, "cause");
            this.message = str;
            this.cause = th2;
        }
    }

    public WebSocketPublishStream(q0 q0Var, URI uri, String str, WebSocketPublishStreamListener webSocketPublishStreamListener) {
        p.h(q0Var, "coroutineScope");
        p.h(uri, "url");
        p.h(str, "userAgent");
        this.coroutineScope = q0Var;
        this.url = uri;
        this.userAgent = str;
        this.listener = webSocketPublishStreamListener;
        this.totalBytesIn = new AtomicLong(0L);
        this.totalBytesOut = new AtomicLong(0L);
        this.queuedBytesOut = new AtomicLong(0L);
        this.totalInCount = new AtomicLong(0L);
        this.totalOutCount = new AtomicLong(0L);
        this.queuedOutCount = new AtomicLong(0L);
        this.noSentCount = new AtomicInteger(0);
        this.state = new AtomicReference<>(ConnectionState.CLOSED);
        this.previousTotalBytesOut = new AtomicLong(0L);
        this.previousQueuedBytesOut = new AtomicLong(0L);
        this.firstSentAt = -1L;
        this.lastSentAt = -1L;
        this.isActive = new AtomicBoolean(true);
        this.isNetworkAvailable = new AtomicBoolean(false);
        this.waitUntilNetworkIsAvailable = new AtomicBoolean(false);
        createWebsocket();
    }
}
