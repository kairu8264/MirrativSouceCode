package fj;

import android.os.Build;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f31986a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            f31986a = 2;
        } else if (i10 >= 18) {
            f31986a = 1;
        } else {
            f31986a = 0;
        }
    }
}
