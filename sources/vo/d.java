package vo;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Objects;
import wn.l;
import wn.m;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f57539a;
    private static volatile Choreographer choreographer;

    static {
        Object a10;
        try {
            l.a aVar = l.f59224w;
            a10 = l.a(new b(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th2) {
            l.a aVar2 = l.f59224w;
            a10 = l.a(m.a(th2));
        }
        f57539a = l.c(a10) ? null : a10;
    }

    public static final Handler a(Looper looper, boolean z10) {
        int i10;
        if (!z10 || (i10 = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i10 >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    public static final c b(Handler handler, String str) {
        return new b(handler, str);
    }
}
