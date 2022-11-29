package com.mirrativ.llstream.protocol.v1.tag;

/* loaded from: classes4.dex */
public enum TagSystemValue {
    TAG_SYS_UNTAG((byte) 0);
    
    private final byte value;

    TagSystemValue(byte b10) {
        this.value = b10;
    }

    public final byte getValue() {
        return this.value;
    }
}
