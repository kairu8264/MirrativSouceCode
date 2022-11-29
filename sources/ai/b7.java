package ai;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.gms.internal.ads.zzahc;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class b7 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, lu3, fk1, s9, w7, t2, p2, f7, i6, h3 {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ e7 f2258w;

    public /* synthetic */ b7(e7 e7Var, d7 d7Var) {
        this.f2258w = e7Var;
    }

    @Override // ai.fk1
    public final void A(v4 v4Var, qo qoVar) {
        e7.Z(this.f2258w, v4Var);
        e7.W(this.f2258w).A(v4Var, qoVar);
    }

    @Override // ai.i6
    public final void A0(boolean z10, int i10) {
    }

    @Override // ai.fk1
    public final void B(Exception exc) {
        e7.W(this.f2258w).B(exc);
    }

    @Override // ai.i6
    public final void B0(int i10) {
        e7.F(this.f2258w);
    }

    @Override // ai.fk1
    public final void C(Exception exc) {
        e7.W(this.f2258w).C(exc);
    }

    @Override // ai.lu3
    public final void C0(String str) {
        e7.W(this.f2258w).C0(str);
    }

    @Override // ai.h3
    public final void b(boolean z10) {
    }

    @Override // ai.lu3
    public final void c(on onVar) {
        e7.W(this.f2258w).c(onVar);
        e7.Y(this.f2258w, null);
        e7.b0(this.f2258w, null);
    }

    @Override // ai.fk1
    public final void d(String str) {
        e7.W(this.f2258w).d(str);
    }

    @Override // ai.fk1
    public final void e(on onVar) {
        e7.c0(this.f2258w, onVar);
        e7.W(this.f2258w).e(onVar);
    }

    @Override // ai.h3
    public final void f(boolean z10) {
        e7.F(this.f2258w);
    }

    @Override // ai.fk1
    public final void g(int i10, long j10, long j11) {
        e7.W(this.f2258w).g(i10, j10, j11);
    }

    @Override // ai.lu3
    public final void h(Object obj, long j10) {
        e7.W(this.f2258w).h(obj, j10);
        if (e7.a0(this.f2258w) == obj) {
            Iterator it = e7.V(this.f2258w).iterator();
            while (it.hasNext()) {
                ((k6) it.next()).q();
            }
        }
    }

    @Override // ai.lu3
    public final void i(on onVar) {
        e7.b0(this.f2258w, onVar);
        e7.W(this.f2258w).i(onVar);
    }

    @Override // ai.fk1
    public final void j(String str, long j10, long j11) {
        e7.W(this.f2258w).j(str, j10, j11);
    }

    @Override // ai.fk1
    public final void k(long j10) {
        e7.W(this.f2258w).k(j10);
    }

    @Override // ai.lu3
    public final void m(int i10, long j10) {
        e7.W(this.f2258w).m(i10, j10);
    }

    @Override // ai.fk1
    public final void n(boolean z10) {
        if (e7.d0(this.f2258w) == z10) {
            return;
        }
        e7.e0(this.f2258w, z10);
        e7.B(this.f2258w);
    }

    @Override // ai.i6
    public final void n0(boolean z10) {
    }

    @Override // ai.lu3
    public final void o(s54 s54Var) {
        e7.h0(this.f2258w, s54Var);
        e7.W(this.f2258w).o(s54Var);
        Iterator it = e7.V(this.f2258w).iterator();
        while (it.hasNext()) {
            ((k6) it.next()).o(s54Var);
        }
    }

    @Override // ai.i6
    public final void o0() {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        e7.v(this.f2258w, surfaceTexture);
        e7.z(this.f2258w, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e7.w(this.f2258w, null);
        e7.z(this.f2258w, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e7.z(this.f2258w, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // ai.i6
    public final void p0(e6 e6Var) {
    }

    @Override // ai.i6
    public final void q0(boolean z10, int i10) {
        e7.F(this.f2258w);
    }

    @Override // ai.i6
    public final void r0(k5 k5Var, int i10) {
    }

    @Override // ai.i6
    public final void s0(n6 n6Var, n6 n6Var2, int i10) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        e7.z(this.f2258w, i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        e7.z(this.f2258w, 0, 0);
    }

    @Override // ai.lu3
    public final void t(long j10, int i10) {
        e7.W(this.f2258w).t(j10, i10);
    }

    @Override // ai.i6
    public final void t0(boolean z10) {
    }

    @Override // ai.lu3
    public final void u(Exception exc) {
        e7.W(this.f2258w).u(exc);
    }

    @Override // ai.i6
    public final void u0(q7 q7Var, int i10) {
    }

    @Override // ai.i6
    public final void v0(uz3 uz3Var, v04 v04Var) {
    }

    @Override // ai.fk1
    public final void w(on onVar) {
        e7.W(this.f2258w).w(onVar);
        e7.Z(this.f2258w, null);
        e7.c0(this.f2258w, null);
    }

    @Override // ai.i6
    public final void w0(h6 h6Var) {
    }

    @Override // ai.lu3
    public final void x(v4 v4Var, qo qoVar) {
        e7.Y(this.f2258w, v4Var);
        e7.W(this.f2258w).x(v4Var, qoVar);
    }

    @Override // ai.i6
    public final void x0(zzahc zzahcVar) {
    }

    @Override // ai.lu3
    public final void y(String str, long j10, long j11) {
        e7.W(this.f2258w).y(str, j10, j11);
    }

    @Override // ai.i6
    public final void y0(o5 o5Var) {
    }

    @Override // ai.i6
    public final void z0(int i10) {
    }
}
