package hn;

import com.neovisionaries.ws.client.WebSocketException;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface t0 {
    void handleCallbackError(n0 n0Var, Throwable th2) throws Exception;

    void onBinaryFrame(n0 n0Var, r0 r0Var) throws Exception;

    void onBinaryMessage(n0 n0Var, byte[] bArr) throws Exception;

    void onCloseFrame(n0 n0Var, r0 r0Var) throws Exception;

    void onConnectError(n0 n0Var, WebSocketException webSocketException) throws Exception;

    void onConnected(n0 n0Var, Map<String, List<String>> map) throws Exception;

    void onContinuationFrame(n0 n0Var, r0 r0Var) throws Exception;

    void onDisconnected(n0 n0Var, r0 r0Var, r0 r0Var2, boolean z10) throws Exception;

    void onError(n0 n0Var, WebSocketException webSocketException) throws Exception;

    void onFrame(n0 n0Var, r0 r0Var) throws Exception;

    void onFrameError(n0 n0Var, WebSocketException webSocketException, r0 r0Var) throws Exception;

    void onFrameSent(n0 n0Var, r0 r0Var) throws Exception;

    void onFrameUnsent(n0 n0Var, r0 r0Var) throws Exception;

    void onMessageDecompressionError(n0 n0Var, WebSocketException webSocketException, byte[] bArr) throws Exception;

    void onMessageError(n0 n0Var, WebSocketException webSocketException, List<r0> list) throws Exception;

    void onPingFrame(n0 n0Var, r0 r0Var) throws Exception;

    void onPongFrame(n0 n0Var, r0 r0Var) throws Exception;

    void onSendError(n0 n0Var, WebSocketException webSocketException, r0 r0Var) throws Exception;

    void onSendingFrame(n0 n0Var, r0 r0Var) throws Exception;

    void onSendingHandshake(n0 n0Var, String str, List<String[]> list) throws Exception;

    void onStateChanged(n0 n0Var, v0 v0Var) throws Exception;

    void onTextFrame(n0 n0Var, r0 r0Var) throws Exception;

    void onTextMessage(n0 n0Var, String str) throws Exception;

    void onTextMessage(n0 n0Var, byte[] bArr) throws Exception;

    void onTextMessageError(n0 n0Var, WebSocketException webSocketException, byte[] bArr) throws Exception;

    void onThreadCreated(n0 n0Var, l0 l0Var, Thread thread) throws Exception;

    void onThreadStarted(n0 n0Var, l0 l0Var, Thread thread) throws Exception;

    void onThreadStopping(n0 n0Var, l0 l0Var, Thread thread) throws Exception;

    void onUnexpectedError(n0 n0Var, WebSocketException webSocketException) throws Exception;
}
