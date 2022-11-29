package vi;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class r implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ g f57388w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ s f57389x;

    public r(s sVar, g gVar) {
        this.f57389x = sVar;
        this.f57388w = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i0 i0Var;
        i0 i0Var2;
        i0 i0Var3;
        a aVar;
        try {
            aVar = this.f57389x.f57391b;
            g gVar = (g) aVar.a(this.f57388w);
            if (gVar == null) {
                this.f57389x.a(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = i.f57364b;
            gVar.h(executor, this.f57389x);
            gVar.e(executor, this.f57389x);
            gVar.a(executor, this.f57389x);
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                i0Var3 = this.f57389x.f57392c;
                i0Var3.v((Exception) e10.getCause());
                return;
            }
            i0Var2 = this.f57389x.f57392c;
            i0Var2.v(e10);
        } catch (Exception e11) {
            i0Var = this.f57389x.f57392c;
            i0Var.v(e11);
        }
    }
}
