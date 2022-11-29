package v9;

import c1.c0;
import com.dena.mirrativ.mirrativapi.emomo.event.EmomoQuestItemAttribute;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaItem;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffect;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import java.util.List;
import jo.p;
import y1.d0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: k  reason: collision with root package name */
    public static final a f56984k = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f56985a;

    /* renamed from: b  reason: collision with root package name */
    public final String f56986b;

    /* renamed from: c  reason: collision with root package name */
    public final String f56987c;

    /* renamed from: d  reason: collision with root package name */
    public final int f56988d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f56989e;

    /* renamed from: f  reason: collision with root package name */
    public final int f56990f;

    /* renamed from: g  reason: collision with root package name */
    public final long f56991g;

    /* renamed from: h  reason: collision with root package name */
    public final d0 f56992h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f56993i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f56994j;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f a(GiftGachaItem giftGachaItem, String str) {
            List<EmomoQuestItemAttribute> emomoQuestParams;
            p.h(giftGachaItem, "giftGachaItem");
            p.h(str, "gachaImageUrl");
            String id2 = giftGachaItem.getId();
            String imageUrl = giftGachaItem.getImageUrl();
            int rarity = giftGachaItem.getRarity();
            boolean isNew = giftGachaItem.isNew();
            boolean isExchangedFragment = giftGachaItem.isExchangedFragment();
            GiftItemEffect effect = giftGachaItem.getEffect();
            boolean z10 = false;
            if (effect != null && (emomoQuestParams = effect.getEmomoQuestParams()) != null && !emomoQuestParams.isEmpty()) {
                Iterator<T> it = emomoQuestParams.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((EmomoQuestItemAttribute) it.next()).isSpecial()) {
                        z10 = true;
                        break;
                    }
                }
            }
            return b(id2, imageUrl, str, rarity, isNew, isExchangedFragment, z10);
        }

        public final f b(String str, String str2, String str3, int i10, boolean z10, boolean z11, boolean z12) {
            int i11;
            long q10;
            d0 q11;
            p.h(str, TtmlNode.ATTR_ID);
            p.h(str2, "itemImageUrl");
            p.h(str3, "gachaImageUrl");
            boolean z13 = i10 > 3;
            if (z10) {
                i11 = q9.i.W;
            } else if (z11) {
                i11 = q9.i.f48842s;
            } else {
                i11 = q9.i.f48843t;
            }
            int i12 = i11;
            if (z10) {
                q10 = o9.b.f44283a.a().p();
            } else if (z11) {
                q10 = o9.b.f44283a.a().o();
            } else {
                q10 = o9.b.f44283a.a().q();
            }
            if (z10) {
                q11 = o9.b.f44283a.b().r();
            } else {
                q11 = o9.b.f44283a.b().q();
            }
            return new f(str, str2, str3, i10, z13, i12, q10, q11, z13, z12, null);
        }
    }

    public f(String str, String str2, String str3, int i10, boolean z10, int i11, long j10, d0 d0Var, boolean z11, boolean z12) {
        this.f56985a = str;
        this.f56986b = str2;
        this.f56987c = str3;
        this.f56988d = i10;
        this.f56989e = z10;
        this.f56990f = i11;
        this.f56991g = j10;
        this.f56992h = d0Var;
        this.f56993i = z11;
        this.f56994j = z12;
    }

    public /* synthetic */ f(String str, String str2, String str3, int i10, boolean z10, int i11, long j10, d0 d0Var, boolean z11, boolean z12, jo.h hVar) {
        this(str, str2, str3, i10, z10, i11, j10, d0Var, z11, z12);
    }

    public final String a() {
        return this.f56987c;
    }

    public final String b() {
        return this.f56986b;
    }

    public final long c() {
        return this.f56991g;
    }

    public final int d() {
        return this.f56990f;
    }

    public final d0 e() {
        return this.f56992h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return p.c(this.f56985a, fVar.f56985a) && p.c(this.f56986b, fVar.f56986b) && p.c(this.f56987c, fVar.f56987c) && this.f56988d == fVar.f56988d && this.f56989e == fVar.f56989e && this.f56990f == fVar.f56990f && c0.m(this.f56991g, fVar.f56991g) && p.c(this.f56992h, fVar.f56992h) && this.f56993i == fVar.f56993i && this.f56994j == fVar.f56994j;
        }
        return false;
    }

    public final int f() {
        return this.f56988d;
    }

    public final boolean g() {
        return this.f56989e;
    }

    public final boolean h() {
        return this.f56994j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f56985a.hashCode() * 31) + this.f56986b.hashCode()) * 31) + this.f56987c.hashCode()) * 31) + Integer.hashCode(this.f56988d)) * 31;
        boolean z10 = this.f56989e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((((((hashCode + i10) * 31) + Integer.hashCode(this.f56990f)) * 31) + c0.s(this.f56991g)) * 31) + this.f56992h.hashCode()) * 31;
        boolean z11 = this.f56993i;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode2 + i11) * 31;
        boolean z12 = this.f56994j;
        return i12 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public final boolean i() {
        return this.f56993i;
    }

    public String toString() {
        return "EmomoQuestEquipmentGachaItemBindModel(id=" + this.f56985a + ", itemImageUrl=" + this.f56986b + ", gachaImageUrl=" + this.f56987c + ", rarity=" + this.f56988d + ", isRare=" + this.f56989e + ", itemInfoTextResId=" + this.f56990f + ", itemInfoTextColor=" + ((Object) c0.t(this.f56991g)) + ", itemInfoTextStyle=" + this.f56992h + ", isVisibleRareBorderImage=" + this.f56993i + ", isVisibleEventBonusIcon=" + this.f56994j + ')';
    }
}
