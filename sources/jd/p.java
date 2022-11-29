package jd;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();
    public final String A;
    public final String B;
    public final boolean C;
    public final boolean D;
    public final Integer E;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f37633w;

    /* renamed from: x  reason: collision with root package name */
    public final String f37634x;

    /* renamed from: y  reason: collision with root package name */
    public final String f37635y;

    /* renamed from: z  reason: collision with root package name */
    public final String f37636z;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final p createFromParcel(Parcel parcel) {
            jo.p.h(parcel, "parcel");
            return new p(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final p[] newArray(int i10) {
            return new p[i10];
        }
    }

    public p() {
        this(false, null, null, null, null, null, false, false, null, 511, null);
    }

    public p(boolean z10, String str, String str2, String str3, String str4, String str5, boolean z11, boolean z12, Integer num) {
        jo.p.h(str, "profileImageUrl");
        jo.p.h(str2, "name");
        jo.p.h(str3, MRLog.PAYLOAD_KEY_DESCRIPTION);
        jo.p.h(str4, "url");
        jo.p.h(str5, "birthday");
        this.f37633w = z10;
        this.f37634x = str;
        this.f37635y = str2;
        this.f37636z = str3;
        this.A = str4;
        this.B = str5;
        this.C = z11;
        this.D = z12;
        this.E = num;
    }

    public final p a(boolean z10, String str, String str2, String str3, String str4, String str5, boolean z11, boolean z12, Integer num) {
        jo.p.h(str, "profileImageUrl");
        jo.p.h(str2, "name");
        jo.p.h(str3, MRLog.PAYLOAD_KEY_DESCRIPTION);
        jo.p.h(str4, "url");
        jo.p.h(str5, "birthday");
        return new p(z10, str, str2, str3, str4, str5, z11, z12, num);
    }

    public final String c() {
        return this.B;
    }

    public final boolean d() {
        if (!so.n.r(this.f37635y)) {
            po.i i10 = i();
            int k10 = i10.k();
            int m10 = i10.m();
            int a10 = de.l.a(this.f37635y);
            if (k10 <= a10 && a10 <= m10) {
                po.i f10 = f();
                int k11 = f10.k();
                int m11 = f10.m();
                int a11 = de.l.a(this.f37636z);
                if (k11 <= a11 && a11 <= m11) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f37636z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return this.f37633w == pVar.f37633w && jo.p.c(this.f37634x, pVar.f37634x) && jo.p.c(this.f37635y, pVar.f37635y) && jo.p.c(this.f37636z, pVar.f37636z) && jo.p.c(this.A, pVar.A) && jo.p.c(this.B, pVar.B) && this.C == pVar.C && this.D == pVar.D && jo.p.c(this.E, pVar.E);
        }
        return false;
    }

    public final po.i f() {
        return new po.i(0, 1000);
    }

    public final boolean g() {
        return this.f37633w;
    }

    public final String h() {
        return this.f37635y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.f37633w;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int hashCode = ((((((((((r02 * 31) + this.f37634x.hashCode()) * 31) + this.f37635y.hashCode()) * 31) + this.f37636z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31;
        ?? r22 = this.C;
        int i10 = r22;
        if (r22 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.D;
        int i12 = (i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
        Integer num = this.E;
        return i12 + (num == null ? 0 : num.hashCode());
    }

    public final po.i i() {
        return new po.i(1, 15);
    }

    public final String j() {
        return this.f37634x;
    }

    public final Integer k() {
        return this.E;
    }

    public final String l() {
        return this.A;
    }

    public final boolean m() {
        return this.D;
    }

    public final boolean n() {
        po.i f10 = f();
        int k10 = f10.k();
        int m10 = f10.m();
        int a10 = de.l.a(this.f37636z);
        return k10 <= a10 && a10 <= m10;
    }

    public final boolean o() {
        return this.C;
    }

    public String toString() {
        return "ProfileEditEditModel(modified=" + this.f37633w + ", profileImageUrl=" + this.f37634x + ", name=" + this.f37635y + ", description=" + this.f37636z + ", url=" + this.A + ", birthday=" + this.B + ", isVisibleBirthday=" + this.C + ", isBirthdayEditable=" + this.D + ", selectedRibbonId=" + this.E + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int intValue;
        jo.p.h(parcel, "out");
        parcel.writeInt(this.f37633w ? 1 : 0);
        parcel.writeString(this.f37634x);
        parcel.writeString(this.f37635y);
        parcel.writeString(this.f37636z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D ? 1 : 0);
        Integer num = this.E;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }

    public /* synthetic */ p(boolean z10, String str, String str2, String str3, String str4, String str5, boolean z11, boolean z12, Integer num, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? "" : str4, (i10 & 32) == 0 ? str5 : "", (i10 & 64) != 0 ? true : z11, (i10 & 128) == 0 ? z12 : true, (i10 & 256) != 0 ? null : num);
    }
}
