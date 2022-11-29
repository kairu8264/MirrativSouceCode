package ai;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class td2 implements xc2<ud2> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f10267a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10268b;

    /* renamed from: c  reason: collision with root package name */
    public final PackageInfo f10269c;

    /* renamed from: d  reason: collision with root package name */
    public final wi0 f10270d;

    public td2(wi0 wi0Var, Executor executor, String str, PackageInfo packageInfo, int i10, byte[] bArr) {
        this.f10270d = wi0Var;
        this.f10267a = executor;
        this.f10268b = str;
        this.f10269c = packageInfo;
    }

    public final /* synthetic */ s43 a(Throwable th2) throws Exception {
        return j43.a(new ud2(this.f10268b));
    }

    @Override // ai.xc2
    public final s43<ud2> zza() {
        return j43.g(j43.j(j43.a(this.f10268b), rd2.f9410a, this.f10267a), Throwable.class, new p33(this) { // from class: ai.sd2

            /* renamed from: a  reason: collision with root package name */
            public final td2 f9803a;

            {
                this.f9803a = this;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f9803a.a((Throwable) obj);
            }
        }, this.f10267a);
    }
}
