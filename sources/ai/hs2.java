package ai;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes3.dex */
public final class hs2 {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    public static final hs2 f4957b = new hs2();

    /* renamed from: a  reason: collision with root package name */
    public Context f4958a;

    public static hs2 a() {
        return f4957b;
    }

    public final Context b() {
        return this.f4958a;
    }

    public final void c(Context context) {
        this.f4958a = context != null ? context.getApplicationContext() : null;
    }
}
