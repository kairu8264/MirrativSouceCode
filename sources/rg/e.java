package rg;

import ai.a00;
import ai.dt;
import ai.es;
import ai.jw;
import ai.n20;
import ai.o20;
import ai.tt;
import ai.uj0;
import ai.uw;
import ai.vr;
import ai.w80;
import ai.wt;
import ai.wv;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import tg.f;
import tg.h;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final es f51340a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f51341b;

    /* renamed from: c  reason: collision with root package name */
    public final tt f51342c;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f51343a;

        /* renamed from: b  reason: collision with root package name */
        public final wt f51344b;

        public a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
            wt h10 = dt.b().h(context, str, new w80());
            this.f51343a = (Context) rh.p.j(context, "context cannot be null");
            this.f51344b = h10;
        }

        @RecentlyNonNull
        public e a() {
            try {
                return new e(this.f51343a, this.f51344b.c(), es.f3758a);
            } catch (RemoteException e10) {
                uj0.d("Failed to build AdLoader.", e10);
                return new e(this.f51343a, new jw().S5(), es.f3758a);
            }
        }

        @RecentlyNonNull
        @Deprecated
        public a b(@RecentlyNonNull String str, @RecentlyNonNull f.b bVar, f.a aVar) {
            n20 n20Var = new n20(bVar, aVar);
            try {
                this.f51344b.N0(str, n20Var.c(), n20Var.d());
            } catch (RemoteException e10) {
                uj0.g("Failed to add custom template ad listener", e10);
            }
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public a c(@RecentlyNonNull h.a aVar) {
            try {
                this.f51344b.P4(new o20(aVar));
            } catch (RemoteException e10) {
                uj0.g("Failed to add google native ad listener", e10);
            }
            return this;
        }

        @RecentlyNonNull
        public a d(@RecentlyNonNull c cVar) {
            try {
                this.f51344b.Q3(new vr(cVar));
            } catch (RemoteException e10) {
                uj0.g("Failed to set AdListener.", e10);
            }
            return this;
        }

        @RecentlyNonNull
        public a e(@RecentlyNonNull dh.d dVar) {
            try {
                this.f51344b.E5(new a00(4, dVar.e(), -1, dVar.d(), dVar.a(), dVar.c() != null ? new uw(dVar.c()) : null, dVar.f(), dVar.b()));
            } catch (RemoteException e10) {
                uj0.g("Failed to specify native ad options", e10);
            }
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public a f(@RecentlyNonNull tg.e eVar) {
            try {
                this.f51344b.E5(new a00(eVar));
            } catch (RemoteException e10) {
                uj0.g("Failed to specify native ad options", e10);
            }
            return this;
        }
    }

    public e(Context context, tt ttVar, es esVar) {
        this.f51341b = context;
        this.f51342c = ttVar;
        this.f51340a = esVar;
    }

    public void a(@RecentlyNonNull f fVar) {
        b(fVar.a());
    }

    public final void b(wv wvVar) {
        try {
            this.f51342c.S1(this.f51340a.a(this.f51341b, wvVar));
        } catch (RemoteException e10) {
            uj0.d("Failed to load ad.", e10);
        }
    }
}
