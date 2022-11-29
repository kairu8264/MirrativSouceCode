package ud;

import com.dena.mirrativ.mirrativapi.emomo.event.EmomoQuestItemAttribute;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaItem;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffect;
import java.util.Iterator;
import java.util.List;
import ud.i0;

/* loaded from: classes2.dex */
public final class g0 implements i0 {

    /* renamed from: j  reason: collision with root package name */
    public static final a f54949j = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f54950a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54951b;

    /* renamed from: c  reason: collision with root package name */
    public final int f54952c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f54953d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f54954e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f54955f;

    /* renamed from: g  reason: collision with root package name */
    public final long f54956g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f54957h;

    /* renamed from: i  reason: collision with root package name */
    public final i0.a f54958i;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g0 a(GiftGachaItem giftGachaItem, String str, long j10, boolean z10) {
            List<EmomoQuestItemAttribute> emomoQuestParams;
            jo.p.h(giftGachaItem, "giftGachaItem");
            jo.p.h(str, "gachaImageUrl");
            String imageUrl = giftGachaItem.getImageUrl();
            int rarity = giftGachaItem.getRarity();
            boolean isNew = giftGachaItem.isNew();
            boolean isExchangedFragment = giftGachaItem.isExchangedFragment();
            GiftItemEffect effect = giftGachaItem.getEffect();
            boolean z11 = false;
            if (effect != null && (emomoQuestParams = effect.getEmomoQuestParams()) != null && !emomoQuestParams.isEmpty()) {
                Iterator<T> it = emomoQuestParams.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((EmomoQuestItemAttribute) it.next()).isSpecial()) {
                        z11 = true;
                        break;
                    }
                }
            }
            return new g0(imageUrl, str, rarity, isNew, isExchangedFragment, z11, j10, z10, null, 256, null);
        }
    }

    public g0(String str, String str2, int i10, boolean z10, boolean z11, boolean z12, long j10, boolean z13, i0.a aVar) {
        jo.p.h(str, "itemImageUrl");
        jo.p.h(str2, "gachaImageUrl");
        jo.p.h(aVar, "type");
        this.f54950a = str;
        this.f54951b = str2;
        this.f54952c = i10;
        this.f54953d = z10;
        this.f54954e = z11;
        this.f54955f = z12;
        this.f54956g = j10;
        this.f54957h = z13;
        this.f54958i = aVar;
    }

    public final String a() {
        return this.f54951b;
    }

    public final String b() {
        return this.f54950a;
    }

    public final long c() {
        return this.f54956g;
    }

    public final int d() {
        return this.f54952c;
    }

    public final boolean e() {
        return this.f54957h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            return jo.p.c(this.f54950a, g0Var.f54950a) && jo.p.c(this.f54951b, g0Var.f54951b) && this.f54952c == g0Var.f54952c && this.f54953d == g0Var.f54953d && this.f54954e == g0Var.f54954e && this.f54955f == g0Var.f54955f && this.f54956g == g0Var.f54956g && this.f54957h == g0Var.f54957h && getType() == g0Var.getType();
        }
        return false;
    }

    public final boolean f() {
        return this.f54954e;
    }

    public final boolean g() {
        return this.f54953d;
    }

    @Override // ud.i0
    public i0.a getType() {
        return this.f54958i;
    }

    public final boolean h() {
        return this.f54955f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f54950a.hashCode() * 31) + this.f54951b.hashCode()) * 31) + Integer.hashCode(this.f54952c)) * 31;
        boolean z10 = this.f54953d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f54954e;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f54955f;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int hashCode2 = (((i13 + i14) * 31) + Long.hashCode(this.f54956g)) * 31;
        boolean z13 = this.f54957h;
        return ((hashCode2 + (z13 ? 1 : z13 ? 1 : 0)) * 31) + getType().hashCode();
    }

    public String toString() {
        return "GiftGachaEmomoQuestRareItemBindModel(itemImageUrl=" + this.f54950a + ", gachaImageUrl=" + this.f54951b + ", rarity=" + this.f54952c + ", isNew=" + this.f54953d + ", isExchangedFragment=" + this.f54954e + ", isSpecialEffect=" + this.f54955f + ", openAt=" + this.f54956g + ", isEnabledGachaAnimation=" + this.f54957h + ", type=" + getType() + ')';
    }

    public /* synthetic */ g0(String str, String str2, int i10, boolean z10, boolean z11, boolean z12, long j10, boolean z13, i0.a aVar, int i11, jo.h hVar) {
        this(str, str2, i10, z10, z11, z12, j10, z13, (i11 & 256) != 0 ? i0.a.EMOMO_QUEST_RARE : aVar);
    }
}
