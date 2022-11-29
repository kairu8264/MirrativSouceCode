package vi;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* loaded from: classes3.dex */
public final class p implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ g f57383w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ q f57384x;

    public p(q qVar, g gVar) {
        this.f57384x = qVar;
        this.f57383w = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i0 i0Var;
        i0 i0Var2;
        i0 i0Var3;
        a aVar;
        i0 i0Var4;
        i0 i0Var5;
        if (this.f57383w.q()) {
            i0Var5 = this.f57384x.f57387c;
            i0Var5.x();
            return;
        }
        try {
            aVar = this.f57384x.f57386b;
            Object a10 = aVar.a(this.f57383w);
            i0Var4 = this.f57384x.f57387c;
            i0Var4.w(a10);
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                i0Var3 = this.f57384x.f57387c;
                i0Var3.v((Exception) e10.getCause());
                return;
            }
            i0Var2 = this.f57384x.f57387c;
            i0Var2.v(e10);
        } catch (Exception e11) {
            i0Var = this.f57384x.f57387c;
            i0Var.v(e11);
        }
    }
}
