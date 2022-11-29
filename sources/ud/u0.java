package ud;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaItem;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffect;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffectType;
import com.dena.mirrorman.clientlog.logs.MRLog;
import ud.w0;
import ud.x0;

/* loaded from: classes2.dex */
public final class u0 implements w0 {
    public final String A;
    public final Integer B;
    public final String C;
    public final x0 D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final w0.a H;

    /* renamed from: w  reason: collision with root package name */
    public final String f55555w;

    /* renamed from: x  reason: collision with root package name */
    public final float f55556x;

    /* renamed from: y  reason: collision with root package name */
    public final String f55557y;

    /* renamed from: z  reason: collision with root package name */
    public final String f55558z;
    public static final a I = new a(null);
    public static final Parcelable.Creator<u0> CREATOR = new b();
    public static final int J = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u0 a(Context context, GiftGachaItem giftGachaItem) {
            float f10;
            jo.p.h(context, "context");
            jo.p.h(giftGachaItem, "giftGachaItem");
            String modalImageUrl = giftGachaItem.getModalImageUrl().length() > 0 ? giftGachaItem.getModalImageUrl() : giftGachaItem.getImageUrl();
            if (giftGachaItem.getEffect() == null) {
                f10 = 240.0f;
            } else {
                GiftItemEffect effect = giftGachaItem.getEffect();
                f10 = (effect != null ? effect.getType() : null) == GiftItemEffectType.EMOMO_RUN ? 180.0f : 160.0f;
            }
            float f11 = f10;
            String partTypeIconUrl = giftGachaItem.getPartTypeIconUrl();
            String name = giftGachaItem.getName();
            String description = giftGachaItem.getDescription();
            Integer valueOf = Integer.valueOf(giftGachaItem.getRarity());
            String lottery = giftGachaItem.getLottery();
            GiftItemEffect effect2 = giftGachaItem.getEffect();
            x0 b10 = effect2 != null ? x0.a.b(x0.I, context, effect2, null, 4, null) : null;
            String partTypeIconUrl2 = giftGachaItem.getPartTypeIconUrl();
            return new u0(modalImageUrl, f11, partTypeIconUrl, name, description, valueOf, lottery, b10, !(partTypeIconUrl2 == null || partTypeIconUrl2.length() == 0), giftGachaItem.getDescription().length() > 0, giftGachaItem.getEffect() != null, null, 2048, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<u0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final u0 createFromParcel(Parcel parcel) {
            jo.p.h(parcel, "parcel");
            return new u0(parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? x0.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, w0.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final u0[] newArray(int i10) {
            return new u0[i10];
        }
    }

    public u0(String str, float f10, String str2, String str3, String str4, Integer num, String str5, x0 x0Var, boolean z10, boolean z11, boolean z12, w0.a aVar) {
        jo.p.h(str, "imageUrl");
        jo.p.h(str3, "partTitle");
        jo.p.h(str4, MRLog.PAYLOAD_KEY_DESCRIPTION);
        jo.p.h(aVar, "type");
        this.f55555w = str;
        this.f55556x = f10;
        this.f55557y = str2;
        this.f55558z = str3;
        this.A = str4;
        this.B = num;
        this.C = str5;
        this.D = x0Var;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        this.H = aVar;
    }

    public final String a() {
        return this.f55557y;
    }

    public final String b() {
        return this.A;
    }

    public final x0 c() {
        return this.D;
    }

    public final float d() {
        return this.f55556x;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f55555w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            return jo.p.c(this.f55555w, u0Var.f55555w) && jo.p.c(Float.valueOf(this.f55556x), Float.valueOf(u0Var.f55556x)) && jo.p.c(this.f55557y, u0Var.f55557y) && jo.p.c(this.f55558z, u0Var.f55558z) && jo.p.c(this.A, u0Var.A) && jo.p.c(this.B, u0Var.B) && jo.p.c(this.C, u0Var.C) && jo.p.c(this.D, u0Var.D) && this.E == u0Var.E && this.F == u0Var.F && this.G == u0Var.G && getType() == u0Var.getType();
        }
        return false;
    }

    public final String f() {
        return this.C;
    }

    public final String g() {
        return this.f55558z;
    }

    @Override // ud.w0
    public w0.a getType() {
        return this.H;
    }

    public final Integer h() {
        return this.B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f55555w.hashCode() * 31) + Float.hashCode(this.f55556x)) * 31;
        String str = this.f55557y;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f55558z.hashCode()) * 31) + this.A.hashCode()) * 31;
        Integer num = this.B;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.C;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        x0 x0Var = this.D;
        int hashCode5 = (hashCode4 + (x0Var != null ? x0Var.hashCode() : 0)) * 31;
        boolean z10 = this.E;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode5 + i10) * 31;
        boolean z11 = this.F;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.G;
        return ((i13 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + getType().hashCode();
    }

    public final boolean i() {
        return this.E;
    }

    public final boolean j() {
        return this.F;
    }

    public final boolean k() {
        return this.G;
    }

    public String toString() {
        return "GiftItemDetailBindModel(imageUrl=" + this.f55555w + ", imageSize=" + this.f55556x + ", categoryImageUrl=" + this.f55557y + ", partTitle=" + this.f55558z + ", description=" + this.A + ", rarity=" + this.B + ", lottery=" + this.C + ", giftItemEventAttributesBindModel=" + this.D + ", isVisibleCategoryImageView=" + this.E + ", isVisibleDescriptionTextView=" + this.F + ", isVisibleGiftItemEventAttributesView=" + this.G + ", type=" + getType() + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        jo.p.h(parcel, "out");
        parcel.writeString(this.f55555w);
        parcel.writeFloat(this.f55556x);
        parcel.writeString(this.f55557y);
        parcel.writeString(this.f55558z);
        parcel.writeString(this.A);
        Integer num = this.B;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.C);
        x0 x0Var = this.D;
        if (x0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            x0Var.writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeString(this.H.name());
    }

    public /* synthetic */ u0(String str, float f10, String str2, String str3, String str4, Integer num, String str5, x0 x0Var, boolean z10, boolean z11, boolean z12, w0.a aVar, int i10, jo.h hVar) {
        this(str, f10, str2, str3, str4, num, str5, x0Var, (i10 & 256) != 0 ? false : z10, (i10 & 512) != 0 ? false : z11, (i10 & 1024) != 0 ? false : z12, (i10 & 2048) != 0 ? w0.a.DEFAULT : aVar);
    }
}
