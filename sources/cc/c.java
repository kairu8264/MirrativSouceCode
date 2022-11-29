package cc;

import android.content.Context;
import ud.a;
import ud.c1;

/* loaded from: classes2.dex */
public final class c implements ud.a {
    public static final a A = new a(null);
    public static final int B = 8;

    /* renamed from: w  reason: collision with root package name */
    public final t0 f19042w;

    /* renamed from: x  reason: collision with root package name */
    public final c1 f19043x;

    /* renamed from: y  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f19044y;

    /* renamed from: z  reason: collision with root package name */
    public final a.EnumC0862a f19045z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c a(Context context, jf.u uVar) {
            jo.p.h(context, "context");
            jo.p.h(uVar, "giftRankingCurrentUserRank");
            return new c(t0.G.a(uVar), c1.F.a(context, uVar), null, null, 12, null);
        }
    }

    public c(t0 t0Var, c1 c1Var, androidx.lifecycle.e0<Boolean> e0Var, a.EnumC0862a enumC0862a) {
        jo.p.h(t0Var, "giftRankingCurrentUserRankBindModel");
        jo.p.h(c1Var, "giftRankingCurrentUserRewardBindModel");
        jo.p.h(e0Var, "needsScrollAnimation");
        jo.p.h(enumC0862a, "type");
        this.f19042w = t0Var;
        this.f19043x = c1Var;
        this.f19044y = e0Var;
        this.f19045z = enumC0862a;
    }

    public final t0 a() {
        return this.f19042w;
    }

    public final c1 b() {
        return this.f19043x;
    }

    public final androidx.lifecycle.e0<Boolean> c() {
        return this.f19044y;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f19045z;
    }

    public /* synthetic */ c(t0 t0Var, c1 c1Var, androidx.lifecycle.e0 e0Var, a.EnumC0862a enumC0862a, int i10, jo.h hVar) {
        this(t0Var, c1Var, (i10 & 4) != 0 ? new androidx.lifecycle.e0(Boolean.FALSE) : e0Var, (i10 & 8) != 0 ? a.EnumC0862a.CURRENT_USER_GIFT_RANKING : enumC0862a);
    }
}
