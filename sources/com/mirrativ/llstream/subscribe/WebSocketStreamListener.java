package com.mirrativ.llstream.subscribe;

import com.mirrativ.llstream.subscribe.WebSocketStream;

/* loaded from: classes4.dex */
public interface WebSocketStreamListener {
    void onChangeConnectionState(WebSocketStream webSocketStream, WebSocketStream.ConnectionState connectionState);

    void onClosed(WebSocketStream webSocketStream, int i10, String str);

    void onClosing(WebSocketStream webSocketStream, int i10, String str);

    void onError(WebSocketStream webSocketStream, WebSocketStream.WebsocketStreamError websocketStreamError);

    void onMessage(WebSocketStream webSocketStream, byte[] bArr);

    void onOpen(WebSocketStream webSocketStream);
}
