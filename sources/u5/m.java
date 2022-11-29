package u5;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import k5.o;
import k5.s;
import t5.p;

/* loaded from: classes.dex */
public class m implements o {

    /* renamed from: c  reason: collision with root package name */
    public static final String f54433c = k5.j.f("WorkProgressUpdater");

    /* renamed from: a  reason: collision with root package name */
    public final WorkDatabase f54434a;

    /* renamed from: b  reason: collision with root package name */
    public final w5.a f54435b;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ UUID f54436w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ androidx.work.b f54437x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ v5.c f54438y;

        public a(UUID uuid, androidx.work.b bVar, v5.c cVar) {
            this.f54436w = uuid;
            this.f54437x = bVar;
            this.f54438y = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p g10;
            String uuid = this.f54436w.toString();
            k5.j c10 = k5.j.c();
            String str = m.f54433c;
            c10.a(str, String.format("Updating progress for %s (%s)", this.f54436w, this.f54437x), new Throwable[0]);
            m.this.f54434a.e();
            try {
                g10 = m.this.f54434a.L().g(uuid);
            } finally {
                try {
                    return;
                } finally {
                }
            }
            if (g10 != null) {
                if (g10.f53193b == s.a.RUNNING) {
                    m.this.f54434a.K().c(new t5.m(uuid, this.f54437x));
                } else {
                    k5.j.c().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid), new Throwable[0]);
                }
                this.f54438y.q(null);
                m.this.f54434a.A();
                return;
            }
            throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
    }

    public m(WorkDatabase workDatabase, w5.a aVar) {
        this.f54434a = workDatabase;
        this.f54435b = aVar;
    }

    @Override // k5.o
    public nk.c<Void> a(Context context, UUID uuid, androidx.work.b bVar) {
        v5.c u10 = v5.c.u();
        this.f54435b.b(new a(uuid, bVar, u10));
        return u10;
    }
}
