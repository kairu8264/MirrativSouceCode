package aa;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.emomo.event.EmomoQuestItemAttribute;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffect;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestReward;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.List;
import jo.p;
import ud.t0;
import xn.s;
import xn.t;

/* loaded from: classes.dex */
public final class b implements e {
    public final String A;
    public final String B;
    public final String C;
    public final int D;
    public final String E;
    public final List<t0> F;
    public final String G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;

    /* renamed from: w  reason: collision with root package name */
    public final String f664w;

    /* renamed from: x  reason: collision with root package name */
    public final int f665x;

    /* renamed from: y  reason: collision with root package name */
    public final String f666y;

    /* renamed from: z  reason: collision with root package name */
    public final String f667z;
    public static final a M = new a(null);
    public static final Parcelable.Creator<b> CREATOR = new C0011b();
    public static final int N = 8;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b a(EmomoQuestReward emomoQuestReward, String str) {
            int i10;
            List<EmomoQuestItemAttribute> emomoQuestParams;
            List<EmomoQuestItemAttribute> emomoQuestParams2;
            ArrayList k10;
            List<EmomoQuestItemAttribute> emomoQuestParams3;
            List<EmomoQuestItemAttribute> emomoQuestParams4;
            p.h(emomoQuestReward, "reward");
            p.h(str, "achievedImageUrl");
            String imageUrl = emomoQuestReward.getImageUrl();
            GiftItemEffect effect = emomoQuestReward.getEffect();
            Integer num = null;
            List<EmomoQuestItemAttribute> emomoQuestParams5 = effect != null ? effect.getEmomoQuestParams() : null;
            if (emomoQuestParams5 == null || emomoQuestParams5.isEmpty()) {
                i10 = PsExtractor.VIDEO_STREAM_MASK;
            } else {
                po.i iVar = new po.i(1, 3);
                GiftItemEffect effect2 = emomoQuestReward.getEffect();
                Integer valueOf = (effect2 == null || (emomoQuestParams2 = effect2.getEmomoQuestParams()) == null) ? null : Integer.valueOf(emomoQuestParams2.size());
                if (valueOf != null && iVar.t(valueOf.intValue())) {
                    i10 = 160;
                } else {
                    po.i iVar2 = new po.i(4, 5);
                    GiftItemEffect effect3 = emomoQuestReward.getEffect();
                    if (effect3 != null && (emomoQuestParams = effect3.getEmomoQuestParams()) != null) {
                        num = Integer.valueOf(emomoQuestParams.size());
                    }
                    i10 = num != null && iVar2.t(num.intValue()) ? 148 : 126;
                }
            }
            int i11 = i10;
            String partTypeIconUrl = emomoQuestReward.getPartTypeIconUrl();
            GiftItemEffect effect4 = emomoQuestReward.getEffect();
            String str2 = (effect4 == null || (str2 = effect4.getEffectImageUrl()) == null) ? "" : "";
            String name = emomoQuestReward.getName();
            String description = emomoQuestReward.getDescription();
            int rarity = emomoQuestReward.getRarity();
            String condition = emomoQuestReward.getCondition();
            boolean z10 = emomoQuestReward.getRarity() > 0;
            boolean achieved = emomoQuestReward.getAchieved();
            boolean z11 = emomoQuestReward.getPartTypeIconUrl().length() > 0;
            GiftItemEffect effect5 = emomoQuestReward.getEffect();
            if (effect5 != null && (emomoQuestParams4 = effect5.getEmomoQuestParams()) != null) {
                ArrayList arrayList = new ArrayList(t.u(emomoQuestParams4, 10));
                for (EmomoQuestItemAttribute emomoQuestItemAttribute : emomoQuestParams4) {
                    arrayList.add(t0.D.a(emomoQuestItemAttribute));
                }
                k10 = arrayList;
            } else {
                k10 = s.k();
            }
            GiftItemEffect effect6 = emomoQuestReward.getEffect();
            return new b(imageUrl, i11, str, partTypeIconUrl, str2, name, description, rarity, condition, k10, "", z10, achieved, z11, (effect6 == null || (emomoQuestParams3 = effect6.getEmomoQuestParams()) == null) ? false : !emomoQuestParams3.isEmpty(), false);
        }
    }

    /* renamed from: aa.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0011b implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final b createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt2 = parcel.readInt();
            String readString7 = parcel.readString();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            for (int i10 = 0; i10 != readInt3; i10++) {
                arrayList.add(parcel.readParcelable(b.class.getClassLoader()));
            }
            return new b(readString, readInt, readString2, readString3, readString4, readString5, readString6, readInt2, readString7, arrayList, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(String str, int i10, String str2, String str3, String str4, String str5, String str6, int i11, String str7, List<t0> list, String str8, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        p.h(str, "rewardImageUrl");
        p.h(str2, "achievedImageUrl");
        p.h(str3, "categoryImageUrl");
        p.h(str4, "logoImageUrl");
        p.h(str5, "nameText");
        p.h(str6, "descriptionText");
        p.h(str7, "conditionText");
        p.h(list, "attributes");
        p.h(str8, "specialEffectText");
        this.f664w = str;
        this.f665x = i10;
        this.f666y = str2;
        this.f667z = str3;
        this.A = str4;
        this.B = str5;
        this.C = str6;
        this.D = i11;
        this.E = str7;
        this.F = list;
        this.G = str8;
        this.H = z10;
        this.I = z11;
        this.J = z12;
        this.K = z13;
        this.L = z14;
    }

    public final String a() {
        return this.f666y;
    }

    public final List<t0> b() {
        return this.F;
    }

    public final String c() {
        return this.f667z;
    }

    public final String d() {
        return this.E;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return p.c(this.f664w, bVar.f664w) && this.f665x == bVar.f665x && p.c(this.f666y, bVar.f666y) && p.c(this.f667z, bVar.f667z) && p.c(this.A, bVar.A) && p.c(this.B, bVar.B) && p.c(this.C, bVar.C) && this.D == bVar.D && p.c(this.E, bVar.E) && p.c(this.F, bVar.F) && p.c(this.G, bVar.G) && this.H == bVar.H && this.I == bVar.I && this.J == bVar.J && this.K == bVar.K && this.L == bVar.L;
        }
        return false;
    }

    public final String f() {
        return this.A;
    }

    public final String g() {
        return this.B;
    }

    public final int h() {
        return this.D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((this.f664w.hashCode() * 31) + Integer.hashCode(this.f665x)) * 31) + this.f666y.hashCode()) * 31) + this.f667z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + Integer.hashCode(this.D)) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31) + this.G.hashCode()) * 31;
        boolean z10 = this.H;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.I;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.J;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z13 = this.K;
        int i16 = z13;
        if (z13 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z14 = this.L;
        return i17 + (z14 ? 1 : z14 ? 1 : 0);
    }

    public final int i() {
        return this.f665x;
    }

    public final String j() {
        return this.f664w;
    }

    public final String k() {
        return this.G;
    }

    public final boolean l() {
        return this.I;
    }

    public final boolean m() {
        return this.K;
    }

    public final boolean n() {
        return this.J;
    }

    public final boolean o() {
        return this.H;
    }

    public final boolean p() {
        return this.L;
    }

    public String toString() {
        return "LandingPageEmomoQuestRewardBindModel(rewardImageUrl=" + this.f664w + ", rewardImageSize=" + this.f665x + ", achievedImageUrl=" + this.f666y + ", categoryImageUrl=" + this.f667z + ", logoImageUrl=" + this.A + ", nameText=" + this.B + ", descriptionText=" + this.C + ", rarity=" + this.D + ", conditionText=" + this.E + ", attributes=" + this.F + ", specialEffectText=" + this.G + ", isVisibleRarity=" + this.H + ", isVisibleAchievedImageView=" + this.I + ", isVisibleCategoryImageView=" + this.J + ", isVisibleAttributes=" + this.K + ", isVisibleSpecialEffect=" + this.L + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.f664w);
        parcel.writeInt(this.f665x);
        parcel.writeString(this.f666y);
        parcel.writeString(this.f667z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeInt(this.D);
        parcel.writeString(this.E);
        List<t0> list = this.F;
        parcel.writeInt(list.size());
        for (t0 t0Var : list) {
            parcel.writeParcelable(t0Var, i10);
        }
        parcel.writeString(this.G);
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeInt(this.I ? 1 : 0);
        parcel.writeInt(this.J ? 1 : 0);
        parcel.writeInt(this.K ? 1 : 0);
        parcel.writeInt(this.L ? 1 : 0);
    }
}
