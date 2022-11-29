package ai;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public abstract class f33<I, O, F, T> extends y33<O> implements Runnable {
    public static final /* synthetic */ int F = 0;
    public s43<? extends I> D;
    public F E;

    public f33(s43<? extends I> s43Var, F f10) {
        Objects.requireNonNull(s43Var);
        this.D = s43Var;
        Objects.requireNonNull(f10);
        this.E = f10;
    }

    public abstract void F(T t10);

    public abstract T G(F f10, I i10) throws Exception;

    @Override // ai.a33
    public final String h() {
        String str;
        s43<? extends I> s43Var = this.D;
        F f10 = this.E;
        String h10 = super.h();
        if (s43Var != null) {
            String obj = s43Var.toString();
            StringBuilder sb2 = new StringBuilder(obj.length() + 16);
            sb2.append("inputFuture=[");
            sb2.append(obj);
            sb2.append("], ");
            str = sb2.toString();
        } else {
            str = "";
        }
        if (f10 == null) {
            if (h10 != null) {
                return h10.length() != 0 ? str.concat(h10) : new String(str);
            }
            return null;
        }
        String obj2 = f10.toString();
        StringBuilder sb3 = new StringBuilder(str.length() + 11 + obj2.length());
        sb3.append(str);
        sb3.append("function=[");
        sb3.append(obj2);
        sb3.append("]");
        return sb3.toString();
    }

    @Override // ai.a33
    public final void j() {
        z(this.D);
        this.D = null;
        this.E = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        s43<? extends I> s43Var = this.D;
        F f10 = this.E;
        if ((isCancelled() | (s43Var == null)) || (f10 == null)) {
            return;
        }
        this.D = null;
        if (s43Var.isCancelled()) {
            w(s43Var);
            return;
        }
        try {
            try {
                Object G = G(f10, j43.q(s43Var));
                this.E = null;
                F(G);
            } catch (Throwable th2) {
                try {
                    v(th2);
                } finally {
                    this.E = null;
                }
            }
        } catch (Error e10) {
            v(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e11) {
            v(e11);
        } catch (ExecutionException e12) {
            v(e12.getCause());
        }
    }
}
