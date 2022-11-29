package t5;

import android.database.Cursor;
import v4.q0;
import v4.t0;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f53166a;

    /* renamed from: b  reason: collision with root package name */
    public final v4.s<d> f53167b;

    /* loaded from: classes.dex */
    public class a extends v4.s<d> {
        public a(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // v4.s
        /* renamed from: i */
        public void g(z4.k kVar, d dVar) {
            String str = dVar.f53164a;
            if (str == null) {
                kVar.y1(1);
            } else {
                kVar.S0(1, str);
            }
            Long l10 = dVar.f53165b;
            if (l10 == null) {
                kVar.y1(2);
            } else {
                kVar.g1(2, l10.longValue());
            }
        }
    }

    public f(q0 q0Var) {
        this.f53166a = q0Var;
        this.f53167b = new a(q0Var);
    }

    @Override // t5.e
    public void a(d dVar) {
        this.f53166a.d();
        this.f53166a.e();
        try {
            this.f53167b.h(dVar);
            this.f53166a.A();
        } finally {
            this.f53166a.i();
        }
    }

    @Override // t5.e
    public Long b(String str) {
        t0 d10 = t0.d("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            d10.y1(1);
        } else {
            d10.S0(1, str);
        }
        this.f53166a.d();
        Long l10 = null;
        Cursor b10 = x4.c.b(this.f53166a, d10, false, null);
        try {
            if (b10.moveToFirst() && !b10.isNull(0)) {
                l10 = Long.valueOf(b10.getLong(0));
            }
            return l10;
        } finally {
            b10.close();
            d10.i();
        }
    }
}
