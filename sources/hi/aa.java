package hi;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class aa<T> implements ha<T> {

    /* renamed from: a  reason: collision with root package name */
    public final w9 f35639a;

    /* renamed from: b  reason: collision with root package name */
    public final va<?, ?> f35640b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f35641c;

    /* renamed from: d  reason: collision with root package name */
    public final h8<?> f35642d;

    public aa(va<?, ?> vaVar, h8<?> h8Var, w9 w9Var) {
        this.f35640b = vaVar;
        this.f35641c = h8Var.c(w9Var);
        this.f35642d = h8Var;
        this.f35639a = w9Var;
    }

    public static <T> aa<T> j(va<?, ?> vaVar, h8<?> h8Var, w9 w9Var) {
        return new aa<>(vaVar, h8Var, w9Var);
    }

    @Override // hi.ha
    public final int a(T t10) {
        va<?, ?> vaVar = this.f35640b;
        int b10 = vaVar.b(vaVar.c(t10));
        if (this.f35641c) {
            this.f35642d.a(t10);
            throw null;
        }
        return b10;
    }

    @Override // hi.ha
    public final int b(T t10) {
        int hashCode = this.f35640b.c(t10).hashCode();
        if (this.f35641c) {
            this.f35642d.a(t10);
            throw null;
        }
        return hashCode;
    }

    @Override // hi.ha
    public final T c() {
        return (T) this.f35639a.v0().S();
    }

    @Override // hi.ha
    public final void d(T t10) {
        this.f35640b.g(t10);
        this.f35642d.b(t10);
    }

    @Override // hi.ha
    public final boolean e(T t10) {
        this.f35642d.a(t10);
        throw null;
    }

    @Override // hi.ha
    public final void f(T t10, T t11) {
        ja.f(this.f35640b, t10, t11);
        if (this.f35641c) {
            ja.e(this.f35642d, t10, t11);
        }
    }

    @Override // hi.ha
    public final boolean g(T t10, T t11) {
        if (this.f35640b.c(t10).equals(this.f35640b.c(t11))) {
            if (this.f35641c) {
                this.f35642d.a(t10);
                this.f35642d.a(t11);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // hi.ha
    public final void h(T t10, byte[] bArr, int i10, int i11, h7 h7Var) throws IOException {
        t8 t8Var = (t8) t10;
        if (t8Var.zzc == wa.c()) {
            t8Var.zzc = wa.e();
        }
        r8 r8Var = (r8) t10;
        throw null;
    }

    @Override // hi.ha
    public final void i(T t10, c8 c8Var) throws IOException {
        this.f35642d.a(t10);
        throw null;
    }
}
