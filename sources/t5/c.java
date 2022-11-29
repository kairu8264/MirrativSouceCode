package t5;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import v4.q0;
import v4.t0;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f53161a;

    /* renamed from: b  reason: collision with root package name */
    public final v4.s<t5.a> f53162b;

    /* loaded from: classes.dex */
    public class a extends v4.s<t5.a> {
        public a(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // v4.s
        /* renamed from: i */
        public void g(z4.k kVar, t5.a aVar) {
            String str = aVar.f53159a;
            if (str == null) {
                kVar.y1(1);
            } else {
                kVar.S0(1, str);
            }
            String str2 = aVar.f53160b;
            if (str2 == null) {
                kVar.y1(2);
            } else {
                kVar.S0(2, str2);
            }
        }
    }

    public c(q0 q0Var) {
        this.f53161a = q0Var;
        this.f53162b = new a(q0Var);
    }

    @Override // t5.b
    public List<String> a(String str) {
        t0 d10 = t0.d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            d10.y1(1);
        } else {
            d10.S0(1, str);
        }
        this.f53161a.d();
        Cursor b10 = x4.c.b(this.f53161a, d10, false, null);
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

    @Override // t5.b
    public boolean b(String str) {
        t0 d10 = t0.d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            d10.y1(1);
        } else {
            d10.S0(1, str);
        }
        this.f53161a.d();
        boolean z10 = false;
        Cursor b10 = x4.c.b(this.f53161a, d10, false, null);
        try {
            if (b10.moveToFirst()) {
                z10 = b10.getInt(0) != 0;
            }
            return z10;
        } finally {
            b10.close();
            d10.i();
        }
    }

    @Override // t5.b
    public void c(t5.a aVar) {
        this.f53161a.d();
        this.f53161a.e();
        try {
            this.f53162b.h(aVar);
            this.f53161a.A();
        } finally {
            this.f53161a.i();
        }
    }

    @Override // t5.b
    public boolean d(String str) {
        t0 d10 = t0.d("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            d10.y1(1);
        } else {
            d10.S0(1, str);
        }
        this.f53161a.d();
        boolean z10 = false;
        Cursor b10 = x4.c.b(this.f53161a, d10, false, null);
        try {
            if (b10.moveToFirst()) {
                z10 = b10.getInt(0) != 0;
            }
            return z10;
        } finally {
            b10.close();
            d10.i();
        }
    }
}
