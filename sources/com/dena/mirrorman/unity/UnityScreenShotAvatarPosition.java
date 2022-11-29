package com.dena.mirrorman.unity;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;

/* loaded from: classes3.dex */
public enum UnityScreenShotAvatarPosition {
    CENTER("-1"),
    LEFT("0"),
    RIGHT(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
    
    private final String value;

    UnityScreenShotAvatarPosition(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
