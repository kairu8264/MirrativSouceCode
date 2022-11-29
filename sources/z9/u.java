package z9;

import androidx.lifecycle.e0;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingReward;
import ud.a;

/* loaded from: classes.dex */
public final class u implements ud.a {
    public final e0<Boolean> A;
    public final e0<String> B;
    public final e0<String> C;
    public final e0<String> D;
    public final e0<String> E;
    public final e0<Boolean> F;
    public final e0<Integer> G;
    public final e0<Integer> H;

    /* renamed from: w  reason: collision with root package name */
    public final a.EnumC0862a f62901w;

    /* renamed from: x  reason: collision with root package name */
    public final e0<String> f62902x;

    /* renamed from: y  reason: collision with root package name */
    public final e0<String> f62903y;

    /* renamed from: z  reason: collision with root package name */
    public final e0<String> f62904z;

    public u() {
        this(null, 1, null);
    }

    public u(a.EnumC0862a enumC0862a) {
        jo.p.h(enumC0862a, "type");
        this.f62901w = enumC0862a;
        this.f62902x = new e0<>("");
        this.f62903y = new e0<>("");
        this.f62904z = new e0<>("");
        Boolean bool = Boolean.FALSE;
        this.A = new e0<>(bool);
        this.B = new e0<>("");
        this.C = new e0<>("");
        this.D = new e0<>("");
        this.E = new e0<>("");
        this.F = new e0<>(bool);
        this.G = new e0<>(0);
        this.H = new e0<>(0);
    }

    public final void a(GiftRankingReward giftRankingReward, String str, int i10, int i11) {
        jo.p.h(giftRankingReward, "reward");
        jo.p.h(str, "achievedImageUrl");
        this.f62902x.p(giftRankingReward.getIconUrl());
        this.f62903y.p(giftRankingReward.getImageUrl());
        this.f62904z.p(giftRankingReward.getBadgeUrl());
        this.A.p(Boolean.valueOf(giftRankingReward.getBadgeUrl().length() > 0));
        e0<String> e0Var = this.B;
        if (!giftRankingReward.getAchieved()) {
            str = "";
        }
        e0Var.p(str);
        this.C.p(giftRankingReward.getName());
        this.D.p(giftRankingReward.getCondition());
        this.E.p(giftRankingReward.getDescription());
        this.F.p(Boolean.valueOf(giftRankingReward.getDisabled()));
        this.G.p(Integer.valueOf(i10));
        this.H.p(Integer.valueOf(i11));
    }

    public final e0<String> b() {
        return this.B;
    }

    public final e0<String> c() {
        return this.f62904z;
    }

    public final e0<Integer> d() {
        return this.H;
    }

    public final e0<Integer> e() {
        return this.G;
    }

    public final e0<String> f() {
        return this.D;
    }

    public final e0<Boolean> g() {
        return this.F;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f62901w;
    }

    public final e0<String> h() {
        return this.f62902x;
    }

    public final e0<Boolean> i() {
        return this.A;
    }

    public /* synthetic */ u(a.EnumC0862a enumC0862a, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? a.EnumC0862a.GIFT_RANKING_REWARD : enumC0862a);
    }
}
