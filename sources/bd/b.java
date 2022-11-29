package bd;

import ad.m2;
import android.content.Context;
import android.content.res.Resources;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingLiveResult;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingLiveResultClass;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingLiveResultExpInfo;
import java.util.ArrayList;
import java.util.List;
import jo.h;
import jo.p;
import nc.i;
import xn.a0;
import xn.t;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: q  reason: collision with root package name */
    public static final a f17539q = new a(null);

    /* renamed from: r  reason: collision with root package name */
    public static final int f17540r = 8;

    /* renamed from: a  reason: collision with root package name */
    public final List<f> f17541a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17542b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17543c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f17544d;

    /* renamed from: e  reason: collision with root package name */
    public final m2 f17545e;

    /* renamed from: f  reason: collision with root package name */
    public final m2 f17546f;

    /* renamed from: g  reason: collision with root package name */
    public final m2 f17547g;

    /* renamed from: h  reason: collision with root package name */
    public final m2 f17548h;

    /* renamed from: i  reason: collision with root package name */
    public final m2 f17549i;

    /* renamed from: j  reason: collision with root package name */
    public final m2 f17550j;

    /* renamed from: k  reason: collision with root package name */
    public final m2 f17551k;

    /* renamed from: l  reason: collision with root package name */
    public final String f17552l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f17553m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f17554n;

    /* renamed from: o  reason: collision with root package name */
    public final df.c f17555o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f17556p;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final b a(SeasonRatingLiveResult seasonRatingLiveResult, Resources resources, Context context) {
            p.h(seasonRatingLiveResult, "response");
            p.h(resources, "resources");
            p.h(context, "context");
            List<SeasonRatingLiveResultClass> classList = seasonRatingLiveResult.getClassList();
            ArrayList arrayList = new ArrayList(t.u(classList, 10));
            for (SeasonRatingLiveResultClass seasonRatingLiveResultClass : classList) {
                arrayList.add(f.f17605k.a(seasonRatingLiveResultClass, p.c(a0.i0(seasonRatingLiveResult.getClassList()), seasonRatingLiveResultClass), context));
            }
            int end = ((SeasonRatingLiveResultClass) a0.i0(seasonRatingLiveResult.getClassList())).getEnd() - ((SeasonRatingLiveResultClass) a0.X(seasonRatingLiveResult.getClassList())).getStart();
            boolean z10 = seasonRatingLiveResult.getClassList().size() > 1;
            String string = resources.getString(i.text_classup_season_countdown, String.valueOf(seasonRatingLiveResult.getDaysLeft()), String.valueOf(seasonRatingLiveResult.getHoursLeft()));
            m2.a aVar = m2.f1206i;
            String string2 = resources.getString(i.text_classup_time);
            SeasonRatingLiveResultExpInfo broadcast = seasonRatingLiveResult.getBroadcast();
            p.g(string2, "getString(R.string.text_classup_time)");
            m2 d10 = m2.a.d(aVar, broadcast, string2, null, resources, 4, null);
            String string3 = resources.getString(i.text_classup_viewer);
            SeasonRatingLiveResultExpInfo view = seasonRatingLiveResult.getView();
            p.g(string3, "getString(R.string.text_classup_viewer)");
            m2 b10 = m2.a.b(aVar, view, string3, null, resources, 4, null);
            String string4 = resources.getString(i.text_classup_follow);
            SeasonRatingLiveResultExpInfo follow = seasonRatingLiveResult.getFollow();
            p.g(string4, "getString(R.string.text_classup_follow)");
            m2 b11 = m2.a.b(aVar, follow, string4, null, resources, 4, null);
            String string5 = resources.getString(i.text_classup_comment);
            SeasonRatingLiveResultExpInfo comment = seasonRatingLiveResult.getComment();
            p.g(string5, "getString(R.string.text_classup_comment)");
            m2 b12 = m2.a.b(aVar, comment, string5, null, resources, 4, null);
            String string6 = resources.getString(i.text_classup_gift);
            SeasonRatingLiveResultExpInfo gift = seasonRatingLiveResult.getGift();
            String string7 = resources.getString(i.text_classup_gift_annotation);
            p.g(string6, "getString(R.string.text_classup_gift)");
            m2 a10 = aVar.a(gift, string6, string7, resources);
            SeasonRatingLiveResultExpInfo yell = seasonRatingLiveResult.getYell();
            m2 b13 = yell != null ? m2.a.b(aVar, yell, "チアボーナス", null, resources, 4, null) : null;
            String string8 = resources.getString(i.text_classup_other_bonus);
            SeasonRatingLiveResultExpInfo others = seasonRatingLiveResult.getOthers();
            p.g(string8, "getString(R.string.text_classup_other_bonus)");
            m2 b14 = m2.a.b(aVar, others, string8, null, resources, 4, null);
            boolean z11 = ((SeasonRatingLiveResultClass) a0.i0(seasonRatingLiveResult.getClassList())).getEnd() - ((SeasonRatingLiveResultClass) a0.X(seasonRatingLiveResult.getClassList())).getStart() > 0;
            boolean isContractLiveResultEnabled = seasonRatingLiveResult.isContractLiveResultEnabled();
            df.c a11 = df.c.Companion.a(((SeasonRatingLiveResultClass) a0.i0(seasonRatingLiveResult.getClassList())).getClassId());
            boolean z12 = seasonRatingLiveResult.getYell() != null;
            p.g(string, "getString(R.string.text_…nse.hoursLeft.toString())");
            return new b(arrayList, 0, end, z10, d10, b10, b11, b12, a10, b13, b14, string, z11, isContractLiveResultEnabled, a11, z12);
        }
    }

    public b(List<f> list, int i10, int i11, boolean z10, m2 m2Var, m2 m2Var2, m2 m2Var3, m2 m2Var4, m2 m2Var5, m2 m2Var6, m2 m2Var7, String str, boolean z11, boolean z12, df.c cVar, boolean z13) {
        p.h(list, "classList");
        p.h(m2Var, "resultLiveTime");
        p.h(m2Var2, "resultViewerInfo");
        p.h(m2Var3, "resultFollowerInfo");
        p.h(m2Var4, "resultCommentInfo");
        p.h(m2Var5, "resultGiftInfo");
        p.h(m2Var7, "resultOther");
        p.h(str, "seasonResetMessage");
        p.h(cVar, "currentRank");
        this.f17541a = list;
        this.f17542b = i10;
        this.f17543c = i11;
        this.f17544d = z10;
        this.f17545e = m2Var;
        this.f17546f = m2Var2;
        this.f17547g = m2Var3;
        this.f17548h = m2Var4;
        this.f17549i = m2Var5;
        this.f17550j = m2Var6;
        this.f17551k = m2Var7;
        this.f17552l = str;
        this.f17553m = z11;
        this.f17554n = z12;
        this.f17555o = cVar;
        this.f17556p = z13;
    }

    public final List<f> a() {
        return this.f17541a;
    }

    public final df.c b() {
        return this.f17555o;
    }

    public final int c() {
        return this.f17543c;
    }

    public final int d() {
        return this.f17542b;
    }

    public final m2 e() {
        return this.f17550j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return p.c(this.f17541a, bVar.f17541a) && this.f17542b == bVar.f17542b && this.f17543c == bVar.f17543c && this.f17544d == bVar.f17544d && p.c(this.f17545e, bVar.f17545e) && p.c(this.f17546f, bVar.f17546f) && p.c(this.f17547g, bVar.f17547g) && p.c(this.f17548h, bVar.f17548h) && p.c(this.f17549i, bVar.f17549i) && p.c(this.f17550j, bVar.f17550j) && p.c(this.f17551k, bVar.f17551k) && p.c(this.f17552l, bVar.f17552l) && this.f17553m == bVar.f17553m && this.f17554n == bVar.f17554n && this.f17555o == bVar.f17555o && this.f17556p == bVar.f17556p;
        }
        return false;
    }

    public final m2 f() {
        return this.f17548h;
    }

    public final m2 g() {
        return this.f17547g;
    }

    public final m2 h() {
        return this.f17549i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f17541a.hashCode() * 31) + Integer.hashCode(this.f17542b)) * 31) + Integer.hashCode(this.f17543c)) * 31;
        boolean z10 = this.f17544d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((((((((((hashCode + i10) * 31) + this.f17545e.hashCode()) * 31) + this.f17546f.hashCode()) * 31) + this.f17547g.hashCode()) * 31) + this.f17548h.hashCode()) * 31) + this.f17549i.hashCode()) * 31;
        m2 m2Var = this.f17550j;
        int hashCode3 = (((((hashCode2 + (m2Var == null ? 0 : m2Var.hashCode())) * 31) + this.f17551k.hashCode()) * 31) + this.f17552l.hashCode()) * 31;
        boolean z11 = this.f17553m;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode3 + i11) * 31;
        boolean z12 = this.f17554n;
        int i13 = z12;
        if (z12 != 0) {
            i13 = 1;
        }
        int hashCode4 = (((i12 + i13) * 31) + this.f17555o.hashCode()) * 31;
        boolean z13 = this.f17556p;
        return hashCode4 + (z13 ? 1 : z13 ? 1 : 0);
    }

    public final m2 i() {
        return this.f17545e;
    }

    public final m2 j() {
        return this.f17551k;
    }

    public final m2 k() {
        return this.f17546f;
    }

    public final String l() {
        return this.f17552l;
    }

    public final boolean m() {
        return this.f17554n;
    }

    public final boolean n() {
        return this.f17553m;
    }

    public final boolean o() {
        return this.f17544d;
    }

    public final boolean p() {
        return this.f17556p;
    }

    public String toString() {
        return "BroadcastResultExpBindModel(classList=" + this.f17541a + ", getLiveResultTotalStartExp=" + this.f17542b + ", getLiveResultTotalExp=" + this.f17543c + ", isRankUp=" + this.f17544d + ", resultLiveTime=" + this.f17545e + ", resultViewerInfo=" + this.f17546f + ", resultFollowerInfo=" + this.f17547g + ", resultCommentInfo=" + this.f17548h + ", resultGiftInfo=" + this.f17549i + ", resultCheer=" + this.f17550j + ", resultOther=" + this.f17551k + ", seasonResetMessage=" + this.f17552l + ", isCountUpAnimation=" + this.f17553m + ", isContractLiveResultEnabled=" + this.f17554n + ", currentRank=" + this.f17555o + ", isVisibleCheerBonus=" + this.f17556p + ')';
    }
}
