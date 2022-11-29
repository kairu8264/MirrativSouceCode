package t5;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import v4.q0;
import v4.t0;

/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f53239a;

    /* renamed from: b  reason: collision with root package name */
    public final v4.s<s> f53240b;

    /* loaded from: classes.dex */
    public class a extends v4.s<s> {
        public a(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // v4.s
        /* renamed from: i */
        public void g(z4.k kVar, s sVar) {
            String str = sVar.f53237a;
            if (str == null) {
                kVar.y1(1);
            } else {
                kVar.S0(1, str);
            }
            String str2 = sVar.f53238b;
            if (str2 == null) {
                kVar.y1(2);
            } else {
                kVar.S0(2, str2);
            }
        }
    }

    public u(q0 q0Var) {
        this.f53239a = q0Var;
        this.f53240b = new a(q0Var);
    }

    @Override // t5.t
    public void a(s sVar) {
        this.f53239a.d();
        this.f53239a.e();
        try {
            this.f53240b.h(sVar);
            this.f53239a.A();
        } finally {
            this.f53239a.i();
        }
    }

    @Override // t5.t
    public List<String> b(String str) {
        t0 d10 = t0.d("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            d10.y1(1);
        } else {
            d10.S0(1, str);
        }
        this.f53239a.d();
        Cursor b10 = x4.c.b(this.f53239a, d10, false, null);
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
}
