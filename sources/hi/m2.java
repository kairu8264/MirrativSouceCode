package hi;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class m2 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final long f35851w;

    /* renamed from: x  reason: collision with root package name */
    public final long f35852x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f35853y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ x2 f35854z;

    public m2(x2 x2Var, boolean z10) {
        this.f35854z = x2Var;
        this.f35851w = x2Var.f36059b.currentTimeMillis();
        this.f35852x = x2Var.f36059b.elapsedRealtime();
        this.f35853y = z10;
    }

    public abstract void a() throws RemoteException;

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        z10 = this.f35854z.f36064g;
        if (z10) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            this.f35854z.k(e10, false, this.f35853y);
            b();
        }
    }
}
