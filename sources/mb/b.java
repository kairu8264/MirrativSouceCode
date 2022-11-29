package mb;

import android.os.Parcel;
import android.os.Parcelable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class b implements Parcelable {
    public final boolean A;

    /* renamed from: w  reason: collision with root package name */
    public final String f40708w;

    /* renamed from: x  reason: collision with root package name */
    public final int f40709x;

    /* renamed from: y  reason: collision with root package name */
    public final int f40710y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f40711z;
    public static final a B = new a(null);
    public static final Parcelable.Creator<b> CREATOR = new C0598b();
    public static final int C = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final b a(String str, int i10, int i11) {
            p.h(str, "giftId");
            return new b(str, i10, i11, i10 > 0, i10 > 1);
        }
    }

    /* renamed from: mb.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0598b implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final b createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new b(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(String str, int i10, int i11, boolean z10, boolean z11) {
        p.h(str, "giftId");
        this.f40708w = str;
        this.f40709x = i10;
        this.f40710y = i11;
        this.f40711z = z10;
        this.A = z11;
    }

    public final int a() {
        return this.f40709x;
    }

    public final int b() {
        return this.f40710y;
    }

    public final String c() {
        return this.f40708w;
    }

    public final boolean d() {
        return this.f40711z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return p.c(this.f40708w, bVar.f40708w) && this.f40709x == bVar.f40709x && this.f40710y == bVar.f40710y && this.f40711z == bVar.f40711z && this.A == bVar.A;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f40708w.hashCode() * 31) + Integer.hashCode(this.f40709x)) * 31) + Integer.hashCode(this.f40710y)) * 31;
        boolean z10 = this.f40711z;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.A;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "EmomoQuestGiftGachaTicketBindModel(giftId=" + this.f40708w + ", gachaTicketCount=" + this.f40709x + ", giftEventId=" + this.f40710y + ", hasGiftGachaTicket=" + this.f40711z + ", isVisibleSendAllButton=" + this.A + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.f40708w);
        parcel.writeInt(this.f40709x);
        parcel.writeInt(this.f40710y);
        parcel.writeInt(this.f40711z ? 1 : 0);
        parcel.writeInt(this.A ? 1 : 0);
    }
}
