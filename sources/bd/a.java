package bd;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.user.ContractBank;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public abstract class a implements Parcelable {

    /* renamed from: w  reason: collision with root package name */
    public static final b f17526w = new b(null);

    /* renamed from: bd.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0113a extends a {

        /* renamed from: x  reason: collision with root package name */
        public final ContractBank f17527x;

        /* renamed from: y  reason: collision with root package name */
        public final int f17528y;

        /* renamed from: z  reason: collision with root package name */
        public final String f17529z;
        public static final Parcelable.Creator<C0113a> CREATOR = new C0114a();
        public static final int A = 8;

        /* renamed from: bd.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0114a implements Parcelable.Creator<C0113a> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final C0113a createFromParcel(Parcel parcel) {
                p.h(parcel, "parcel");
                return new C0113a((ContractBank) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final C0113a[] newArray(int i10) {
                return new C0113a[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0113a(ContractBank contractBank) {
            super(null);
            p.h(contractBank, "contractBank");
            this.f17527x = contractBank;
            this.f17528y = 2;
            this.f17529z = contractBank.getBankName();
        }

        @Override // bd.a
        public String a() {
            return this.f17529z;
        }

        @Override // bd.a
        public int b() {
            return this.f17528y;
        }

        public final ContractBank c() {
            return this.f17527x;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0113a) && p.c(this.f17527x, ((C0113a) obj).f17527x);
        }

        public int hashCode() {
            return this.f17527x.hashCode();
        }

        public String toString() {
            return "Bank(contractBank=" + this.f17527x + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            p.h(parcel, "out");
            parcel.writeSerializable(this.f17527x);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends a {
        public static final Parcelable.Creator<d> CREATOR = new C0116a();

        /* renamed from: z  reason: collision with root package name */
        public static final int f17533z = 8;

        /* renamed from: x  reason: collision with root package name */
        public final String f17534x;

        /* renamed from: y  reason: collision with root package name */
        public final int f17535y;

        /* renamed from: bd.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0116a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final d createFromParcel(Parcel parcel) {
                p.h(parcel, "parcel");
                return new d(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(null);
            p.h(str, "title");
            this.f17534x = str;
        }

        @Override // bd.a
        public String a() {
            return this.f17534x;
        }

        @Override // bd.a
        public int b() {
            return this.f17535y;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p.c(a(), ((d) obj).a());
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "IndexSection(title=" + a() + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            p.h(parcel, "out");
            parcel.writeString(this.f17534x);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(android.content.res.Resources r2) {
            /*
                r1 = this;
                java.lang.String r0 = "resources"
                jo.p.h(r2, r0)
                int r0 = nc.i.text_contract_bank_select_order
                java.lang.String r2 = r2.getString(r0)
                java.lang.String r0 = "resources.getString(R.st…ntract_bank_select_order)"
                jo.p.g(r2, r0)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bd.a.d.<init>(android.content.res.Resources):void");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends a {
        public static final Parcelable.Creator<e> CREATOR = new C0117a();

        /* renamed from: z  reason: collision with root package name */
        public static final int f17536z = 8;

        /* renamed from: x  reason: collision with root package name */
        public final String f17537x;

        /* renamed from: y  reason: collision with root package name */
        public final int f17538y;

        /* renamed from: bd.a$e$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0117a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final e createFromParcel(Parcel parcel) {
                p.h(parcel, "parcel");
                return new e(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(null);
            p.h(str, "title");
            this.f17537x = str;
        }

        @Override // bd.a
        public String a() {
            return this.f17537x;
        }

        @Override // bd.a
        public int b() {
            return this.f17538y;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && p.c(a(), ((e) obj).a());
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "MajorBankSection(title=" + a() + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            p.h(parcel, "out");
            parcel.writeString(this.f17537x);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public e(android.content.res.Resources r2) {
            /*
                r1 = this;
                java.lang.String r0 = "resources"
                jo.p.h(r2, r0)
                int r0 = nc.i.text_contract_bank_select_major_bank
                java.lang.String r2 = r2.getString(r0)
                java.lang.String r0 = "resources.getString(R.st…t_bank_select_major_bank)"
                jo.p.g(r2, r0)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bd.a.e.<init>(android.content.res.Resources):void");
        }
    }

    public a() {
    }

    public /* synthetic */ a(h hVar) {
        this();
    }

    public abstract String a();

    public abstract int b();

    /* loaded from: classes2.dex */
    public static final class c extends a {

        /* renamed from: x  reason: collision with root package name */
        public final String f17530x;

        /* renamed from: y  reason: collision with root package name */
        public final int f17531y;

        /* renamed from: z  reason: collision with root package name */
        public final int f17532z;
        public static final Parcelable.Creator<c> CREATOR = new C0115a();
        public static final int A = 8;

        /* renamed from: bd.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0115a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                p.h(parcel, "parcel");
                return new c(parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, int i10) {
            super(null);
            p.h(str, "title");
            this.f17530x = str;
            this.f17531y = i10;
            this.f17532z = 1;
        }

        @Override // bd.a
        public String a() {
            return this.f17530x;
        }

        @Override // bd.a
        public int b() {
            return this.f17532z;
        }

        public final int c() {
            return this.f17531y;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return p.c(a(), cVar.a()) && this.f17531y == cVar.f17531y;
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + Integer.hashCode(this.f17531y);
        }

        public String toString() {
            return "Index(title=" + a() + ", index=" + this.f17531y + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            p.h(parcel, "out");
            parcel.writeString(this.f17530x);
            parcel.writeInt(this.f17531y);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public c(ad.y0 r2, android.content.res.Resources r3) {
            /*
                r1 = this;
                java.lang.String r0 = "contractBankIndex"
                jo.p.h(r2, r0)
                java.lang.String r0 = "resources"
                jo.p.h(r3, r0)
                java.lang.Integer r0 = r2.e()
                if (r0 == 0) goto L19
                int r0 = r0.intValue()
                java.lang.String r3 = r3.getString(r0)
                goto L1a
            L19:
                r3 = 0
            L1a:
                if (r3 != 0) goto L1e
                java.lang.String r3 = ""
            L1e:
                int r2 = r2.c()
                r1.<init>(r3, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bd.a.c.<init>(ad.y0, android.content.res.Resources):void");
        }
    }
}
