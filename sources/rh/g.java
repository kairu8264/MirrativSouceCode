package rh;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class g<T extends IInterface> extends c<T> implements a.f {

    /* renamed from: b0  reason: collision with root package name */
    public final d f51445b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Set<Scope> f51446c0;

    /* renamed from: d0  reason: collision with root package name */
    public final Account f51447d0;

    @Deprecated
    public g(Context context, Looper looper, int i10, d dVar, c.a aVar, c.b bVar) {
        this(context, looper, i10, dVar, (ph.d) aVar, (ph.j) bVar);
    }

    @Override // rh.c
    public final Set<Scope> A() {
        return this.f51446c0;
    }

    @Override // com.google.android.gms.common.api.a.f
    public Set<Scope> h() {
        return f() ? this.f51446c0 : Collections.emptySet();
    }

    public Set<Scope> h0(Set<Scope> set) {
        return set;
    }

    public final Set<Scope> i0(Set<Scope> set) {
        Set<Scope> h02 = h0(set);
        for (Scope scope : h02) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return h02;
    }

    @Override // rh.c
    public final Account s() {
        return this.f51447d0;
    }

    @Override // rh.c
    public final Executor u() {
        return null;
    }

    public g(Context context, Looper looper, int i10, d dVar, ph.d dVar2, ph.j jVar) {
        this(context, looper, h.b(context), nh.d.m(), i10, dVar, (ph.d) p.i(dVar2), (ph.j) p.i(jVar));
    }

    public g(Context context, Looper looper, h hVar, nh.d dVar, int i10, d dVar2, ph.d dVar3, ph.j jVar) {
        super(context, looper, hVar, dVar, i10, dVar3 == null ? null : new f0(dVar3), jVar == null ? null : new g0(jVar), dVar2.h());
        this.f51445b0 = dVar2;
        this.f51447d0 = dVar2.a();
        this.f51446c0 = i0(dVar2.c());
    }
}
