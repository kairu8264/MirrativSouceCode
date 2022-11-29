package ai;

import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes3.dex */
public final class vv2 {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f11387a;

    /* renamed from: b  reason: collision with root package name */
    public int f11388b;

    /* renamed from: c  reason: collision with root package name */
    public int f11389c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ xv2 f11390d;

    public /* synthetic */ vv2(xv2 xv2Var, byte[] bArr, wv2 wv2Var) {
        this.f11390d = xv2Var;
        this.f11387a = bArr;
    }

    public final synchronized void a() {
        try {
            xv2 xv2Var = this.f11390d;
            if (xv2Var.f12323a) {
                xv2Var.f12324b.f4(this.f11387a);
                this.f11390d.f12324b.c0(this.f11388b);
                this.f11390d.f12324b.q0(this.f11389c);
                this.f11390d.f12324b.M1(null);
                this.f11390d.f12324b.c();
            }
        } catch (RemoteException e10) {
            Log.d("GASS", "Clearcut log failed", e10);
        }
    }

    public final vv2 b(int i10) {
        this.f11388b = i10;
        return this;
    }

    public final vv2 c(int i10) {
        this.f11389c = i10;
        return this;
    }
}
