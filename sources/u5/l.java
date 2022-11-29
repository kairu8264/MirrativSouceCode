package u5;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import k5.s;
import t5.q;

/* loaded from: classes.dex */
public class l implements k5.f {

    /* renamed from: d  reason: collision with root package name */
    public static final String f54425d = k5.j.f("WMFgUpdater");

    /* renamed from: a  reason: collision with root package name */
    public final w5.a f54426a;

    /* renamed from: b  reason: collision with root package name */
    public final s5.a f54427b;

    /* renamed from: c  reason: collision with root package name */
    public final q f54428c;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ v5.c f54429w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ UUID f54430x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ k5.e f54431y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Context f54432z;

        public a(v5.c cVar, UUID uuid, k5.e eVar, Context context) {
            this.f54429w = cVar;
            this.f54430x = uuid;
            this.f54431y = eVar;
            this.f54432z = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f54429w.isCancelled()) {
                    String uuid = this.f54430x.toString();
                    s.a f10 = l.this.f54428c.f(uuid);
                    if (f10 != null && !f10.a()) {
                        l.this.f54427b.b(uuid, this.f54431y);
                        this.f54432z.startService(androidx.work.impl.foreground.a.a(this.f54432z, uuid, this.f54431y));
                    } else {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                }
                this.f54429w.q(null);
            } catch (Throwable th2) {
                this.f54429w.r(th2);
            }
        }
    }

    public l(WorkDatabase workDatabase, s5.a aVar, w5.a aVar2) {
        this.f54427b = aVar;
        this.f54426a = aVar2;
        this.f54428c = workDatabase.L();
    }

    @Override // k5.f
    public nk.c<Void> a(Context context, UUID uuid, k5.e eVar) {
        v5.c u10 = v5.c.u();
        this.f54426a.b(new a(u10, uuid, eVar, context));
        return u10;
    }
}
