package ai;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class lo3<T> extends pk3 {

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<T, ko3<T>> f6636g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public Handler f6637h;

    /* renamed from: i  reason: collision with root package name */
    public pm f6638i;

    public final void A(final T t10, dp3 dp3Var) {
        u9.a(!this.f6636g.containsKey(t10));
        cp3 cp3Var = new cp3(this, t10) { // from class: ai.io3

            /* renamed from: a  reason: collision with root package name */
            public final lo3 f5310a;

            /* renamed from: b  reason: collision with root package name */
            public final Object f5311b;

            {
                this.f5310a = this;
                this.f5311b = t10;
            }

            @Override // ai.cp3
            public final void a(dp3 dp3Var2, q7 q7Var) {
                this.f5310a.z(this.f5311b, dp3Var2, q7Var);
            }
        };
        jo3 jo3Var = new jo3(this, t10);
        this.f6636g.put(t10, new ko3<>(dp3Var, cp3Var, jo3Var));
        Handler handler = this.f6637h;
        Objects.requireNonNull(handler);
        dp3Var.b(handler, jo3Var);
        Handler handler2 = this.f6637h;
        Objects.requireNonNull(handler2);
        dp3Var.e(handler2, jo3Var);
        dp3Var.a(cp3Var, this.f6638i);
        if (y()) {
            return;
        }
        dp3Var.i(cp3Var);
    }

    public abstract bp3 B(T t10, bp3 bp3Var);

    @Override // ai.pk3
    public final void l() {
        for (ko3<T> ko3Var : this.f6636g.values()) {
            ko3Var.f6299a.h(ko3Var.f6300b);
        }
    }

    @Override // ai.pk3
    public void n(pm pmVar) {
        this.f6638i = pmVar;
        this.f6637h = sb.M(null);
    }

    @Override // ai.pk3
    public final void o() {
        for (ko3<T> ko3Var : this.f6636g.values()) {
            ko3Var.f6299a.i(ko3Var.f6300b);
        }
    }

    @Override // ai.pk3
    public void p() {
        for (ko3<T> ko3Var : this.f6636g.values()) {
            ko3Var.f6299a.j(ko3Var.f6300b);
            ko3Var.f6299a.d(ko3Var.f6301c);
            ko3Var.f6299a.k(ko3Var.f6301c);
        }
        this.f6636g.clear();
    }

    @Override // ai.dp3
    public void r() throws IOException {
        for (ko3<T> ko3Var : this.f6636g.values()) {
            ko3Var.f6299a.r();
        }
    }

    public abstract void z(T t10, dp3 dp3Var, q7 q7Var);
}
