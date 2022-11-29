package ud;

import android.content.Context;
import java.util.Arrays;
import ud.a;

/* loaded from: classes2.dex */
public final class c1 implements ud.a {
    public static final a F = new a(null);
    public final boolean A;
    public final boolean B;
    public final String C;
    public final int D;
    public final a.EnumC0862a E;

    /* renamed from: w  reason: collision with root package name */
    public final String f54818w;

    /* renamed from: x  reason: collision with root package name */
    public final float f54819x;

    /* renamed from: y  reason: collision with root package name */
    public final String f54820y;

    /* renamed from: z  reason: collision with root package name */
    public final String f54821z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c1 a(Context context, jf.u uVar) {
            int i10;
            jo.p.h(context, "context");
            jo.p.h(uVar, "event");
            float n10 = uVar.n() / uVar.k();
            String string = context.getString(sb.c.text_gift_ranking_ticker_text_2);
            jo.p.g(string, "context.getString(R.stri…ft_ranking_ticker_text_2)");
            if (Float.isNaN(n10)) {
                n10 = 0.0f;
            }
            float min = Math.min(n10, 1.0f);
            int i11 = sb.c.text_gift_ranking_remain_point;
            String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(uVar.m())}, 1));
            jo.p.g(format, "format(this, *args)");
            String string2 = context.getString(i11, format);
            jo.p.g(string2, "context.getString(R.stri…t(event.rewardNeedPoint))");
            String l10 = uVar.l();
            boolean z10 = uVar.m() <= 0;
            boolean z11 = uVar.m() > 0;
            String d10 = uVar.d();
            if (uVar.p()) {
                i10 = nd.y0.W;
            } else {
                i10 = nd.y0.f42254j4;
            }
            return new c1(string, min, string2, l10, z10, z11, d10, i10, null, 256, null);
        }
    }

    public c1(String str, float f10, String str2, String str3, boolean z10, boolean z11, String str4, int i10, a.EnumC0862a enumC0862a) {
        jo.p.h(str, "titleText");
        jo.p.h(str2, "nextRewardText");
        jo.p.h(str3, "nextRewardIconUrl");
        jo.p.h(str4, "eventBannerLinkUrl");
        jo.p.h(enumC0862a, "type");
        this.f54818w = str;
        this.f54819x = f10;
        this.f54820y = str2;
        this.f54821z = str3;
        this.A = z10;
        this.B = z11;
        this.C = str4;
        this.D = i10;
        this.E = enumC0862a;
    }

    public final int a() {
        return this.D;
    }

    public final String b() {
        return this.C;
    }

    public final String c() {
        return this.f54821z;
    }

    public final float d() {
        return this.f54819x;
    }

    public final String e() {
        return this.f54820y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c1) {
            c1 c1Var = (c1) obj;
            return jo.p.c(this.f54818w, c1Var.f54818w) && jo.p.c(Float.valueOf(this.f54819x), Float.valueOf(c1Var.f54819x)) && jo.p.c(this.f54820y, c1Var.f54820y) && jo.p.c(this.f54821z, c1Var.f54821z) && this.A == c1Var.A && this.B == c1Var.B && jo.p.c(this.C, c1Var.C) && this.D == c1Var.D && getType() == c1Var.getType();
        }
        return false;
    }

    public final String f() {
        return this.f54818w;
    }

    public final boolean g() {
        return this.B;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.E;
    }

    public final boolean h() {
        return this.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f54818w.hashCode() * 31) + Float.hashCode(this.f54819x)) * 31) + this.f54820y.hashCode()) * 31) + this.f54821z.hashCode()) * 31;
        boolean z10 = this.A;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.B;
        return ((((((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.C.hashCode()) * 31) + Integer.hashCode(this.D)) * 31) + getType().hashCode();
    }

    public String toString() {
        return "GiftRankingCurrentUserRewardBindModel(titleText=" + this.f54818w + ", nextRewardProgress=" + this.f54819x + ", nextRewardText=" + this.f54820y + ", nextRewardIconUrl=" + this.f54821z + ", visibleRewardCompletedView=" + this.A + ", visibleRemainingGiftPointView=" + this.B + ", eventBannerLinkUrl=" + this.C + ", backgroundResourceId=" + this.D + ", type=" + getType() + ')';
    }

    public /* synthetic */ c1(String str, float f10, String str2, String str3, boolean z10, boolean z11, String str4, int i10, a.EnumC0862a enumC0862a, int i11, jo.h hVar) {
        this(str, f10, str2, str3, z10, z11, str4, i10, (i11 & 256) != 0 ? a.EnumC0862a.GIFT_RANKING_CURRENT_USER_REWARD : enumC0862a);
    }
}
