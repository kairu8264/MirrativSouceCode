package ai;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class nd2 implements xc2<od2> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7266a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f7267b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f7268c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7269d;

    /* renamed from: e  reason: collision with root package name */
    public final wi0 f7270e;

    public nd2(wi0 wi0Var, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, byte[] bArr) {
        this.f7270e = wi0Var;
        this.f7266a = context;
        this.f7267b = scheduledExecutorService;
        this.f7268c = executor;
        this.f7269d = i10;
    }

    public final /* synthetic */ od2 a(Throwable th2) {
        dt.a();
        ContentResolver contentResolver = this.f7266a.getContentResolver();
        return new od2(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"));
    }

    @Override // ai.xc2
    public final s43<od2> zza() {
        if (((Boolean) ft.c().c(ox.F0)).booleanValue()) {
            return j43.f((z33) j43.h(j43.j(z33.E(this.f7270e.a(this.f7266a, this.f7269d)), ld2.f6531a, this.f7268c), ((Long) ft.c().c(ox.G0)).longValue(), TimeUnit.MILLISECONDS, this.f7267b), Throwable.class, new bx2(this) { // from class: ai.md2

                /* renamed from: a  reason: collision with root package name */
                public final nd2 f6889a;

                {
                    this.f6889a = this;
                }

                @Override // ai.bx2
                public final Object apply(Object obj) {
                    return this.f6889a.a((Throwable) obj);
                }
            }, this.f7268c);
        }
        return j43.c(new Exception("Did not ad Ad ID into query param."));
    }
}
