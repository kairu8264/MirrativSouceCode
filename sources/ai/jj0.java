package ai;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class jj0 implements ol {

    /* renamed from: b  reason: collision with root package name */
    public final yg.r1 f5808b;

    /* renamed from: d  reason: collision with root package name */
    public final gj0 f5810d;

    /* renamed from: a  reason: collision with root package name */
    public final Object f5807a = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet<yi0> f5811e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashSet<ij0> f5812f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    public boolean f5813g = false;

    /* renamed from: c  reason: collision with root package name */
    public final hj0 f5809c = new hj0();

    public jj0(String str, yg.r1 r1Var) {
        this.f5810d = new gj0(str, r1Var);
        this.f5808b = r1Var;
    }

    public final void a(yi0 yi0Var) {
        synchronized (this.f5807a) {
            this.f5811e.add(yi0Var);
        }
    }

    @Override // ai.ol
    public final void b(boolean z10) {
        long currentTimeMillis = wg.t.k().currentTimeMillis();
        if (z10) {
            if (currentTimeMillis - this.f5808b.w() > ((Long) ft.c().c(ox.E0)).longValue()) {
                this.f5810d.f4477d = -1;
            } else {
                this.f5810d.f4477d = this.f5808b.m();
            }
            this.f5813g = true;
            return;
        }
        this.f5808b.t(currentTimeMillis);
        this.f5808b.m0(this.f5810d.f4477d);
    }

    public final void c(HashSet<yi0> hashSet) {
        synchronized (this.f5807a) {
            this.f5811e.addAll(hashSet);
        }
    }

    public final void d() {
        synchronized (this.f5807a) {
            this.f5810d.a();
        }
    }

    public final void e() {
        synchronized (this.f5807a) {
            this.f5810d.b();
        }
    }

    public final void f(as asVar, long j10) {
        synchronized (this.f5807a) {
            this.f5810d.c(asVar, j10);
        }
    }

    public final void g() {
        synchronized (this.f5807a) {
            this.f5810d.d();
        }
    }

    public final void h() {
        synchronized (this.f5807a) {
            this.f5810d.e();
        }
    }

    public final yi0 i(vh.f fVar, String str) {
        return new yi0(fVar, this, this.f5809c.a(), str);
    }

    public final boolean j() {
        return this.f5813g;
    }

    public final Bundle k(Context context, ym2 ym2Var) {
        HashSet<yi0> hashSet = new HashSet<>();
        synchronized (this.f5807a) {
            hashSet.addAll(this.f5811e);
            this.f5811e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f5810d.f(context, this.f5809c.b()));
        Bundle bundle2 = new Bundle();
        Iterator<ij0> it = this.f5812f.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<yi0> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().j());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            ym2Var.a(hashSet);
            return bundle;
        }
        it.next();
        throw null;
    }
}
