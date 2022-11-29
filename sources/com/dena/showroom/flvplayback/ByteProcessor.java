package com.dena.showroom.flvplayback;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface ByteProcessor {
    ByteBuffer getIncomingBytes();

    ByteBuffer getOutgoingBytes();

    boolean proceed();
}
