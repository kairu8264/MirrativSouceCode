package zo;

import wn.l;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f63310a;

    static {
        Object a10;
        try {
            l.a aVar = wn.l.f59224w;
            a10 = wn.l.a(Class.forName("android.os.Build"));
        } catch (Throwable th2) {
            l.a aVar2 = wn.l.f59224w;
            a10 = wn.l.a(wn.m.a(th2));
        }
        f63310a = wn.l.d(a10);
    }

    public static final boolean a() {
        return f63310a;
    }
}
