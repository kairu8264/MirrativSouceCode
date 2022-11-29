package ud;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.emomo.event.EmomoQuestItemAttribute;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaItem;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffect;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffectType;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.util.ArrayList;
import java.util.List;
import ud.w0;
import ud.x0;

/* loaded from: classes2.dex */
public final class v0 implements w0 {
    public final String A;
    public final Integer B;
    public final String C;
    public final String D;
    public final x0 E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final w0.a J;

    /* renamed from: w  reason: collision with root package name */
    public final String f55590w;

    /* renamed from: x  reason: collision with root package name */
    public final float f55591x;

    /* renamed from: y  reason: collision with root package name */
    public final String f55592y;

    /* renamed from: z  reason: collision with root package name */
    public final String f55593z;
    public static final a K = new a(null);
    public static final Parcelable.Creator<v0> CREATOR = new b();
    public static final int L = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final v0 a(Context context, GiftGachaItem giftGachaItem, String str) {
            float f10;
            List<EmomoQuestItemAttribute> emomoQuestParams;
            x0 x0Var;
            boolean z10;
            boolean z11;
            List<EmomoQuestItemAttribute> emomoQuestParams2;
            List<? extends r0> k10;
            List<EmomoQuestItemAttribute> emomoQuestParams3;
            jo.p.h(context, "context");
            jo.p.h(giftGachaItem, "giftGachaItem");
            String modalImageUrl = giftGachaItem.getModalImageUrl();
            if (modalImageUrl.length() == 0) {
                modalImageUrl = giftGachaItem.getImageUrl();
            }
            String str2 = modalImageUrl;
            GiftItemEffect effect = giftGachaItem.getEffect();
            int size = (effect == null || (emomoQuestParams3 = effect.getEmomoQuestParams()) == null) ? 0 : emomoQuestParams3.size();
            if (size >= 0 && size < 4) {
                f10 = 160.0f;
            } else {
                GiftItemEffect effect2 = giftGachaItem.getEffect();
                int size2 = (effect2 == null || (emomoQuestParams = effect2.getEmomoQuestParams()) == null) ? 0 : emomoQuestParams.size();
                f10 = 4 <= size2 && size2 < 6 ? 148.0f : 126.0f;
            }
            float f11 = f10;
            String partTypeIconUrl = giftGachaItem.getPartTypeIconUrl();
            String name = giftGachaItem.getName();
            String description = giftGachaItem.getDescription();
            Integer valueOf = Integer.valueOf(giftGachaItem.getRarity());
            String lottery = giftGachaItem.getLottery();
            GiftItemEffect effect3 = giftGachaItem.getEffect();
            if (effect3 != null) {
                x0.a aVar = x0.I;
                if (effect3.getType() == GiftItemEffectType.EMOMO_QUEST) {
                    List<EmomoQuestItemAttribute> emomoQuestParams4 = effect3.getEmomoQuestParams();
                    k10 = new ArrayList<>();
                    for (EmomoQuestItemAttribute emomoQuestItemAttribute : emomoQuestParams4) {
                        t0 a10 = t0.D.a(emomoQuestItemAttribute);
                        if (a10 != null) {
                            k10.add(a10);
                        }
                    }
                } else {
                    k10 = xn.s.k();
                }
                x0Var = aVar.a(context, effect3, k10);
            } else {
                x0Var = null;
            }
            x0 x0Var2 = x0Var;
            String partTypeIconUrl2 = giftGachaItem.getPartTypeIconUrl();
            boolean z12 = !(partTypeIconUrl2 == null || partTypeIconUrl2.length() == 0);
            boolean z13 = giftGachaItem.getDescription().length() > 0;
            boolean z14 = giftGachaItem.getEffect() != null;
            if (!(str == null || str.length() == 0)) {
                GiftItemEffect effect4 = giftGachaItem.getEffect();
                if (effect4 != null && (emomoQuestParams2 = effect4.getEmomoQuestParams()) != null && !emomoQuestParams2.isEmpty()) {
                    for (EmomoQuestItemAttribute emomoQuestItemAttribute2 : emomoQuestParams2) {
                        if (emomoQuestItemAttribute2.isSpecial()) {
                            z11 = true;
                            break;
                        }
                    }
                }
                z11 = false;
                if (z11) {
                    z10 = true;
                    return new v0(str2, f11, partTypeIconUrl, name, description, valueOf, lottery, str, x0Var2, z12, z13, z14, z10, null, 8192, null);
                }
            }
            z10 = false;
            return new v0(str2, f11, partTypeIconUrl, name, description, valueOf, lottery, str, x0Var2, z12, z13, z14, z10, null, 8192, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<v0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final v0 createFromParcel(Parcel parcel) {
            jo.p.h(parcel, "parcel");
            return new v0(parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? x0.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, w0.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final v0[] newArray(int i10) {
            return new v0[i10];
        }
    }

    public v0(String str, float f10, String str2, String str3, String str4, Integer num, String str5, String str6, x0 x0Var, boolean z10, boolean z11, boolean z12, boolean z13, w0.a aVar) {
        jo.p.h(str, "imageUrl");
        jo.p.h(str3, "partTitle");
        jo.p.h(str4, MRLog.PAYLOAD_KEY_DESCRIPTION);
        jo.p.h(aVar, "type");
        this.f55590w = str;
        this.f55591x = f10;
        this.f55592y = str2;
        this.f55593z = str3;
        this.A = str4;
        this.B = num;
        this.C = str5;
        this.D = str6;
        this.E = x0Var;
        this.F = z10;
        this.G = z11;
        this.H = z12;
        this.I = z13;
        this.J = aVar;
    }

    public final String a() {
        return this.f55592y;
    }

    public final String b() {
        return this.A;
    }

    public final x0 c() {
        return this.E;
    }

    public final float d() {
        return this.f55591x;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f55590w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            return jo.p.c(this.f55590w, v0Var.f55590w) && jo.p.c(Float.valueOf(this.f55591x), Float.valueOf(v0Var.f55591x)) && jo.p.c(this.f55592y, v0Var.f55592y) && jo.p.c(this.f55593z, v0Var.f55593z) && jo.p.c(this.A, v0Var.A) && jo.p.c(this.B, v0Var.B) && jo.p.c(this.C, v0Var.C) && jo.p.c(this.D, v0Var.D) && jo.p.c(this.E, v0Var.E) && this.F == v0Var.F && this.G == v0Var.G && this.H == v0Var.H && this.I == v0Var.I && getType() == v0Var.getType();
        }
        return false;
    }

    public final String f() {
        return this.C;
    }

    public final String g() {
        return this.f55593z;
    }

    @Override // ud.w0
    public w0.a getType() {
        return this.J;
    }

    public final Integer h() {
        return this.B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f55590w.hashCode() * 31) + Float.hashCode(this.f55591x)) * 31;
        String str = this.f55592y;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f55593z.hashCode()) * 31) + this.A.hashCode()) * 31;
        Integer num = this.B;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.C;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.D;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        x0 x0Var = this.E;
        int hashCode6 = (hashCode5 + (x0Var != null ? x0Var.hashCode() : 0)) * 31;
        boolean z10 = this.F;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode6 + i10) * 31;
        boolean z11 = this.G;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.H;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z13 = this.I;
        return ((i15 + (z13 ? 1 : z13 ? 1 : 0)) * 31) + getType().hashCode();
    }

    public final String i() {
        return this.D;
    }

    public final boolean j() {
        return this.F;
    }

    public final boolean k() {
        return this.G;
    }

    public final boolean l() {
        return this.H;
    }

    public final boolean m() {
        return this.I;
    }

    public String toString() {
        return "GiftItemDetailEmomoQuestBindModel(imageUrl=" + this.f55590w + ", imageSize=" + this.f55591x + ", categoryImageUrl=" + this.f55592y + ", partTitle=" + this.f55593z + ", description=" + this.A + ", rarity=" + this.B + ", lottery=" + this.C + ", specialEffectText=" + this.D + ", giftItemEventAttributesBindModel=" + this.E + ", isVisibleCategoryImageView=" + this.F + ", isVisibleDescriptionTextView=" + this.G + ", isVisibleGiftItemEventAttributesView=" + this.H + ", isVisibleSpecialEffect=" + this.I + ", type=" + getType() + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        jo.p.h(parcel, "out");
        parcel.writeString(this.f55590w);
        parcel.writeFloat(this.f55591x);
        parcel.writeString(this.f55592y);
        parcel.writeString(this.f55593z);
        parcel.writeString(this.A);
        Integer num = this.B;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        x0 x0Var = this.E;
        if (x0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            x0Var.writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeInt(this.I ? 1 : 0);
        parcel.writeString(this.J.name());
    }

    public /* synthetic */ v0(String str, float f10, String str2, String str3, String str4, Integer num, String str5, String str6, x0 x0Var, boolean z10, boolean z11, boolean z12, boolean z13, w0.a aVar, int i10, jo.h hVar) {
        this(str, f10, str2, str3, str4, num, str5, str6, x0Var, (i10 & 512) != 0 ? false : z10, (i10 & 1024) != 0 ? false : z11, (i10 & 2048) != 0 ? false : z12, z13, (i10 & 8192) != 0 ? w0.a.EMOMO_QUEST : aVar);
    }
}
