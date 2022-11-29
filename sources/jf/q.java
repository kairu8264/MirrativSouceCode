package jf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes2.dex */
public final class q implements Parcelable {
    public static final a CREATOR = new a(null);
    public static final int N = 8;
    public int A;
    public final ve.d B;
    public final String C;
    public final boolean D;
    public final long E;
    public final long F;
    public final Integer G;
    public final Integer H;
    public final String I;
    public final boolean J;
    public final boolean K;
    public final String L;
    public final String M;

    /* renamed from: w  reason: collision with root package name */
    public final String f37968w;

    /* renamed from: x  reason: collision with root package name */
    public final String f37969x;

    /* renamed from: y  reason: collision with root package name */
    public final String f37970y;

    /* renamed from: z  reason: collision with root package name */
    public final int f37971z;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<q> {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public q createFromParcel(Parcel parcel) {
            jo.p.h(parcel, "parcel");
            return new q(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public q[] newArray(int i10) {
            return new q[i10];
        }
    }

    public q(String str, String str2, String str3, int i10, int i11, ve.d dVar, String str4, boolean z10, long j10, long j11, Integer num, Integer num2, String str5, boolean z11, boolean z12, String str6, String str7) {
        jo.p.h(str, TtmlNode.ATTR_ID);
        jo.p.h(str2, "small_image_url");
        jo.p.h(str3, "large_image_url");
        jo.p.h(dVar, "type");
        jo.p.h(str4, "referer");
        jo.p.h(str6, "bonusImageUrl");
        jo.p.h(str7, "eventIconUrl");
        this.f37968w = str;
        this.f37969x = str2;
        this.f37970y = str3;
        this.f37971z = i10;
        this.A = i11;
        this.B = dVar;
        this.C = str4;
        this.D = z10;
        this.E = j10;
        this.F = j11;
        this.G = num;
        this.H = num2;
        this.I = str5;
        this.J = z11;
        this.K = z12;
        this.L = str6;
        this.M = str7;
    }

    public final void a() {
        this.A = 0;
    }

    public final q b(String str, String str2, String str3, int i10, int i11, ve.d dVar, String str4, boolean z10, long j10, long j11, Integer num, Integer num2, String str5, boolean z11, boolean z12, String str6, String str7) {
        jo.p.h(str, TtmlNode.ATTR_ID);
        jo.p.h(str2, "small_image_url");
        jo.p.h(str3, "large_image_url");
        jo.p.h(dVar, "type");
        jo.p.h(str4, "referer");
        jo.p.h(str6, "bonusImageUrl");
        jo.p.h(str7, "eventIconUrl");
        return new q(str, str2, str3, i10, i11, dVar, str4, z10, j10, j11, num, num2, str5, z11, z12, str6, str7);
    }

    public final String d() {
        return this.L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f37971z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return jo.p.c(this.f37968w, qVar.f37968w) && jo.p.c(this.f37969x, qVar.f37969x) && jo.p.c(this.f37970y, qVar.f37970y) && this.f37971z == qVar.f37971z && this.A == qVar.A && this.B == qVar.B && jo.p.c(this.C, qVar.C) && this.D == qVar.D && this.E == qVar.E && this.F == qVar.F && jo.p.c(this.G, qVar.G) && jo.p.c(this.H, qVar.H) && jo.p.c(this.I, qVar.I) && this.J == qVar.J && this.K == qVar.K && jo.p.c(this.L, qVar.L) && jo.p.c(this.M, qVar.M);
        }
        return false;
    }

    public final String f() {
        return this.M;
    }

    public final boolean g() {
        return this.K;
    }

    public final String h() {
        return this.f37968w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((this.f37968w.hashCode() * 31) + this.f37969x.hashCode()) * 31) + this.f37970y.hashCode()) * 31) + Integer.hashCode(this.f37971z)) * 31) + Integer.hashCode(this.A)) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31;
        boolean z10 = this.D;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((((hashCode + i10) * 31) + Long.hashCode(this.E)) * 31) + Long.hashCode(this.F)) * 31;
        Integer num = this.G;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.H;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.I;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z11 = this.J;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode5 + i11) * 31;
        boolean z12 = this.K;
        return ((((i12 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + this.L.hashCode()) * 31) + this.M.hashCode();
    }

    public final String i() {
        return this.f37970y;
    }

    public final String j() {
        return this.I;
    }

    public final Integer k() {
        return this.G;
    }

    public final Integer l() {
        return this.H;
    }

    public final String m() {
        return this.C;
    }

    public final boolean n() {
        return this.D;
    }

    public final String o() {
        return this.f37969x;
    }

    public final int p() {
        return this.A;
    }

    public final ve.d q() {
        return this.B;
    }

    public final void r() {
        this.A++;
    }

    public final boolean s() {
        return this.J;
    }

    public final boolean t() {
        return (this.G == null || this.H == null) ? false : true;
    }

    public String toString() {
        return "GiftModel(id=" + this.f37968w + ", small_image_url=" + this.f37969x + ", large_image_url=" + this.f37970y + ", coins=" + this.f37971z + ", stockCount=" + this.A + ", type=" + this.B + ", referer=" + this.C + ", requiredReload=" + this.D + ", availableFrom=" + this.E + ", availableTo=" + this.F + ", panelType=" + this.G + ", reasonId=" + this.H + ", lockedMessage=" + this.I + ", isPaidCoinOnly=" + this.J + ", fadedOut=" + this.K + ", bonusImageUrl=" + this.L + ", eventIconUrl=" + this.M + ')';
    }

    public final boolean u() {
        return this.A > 0;
    }

    public final boolean v() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long j10 = this.E;
        if (j10 != 0) {
            long j11 = this.F;
            if (j11 != 0) {
                return (currentTimeMillis > j11 ? 1 : (currentTimeMillis == j11 ? 0 : -1)) <= 0 && (j10 > currentTimeMillis ? 1 : (j10 == currentTimeMillis ? 0 : -1)) <= 0;
            }
            return true;
        }
        return true;
    }

    public final void w(int i10) {
        this.A = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        jo.p.h(parcel, "parcel");
        parcel.writeString(this.f37968w);
        parcel.writeString(this.f37969x);
        parcel.writeString(this.f37970y);
        parcel.writeInt(this.f37971z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B.c());
        parcel.writeString(this.C);
        parcel.writeByte(this.D ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.E);
        parcel.writeLong(this.F);
        Integer num = this.G;
        parcel.writeInt(num != null ? num.intValue() : 0);
        Integer num2 = this.H;
        parcel.writeInt(num2 != null ? num2.intValue() : 0);
        parcel.writeString(this.I);
        parcel.writeByte(this.J ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.K ? (byte) 1 : (byte) 0);
        parcel.writeString(this.L);
        parcel.writeString(this.M);
    }

    public /* synthetic */ q(String str, String str2, String str3, int i10, int i11, ve.d dVar, String str4, boolean z10, long j10, long j11, Integer num, Integer num2, String str5, boolean z11, boolean z12, String str6, String str7, int i12, jo.h hVar) {
        this(str, str2, str3, i10, i11, dVar, str4, z10, (i12 & 256) != 0 ? 0L : j10, (i12 & 512) != 0 ? 0L : j11, num, num2, str5, (i12 & 8192) != 0 ? false : z11, (i12 & 16384) != 0 ? false : z12, str6, str7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q(android.os.Parcel r24) {
        /*
            r23 = this;
            java.lang.String r0 = "parcel"
            r1 = r24
            jo.p.h(r1, r0)
            java.lang.String r0 = r24.readString()
            java.lang.String r2 = ""
            if (r0 != 0) goto L11
            r4 = r2
            goto L12
        L11:
            r4 = r0
        L12:
            java.lang.String r0 = r24.readString()
            if (r0 != 0) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r0
        L1b:
            java.lang.String r0 = r24.readString()
            if (r0 != 0) goto L23
            r6 = r2
            goto L24
        L23:
            r6 = r0
        L24:
            int r7 = r24.readInt()
            int r8 = r24.readInt()
            ve.d$a r0 = ve.d.Companion
            int r3 = r24.readInt()
            ve.d r9 = r0.a(r3)
            java.lang.String r0 = r24.readString()
            if (r0 != 0) goto L3e
            r10 = r2
            goto L3f
        L3e:
            r10 = r0
        L3f:
            byte r0 = r24.readByte()
            r3 = 1
            r11 = 0
            if (r0 <= 0) goto L49
            r0 = r3
            goto L4a
        L49:
            r0 = r11
        L4a:
            long r12 = r24.readLong()
            long r14 = r24.readLong()
            int r16 = r24.readInt()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            int r17 = r24.readInt()
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            java.lang.String r18 = r24.readString()
            if (r18 != 0) goto L6a
            r18 = r2
        L6a:
            byte r19 = r24.readByte()
            if (r19 <= 0) goto L73
            r19 = r3
            goto L75
        L73:
            r19 = r11
        L75:
            byte r20 = r24.readByte()
            if (r20 <= 0) goto L7e
            r20 = r3
            goto L80
        L7e:
            r20 = r11
        L80:
            java.lang.String r3 = r24.readString()
            if (r3 != 0) goto L89
            r21 = r2
            goto L8b
        L89:
            r21 = r3
        L8b:
            java.lang.String r1 = r24.readString()
            if (r1 != 0) goto L94
            r22 = r2
            goto L96
        L94:
            r22 = r1
        L96:
            r3 = r23
            r11 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.q.<init>(android.os.Parcel):void");
    }
}
