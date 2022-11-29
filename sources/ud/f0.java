package ud;

import com.dena.mirrativ.mirrativapi.emomo.event.EmomoQuestItemAttribute;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaItem;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffect;
import java.util.Iterator;
import java.util.List;
import ud.i0;

/* loaded from: classes2.dex */
public final class f0 implements i0 {

    /* renamed from: i  reason: collision with root package name */
    public static final a f54908i = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f54909a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54910b;

    /* renamed from: c  reason: collision with root package name */
    public final int f54911c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f54912d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f54913e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f54914f;

    /* renamed from: g  reason: collision with root package name */
    public final long f54915g;

    /* renamed from: h  reason: collision with root package name */
    public final i0.a f54916h;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f0 a(GiftGachaItem giftGachaItem, String str, long j10) {
            List<EmomoQuestItemAttribute> emomoQuestParams;
            jo.p.h(giftGachaItem, "giftGachaItem");
            jo.p.h(str, "gachaImageUrl");
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
            return new f0(imageUrl, str, rarity, isNew, isExchangedFragment, z10, j10, null, 128, null);
        }
    }

    public f0(String str, String str2, int i10, boolean z10, boolean z11, boolean z12, long j10, i0.a aVar) {
        jo.p.h(str, "itemImageUrl");
        jo.p.h(str2, "gachaImageUrl");
        jo.p.h(aVar, "type");
        this.f54909a = str;
        this.f54910b = str2;
        this.f54911c = i10;
        this.f54912d = z10;
        this.f54913e = z11;
        this.f54914f = z12;
        this.f54915g = j10;
        this.f54916h = aVar;
    }

    public final String a() {
        return this.f54910b;
    }

    public final String b() {
        return this.f54909a;
    }

    public final long c() {
        return this.f54915g;
    }

    public final int d() {
        return this.f54911c;
    }

    public final boolean e() {
        return this.f54913e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            return jo.p.c(this.f54909a, f0Var.f54909a) && jo.p.c(this.f54910b, f0Var.f54910b) && this.f54911c == f0Var.f54911c && this.f54912d == f0Var.f54912d && this.f54913e == f0Var.f54913e && this.f54914f == f0Var.f54914f && this.f54915g == f0Var.f54915g && getType() == f0Var.getType();
        }
        return false;
    }

    public final boolean f() {
        return this.f54912d;
    }

    public final boolean g() {
        return this.f54914f;
    }

    @Override // ud.i0
    public i0.a getType() {
        return this.f54916h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f54909a.hashCode() * 31) + this.f54910b.hashCode()) * 31) + Integer.hashCode(this.f54911c)) * 31;
        boolean z10 = this.f54912d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f54913e;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f54914f;
        return ((((i13 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + Long.hashCode(this.f54915g)) * 31) + getType().hashCode();
    }

    public String toString() {
        return "GiftGachaEmomoQuestNormalItemBindModel(itemImageUrl=" + this.f54909a + ", gachaImageUrl=" + this.f54910b + ", rarity=" + this.f54911c + ", isNew=" + this.f54912d + ", isExchangedFragment=" + this.f54913e + ", isSpecialEffect=" + this.f54914f + ", openAt=" + this.f54915g + ", type=" + getType() + ')';
    }

    public /* synthetic */ f0(String str, String str2, int i10, boolean z10, boolean z11, boolean z12, long j10, i0.a aVar, int i11, jo.h hVar) {
        this(str, str2, i10, z10, z11, z12, j10, (i11 & 128) != 0 ? i0.a.EMOMO_QUEST_NORMAL : aVar);
    }
}
