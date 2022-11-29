package v4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import v4.q0;

/* loaded from: classes.dex */
public final class g0 implements z4.g {

    /* renamed from: w  reason: collision with root package name */
    public final z4.g f56613w;

    /* renamed from: x  reason: collision with root package name */
    public final q0.f f56614x;

    /* renamed from: y  reason: collision with root package name */
    public final Executor f56615y;

    public g0(z4.g gVar, q0.f fVar, Executor executor) {
        this.f56613w = gVar;
        this.f56614x = fVar;
        this.f56615y = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(String str) {
        this.f56614x.a(str, new ArrayList(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(String str, List list) {
        this.f56614x.a(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(String str) {
        this.f56614x.a(str, Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(String str, List list) {
        this.f56614x.a(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(z4.j jVar, j0 j0Var) {
        this.f56614x.a(jVar.a(), j0Var.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(z4.j jVar, j0 j0Var) {
        this.f56614x.a(jVar.a(), j0Var.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        this.f56614x.a("TRANSACTION SUCCESSFUL", Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.f56614x.a("BEGIN EXCLUSIVE TRANSACTION", Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        this.f56614x.a("BEGIN DEFERRED TRANSACTION", Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        this.f56614x.a("END TRANSACTION", Collections.emptyList());
    }

    @Override // z4.g
    public void B(final String str) throws SQLException {
        this.f56615y.execute(new Runnable() { // from class: v4.a0
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.C(str);
            }
        });
        this.f56613w.B(str);
    }

    @Override // z4.g
    public boolean C1() {
        return this.f56613w.C1();
    }

    @Override // z4.g
    public boolean J1() {
        return this.f56613w.J1();
    }

    @Override // z4.g
    public Cursor Q0(final String str, Object[] objArr) {
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        this.f56615y.execute(new Runnable() { // from class: v4.d0
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.G(str, arrayList);
            }
        });
        return this.f56613w.Q0(str, objArr);
    }

    @Override // z4.g
    public void T() {
        this.f56615y.execute(new Runnable() { // from class: v4.y
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.L();
            }
        });
        this.f56613w.T();
    }

    @Override // z4.g
    public void V(final String str, Object[] objArr) throws SQLException {
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        this.f56615y.execute(new Runnable() { // from class: v4.c0
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.E(str, arrayList);
            }
        });
        this.f56613w.V(str, arrayList.toArray());
    }

    @Override // z4.g
    public void W() {
        this.f56615y.execute(new Runnable() { // from class: v4.x
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.v();
            }
        });
        this.f56613w.W();
    }

    @Override // z4.g
    public z4.k X0(String str) {
        return new m0(this.f56613w.X0(str), this.f56614x, str, this.f56615y);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f56613w.close();
    }

    @Override // z4.g
    public void e0() {
        this.f56615y.execute(new Runnable() { // from class: v4.w
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.z();
            }
        });
        this.f56613w.e0();
    }

    @Override // z4.g
    public String getPath() {
        return this.f56613w.getPath();
    }

    @Override // z4.g
    public int h1(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
        return this.f56613w.h1(str, i10, contentValues, str2, objArr);
    }

    @Override // z4.g
    public boolean isOpen() {
        return this.f56613w.isOpen();
    }

    @Override // z4.g
    public Cursor j0(final z4.j jVar) {
        final j0 j0Var = new j0();
        jVar.c(j0Var);
        this.f56615y.execute(new Runnable() { // from class: v4.e0
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.I(jVar, j0Var);
            }
        });
        return this.f56613w.j0(jVar);
    }

    @Override // z4.g
    public Cursor m0(final z4.j jVar, CancellationSignal cancellationSignal) {
        final j0 j0Var = new j0();
        jVar.c(j0Var);
        this.f56615y.execute(new Runnable() { // from class: v4.f0
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.K(jVar, j0Var);
            }
        });
        return this.f56613w.j0(jVar);
    }

    @Override // z4.g
    public Cursor p1(final String str) {
        this.f56615y.execute(new Runnable() { // from class: v4.b0
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.F(str);
            }
        });
        return this.f56613w.p1(str);
    }

    @Override // z4.g
    public int r(String str, String str2, Object[] objArr) {
        return this.f56613w.r(str, str2, objArr);
    }

    @Override // z4.g
    public long r1(String str, int i10, ContentValues contentValues) throws SQLException {
        return this.f56613w.r1(str, i10, contentValues);
    }

    @Override // z4.g
    public void s() {
        this.f56615y.execute(new Runnable() { // from class: v4.z
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.q();
            }
        });
        this.f56613w.s();
    }

    @Override // z4.g
    public List<Pair<String, String>> y() {
        return this.f56613w.y();
    }
}
