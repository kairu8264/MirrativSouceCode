package pi;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class o8 implements Runnable {
    public final /* synthetic */ w8 A;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f48105w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f48106x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ na f48107y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ hi.i1 f48108z;

    public o8(w8 w8Var, String str, String str2, na naVar, hi.i1 i1Var) {
        this.A = w8Var;
        this.f48105w = str;
        this.f48106x = str2;
        this.f48107y = naVar;
        this.f48108z = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b5 b5Var;
        g3 g3Var;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            try {
                g3Var = this.A.f48322d;
                if (g3Var == null) {
                    this.A.f48285a.r().p().c("Failed to get conditional properties; not connected to service", this.f48105w, this.f48106x);
                    b5Var = this.A.f48285a;
                } else {
                    rh.p.i(this.f48107y);
                    arrayList = ia.t(g3Var.x3(this.f48105w, this.f48106x, this.f48107y));
                    this.A.D();
                    b5Var = this.A.f48285a;
                }
            } catch (RemoteException e10) {
                this.A.f48285a.r().p().d("Failed to get conditional properties; remote exception", this.f48105w, this.f48106x, e10);
                b5Var = this.A.f48285a;
            }
            b5Var.N().C(this.f48108z, arrayList);
        } catch (Throwable th2) {
            this.A.f48285a.N().C(this.f48108z, arrayList);
            throw th2;
        }
    }
}
