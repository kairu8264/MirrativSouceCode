package ai;

import android.os.Build;
import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: c  reason: collision with root package name */
    public static final ConditionVariable f8192c = new ConditionVariable();

    /* renamed from: d  reason: collision with root package name */
    public static volatile xv2 f8193d = null;

    /* renamed from: e  reason: collision with root package name */
    public static volatile Random f8194e = null;

    /* renamed from: a  reason: collision with root package name */
    public final r0 f8195a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Boolean f8196b;

    public p(r0 r0Var) {
        this.f8195a = r0Var;
        r0Var.e().execute(new o(this));
    }

    public static final int d() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : e().nextInt();
        } catch (RuntimeException unused) {
            return e().nextInt();
        }
    }

    public static Random e() {
        if (f8194e == null) {
            synchronized (p.class) {
                if (f8194e == null) {
                    f8194e = new Random();
                }
            }
        }
        return f8194e;
    }

    public final void c(int i10, int i11, long j10, String str, Exception exc) {
        try {
            f8192c.block();
            if (!this.f8196b.booleanValue() || f8193d == null) {
                return;
            }
            n54 B = r54.B();
            B.r(this.f8195a.f9266a.getPackageName());
            B.s(j10);
            if (str != null) {
                B.v(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                ug3.c(exc, new PrintWriter(stringWriter));
                B.t(stringWriter.toString());
                B.u(exc.getClass().getName());
            }
            vv2 a10 = f8193d.a(B.n().L());
            a10.c(i10);
            if (i11 != -1) {
                a10.b(i11);
            }
            a10.a();
        } catch (Exception unused) {
        }
    }
}
