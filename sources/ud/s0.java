package ud;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemAttribute;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemAttributeVectorType;
import ud.r0;

/* loaded from: classes2.dex */
public final class s0 implements r0 {
    public final float A;
    public final r0.a B;
    public final boolean C;

    /* renamed from: w  reason: collision with root package name */
    public final String f55467w;

    /* renamed from: x  reason: collision with root package name */
    public final String f55468x;

    /* renamed from: y  reason: collision with root package name */
    public final int f55469y;

    /* renamed from: z  reason: collision with root package name */
    public final float f55470z;
    public static final a D = new a(null);
    public static final Parcelable.Creator<s0> CREATOR = new b();
    public static final int E = 8;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: ud.s0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0866a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f55471a;

            static {
                int[] iArr = new int[GiftItemAttributeVectorType.values().length];
                iArr[GiftItemAttributeVectorType.POSITIVE.ordinal()] = 1;
                iArr[GiftItemAttributeVectorType.NEGATIVE.ordinal()] = 2;
                iArr[GiftItemAttributeVectorType.NEUTRAL.ordinal()] = 3;
                f55471a = iArr;
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ s0 b(a aVar, Context context, GiftItemAttribute giftItemAttribute, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            if ((i10 & 8) != 0) {
                z11 = false;
            }
            return aVar.a(context, giftItemAttribute, z10, z11);
        }

        public final s0 a(Context context, GiftItemAttribute giftItemAttribute, boolean z10, boolean z11) {
            int color;
            jo.p.h(context, "context");
            jo.p.h(giftItemAttribute, "response");
            String title = giftItemAttribute.getTitle();
            String value = giftItemAttribute.getValue();
            GiftItemAttributeVectorType type = giftItemAttribute.getType();
            int[] iArr = C0866a.f55471a;
            int i10 = iArr[type.ordinal()];
            if (i10 == 1) {
                color = context.getColor(nd.w0.S);
            } else if (i10 != 2) {
                color = context.getColor(nd.w0.f42236l);
            } else {
                color = context.getColor(nd.w0.f42238n);
            }
            return new s0(title, value, color, z11 ? 14.0f : 12.0f, iArr[giftItemAttribute.getType().ordinal()] == 3 ? 0.3f : 1.0f, null, z10, 32, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<s0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final s0 createFromParcel(Parcel parcel) {
            jo.p.h(parcel, "parcel");
            return new s0(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), r0.a.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final s0[] newArray(int i10) {
            return new s0[i10];
        }
    }

    public s0(String str, String str2, int i10, float f10, float f11, r0.a aVar, boolean z10) {
        jo.p.h(str, "labelText");
        jo.p.h(str2, "valueText");
        jo.p.h(aVar, "type");
        this.f55467w = str;
        this.f55468x = str2;
        this.f55469y = i10;
        this.f55470z = f10;
        this.A = f11;
        this.B = aVar;
        this.C = z10;
    }

    @Override // ud.r0
    public boolean F0() {
        return this.C;
    }

    public final float a() {
        return this.A;
    }

    public final String b() {
        return this.f55467w;
    }

    public final float c() {
        return this.f55470z;
    }

    public final String d() {
        return this.f55468x;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f55469y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            return jo.p.c(this.f55467w, s0Var.f55467w) && jo.p.c(this.f55468x, s0Var.f55468x) && this.f55469y == s0Var.f55469y && jo.p.c(Float.valueOf(this.f55470z), Float.valueOf(s0Var.f55470z)) && jo.p.c(Float.valueOf(this.A), Float.valueOf(s0Var.A)) && getType() == s0Var.getType() && F0() == s0Var.F0();
        }
        return false;
    }

    @Override // ud.r0
    public r0.a getType() {
        return this.B;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f55467w.hashCode() * 31) + this.f55468x.hashCode()) * 31) + Integer.hashCode(this.f55469y)) * 31) + Float.hashCode(this.f55470z)) * 31) + Float.hashCode(this.A)) * 31) + getType().hashCode()) * 31;
        boolean F0 = F0();
        int i10 = F0;
        if (F0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "GiftItemAttributeBindModel(labelText=" + this.f55467w + ", valueText=" + this.f55468x + ", valueTextColor=" + this.f55469y + ", textSizeSp=" + this.f55470z + ", alpha=" + this.A + ", type=" + getType() + ", isFillWidth=" + F0() + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        jo.p.h(parcel, "out");
        parcel.writeString(this.f55467w);
        parcel.writeString(this.f55468x);
        parcel.writeInt(this.f55469y);
        parcel.writeFloat(this.f55470z);
        parcel.writeFloat(this.A);
        parcel.writeString(this.B.name());
        parcel.writeInt(this.C ? 1 : 0);
    }

    public /* synthetic */ s0(String str, String str2, int i10, float f10, float f11, r0.a aVar, boolean z10, int i11, jo.h hVar) {
        this(str, str2, i10, f10, f11, (i11 & 32) != 0 ? r0.a.DEFAULT : aVar, z10);
    }
}
