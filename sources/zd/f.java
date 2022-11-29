package zd;

import java.util.Collections;
import java.util.List;
import v4.q0;
import v4.s;
import v4.w0;
import z4.k;

/* loaded from: classes2.dex */
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f63095a;

    /* renamed from: b  reason: collision with root package name */
    public final s<zd.d> f63096b;

    /* renamed from: c  reason: collision with root package name */
    public final w0 f63097c;

    /* renamed from: d  reason: collision with root package name */
    public final w0 f63098d;

    /* renamed from: e  reason: collision with root package name */
    public final w0 f63099e;

    /* loaded from: classes2.dex */
    public class a extends s<zd.d> {
        public a(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "INSERT OR ABORT INTO `LiveInfoHistory` (`title`,`closedLive`,`appId`,`id`,`tags`,`contentHash`,`stickerEnabled`,`shareAll`,`shareUserIDs`) VALUES (?,?,?,?,?,?,?,?,?)";
        }

        @Override // v4.s
        /* renamed from: i */
        public void g(k kVar, zd.d dVar) {
            if (dVar.i() == null) {
                kVar.y1(1);
            } else {
                kVar.S0(1, dVar.i());
            }
            if (dVar.b() == null) {
                kVar.y1(2);
            } else {
                kVar.g1(2, dVar.b().intValue());
            }
            if (dVar.a() == null) {
                kVar.y1(3);
            } else {
                kVar.S0(3, dVar.a());
            }
            if (dVar.d() == null) {
                kVar.y1(4);
            } else {
                kVar.g1(4, dVar.d().intValue());
            }
            if (dVar.h() == null) {
                kVar.y1(5);
            } else {
                kVar.S0(5, dVar.h());
            }
            if (dVar.c() == null) {
                kVar.y1(6);
            } else {
                kVar.g1(6, dVar.c().intValue());
            }
            if (dVar.g() == null) {
                kVar.y1(7);
            } else {
                kVar.g1(7, dVar.g().intValue());
            }
            if (dVar.e() == null) {
                kVar.y1(8);
            } else {
                kVar.g1(8, dVar.e().intValue());
            }
            if (dVar.f() == null) {
                kVar.y1(9);
            } else {
                kVar.S0(9, dVar.f());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b extends w0 {
        public b(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "DELETE FROM LiveInfoHistory WHERE closedLive = 1";
        }
    }

    /* loaded from: classes2.dex */
    public class c extends w0 {
        public c(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "DELETE FROM LiveInfoHistory WHERE id < ?";
        }
    }

    /* loaded from: classes2.dex */
    public class d extends w0 {
        public d(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "DELETE FROM LiveInfoHistory";
        }
    }

    public f(q0 q0Var) {
        this.f63095a = q0Var;
        this.f63096b = new a(q0Var);
        this.f63097c = new b(q0Var);
        this.f63098d = new c(q0Var);
        this.f63099e = new d(q0Var);
    }

    public static List<Class<?>> b() {
        return Collections.emptyList();
    }

    @Override // zd.e
    public void a() {
        this.f63095a.d();
        k a10 = this.f63099e.a();
        this.f63095a.e();
        try {
            a10.D();
            this.f63095a.A();
        } finally {
            this.f63095a.i();
            this.f63099e.f(a10);
        }
    }
}
