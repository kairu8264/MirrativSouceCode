package jf;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrorman.net.api.response.user.UserMe;

/* loaded from: classes2.dex */
public final class o0 implements Parcelable {
    public final int A;
    public final boolean B;
    public final int C;
    public final int D;
    public final long E;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f37954w;

    /* renamed from: x  reason: collision with root package name */
    public final long f37955x;

    /* renamed from: y  reason: collision with root package name */
    public final int f37956y;

    /* renamed from: z  reason: collision with root package name */
    public final int f37957z;
    public static final a F = new a(null);
    public static final Parcelable.Creator<o0> CREATOR = new b();
    public static final int G = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final o0 a(UserMe userMe) {
            jo.p.h(userMe, "me");
            return new o0(userMe.getPurchaseContinuousLiveHolidayEnabled(), userMe.getPurchaseContinuousLiveHolidayEnabledAt(), userMe.getPurchaseContinuousLiveHolidayRequiredCoin(), userMe.getContinuousStreamHolidaysNum(), userMe.getUsedContinuousStreamHolidaysNum(), userMe.isContinuousStreamer(), userMe.getMaxContinuousRecord(), userMe.getMaxContinuousLiveHoliday(), System.currentTimeMillis() / 1000);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<o0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final o0 createFromParcel(Parcel parcel) {
            jo.p.h(parcel, "parcel");
            return new o0(parcel.readInt() != 0, parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final o0[] newArray(int i10) {
            return new o0[i10];
        }
    }

    public o0() {
        this(false, 0L, 0, 0, 0, false, 0, 0, 0L, 511, null);
    }

    public o0(boolean z10, long j10, int i10, int i11, int i12, boolean z11, int i13, int i14, long j11) {
        this.f37954w = z10;
        this.f37955x = j10;
        this.f37956y = i10;
        this.f37957z = i11;
        this.A = i12;
        this.B = z11;
        this.C = i13;
        this.D = i14;
        this.E = j11;
    }

    public final int a() {
        return this.f37957z;
    }

    public final boolean b() {
        return this.f37957z == this.D;
    }

    public final boolean c() {
        return this.A > 0 && this.f37957z >= this.D - 1;
    }

    public final int d() {
        return this.C;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0) {
            o0 o0Var = (o0) obj;
            return this.f37954w == o0Var.f37954w && this.f37955x == o0Var.f37955x && this.f37956y == o0Var.f37956y && this.f37957z == o0Var.f37957z && this.A == o0Var.A && this.B == o0Var.B && this.C == o0Var.C && this.D == o0Var.D && this.E == o0Var.E;
        }
        return false;
    }

    public final boolean f() {
        return this.f37954w;
    }

    public final long g() {
        return this.f37955x;
    }

    public final int h() {
        return this.f37956y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    public int hashCode() {
        boolean z10 = this.f37954w;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int hashCode = ((((((((r02 * 31) + Long.hashCode(this.f37955x)) * 31) + Integer.hashCode(this.f37956y)) * 31) + Integer.hashCode(this.f37957z)) * 31) + Integer.hashCode(this.A)) * 31;
        boolean z11 = this.B;
        return ((((((hashCode + (z11 ? 1 : z11 ? 1 : 0)) * 31) + Integer.hashCode(this.C)) * 31) + Integer.hashCode(this.D)) * 31) + Long.hashCode(this.E);
    }

    public final boolean i() {
        return this.B;
    }

    public final boolean j() {
        return this.f37955x > this.E;
    }

    public String toString() {
        return "PurchaseHoliday(purchaseContinuousLiveHolidayEnabled=" + this.f37954w + ", purchaseContinuousLiveHolidayEnabledAt=" + this.f37955x + ", purchaseContinuousLiveHolidayRequiredCoin=" + this.f37956y + ", continuousStreamHolidaysNum=" + this.f37957z + ", usedContinuousStreamHolidaysNum=" + this.A + ", isContinuousStreamer=" + this.B + ", maxContinuousRecord=" + this.C + ", maxHolidayNum=" + this.D + ", currentTimeSec=" + this.E + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        jo.p.h(parcel, "out");
        parcel.writeInt(this.f37954w ? 1 : 0);
        parcel.writeLong(this.f37955x);
        parcel.writeInt(this.f37956y);
        parcel.writeInt(this.f37957z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeLong(this.E);
    }

    public /* synthetic */ o0(boolean z10, long j10, int i10, int i11, int i12, boolean z11, int i13, int i14, long j11, int i15, jo.h hVar) {
        this((i15 & 1) != 0 ? false : z10, (i15 & 2) != 0 ? 0L : j10, (i15 & 4) != 0 ? 0 : i10, (i15 & 8) != 0 ? 0 : i11, (i15 & 16) != 0 ? 0 : i12, (i15 & 32) != 0 ? false : z11, (i15 & 64) != 0 ? 0 : i13, (i15 & 128) == 0 ? i14 : 0, (i15 & 256) == 0 ? j11 : 0L);
    }
}
