package t5;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import v4.q0;
import v4.t0;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f53178a;

    /* renamed from: b  reason: collision with root package name */
    public final v4.s<j> f53179b;

    /* loaded from: classes.dex */
    public class a extends v4.s<j> {
        public a(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // v4.s
        /* renamed from: i */
        public void g(z4.k kVar, j jVar) {
            String str = jVar.f53176a;
            if (str == null) {
                kVar.y1(1);
            } else {
                kVar.S0(1, str);
            }
            String str2 = jVar.f53177b;
            if (str2 == null) {
                kVar.y1(2);
            } else {
                kVar.S0(2, str2);
            }
        }
    }

    public l(q0 q0Var) {
        this.f53178a = q0Var;
        this.f53179b = new a(q0Var);
    }

    @Override // t5.k
    public List<String> a(String str) {
        t0 d10 = t0.d("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            d10.y1(1);
        } else {
            d10.S0(1, str);
        }
        this.f53178a.d();
        Cursor b10 = x4.c.b(this.f53178a, d10, false, null);
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

    @Override // t5.k
    public void b(j jVar) {
        this.f53178a.d();
        this.f53178a.e();
        try {
            this.f53179b.h(jVar);
            this.f53178a.A();
        } finally {
            this.f53178a.i();
        }
    }
}
