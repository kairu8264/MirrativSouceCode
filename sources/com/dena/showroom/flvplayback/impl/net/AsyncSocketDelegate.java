package com.dena.showroom.flvplayback.impl.net;

/* loaded from: classes3.dex */
public interface AsyncSocketDelegate {
    void onBytesAvailable(AsyncSocket asyncSocket);

    void onClosed(AsyncSocket asyncSocket, Throwable th2);

    void onSpaceAvailable(AsyncSocket asyncSocket);
}
