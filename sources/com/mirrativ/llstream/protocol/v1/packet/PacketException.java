package com.mirrativ.llstream.protocol.v1.packet;

import jo.p;

/* loaded from: classes4.dex */
public final class PacketException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PacketException(String str) {
        super(str);
        p.h(str, "message");
    }
}
