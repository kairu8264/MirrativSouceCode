package ai;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public class az0 {

    /* renamed from: a  reason: collision with root package name */
    public final s01 f2171a;

    /* renamed from: b  reason: collision with root package name */
    public final View f2172b;

    /* renamed from: c  reason: collision with root package name */
    public final il2 f2173c;

    /* renamed from: d  reason: collision with root package name */
    public final rp0 f2174d;

    public az0(View view, rp0 rp0Var, s01 s01Var, il2 il2Var) {
        this.f2172b = view;
        this.f2174d = rp0Var;
        this.f2171a = s01Var;
        this.f2173c = il2Var;
    }

    public static final gc1<k61> f(final Context context, final zj0 zj0Var, final fl2 fl2Var, final yl2 yl2Var) {
        return new gc1<>(new k61(context, zj0Var, fl2Var, yl2Var) { // from class: ai.yy0

            /* renamed from: w  reason: collision with root package name */
            public final Context f12767w;

            /* renamed from: x  reason: collision with root package name */
            public final zj0 f12768x;

            /* renamed from: y  reason: collision with root package name */
            public final fl2 f12769y;

            /* renamed from: z  reason: collision with root package name */
            public final yl2 f12770z;

            {
                this.f12767w = context;
                this.f12768x = zj0Var;
                this.f12769y = fl2Var;
                this.f12770z = yl2Var;
            }

            @Override // ai.k61
            public final void a() {
                wg.t.n().g(this.f12767w, this.f12768x.f13013w, this.f12769y.C.toString(), this.f12770z.f12652f);
            }
        }, hk0.f4883f);
    }

    public static final Set<gc1<k61>> g(l01 l01Var) {
        return Collections.singleton(new gc1(l01Var, hk0.f4883f));
    }

    public static final gc1<k61> h(j01 j01Var) {
        return new gc1<>(j01Var, hk0.f4882e);
    }

    public final rp0 a() {
        return this.f2174d;
    }

    public final View b() {
        return this.f2172b;
    }

    public final s01 c() {
        return this.f2171a;
    }

    public final il2 d() {
        return this.f2173c;
    }

    public i61 e(Set<gc1<k61>> set) {
        return new i61(set);
    }
}
