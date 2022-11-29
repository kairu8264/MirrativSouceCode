package com.mirrativ.llstream.protocol.v1.tag;

/* loaded from: classes4.dex */
public enum TagCategory {
    TAG_CAT_UNTAG((byte) 0),
    TAG_CAT_LIP_META((byte) 1),
    TAG_CAT_RESERVED((byte) -1);
    
    private final byte value;

    TagCategory(byte b10) {
        this.value = b10;
    }

    public final byte getValue() {
        return this.value;
    }
}
