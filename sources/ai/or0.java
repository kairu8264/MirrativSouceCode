package ai;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public abstract class or0 implements hv0 {

    /* renamed from: a  reason: collision with root package name */
    public static or0 f7886a;

    public static or0 d(Context context, z80 z80Var, int i10) {
        or0 e10 = e(context, i10);
        e10.l().a(z80Var);
        return e10;
    }

    @Deprecated
    public static or0 e(Context context, int i10) {
        synchronized (or0.class) {
            or0 or0Var = f7886a;
            return or0Var != null ? or0Var : f(new zj0(213806000, i10, true, false), context, new os0());
        }
    }

    @Deprecated
    public static synchronized or0 f(zj0 zj0Var, Context context, cu0 cu0Var) {
        or0 or0Var;
        synchronized (or0.class) {
            if (f7886a == null) {
                ft0 ft0Var = new ft0(null);
                pr0 pr0Var = new pr0();
                pr0Var.d(zj0Var);
                pr0Var.e(context);
                ft0Var.a(new rr0(pr0Var, null));
                ft0Var.b(new du0(cu0Var));
                f7886a = ft0Var.c();
                ox.a(context);
                wg.t.h().i(context, zj0Var);
                wg.t.j().d(context);
                wg.t.d().N(context);
                wg.t.d().O(context);
                wg.t.d().Y(context);
                yg.o1.a(context);
                wg.t.g().a(context);
                wg.t.y().a(context);
                bi0.d(context);
                if (((Boolean) ft.c().c(ox.f8129x4)).booleanValue()) {
                    if (!((Boolean) ft.c().c(ox.f8061p0)).booleanValue()) {
                        qn qnVar = new qn(new un(context));
                        dx1 dx1Var = new dx1(new zw1(context), f7886a.j());
                        wg.t.d();
                        new wx1(context, zj0Var, qnVar, dx1Var, UUID.randomUUID().toString(), f7886a.g()).a(wg.t.h().p().x());
                    }
                }
            }
            or0Var = f7886a;
        }
        return or0Var;
    }

    public abstract my1 A();

    public abstract qm2<nl1> B();

    public abstract ms1 C();

    @Override // ai.hv0
    public final qd2 a(ie0 ie0Var, int i10) {
        return b(new ye2(ie0Var, i10));
    }

    public abstract qd2 b(ye2 ye2Var);

    public abstract yq1 c();

    public abstract nq2 g();

    public abstract Executor h();

    public abstract ScheduledExecutorService i();

    public abstract t43 j();

    public abstract l71 k();

    public abstract mn1 l();

    public abstract nu0 m();

    public abstract qz0 n();

    public abstract ph2 o();

    public abstract ux0 p();

    public abstract fy0 q();

    public abstract zf2 r();

    public abstract fe1 s();

    public abstract jj2 t();

    public abstract bf1 u();

    public abstract gm1 v();

    public abstract yk2 w();

    public abstract eh.p x();

    public abstract eh.f0 y();

    public abstract eh.l z();
}
