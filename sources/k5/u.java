package k5;

import android.os.Build;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public UUID f38428a;

    /* renamed from: b  reason: collision with root package name */
    public t5.p f38429b;

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f38430c;

    /* loaded from: classes.dex */
    public static abstract class a<B extends a<?, ?>, W extends u> {

        /* renamed from: c  reason: collision with root package name */
        public t5.p f38433c;

        /* renamed from: e  reason: collision with root package name */
        public Class<? extends ListenableWorker> f38435e;

        /* renamed from: a  reason: collision with root package name */
        public boolean f38431a = false;

        /* renamed from: d  reason: collision with root package name */
        public Set<String> f38434d = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        public UUID f38432b = UUID.randomUUID();

        public a(Class<? extends ListenableWorker> cls) {
            this.f38435e = cls;
            this.f38433c = new t5.p(this.f38432b.toString(), cls.getName());
            a(cls.getName());
        }

        public final B a(String str) {
            this.f38434d.add(str);
            return d();
        }

        public final W b() {
            W c10 = c();
            b bVar = this.f38433c.f53201j;
            int i10 = Build.VERSION.SDK_INT;
            boolean z10 = (i10 >= 24 && bVar.e()) || bVar.f() || bVar.g() || (i10 >= 23 && bVar.h());
            if (this.f38433c.f53208q && z10) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.f38432b = UUID.randomUUID();
            t5.p pVar = new t5.p(this.f38433c);
            this.f38433c = pVar;
            pVar.f53192a = this.f38432b.toString();
            return c10;
        }

        public abstract W c();

        public abstract B d();

        public final B e(b bVar) {
            this.f38433c.f53201j = bVar;
            return d();
        }

        public final B f(androidx.work.b bVar) {
            this.f38433c.f53196e = bVar;
            return d();
        }
    }

    public u(UUID uuid, t5.p pVar, Set<String> set) {
        this.f38428a = uuid;
        this.f38429b = pVar;
        this.f38430c = set;
    }

    public String a() {
        return this.f38428a.toString();
    }

    public Set<String> b() {
        return this.f38430c;
    }

    public t5.p c() {
        return this.f38429b;
    }
}
