package com.dena.mirrorman.webrtc;

import io.l;
import jo.p;
import jo.q;
import org.webrtc.MediaStream;

/* loaded from: classes3.dex */
public final class RTCClient$onRemoveStream$1 extends q implements l<MediaStream, Boolean> {
    public final /* synthetic */ MediaStream $stream;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCClient$onRemoveStream$1(MediaStream mediaStream) {
        super(1);
        this.$stream = mediaStream;
    }

    @Override // io.l
    public final Boolean invoke(MediaStream mediaStream) {
        p.h(mediaStream, "it");
        return Boolean.valueOf(p.c(mediaStream.getId(), this.$stream.getId()));
    }
}
