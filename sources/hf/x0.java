package hf;

import com.dena.mirrorman.net.api.response.user.UserMe;

/* loaded from: classes2.dex */
public final class x0 implements w0 {

    /* renamed from: a  reason: collision with root package name */
    public final s f35625a;

    /* renamed from: b  reason: collision with root package name */
    public final nf.k f35626b;

    /* renamed from: c  reason: collision with root package name */
    public long f35627c;

    /* renamed from: d  reason: collision with root package name */
    public UserMe f35628d;

    public x0(s sVar, nf.k kVar, long j10, UserMe userMe) {
        jo.p.h(sVar, "getCurrentTimeMillis");
        jo.p.h(kVar, "featureStore");
        this.f35625a = sVar;
        this.f35626b = kVar;
        this.f35627c = j10;
        this.f35628d = userMe;
    }

    @Override // hf.w0
    public void a(UserMe userMe) {
        this.f35628d = userMe;
        this.f35627c = this.f35625a.d();
    }

    @Override // hf.w0
    public void clear() {
        this.f35627c = 0L;
        this.f35628d = null;
    }

    @Override // hf.w0
    public UserMe get() {
        if (this.f35628d == null || this.f35625a.d() - this.f35627c > this.f35626b.v() * 1000) {
            return null;
        }
        return this.f35628d;
    }

    public /* synthetic */ x0(s sVar, nf.k kVar, long j10, UserMe userMe, int i10, jo.h hVar) {
        this(sVar, kVar, (i10 & 4) != 0 ? 0L : j10, (i10 & 8) != 0 ? null : userMe);
    }
}
