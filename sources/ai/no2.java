package ai;

import ai.d41;
import ai.u01;

/* loaded from: classes3.dex */
public final class no2<R extends d41<AdT>, AdT extends u01> {

    /* renamed from: a  reason: collision with root package name */
    public final fo2<R, AdT> f7427a;

    /* renamed from: b  reason: collision with root package name */
    public final s43<do2<R, AdT>> f7428b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7429c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7430d = false;

    public no2(final kn2 kn2Var, final eo2<R, AdT> eo2Var, final fo2<R, AdT> fo2Var) {
        this.f7427a = fo2Var;
        this.f7428b = j43.g(j43.i(eo2Var.a(fo2Var), new p33(this, eo2Var, kn2Var, fo2Var) { // from class: ai.ko2

            /* renamed from: a  reason: collision with root package name */
            public final no2 f6295a;

            /* renamed from: b  reason: collision with root package name */
            public final eo2 f6296b;

            /* renamed from: c  reason: collision with root package name */
            public final kn2 f6297c;

            /* renamed from: d  reason: collision with root package name */
            public final fo2 f6298d;

            {
                this.f6295a = this;
                this.f6296b = eo2Var;
                this.f6297c = kn2Var;
                this.f6298d = fo2Var;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f6295a.d(this.f6296b, this.f6297c, this.f6298d, (tn2) obj);
            }
        }, fo2Var.zza()), Exception.class, new p33(this, eo2Var) { // from class: ai.lo2

            /* renamed from: a  reason: collision with root package name */
            public final no2 f6634a;

            /* renamed from: b  reason: collision with root package name */
            public final eo2 f6635b;

            {
                this.f6634a = this;
                this.f6635b = eo2Var;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f6634a.c(this.f6635b, (Exception) obj);
            }
        }, fo2Var.zza());
    }

    public final synchronized void a(e43<Void> e43Var) {
        j43.p(j43.i(this.f7428b, mo2.f6993a, this.f7427a.zza()), e43Var, this.f7427a.zza());
    }

    public final synchronized s43<do2<R, AdT>> b(fo2<R, AdT> fo2Var) {
        if (!this.f7430d && !this.f7429c) {
            if (this.f7427a.zzb() != null && fo2Var.zzb() != null && this.f7427a.zzb().equals(fo2Var.zzb())) {
                this.f7429c = true;
                return this.f7428b;
            }
            return null;
        }
        return null;
    }

    public final /* synthetic */ s43 c(eo2 eo2Var, Exception exc) throws Exception {
        synchronized (this) {
            this.f7430d = true;
            throw exc;
        }
    }

    public final /* synthetic */ s43 d(eo2 eo2Var, kn2 kn2Var, fo2 fo2Var, tn2 tn2Var) throws Exception {
        synchronized (this) {
            this.f7430d = true;
            eo2Var.b(tn2Var);
            if (!this.f7429c) {
                kn2Var.b(fo2Var.zzb(), tn2Var);
                return j43.a(null);
            }
            return j43.a(new do2(tn2Var, fo2Var));
        }
    }
}
