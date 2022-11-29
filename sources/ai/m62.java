package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class m62 {

    /* renamed from: a  reason: collision with root package name */
    public final r62<u01> f6816a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6817b;

    /* renamed from: c  reason: collision with root package name */
    public lv f6818c;

    public m62(r62<u01> r62Var, String str) {
        this.f6816a = r62Var;
        this.f6817b = str;
    }

    public final synchronized boolean b() throws RemoteException {
        return this.f6816a.zzb();
    }

    public final synchronized void c(as asVar, int i10) throws RemoteException {
        this.f6818c = null;
        this.f6816a.a(asVar, this.f6817b, new s62(i10), new l62(this));
    }

    public final synchronized String d() {
        lv lvVar;
        try {
            lvVar = this.f6818c;
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
            return null;
        }
        return lvVar != null ? lvVar.c() : null;
    }

    public final synchronized String e() {
        lv lvVar;
        try {
            lvVar = this.f6818c;
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
            return null;
        }
        return lvVar != null ? lvVar.c() : null;
    }
}
