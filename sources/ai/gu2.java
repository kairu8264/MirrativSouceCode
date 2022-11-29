package ai;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class gu2 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4590a;

    /* renamed from: b  reason: collision with root package name */
    public final Looper f4591b;

    public gu2(Context context, Looper looper) {
        this.f4590a = context;
        this.f4591b = looper;
    }

    public final void a(String str) {
        vu2 B = xu2.B();
        B.r(this.f4590a.getPackageName());
        B.t(2);
        su2 B2 = tu2.B();
        B2.r(str);
        B2.s(2);
        B.s(B2);
        new hu2(this.f4590a, this.f4591b, B.n()).a();
    }
}
