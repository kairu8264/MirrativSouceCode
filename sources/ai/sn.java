package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class sn {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f9880a;

    /* renamed from: b  reason: collision with root package name */
    public int f9881b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ un f9882c;

    public /* synthetic */ sn(un unVar, byte[] bArr, tn tnVar) {
        this.f9882c = unVar;
        this.f9880a = bArr;
    }

    public final synchronized void a() {
        try {
            un unVar = this.f9882c;
            if (unVar.f10759b) {
                unVar.f10758a.p2(this.f9880a);
                this.f9882c.f10758a.q0(0);
                this.f9882c.f10758a.w2(this.f9881b);
                this.f9882c.f10758a.a2(null);
                this.f9882c.f10758a.a();
            }
        } catch (RemoteException e10) {
            uj0.b("Clearcut log failed", e10);
        }
    }

    public final sn b(int i10) {
        this.f9881b = i10;
        return this;
    }
}
