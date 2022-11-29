package ph;

import com.google.android.gms.common.api.a;

/* loaded from: classes3.dex */
public final class z implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ a0 f47569w;

    public z(a0 a0Var) {
        this.f47569w = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.f fVar;
        a.f fVar2;
        b0 b0Var = this.f47569w.f47454a;
        fVar = b0Var.f47461x;
        fVar2 = b0Var.f47461x;
        fVar.a(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
