package t5;

import v4.q0;
import v4.w0;

/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f53183a;

    /* renamed from: b  reason: collision with root package name */
    public final v4.s<m> f53184b;

    /* renamed from: c  reason: collision with root package name */
    public final w0 f53185c;

    /* renamed from: d  reason: collision with root package name */
    public final w0 f53186d;

    /* loaded from: classes.dex */
    public class a extends v4.s<m> {
        public a(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // v4.s
        /* renamed from: i */
        public void g(z4.k kVar, m mVar) {
            String str = mVar.f53181a;
            if (str == null) {
                kVar.y1(1);
            } else {
                kVar.S0(1, str);
            }
            byte[] k10 = androidx.work.b.k(mVar.f53182b);
            if (k10 == null) {
                kVar.y1(2);
            } else {
                kVar.l1(2, k10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends w0 {
        public b(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* loaded from: classes.dex */
    public class c extends w0 {
        public c(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(q0 q0Var) {
        this.f53183a = q0Var;
        this.f53184b = new a(q0Var);
        this.f53185c = new b(q0Var);
        this.f53186d = new c(q0Var);
    }

    @Override // t5.n
    public void a() {
        this.f53183a.d();
        z4.k a10 = this.f53186d.a();
        this.f53183a.e();
        try {
            a10.D();
            this.f53183a.A();
        } finally {
            this.f53183a.i();
            this.f53186d.f(a10);
        }
    }

    @Override // t5.n
    public void b(String str) {
        this.f53183a.d();
        z4.k a10 = this.f53185c.a();
        if (str == null) {
            a10.y1(1);
        } else {
            a10.S0(1, str);
        }
        this.f53183a.e();
        try {
            a10.D();
            this.f53183a.A();
        } finally {
            this.f53183a.i();
            this.f53185c.f(a10);
        }
    }

    @Override // t5.n
    public void c(m mVar) {
        this.f53183a.d();
        this.f53183a.e();
        try {
            this.f53184b.h(mVar);
            this.f53183a.A();
        } finally {
            this.f53183a.i();
        }
    }
}
