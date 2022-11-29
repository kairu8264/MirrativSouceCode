package ai;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class x1 extends a2 {

    /* renamed from: i  reason: collision with root package name */
    public final View f11839i;

    public x1(r0 r0Var, String str, String str2, c64 c64Var, int i10, int i11, View view) {
        super(r0Var, "Rh7wPiyt0Q0zAefasWAQ/36LhULiVi3U1eCO9K34euxkll+3xBb3q2iaqyDuAy33", "Kmv9uscZLQkY9DcwgermeDphrIGnHnQJYdRAudw6Thg=", c64Var, i10, 57);
        this.f11839i = view;
    }

    @Override // ai.a2
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f11839i != null) {
            Boolean bool = (Boolean) ft.c().c(ox.X1);
            v0 v0Var = new v0((String) this.f1689f.invoke(null, this.f11839i, this.f1685b.c().getResources().getDisplayMetrics(), bool));
            q64 B = r64.B();
            B.r(v0Var.f10897b.longValue());
            B.s(v0Var.f10898c.longValue());
            B.t(v0Var.f10899d.longValue());
            if (bool.booleanValue()) {
                B.u(v0Var.f10900e.longValue());
            }
            this.f1688e.C(B.n());
        }
    }
}
