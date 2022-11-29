package com.unity3d.player;

import android.util.Log;

/* loaded from: classes4.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f28496a = false;

    public static void Log(int i10, String str) {
        if (f28496a) {
            return;
        }
        if (i10 == 6) {
            Log.e("Unity", str);
        }
        if (i10 == 5) {
            Log.w("Unity", str);
        }
    }
}
