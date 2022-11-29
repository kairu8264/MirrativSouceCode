package ud;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffect;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffectType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class x0 implements Parcelable {
    public final String A;
    public final int B;
    public final float C;
    public final List<r0> D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;

    /* renamed from: w  reason: collision with root package name */
    public final GiftItemEffectType f55664w;

    /* renamed from: x  reason: collision with root package name */
    public final String f55665x;

    /* renamed from: y  reason: collision with root package name */
    public final String f55666y;

    /* renamed from: z  reason: collision with root package name */
    public final float f55667z;
    public static final a I = new a(null);
    public static final Parcelable.Creator<x0> CREATOR = new b();
    public static final int J = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ x0 b(a aVar, Context context, GiftItemEffect giftItemEffect, List list, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                list = xn.s.k();
            }
            return aVar.a(context, giftItemEffect, list);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final ud.x0 a(android.content.Context r25, com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffect r26, java.util.List<? extends ud.r0> r27) {
            /*
                Method dump skipped, instructions count: 279
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ud.x0.a.a(android.content.Context, com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffect, java.util.List):ud.x0");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<x0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final x0 createFromParcel(Parcel parcel) {
            jo.p.h(parcel, "parcel");
            GiftItemEffectType valueOf = GiftItemEffectType.valueOf(parcel.readString());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            float readFloat = parcel.readFloat();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            float readFloat2 = parcel.readFloat();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i10 = 0; i10 != readInt2; i10++) {
                arrayList.add(parcel.readParcelable(x0.class.getClassLoader()));
            }
            return new x0(valueOf, readString, readString2, readFloat, readString3, readInt, readFloat2, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final x0[] newArray(int i10) {
            return new x0[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x0(GiftItemEffectType giftItemEffectType, String str, String str2, float f10, String str3, int i10, float f11, List<? extends r0> list, boolean z10, boolean z11, boolean z12, boolean z13) {
        jo.p.h(giftItemEffectType, "type");
        jo.p.h(str, "logoImageUrl");
        jo.p.h(list, "attributes");
        this.f55664w = giftItemEffectType;
        this.f55665x = str;
        this.f55666y = str2;
        this.f55667z = f10;
        this.A = str3;
        this.B = i10;
        this.C = f11;
        this.D = list;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        this.H = z13;
    }

    public final List<r0> a() {
        return this.D;
    }

    public final String b() {
        return this.A;
    }

    public final int c() {
        return this.B;
    }

    public final float d() {
        return this.C;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f55665x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            return this.f55664w == x0Var.f55664w && jo.p.c(this.f55665x, x0Var.f55665x) && jo.p.c(this.f55666y, x0Var.f55666y) && jo.p.c(Float.valueOf(this.f55667z), Float.valueOf(x0Var.f55667z)) && jo.p.c(this.A, x0Var.A) && this.B == x0Var.B && jo.p.c(Float.valueOf(this.C), Float.valueOf(x0Var.C)) && jo.p.c(this.D, x0Var.D) && this.E == x0Var.E && this.F == x0Var.F && this.G == x0Var.G && this.H == x0Var.H;
        }
        return false;
    }

    public final String f() {
        return this.f55666y;
    }

    public final float g() {
        return this.f55667z;
    }

    public final GiftItemEffectType h() {
        return this.f55664w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f55664w.hashCode() * 31) + this.f55665x.hashCode()) * 31;
        String str = this.f55666y;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Float.hashCode(this.f55667z)) * 31;
        String str2 = this.A;
        int hashCode3 = (((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.B)) * 31) + Float.hashCode(this.C)) * 31) + this.D.hashCode()) * 31;
        boolean z10 = this.E;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode3 + i10) * 31;
        boolean z11 = this.F;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.G;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z13 = this.H;
        return i15 + (z13 ? 1 : z13 ? 1 : 0);
    }

    public final boolean i() {
        return this.E;
    }

    public final boolean j() {
        return this.G;
    }

    public final boolean k() {
        return this.F;
    }

    public String toString() {
        return "GiftItemEventAttributesBindModel(type=" + this.f55664w + ", logoImageUrl=" + this.f55665x + ", subTitle=" + this.f55666y + ", subTitleTextSizeSp=" + this.f55667z + ", description=" + this.A + ", descriptionTextColor=" + this.B + ", descriptionTextSizeSp=" + this.C + ", attributes=" + this.D + ", isVisibleAttributeRecyclerView=" + this.E + ", isVisibleSubTitle=" + this.F + ", isVisibleDescription=" + this.G + ", isVisibleAttributes=" + this.H + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        jo.p.h(parcel, "out");
        parcel.writeString(this.f55664w.name());
        parcel.writeString(this.f55665x);
        parcel.writeString(this.f55666y);
        parcel.writeFloat(this.f55667z);
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
        parcel.writeFloat(this.C);
        List<r0> list = this.D;
        parcel.writeInt(list.size());
        for (r0 r0Var : list) {
            parcel.writeParcelable(r0Var, i10);
        }
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeInt(this.H ? 1 : 0);
    }
}
