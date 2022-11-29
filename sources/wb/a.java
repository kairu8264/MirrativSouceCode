package wb;

import android.os.Parcel;
import android.os.Parcelable;
import jo.h;
import jo.p;
import jo.q;

/* loaded from: classes2.dex */
public abstract class a implements Parcelable {

    /* renamed from: w  reason: collision with root package name */
    public static final b f58561w = new b(null);

    /* renamed from: wb.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0967a extends a {
        public static final Parcelable.Creator<C0967a> CREATOR = new C0968a();

        /* renamed from: x  reason: collision with root package name */
        public final String f58562x;

        /* renamed from: wb.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0968a implements Parcelable.Creator<C0967a> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final C0967a createFromParcel(Parcel parcel) {
                p.h(parcel, "parcel");
                return new C0967a(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final C0967a[] newArray(int i10) {
                return new C0967a[i10];
            }
        }

        /* renamed from: wb.a$a$b */
        /* loaded from: classes2.dex */
        public static final class b extends q implements io.a<uq.a> {
            public b() {
                super(0);
            }

            @Override // io.a
            /* renamed from: a */
            public final uq.a invoke() {
                return uq.b.b(C0967a.this.a());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0967a(String str) {
            super(null);
            p.h(str, "appId");
            this.f58562x = str;
        }

        @Override // wb.a
        public String a() {
            return this.f58562x;
        }

        @Override // wb.a
        public String b() {
            return "KEY_APP_PAGE";
        }

        @Override // wb.a
        public io.a<uq.a> c() {
            return new b();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            p.h(parcel, "out");
            parcel.writeString(this.f58562x);
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
    public static final class c extends a {
        public static final Parcelable.Creator<c> CREATOR = new C0969a();

        /* renamed from: x  reason: collision with root package name */
        public final String f58564x;

        /* renamed from: y  reason: collision with root package name */
        public final String f58565y;

        /* renamed from: z  reason: collision with root package name */
        public final String f58566z;

        /* renamed from: wb.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0969a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                p.h(parcel, "parcel");
                return new c(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends q implements io.a<uq.a> {
            public b() {
                super(0);
            }

            @Override // io.a
            /* renamed from: a */
            public final uq.a invoke() {
                return uq.b.b(c.this.f58564x, c.this.f58565y, c.this.a());
            }
        }

        public /* synthetic */ c(String str, String str2, String str3, int i10, h hVar) {
            this(str, str2, (i10 & 4) != 0 ? null : str3);
        }

        @Override // wb.a
        public String a() {
            return this.f58566z;
        }

        @Override // wb.a
        public String b() {
            return "KEY_LIVE_CATALOG";
        }

        @Override // wb.a
        public io.a<uq.a> c() {
            return new b();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            p.h(parcel, "out");
            parcel.writeString(this.f58564x);
            parcel.writeString(this.f58565y);
            parcel.writeString(this.f58566z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3) {
            super(null);
            p.h(str, "referer");
            p.h(str2, "catalogId");
            this.f58564x = str;
            this.f58565y = str2;
            this.f58566z = str3;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends a {
        public static final Parcelable.Creator<d> CREATOR = new C0970a();

        /* renamed from: x  reason: collision with root package name */
        public final String f58568x;

        /* renamed from: y  reason: collision with root package name */
        public final String f58569y;

        /* renamed from: z  reason: collision with root package name */
        public final String f58570z;

        /* renamed from: wb.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0970a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final d createFromParcel(Parcel parcel) {
                p.h(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends q implements io.a<uq.a> {
            public b() {
                super(0);
            }

            @Override // io.a
            /* renamed from: a */
            public final uq.a invoke() {
                return uq.b.b(d.this.f58568x, d.this.e());
            }
        }

        public /* synthetic */ d(String str, String str2, String str3, int i10, h hVar) {
            this(str, str2, (i10 & 4) != 0 ? "" : str3);
        }

        @Override // wb.a
        public String a() {
            return this.f58570z;
        }

        @Override // wb.a
        public String b() {
            return "KEY_LIVE_GAME_CATALOG";
        }

        @Override // wb.a
        public io.a<uq.a> c() {
            return new b();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f58569y;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            p.h(parcel, "out");
            parcel.writeString(this.f58568x);
            parcel.writeString(this.f58569y);
            parcel.writeString(this.f58570z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3) {
            super(null);
            p.h(str, "referer");
            p.h(str2, "liveGameId");
            this.f58568x = str;
            this.f58569y = str2;
            this.f58570z = str3;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends a {
        public static final Parcelable.Creator<e> CREATOR = new C0971a();

        /* renamed from: x  reason: collision with root package name */
        public final String f58572x;

        /* renamed from: y  reason: collision with root package name */
        public final String f58573y;

        /* renamed from: wb.a$e$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0971a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final e createFromParcel(Parcel parcel) {
                p.h(parcel, "parcel");
                return new e(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends q implements io.a<uq.a> {
            public b() {
                super(0);
            }

            @Override // io.a
            /* renamed from: a */
            public final uq.a invoke() {
                return uq.b.b(e.this.f58572x, e.this.a());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2) {
            super(null);
            p.h(str, "searchWord");
            this.f58572x = str;
            this.f58573y = str2;
        }

        @Override // wb.a
        public String a() {
            return this.f58573y;
        }

        @Override // wb.a
        public String b() {
            return "KEY_SEARCH_LIVE";
        }

        @Override // wb.a
        public io.a<uq.a> c() {
            return new b();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            p.h(parcel, "out");
            parcel.writeString(this.f58572x);
            parcel.writeString(this.f58573y);
        }
    }

    public a() {
    }

    public /* synthetic */ a(h hVar) {
        this();
    }

    public abstract String a();

    public abstract String b();

    public abstract io.a<uq.a> c();
}
