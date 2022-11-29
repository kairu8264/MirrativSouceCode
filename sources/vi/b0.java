package vi;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class b0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ g f57352w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ c0 f57353x;

    public b0(c0 c0Var, g gVar) {
        this.f57353x = c0Var;
        this.f57352w = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar;
        try {
            fVar = this.f57353x.f57355b;
            g a10 = fVar.a(this.f57352w.o());
            if (a10 == null) {
                this.f57353x.a(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = i.f57364b;
            a10.h(executor, this.f57353x);
            a10.e(executor, this.f57353x);
            a10.a(executor, this.f57353x);
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                this.f57353x.a((Exception) e10.getCause());
            } else {
                this.f57353x.a(e10);
            }
        } catch (CancellationException unused) {
            this.f57353x.c();
        } catch (Exception e11) {
            this.f57353x.a(e11);
        }
    }
}
