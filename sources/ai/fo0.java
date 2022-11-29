package ai;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class fo0 implements oh.c {

    /* renamed from: w  reason: collision with root package name */
    public final Context f4142w;

    /* renamed from: x  reason: collision with root package name */
    public final String f4143x;

    /* renamed from: y  reason: collision with root package name */
    public final WeakReference<em0> f4144y;

    public fo0(em0 em0Var) {
        Context context = em0Var.getContext();
        this.f4142w = context;
        this.f4143x = wg.t.d().P(context, em0Var.m().f13013w);
        this.f4144y = new WeakReference<>(em0Var);
    }

    public static /* synthetic */ void t(fo0 fo0Var, String str, Map map) {
        em0 em0Var = fo0Var.f4144y.get();
        if (em0Var != null) {
            em0Var.j0("onPrecacheEvent", map);
        }
    }

    public abstract boolean f(String str);

    public boolean g(String str, String[] strArr) {
        return f(str);
    }

    public boolean h(String str, String[] strArr, wn0 wn0Var) {
        return f(str);
    }

    public void i(int i10) {
    }

    public void j(int i10) {
    }

    public void k(int i10) {
    }

    public void l(int i10) {
    }

    public abstract void m();

    public final void o(String str, String str2, long j10, long j11, boolean z10, long j12, long j13, long j14, int i10, int i11) {
        nj0.f7362b.post(new zn0(this, str, str2, j10, j11, j12, j13, j14, z10, i10, i11));
    }

    public final void p(String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        nj0.f7362b.post(new ao0(this, str, str2, i10, i11, j10, j11, z10, i12, i13));
    }

    public final void q(String str, String str2, int i10) {
        nj0.f7362b.post(new bo0(this, str, str2, i10));
    }

    public final void r(String str, String str2, long j10) {
        nj0.f7362b.post(new co0(this, str, str2, j10));
    }

    @Override // oh.c
    public void release() {
    }

    public final void s(String str, String str2, String str3, String str4) {
        nj0.f7362b.post(new do0(this, str, str2, str3, str4));
    }
}
