package com.unity3d.player;

import android.os.Build;

/* loaded from: classes4.dex */
public class PlatformSupport {
    public static final boolean LOLLIPOP_SUPPORT;
    public static final boolean MARSHMALLOW_SUPPORT;
    public static final boolean NOUGAT_SUPPORT;

    static {
        int i10 = Build.VERSION.SDK_INT;
        LOLLIPOP_SUPPORT = i10 >= 21;
        MARSHMALLOW_SUPPORT = i10 >= 23;
        NOUGAT_SUPPORT = i10 >= 24;
    }
}
