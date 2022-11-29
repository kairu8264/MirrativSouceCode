package com.mirrativ.llstream.subscribe;

import android.net.ConnectivityManager;
import android.util.Log;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.mirrativ.llstream.decoder.a;
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
import java.util.concurrent.atomic.AtomicReference;
import jo.h;
import jo.p;
import uo.q0;

/* loaded from: classes4.dex */
public final class WebSocketStream extends ConnectivityManager.NetworkCallback implements t0 {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "WebsocketStream";
    private final q0 coroutineScope;
    private AtomicBoolean isActive;
    private final WebSocketStreamListener listener;
    private AtomicReference<ConnectionState> state;
    private final URI url;
    private final String userAgent;
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
        OPENNING,
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

    public /* synthetic */ WebSocketStream(q0 q0Var, URI uri, String str, WebSocketStreamListener webSocketStreamListener, int i10, h hVar) {
        this(q0Var, uri, str, (i10 & 8) != 0 ? null : webSocketStreamListener);
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
            WebSocketStreamListener webSocketStreamListener = this.listener;
            if (webSocketStreamListener != null) {
                webSocketStreamListener.onError(this, new WebsocketStreamError(e11.getMessage(), new Exception(e11)));
            }
        }
    }

    private final void resetWebsocket() {
        n0 n0Var = this.websocket;
        if (n0Var != null) {
            n0Var.i(AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE, "Connection reset", 0L);
        }
        n0 n0Var2 = this.websocket;
        if (n0Var2 != null) {
            n0Var2.L(this);
        }
        this.isActive.set(false);
        createWebsocket();
    }

    public final void close() {
        StringBuilder a10 = a.a("close url = ");
        a10.append(this.url);
        Log.i(TAG, a10.toString());
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
    }

    public final q0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final WebSocketStreamListener getListener() {
        return this.listener;
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

    @Override // hn.t0
    public void onBinaryFrame(n0 n0Var, r0 r0Var) {
    }

    @Override // hn.t0
    public void onBinaryMessage(n0 n0Var, byte[] bArr) {
        WebSocketStreamListener webSocketStreamListener;
        if (bArr == null || (webSocketStreamListener = this.listener) == null) {
            return;
        }
        webSocketStreamListener.onMessage(this, bArr);
    }

    @Override // hn.t0
    public void onCloseFrame(n0 n0Var, r0 r0Var) {
    }

    @Override // hn.t0
    public void onConnectError(n0 n0Var, WebSocketException webSocketException) {
        StringBuilder a10 = a.a("onConnectError: message = ");
        a10.append(webSocketException != null ? webSocketException.getMessage() : null);
        Log.e(TAG, a10.toString(), webSocketException);
        WebSocketStreamListener webSocketStreamListener = this.listener;
        if (webSocketStreamListener != null) {
            webSocketStreamListener.onError(this, new WebsocketStreamError(webSocketException != null ? webSocketException.getMessage() : null, new Exception(webSocketException)));
        }
    }

    @Override // hn.t0
    public void onConnected(n0 n0Var, Map<String, List<String>> map) {
        Log.i(TAG, "onConnected: headers = " + map);
        WebSocketStreamListener webSocketStreamListener = this.listener;
        if (webSocketStreamListener != null) {
            webSocketStreamListener.onOpen(this);
        }
    }

    @Override // hn.t0
    public void onContinuationFrame(n0 n0Var, r0 r0Var) {
    }

    @Override // hn.t0
    public void onDisconnected(n0 n0Var, r0 r0Var, r0 r0Var2, boolean z10) {
        Log.i(TAG, "onDisconnected: serverCloseFrame = " + r0Var + ", clientCloseFrame = " + r0Var2 + ", closedByServer = " + z10);
        if (r0Var != null) {
            WebSocketStreamListener webSocketStreamListener = this.listener;
            if (webSocketStreamListener != null) {
                int p10 = r0Var.p();
                String q10 = r0Var.q();
                p.g(q10, "serverCloseFrame.closeReason");
                webSocketStreamListener.onClosed(this, p10, q10);
            }
        } else if (r0Var2 != null) {
            WebSocketStreamListener webSocketStreamListener2 = this.listener;
            if (webSocketStreamListener2 != null) {
                int p11 = r0Var2.p();
                String q11 = r0Var2.q();
                p.g(q11, "clientCloseFrame.closeReason");
                webSocketStreamListener2.onClosed(this, p11, q11);
            }
        } else {
            WebSocketStreamListener webSocketStreamListener3 = this.listener;
            if (webSocketStreamListener3 != null) {
                webSocketStreamListener3.onClosed(this, 1000, "closed");
            }
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
    }

    @Override // hn.t0
    public void onFrameUnsent(n0 n0Var, r0 r0Var) {
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
            this.state.set(ConnectionState.OPENNING);
            WebSocketStreamListener webSocketStreamListener = this.listener;
            if (webSocketStreamListener != null) {
                ConnectionState connectionState = this.state.get();
                p.g(connectionState, "state.get()");
                webSocketStreamListener.onChangeConnectionState(this, connectionState);
            }
        } else if (i10 == 3) {
            this.state.set(ConnectionState.OPENED);
            WebSocketStreamListener webSocketStreamListener2 = this.listener;
            if (webSocketStreamListener2 != null) {
                ConnectionState connectionState2 = this.state.get();
                p.g(connectionState2, "state.get()");
                webSocketStreamListener2.onChangeConnectionState(this, connectionState2);
            }
        } else if (i10 == 4) {
            this.state.set(ConnectionState.CLOSING);
            WebSocketStreamListener webSocketStreamListener3 = this.listener;
            if (webSocketStreamListener3 != null) {
                ConnectionState connectionState3 = this.state.get();
                p.g(connectionState3, "state.get()");
                webSocketStreamListener3.onChangeConnectionState(this, connectionState3);
            }
        } else if (i10 != 5) {
        } else {
            this.state.set(ConnectionState.CLOSED);
            WebSocketStreamListener webSocketStreamListener4 = this.listener;
            if (webSocketStreamListener4 != null) {
                ConnectionState connectionState4 = this.state.get();
                p.g(connectionState4, "state.get()");
                webSocketStreamListener4.onChangeConnectionState(this, connectionState4);
            }
            if (n0Var != null) {
                n0Var.g();
            }
            this.isActive.set(false);
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
        if (this.state.get().equals(ConnectionState.CLOSED)) {
            this.state.set(ConnectionState.OPENNING);
            WebSocketStreamListener webSocketStreamListener = this.listener;
            if (webSocketStreamListener != null) {
                ConnectionState connectionState = this.state.get();
                p.g(connectionState, "state.get()");
                webSocketStreamListener.onChangeConnectionState(this, connectionState);
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
            } catch (IOException e10) {
                WebSocketStreamListener webSocketStreamListener2 = this.listener;
                if (webSocketStreamListener2 != null) {
                    webSocketStreamListener2.onError(this, new WebsocketStreamError(e10.getMessage(), e10));
                }
            } catch (IllegalArgumentException e11) {
                WebSocketStreamListener webSocketStreamListener3 = this.listener;
                if (webSocketStreamListener3 != null) {
                    webSocketStreamListener3.onError(this, new WebsocketStreamError(e11.getMessage(), e11));
                }
            }
        }
    }

    public final void release() {
        close();
    }

    /* loaded from: classes4.dex */
    public static final class WebsocketStreamError extends Throwable {
        private final Throwable cause;
        private final String message;

        public /* synthetic */ WebsocketStreamError(String str, Throwable th2, int i10, h hVar) {
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

        public WebsocketStreamError(String str, Throwable th2) {
            p.h(th2, "cause");
            this.message = str;
            this.cause = th2;
        }
    }

    public WebSocketStream(q0 q0Var, URI uri, String str, WebSocketStreamListener webSocketStreamListener) {
        p.h(q0Var, "coroutineScope");
        p.h(uri, "url");
        p.h(str, "userAgent");
        this.coroutineScope = q0Var;
        this.url = uri;
        this.userAgent = str;
        this.listener = webSocketStreamListener;
        this.state = new AtomicReference<>(ConnectionState.CLOSED);
        this.isActive = new AtomicBoolean(true);
        createWebsocket();
    }
}
