package ai;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public abstract class a2 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final String f1684a = getClass().getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public final r0 f1685b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1686c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1687d;

    /* renamed from: e  reason: collision with root package name */
    public final c64 f1688e;

    /* renamed from: f  reason: collision with root package name */
    public Method f1689f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1690g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1691h;

    public a2(r0 r0Var, String str, String str2, c64 c64Var, int i10, int i11) {
        this.f1685b = r0Var;
        this.f1686c = str;
        this.f1687d = str2;
        this.f1688e = c64Var;
        this.f1690g = i10;
        this.f1691h = i11;
    }

    public abstract void a() throws IllegalAccessException, InvocationTargetException;

    public Void b() throws Exception {
        long nanoTime;
        Method q10;
        int i10;
        try {
            nanoTime = System.nanoTime();
            q10 = this.f1685b.q(this.f1686c, this.f1687d);
            this.f1689f = q10;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (q10 == null) {
            return null;
        }
        a();
        p j10 = this.f1685b.j();
        if (j10 != null && (i10 = this.f1690g) != Integer.MIN_VALUE) {
            j10.c(this.f1691h, i10, (System.nanoTime() - nanoTime) / 1000, null, null);
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        b();
        return null;
    }
}
