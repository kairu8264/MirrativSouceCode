package androidx.work.impl;

import a5.c;
import android.content.Context;
import androidx.work.impl.a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import t5.e;
import t5.k;
import t5.n;
import t5.q;
import t5.t;
import v4.n0;
import v4.q0;
import z4.g;
import z4.h;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends q0 {

    /* renamed from: o  reason: collision with root package name */
    public static final long f16561o = TimeUnit.DAYS.toMillis(1);

    /* loaded from: classes.dex */
    public class a implements h.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f16562a;

        public a(Context context) {
            this.f16562a = context;
        }

        @Override // z4.h.c
        public h a(h.b bVar) {
            h.b.a a10 = h.b.a(this.f16562a);
            a10.c(bVar.f62507b).b(bVar.f62508c).d(true);
            return new c().a(a10.a());
        }
    }

    /* loaded from: classes.dex */
    public class b extends q0.b {
        @Override // v4.q0.b
        public void c(g gVar) {
            super.c(gVar);
            gVar.s();
            try {
                gVar.B(WorkDatabase.G());
                gVar.T();
            } finally {
                gVar.e0();
            }
        }
    }

    public static WorkDatabase C(Context context, Executor executor, boolean z10) {
        q0.a a10;
        if (z10) {
            a10 = n0.c(context, WorkDatabase.class).c();
        } else {
            a10 = n0.a(context, WorkDatabase.class, l5.h.d());
            a10.g(new a(context));
        }
        return (WorkDatabase) a10.h(executor).a(E()).b(androidx.work.impl.a.f16571a).b(new a.h(context, 2, 3)).b(androidx.work.impl.a.f16572b).b(androidx.work.impl.a.f16573c).b(new a.h(context, 5, 6)).b(androidx.work.impl.a.f16574d).b(androidx.work.impl.a.f16575e).b(androidx.work.impl.a.f16576f).b(new a.i(context)).b(new a.h(context, 10, 11)).b(androidx.work.impl.a.f16577g).e().d();
    }

    public static q0.b E() {
        return new b();
    }

    public static long F() {
        return System.currentTimeMillis() - f16561o;
    }

    public static String G() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + F() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract t5.b D();

    public abstract e H();

    public abstract t5.h I();

    public abstract k J();

    public abstract n K();

    public abstract q L();

    public abstract t M();
}
