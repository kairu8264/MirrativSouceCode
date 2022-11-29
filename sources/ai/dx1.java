package ai;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes3.dex */
public final class dx1 {

    /* renamed from: a  reason: collision with root package name */
    public final zw1 f3434a;

    /* renamed from: b  reason: collision with root package name */
    public final t43 f3435b;

    public dx1(zw1 zw1Var, t43 t43Var) {
        this.f3434a = zw1Var;
        this.f3435b = t43Var;
    }

    public final void a(fp2<SQLiteDatabase, Void> fp2Var) {
        j43.p(this.f3435b.h(bx1.a(this.f3434a)), new cx1(this, fp2Var), this.f3435b);
    }
}
