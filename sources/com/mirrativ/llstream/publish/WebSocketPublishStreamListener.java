package com.mirrativ.llstream.publish;

import com.mirrativ.llstream.publish.WebSocketPublishStream;

/* loaded from: classes4.dex */
public interface WebSocketPublishStreamListener {
    void onChangeConnectionState(WebSocketPublishStream webSocketPublishStream, WebSocketPublishStream.ConnectionState connectionState);

    void onError(WebSocketPublishStream webSocketPublishStream, WebSocketPublishStream.WebSocketStreamError webSocketStreamError);

    void onExceededMaxReconnectCount(WebSocketPublishStream webSocketPublishStream, int i10);

    void onPublishStreamStalled(WebSocketPublishStream webSocketPublishStream);

    void onRetryToConnect(WebSocketPublishStream webSocketPublishStream, int i10);
}
