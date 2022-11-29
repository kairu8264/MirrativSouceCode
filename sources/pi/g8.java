package pi;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class g8 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ u f47872w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f47873x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ hi.i1 f47874y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ w8 f47875z;

    public g8(w8 w8Var, u uVar, String str, hi.i1 i1Var) {
        this.f47875z = w8Var;
        this.f47872w = uVar;
        this.f47873x = str;
        this.f47874y = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b5 b5Var;
        g3 g3Var;
        byte[] bArr = null;
        try {
            try {
                g3Var = this.f47875z.f48322d;
                if (g3Var == null) {
                    this.f47875z.f48285a.r().p().a("Discarding data. Failed to send event to service to bundle");
                    b5Var = this.f47875z.f48285a;
                } else {
                    bArr = g3Var.j4(this.f47872w, this.f47873x);
                    this.f47875z.D();
                    b5Var = this.f47875z.f48285a;
                }
            } catch (RemoteException e10) {
                this.f47875z.f48285a.r().p().b("Failed to send event to the service to bundle", e10);
                b5Var = this.f47875z.f48285a;
            }
            b5Var.N().E(this.f47874y, bArr);
        } catch (Throwable th2) {
            this.f47875z.f48285a.N().E(this.f47874y, bArr);
            throw th2;
        }
    }
}
