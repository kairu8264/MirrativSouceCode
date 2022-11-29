package t5;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import v4.q0;
import v4.t0;
import v4.w0;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f53171a;

    /* renamed from: b  reason: collision with root package name */
    public final v4.s<g> f53172b;

    /* renamed from: c  reason: collision with root package name */
    public final w0 f53173c;

    /* loaded from: classes.dex */
    public class a extends v4.s<g> {
        public a(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // v4.s
        /* renamed from: i */
        public void g(z4.k kVar, g gVar) {
            String str = gVar.f53169a;
            if (str == null) {
                kVar.y1(1);
            } else {
                kVar.S0(1, str);
            }
            kVar.g1(2, gVar.f53170b);
        }
    }

    /* loaded from: classes.dex */
    public class b extends w0 {
        public b(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(q0 q0Var) {
        this.f53171a = q0Var;
        this.f53172b = new a(q0Var);
        this.f53173c = new b(q0Var);
    }

    @Override // t5.h
    public g a(String str) {
        t0 d10 = t0.d("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            d10.y1(1);
        } else {
            d10.S0(1, str);
        }
        this.f53171a.d();
        Cursor b10 = x4.c.b(this.f53171a, d10, false, null);
        try {
            return b10.moveToFirst() ? new g(b10.getString(x4.b.e(b10, "work_spec_id")), b10.getInt(x4.b.e(b10, "system_id"))) : null;
        } finally {
            b10.close();
            d10.i();
        }
    }

    @Override // t5.h
    public List<String> b() {
        t0 d10 = t0.d("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f53171a.d();
        Cursor b10 = x4.c.b(this.f53171a, d10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            d10.i();
        }
    }

    @Override // t5.h
    public void c(g gVar) {
        this.f53171a.d();
        this.f53171a.e();
        try {
            this.f53172b.h(gVar);
            this.f53171a.A();
        } finally {
            this.f53171a.i();
        }
    }

    @Override // t5.h
    public void d(String str) {
        this.f53171a.d();
        z4.k a10 = this.f53173c.a();
        if (str == null) {
            a10.y1(1);
        } else {
            a10.S0(1, str);
        }
        this.f53171a.e();
        try {
            a10.D();
            this.f53171a.A();
        } finally {
            this.f53171a.i();
            this.f53173c.f(a10);
        }
    }
}
