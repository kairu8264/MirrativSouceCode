package ud;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffectType;
import com.dena.mirrorman.clientlog.logs.MRLog;
import ud.a;

/* loaded from: classes2.dex */
public final class s1 implements ud.a, Parcelable {
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final int E;
    public final String F;
    public final String G;
    public final boolean H;
    public final x0 I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;

    /* renamed from: w  reason: collision with root package name */
    public final a.EnumC0862a f55472w;

    /* renamed from: x  reason: collision with root package name */
    public final String f55473x;

    /* renamed from: y  reason: collision with root package name */
    public final float f55474y;

    /* renamed from: z  reason: collision with root package name */
    public final String f55475z;
    public static final a O = new a(null);
    public static final Parcelable.Creator<s1> CREATOR = new b();
    public static final int P = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final s1 a(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7, String str8, boolean z10, x0 x0Var) {
            float f10;
            jo.p.h(str, "iconUrl");
            jo.p.h(str2, "imageUrl");
            jo.p.h(str3, "badgeUrl");
            jo.p.h(str6, "name");
            jo.p.h(str7, "condition");
            jo.p.h(str8, MRLog.PAYLOAD_KEY_DESCRIPTION);
            if (x0Var == null) {
                f10 = 240.0f;
            } else {
                f10 = x0Var.h() == GiftItemEffectType.EMOMO_RUN ? 180.0f : 160.0f;
            }
            return new s1(null, str, f10, str2, str3, str4, str5, str6, i10, str7, str8, z10, x0Var, i10 > 0, str8.length() > 0, !(str4 == null || str4.length() == 0), !(str5 == null || str5.length() == 0), x0Var != null, 1, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<s1> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final s1 createFromParcel(Parcel parcel) {
            jo.p.h(parcel, "parcel");
            return new s1(a.EnumC0862a.valueOf(parcel.readString()), parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : x0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final s1[] newArray(int i10) {
            return new s1[i10];
        }
    }

    public s1(a.EnumC0862a enumC0862a, String str, float f10, String str2, String str3, String str4, String str5, String str6, int i10, String str7, String str8, boolean z10, x0 x0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        jo.p.h(enumC0862a, "type");
        jo.p.h(str, "rewardImageUrl");
        jo.p.h(str2, "rewardDetailImageUrl");
        jo.p.h(str3, "badgeImageUrl");
        jo.p.h(str6, "nameText");
        jo.p.h(str7, "conditionText");
        jo.p.h(str8, "descriptionText");
        this.f55472w = enumC0862a;
        this.f55473x = str;
        this.f55474y = f10;
        this.f55475z = str2;
        this.A = str3;
        this.B = str4;
        this.C = str5;
        this.D = str6;
        this.E = i10;
        this.F = str7;
        this.G = str8;
        this.H = z10;
        this.I = x0Var;
        this.J = z11;
        this.K = z12;
        this.L = z13;
        this.M = z14;
        this.N = z15;
    }

    public final String a() {
        return this.B;
    }

    public final String b() {
        return this.C;
    }

    public final String c() {
        return this.F;
    }

    public final String d() {
        return this.G;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final x0 e() {
        return this.I;
    }

    public final String f() {
        return this.D;
    }

    public final String g() {
        return this.f55475z;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f55472w;
    }

    public final float h() {
        return this.f55474y;
    }

    public final String i() {
        return this.f55473x;
    }

    public final int j() {
        return this.E;
    }

    public final boolean k() {
        return this.L;
    }

    public final boolean l() {
        return this.M;
    }

    public final boolean m() {
        return this.K;
    }

    public final boolean n() {
        return this.N;
    }

    public final boolean o() {
        return this.J;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        jo.p.h(parcel, "out");
        parcel.writeString(this.f55472w.name());
        parcel.writeString(this.f55473x);
        parcel.writeFloat(this.f55474y);
        parcel.writeString(this.f55475z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeInt(this.E);
        parcel.writeString(this.F);
        parcel.writeString(this.G);
        parcel.writeInt(this.H ? 1 : 0);
        x0 x0Var = this.I;
        if (x0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            x0Var.writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.J ? 1 : 0);
        parcel.writeInt(this.K ? 1 : 0);
        parcel.writeInt(this.L ? 1 : 0);
        parcel.writeInt(this.M ? 1 : 0);
        parcel.writeInt(this.N ? 1 : 0);
    }

    public /* synthetic */ s1(a.EnumC0862a enumC0862a, String str, float f10, String str2, String str3, String str4, String str5, String str6, int i10, String str7, String str8, boolean z10, x0 x0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? a.EnumC0862a.LANDING_PAGE_REWARD : enumC0862a, str, f10, str2, str3, str4, str5, str6, i10, str7, str8, z10, (i11 & 4096) != 0 ? null : x0Var, (i11 & 8192) != 0 ? false : z11, (i11 & 16384) != 0 ? false : z12, (32768 & i11) != 0 ? false : z13, (65536 & i11) != 0 ? false : z14, (i11 & 131072) != 0 ? false : z15);
    }
}
