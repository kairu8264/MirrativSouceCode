package ai;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zf1 extends i00 {

    /* renamed from: w  reason: collision with root package name */
    public final og1 f12972w;

    /* renamed from: x  reason: collision with root package name */
    public yh.a f12973x;

    public zf1(og1 og1Var) {
        this.f12972w = og1Var;
    }

    public static float R5(yh.a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) yh.b.z0(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // ai.j00
    public final float c() throws RemoteException {
        if (((Boolean) ft.c().c(ox.A4)).booleanValue()) {
            if (this.f12972w.w() != 0.0f) {
                return this.f12972w.w();
            }
            if (this.f12972w.e0() != null) {
                try {
                    return this.f12972w.e0().k();
                } catch (RemoteException e10) {
                    uj0.d("Remote exception getting video controller aspect ratio.", e10);
                    return 0.0f;
                }
            }
            yh.a aVar = this.f12973x;
            if (aVar != null) {
                return R5(aVar);
            }
            m00 b10 = this.f12972w.b();
            if (b10 == null) {
                return 0.0f;
            }
            float c10 = (b10.c() == -1 || b10.a() == -1) ? 0.0f : b10.c() / b10.a();
            return c10 == 0.0f ? R5(b10.zzb()) : c10;
        }
        return 0.0f;
    }

    @Override // ai.j00
    public final float e() throws RemoteException {
        if (((Boolean) ft.c().c(ox.B4)).booleanValue() && this.f12972w.e0() != null) {
            return this.f12972w.e0().g();
        }
        return 0.0f;
    }

    @Override // ai.j00
    public final yh.a f() throws RemoteException {
        yh.a aVar = this.f12973x;
        if (aVar != null) {
            return aVar;
        }
        m00 b10 = this.f12972w.b();
        if (b10 == null) {
            return null;
        }
        return b10.zzb();
    }

    @Override // ai.j00
    public final pv g() throws RemoteException {
        if (((Boolean) ft.c().c(ox.B4)).booleanValue()) {
            return this.f12972w.e0();
        }
        return null;
    }

    @Override // ai.j00
    public final float h() throws RemoteException {
        if (((Boolean) ft.c().c(ox.B4)).booleanValue() && this.f12972w.e0() != null) {
            return this.f12972w.e0().i();
        }
        return 0.0f;
    }

    @Override // ai.j00
    public final boolean i() throws RemoteException {
        return ((Boolean) ft.c().c(ox.B4)).booleanValue() && this.f12972w.e0() != null;
    }

    @Override // ai.j00
    public final void z2(r10 r10Var) {
        if (((Boolean) ft.c().c(ox.B4)).booleanValue() && (this.f12972w.e0() instanceof nq0)) {
            ((nq0) this.f12972w.e0()).X5(r10Var);
        }
    }

    @Override // ai.j00
    public final void zzf(yh.a aVar) {
        this.f12973x = aVar;
    }
}
