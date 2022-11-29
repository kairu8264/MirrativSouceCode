package pi;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public final class x7 implements Runnable {
    public final /* synthetic */ hi.i1 A;
    public final /* synthetic */ w8 B;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f48344w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f48345x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ na f48346y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f48347z;

    public x7(w8 w8Var, String str, String str2, na naVar, boolean z10, hi.i1 i1Var) {
        this.B = w8Var;
        this.f48344w = str;
        this.f48345x = str2;
        this.f48346y = naVar;
        this.f48347z = z10;
        this.A = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e10;
        g3 g3Var;
        Bundle bundle2 = new Bundle();
        try {
            g3Var = this.B.f48322d;
            if (g3Var == null) {
                this.B.f48285a.r().p().c("Failed to get user properties; not connected to service", this.f48344w, this.f48345x);
                this.B.f48285a.N().D(this.A, bundle2);
                return;
            }
            rh.p.i(this.f48346y);
            List<ea> Z0 = g3Var.Z0(this.f48344w, this.f48345x, this.f48347z, this.f48346y);
            bundle = new Bundle();
            if (Z0 != null) {
                for (ea eaVar : Z0) {
                    String str = eaVar.A;
                    if (str != null) {
                        bundle.putString(eaVar.f47793x, str);
                    } else {
                        Long l10 = eaVar.f47795z;
                        if (l10 != null) {
                            bundle.putLong(eaVar.f47793x, l10.longValue());
                        } else {
                            Double d10 = eaVar.C;
                            if (d10 != null) {
                                bundle.putDouble(eaVar.f47793x, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.B.D();
                    this.B.f48285a.N().D(this.A, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.B.f48285a.N().D(this.A, bundle2);
                    throw th;
                }
            } catch (RemoteException e11) {
                e10 = e11;
                this.B.f48285a.r().p().c("Failed to get user properties; remote exception", this.f48344w, e10);
                this.B.f48285a.N().D(this.A, bundle);
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            this.B.f48285a.N().D(this.A, bundle2);
            throw th;
        }
    }
}
