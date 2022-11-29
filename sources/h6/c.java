package h6;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import jo.p;
import o6.k;
import xn.n0;

/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f34531a;

        /* renamed from: b  reason: collision with root package name */
        public double f34532b;

        /* renamed from: c  reason: collision with root package name */
        public int f34533c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f34534d = true;

        /* renamed from: e  reason: collision with root package name */
        public boolean f34535e = true;

        public a(Context context) {
            this.f34531a = context;
            this.f34532b = k.d(context);
        }

        public final c a() {
            i bVar;
            h aVar;
            int i10;
            if (this.f34535e) {
                bVar = new g();
            } else {
                bVar = new h6.b();
            }
            if (this.f34534d) {
                double d10 = this.f34532b;
                if (d10 > 0.0d) {
                    i10 = k.b(this.f34531a, d10);
                } else {
                    i10 = this.f34533c;
                }
                if (i10 > 0) {
                    aVar = new f(i10, bVar);
                } else {
                    aVar = new h6.a(bVar);
                }
            } else {
                aVar = new h6.a(bVar);
            }
            return new e(aVar, bVar);
        }
    }

    /* renamed from: h6.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0436c {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f34538a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, Object> f34539b;

        public C0436c(Bitmap bitmap, Map<String, ? extends Object> map) {
            this.f34538a = bitmap;
            this.f34539b = map;
        }

        public final Bitmap a() {
            return this.f34538a;
        }

        public final Map<String, Object> b() {
            return this.f34539b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0436c) {
                C0436c c0436c = (C0436c) obj;
                if (p.c(this.f34538a, c0436c.f34538a) && p.c(this.f34539b, c0436c.f34539b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f34538a.hashCode() * 31) + this.f34539b.hashCode();
        }

        public String toString() {
            return "Value(bitmap=" + this.f34538a + ", extras=" + this.f34539b + ')';
        }
    }

    void a(int i10);

    C0436c b(b bVar);

    void c(b bVar, C0436c c0436c);

    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public final String f34536w;

        /* renamed from: x  reason: collision with root package name */
        public final Map<String, String> f34537x;

        /* loaded from: classes.dex */
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new b(readString, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(String str, Map<String, String> map) {
            this.f34536w = str;
            this.f34537x = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b b(b bVar, String str, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f34536w;
            }
            if ((i10 & 2) != 0) {
                map = bVar.f34537x;
            }
            return bVar.a(str, map);
        }

        public final b a(String str, Map<String, String> map) {
            return new b(str, map);
        }

        public final Map<String, String> c() {
            return this.f34537x;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (p.c(this.f34536w, bVar.f34536w) && p.c(this.f34537x, bVar.f34537x)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f34536w.hashCode() * 31) + this.f34537x.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.f34536w + ", extras=" + this.f34537x + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f34536w);
            Map<String, String> map = this.f34537x;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }

        public /* synthetic */ b(String str, Map map, int i10, jo.h hVar) {
            this(str, (i10 & 2) != 0 ? n0.e() : map);
        }
    }
}
