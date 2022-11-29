package aa;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestReward;
import jo.p;

/* loaded from: classes.dex */
public final class d implements e {
    public final int A;
    public final String B;
    public final String C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;

    /* renamed from: w  reason: collision with root package name */
    public final String f677w;

    /* renamed from: x  reason: collision with root package name */
    public final String f678x;

    /* renamed from: y  reason: collision with root package name */
    public final String f679y;

    /* renamed from: z  reason: collision with root package name */
    public final String f680z;
    public static final a H = new a(null);
    public static final Parcelable.Creator<d> CREATOR = new b();
    public static final int I = 8;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d a(EmomoQuestReward emomoQuestReward, String str) {
            p.h(emomoQuestReward, "reward");
            p.h(str, "achievedImageUrl");
            return new d(emomoQuestReward.getImageUrl(), str, emomoQuestReward.getPartTypeIconUrl(), emomoQuestReward.getName(), emomoQuestReward.getRarity(), emomoQuestReward.getCondition(), emomoQuestReward.getDescription(), emomoQuestReward.getRarity() > 0, emomoQuestReward.getDescription().length() > 0, emomoQuestReward.getAchieved(), emomoQuestReward.getPartTypeIconUrl().length() > 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final d createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(String str, String str2, String str3, String str4, int i10, String str5, String str6, boolean z10, boolean z11, boolean z12, boolean z13) {
        p.h(str, "rewardImageUrl");
        p.h(str2, "achievedImageUrl");
        p.h(str3, "categoryImageUrl");
        p.h(str4, "nameText");
        p.h(str5, "conditionText");
        p.h(str6, "descriptionText");
        this.f677w = str;
        this.f678x = str2;
        this.f679y = str3;
        this.f680z = str4;
        this.A = i10;
        this.B = str5;
        this.C = str6;
        this.D = z10;
        this.E = z11;
        this.F = z12;
        this.G = z13;
    }

    public final String a() {
        return this.f678x;
    }

    public final String b() {
        return this.f679y;
    }

    public final String c() {
        return this.B;
    }

    public final String d() {
        return this.C;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f680z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return p.c(this.f677w, dVar.f677w) && p.c(this.f678x, dVar.f678x) && p.c(this.f679y, dVar.f679y) && p.c(this.f680z, dVar.f680z) && this.A == dVar.A && p.c(this.B, dVar.B) && p.c(this.C, dVar.C) && this.D == dVar.D && this.E == dVar.E && this.F == dVar.F && this.G == dVar.G;
        }
        return false;
    }

    public final int f() {
        return this.A;
    }

    public final String g() {
        return this.f677w;
    }

    public final boolean h() {
        return this.F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((this.f677w.hashCode() * 31) + this.f678x.hashCode()) * 31) + this.f679y.hashCode()) * 31) + this.f680z.hashCode()) * 31) + Integer.hashCode(this.A)) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31;
        boolean z10 = this.D;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.E;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.F;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z13 = this.G;
        return i15 + (z13 ? 1 : z13 ? 1 : 0);
    }

    public final boolean i() {
        return this.G;
    }

    public final boolean j() {
        return this.E;
    }

    public final boolean k() {
        return this.D;
    }

    public String toString() {
        return "LandingPageNormalRewardBindModel(rewardImageUrl=" + this.f677w + ", achievedImageUrl=" + this.f678x + ", categoryImageUrl=" + this.f679y + ", nameText=" + this.f680z + ", rarity=" + this.A + ", conditionText=" + this.B + ", descriptionText=" + this.C + ", isVisibleRarity=" + this.D + ", isVisibleDescriptionText=" + this.E + ", isVisibleAchievedImageView=" + this.F + ", isVisibleCategoryImageView=" + this.G + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.f677w);
        parcel.writeString(this.f678x);
        parcel.writeString(this.f679y);
        parcel.writeString(this.f680z);
        parcel.writeInt(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.G ? 1 : 0);
    }
}
