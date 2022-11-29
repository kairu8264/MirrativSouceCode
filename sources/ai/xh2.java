package ai;

import ai.d41;
import ai.u01;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class xh2<U extends d41<A>, A extends u01> implements fo2<U, A> {

    /* renamed from: a  reason: collision with root package name */
    public final si2<U> f11936a;

    /* renamed from: b  reason: collision with root package name */
    public final ui2 f11937b;

    /* renamed from: c  reason: collision with root package name */
    public final as f11938c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11939d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f11940e;

    /* renamed from: f  reason: collision with root package name */
    public final ls f11941f;

    /* renamed from: g  reason: collision with root package name */
    public final un2 f11942g;

    public xh2(si2<U> si2Var, ui2 ui2Var, as asVar, String str, Executor executor, ls lsVar, un2 un2Var) {
        this.f11936a = si2Var;
        this.f11937b = ui2Var;
        this.f11938c = asVar;
        this.f11939d = str;
        this.f11940e = executor;
        this.f11941f = lsVar;
        this.f11942g = un2Var;
    }

    @Override // ai.fo2
    public final Executor zza() {
        return this.f11940e;
    }

    @Override // ai.fo2
    public final un2 zzb() {
        return this.f11942g;
    }
}
