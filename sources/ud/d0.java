package ud;

import android.graphics.drawable.Drawable;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunReward;
import com.dena.mirrorman.net.api.response.event.ShooterReward;
import ud.a;

/* loaded from: classes2.dex */
public final class d0 implements a {
    public final androidx.lifecycle.e0<Integer> A;
    public final androidx.lifecycle.e0<String> B;
    public final androidx.lifecycle.e0<String> C;
    public final androidx.lifecycle.e0<Boolean> D;
    public final androidx.lifecycle.e0<Integer> E;
    public final androidx.lifecycle.e0<Integer> F;
    public final androidx.lifecycle.e0<Drawable> G;
    public final androidx.lifecycle.e0<Boolean> H;
    public final androidx.lifecycle.e0<Boolean> I;

    /* renamed from: w  reason: collision with root package name */
    public final a.EnumC0862a f54854w;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54855x;

    /* renamed from: y  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54856y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54857z;

    public d0() {
        this(null, 1, null);
    }

    public d0(a.EnumC0862a enumC0862a) {
        jo.p.h(enumC0862a, "type");
        this.f54854w = enumC0862a;
        this.f54855x = new androidx.lifecycle.e0<>("");
        this.f54856y = new androidx.lifecycle.e0<>("");
        this.f54857z = new androidx.lifecycle.e0<>("");
        this.A = new androidx.lifecycle.e0<>(0);
        this.B = new androidx.lifecycle.e0<>("");
        this.C = new androidx.lifecycle.e0<>("");
        Boolean bool = Boolean.FALSE;
        this.D = new androidx.lifecycle.e0<>(bool);
        this.E = new androidx.lifecycle.e0<>(0);
        this.F = new androidx.lifecycle.e0<>(0);
        this.G = new androidx.lifecycle.e0<>(null);
        this.H = new androidx.lifecycle.e0<>(bool);
        this.I = new androidx.lifecycle.e0<>(bool);
    }

    public final void a(EmomoRunReward emomoRunReward, String str, int i10, int i11, Drawable drawable) {
        jo.p.h(emomoRunReward, "reward");
        jo.p.h(str, "achievedImageUrl");
        jo.p.h(drawable, "rewardBackground");
        this.f54855x.p(emomoRunReward.getIconUrl());
        this.f54856y.p(emomoRunReward.getBadgeUrl());
        this.I.p(Boolean.valueOf(emomoRunReward.getBadgeUrl().length() > 0));
        androidx.lifecycle.e0<String> e0Var = this.f54857z;
        if (!emomoRunReward.getAchieved()) {
            str = "";
        }
        e0Var.p(str);
        this.A.p(Integer.valueOf(emomoRunReward.getRarity()));
        this.H.p(Boolean.valueOf(emomoRunReward.getRarity() > 0));
        this.B.p(emomoRunReward.getCondition());
        this.C.p(emomoRunReward.getDescription());
        this.D.p(Boolean.valueOf(emomoRunReward.getDisabled()));
        this.E.p(Integer.valueOf(i10));
        this.F.p(Integer.valueOf(i11));
        this.G.p(drawable);
    }

    public final void b(ShooterReward shooterReward, String str, int i10, int i11, Drawable drawable) {
        jo.p.h(shooterReward, "reward");
        jo.p.h(str, "achievedImageUrl");
        jo.p.h(drawable, "rewardBackground");
        this.f54855x.p(shooterReward.getIconUrl());
        this.f54856y.p(shooterReward.getBadgeUrl());
        this.I.p(Boolean.valueOf(shooterReward.getBadgeUrl().length() > 0));
        androidx.lifecycle.e0<String> e0Var = this.f54857z;
        if (!shooterReward.getAchieved()) {
            str = "";
        }
        e0Var.p(str);
        this.A.p(Integer.valueOf(shooterReward.getRarity()));
        this.H.p(Boolean.valueOf(shooterReward.getRarity() > 0));
        this.B.p(shooterReward.getCondition());
        this.C.p(shooterReward.getDescription());
        this.D.p(Boolean.valueOf(shooterReward.getDisabled()));
        this.E.p(Integer.valueOf(i10));
        this.F.p(Integer.valueOf(i11));
        this.G.p(drawable);
    }

    public final androidx.lifecycle.e0<String> c() {
        return this.f54857z;
    }

    public final androidx.lifecycle.e0<String> d() {
        return this.f54856y;
    }

    public final androidx.lifecycle.e0<Integer> e() {
        return this.F;
    }

    public final androidx.lifecycle.e0<Integer> f() {
        return this.E;
    }

    public final androidx.lifecycle.e0<String> g() {
        return this.B;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f54854w;
    }

    public final androidx.lifecycle.e0<Boolean> h() {
        return this.D;
    }

    public final androidx.lifecycle.e0<Drawable> i() {
        return this.G;
    }

    public final androidx.lifecycle.e0<String> j() {
        return this.f54855x;
    }

    public final androidx.lifecycle.e0<Integer> k() {
        return this.A;
    }

    public final androidx.lifecycle.e0<Boolean> l() {
        return this.I;
    }

    public final androidx.lifecycle.e0<Boolean> m() {
        return this.H;
    }

    public /* synthetic */ d0(a.EnumC0862a enumC0862a, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? a.EnumC0862a.EMOMO_RUN_RANKING_REWARD : enumC0862a);
    }
}
