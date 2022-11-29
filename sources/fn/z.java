package fn;

import com.google.protobuf.j0;
import com.google.protobuf.m0;
import com.google.protobuf.n0;
import com.google.protobuf.p0;
import com.google.protobuf.q0;
import java.io.IOException;

/* loaded from: classes4.dex */
public class z extends m0<n0, n0> {
    @Override // com.google.protobuf.m0
    /* renamed from: A */
    public n0 g(Object obj) {
        return ((com.google.protobuf.r) obj).unknownFields;
    }

    @Override // com.google.protobuf.m0
    /* renamed from: B */
    public int h(n0 n0Var) {
        return n0Var.d();
    }

    @Override // com.google.protobuf.m0
    /* renamed from: C */
    public int i(n0 n0Var) {
        return n0Var.e();
    }

    @Override // com.google.protobuf.m0
    /* renamed from: D */
    public n0 k(n0 n0Var, n0 n0Var2) {
        return n0Var2.equals(n0.c()) ? n0Var : n0.i(n0Var, n0Var2);
    }

    @Override // com.google.protobuf.m0
    /* renamed from: E */
    public n0 n() {
        return n0.j();
    }

    @Override // com.google.protobuf.m0
    /* renamed from: F */
    public void o(Object obj, n0 n0Var) {
        p(obj, n0Var);
    }

    @Override // com.google.protobuf.m0
    /* renamed from: G */
    public void p(Object obj, n0 n0Var) {
        ((com.google.protobuf.r) obj).unknownFields = n0Var;
    }

    @Override // com.google.protobuf.m0
    /* renamed from: H */
    public n0 r(n0 n0Var) {
        n0Var.h();
        return n0Var;
    }

    @Override // com.google.protobuf.m0
    /* renamed from: I */
    public void s(n0 n0Var, q0 q0Var) throws IOException {
        n0Var.o(q0Var);
    }

    @Override // com.google.protobuf.m0
    /* renamed from: J */
    public void t(n0 n0Var, q0 q0Var) throws IOException {
        n0Var.q(q0Var);
    }

    @Override // com.google.protobuf.m0
    public void j(Object obj) {
        g(obj).h();
    }

    @Override // com.google.protobuf.m0
    public boolean q(j0 j0Var) {
        return false;
    }

    @Override // com.google.protobuf.m0
    /* renamed from: u */
    public void a(n0 n0Var, int i10, int i11) {
        n0Var.m(p0.c(i10, 5), Integer.valueOf(i11));
    }

    @Override // com.google.protobuf.m0
    /* renamed from: v */
    public void b(n0 n0Var, int i10, long j10) {
        n0Var.m(p0.c(i10, 1), Long.valueOf(j10));
    }

    @Override // com.google.protobuf.m0
    /* renamed from: w */
    public void c(n0 n0Var, int i10, n0 n0Var2) {
        n0Var.m(p0.c(i10, 3), n0Var2);
    }

    @Override // com.google.protobuf.m0
    /* renamed from: x */
    public void d(n0 n0Var, int i10, com.google.protobuf.f fVar) {
        n0Var.m(p0.c(i10, 2), fVar);
    }

    @Override // com.google.protobuf.m0
    /* renamed from: y */
    public void e(n0 n0Var, int i10, long j10) {
        n0Var.m(p0.c(i10, 0), Long.valueOf(j10));
    }

    @Override // com.google.protobuf.m0
    /* renamed from: z */
    public n0 f(Object obj) {
        n0 g10 = g(obj);
        if (g10 == n0.c()) {
            n0 j10 = n0.j();
            p(obj, j10);
            return j10;
        }
        return g10;
    }
}
