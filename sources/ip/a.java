package ip;

import jo.h;
import jo.p;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public d f36962a;

    /* renamed from: b  reason: collision with root package name */
    public long f36963b;

    /* renamed from: c  reason: collision with root package name */
    public final String f36964c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f36965d;

    public a(String str, boolean z10) {
        p.h(str, "name");
        this.f36964c = str;
        this.f36965d = z10;
        this.f36963b = -1L;
    }

    public final boolean a() {
        return this.f36965d;
    }

    public final String b() {
        return this.f36964c;
    }

    public final long c() {
        return this.f36963b;
    }

    public final d d() {
        return this.f36962a;
    }

    public final void e(d dVar) {
        p.h(dVar, "queue");
        d dVar2 = this.f36962a;
        if (dVar2 == dVar) {
            return;
        }
        if (dVar2 == null) {
            this.f36962a = dVar;
            return;
        }
        throw new IllegalStateException("task is in multiple queues".toString());
    }

    public abstract long f();

    public final void g(long j10) {
        this.f36963b = j10;
    }

    public String toString() {
        return this.f36964c;
    }

    public /* synthetic */ a(String str, boolean z10, int i10, h hVar) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
