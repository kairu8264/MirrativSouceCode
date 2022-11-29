package bc;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class a2 {

    /* renamed from: a  reason: collision with root package name */
    public static final c f17255a = new c(null);

    /* loaded from: classes2.dex */
    public static final class a implements androidx.navigation.p {

        /* renamed from: a  reason: collision with root package name */
        public final String f17256a;

        /* renamed from: b  reason: collision with root package name */
        public final String f17257b;

        /* renamed from: c  reason: collision with root package name */
        public final String f17258c;

        /* renamed from: d  reason: collision with root package name */
        public final String f17259d;

        public a(String str, String str2, String str3, String str4) {
            jo.p.h(str, "title");
            jo.p.h(str2, "singerId");
            jo.p.h(str3, "referer");
            this.f17256a = str;
            this.f17257b = str2;
            this.f17258c = str3;
            this.f17259d = str4;
        }

        @Override // androidx.navigation.p
        public int a() {
            return xb.o.action_refine_artist;
        }

        @Override // androidx.navigation.p
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString("title", this.f17256a);
            bundle.putString("singer_id", this.f17257b);
            bundle.putString("referer", this.f17258c);
            bundle.putString("referer_singer_id", this.f17259d);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return jo.p.c(this.f17256a, aVar.f17256a) && jo.p.c(this.f17257b, aVar.f17257b) && jo.p.c(this.f17258c, aVar.f17258c) && jo.p.c(this.f17259d, aVar.f17259d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((((this.f17256a.hashCode() * 31) + this.f17257b.hashCode()) * 31) + this.f17258c.hashCode()) * 31;
            String str = this.f17259d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ActionRefineArtist(title=" + this.f17256a + ", singerId=" + this.f17257b + ", referer=" + this.f17258c + ", refererSingerId=" + this.f17259d + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements androidx.navigation.p {

        /* renamed from: a  reason: collision with root package name */
        public final String f17260a;

        /* renamed from: b  reason: collision with root package name */
        public final String f17261b;

        public b(String str, String str2) {
            jo.p.h(str, "title");
            jo.p.h(str2, "genreId");
            this.f17260a = str;
            this.f17261b = str2;
        }

        @Override // androidx.navigation.p
        public int a() {
            return xb.o.action_refine_genre;
        }

        @Override // androidx.navigation.p
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString("title", this.f17260a);
            bundle.putString("genre_id", this.f17261b);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return jo.p.c(this.f17260a, bVar.f17260a) && jo.p.c(this.f17261b, bVar.f17261b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f17260a.hashCode() * 31) + this.f17261b.hashCode();
        }

        public String toString() {
            return "ActionRefineGenre(title=" + this.f17260a + ", genreId=" + this.f17261b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(jo.h hVar) {
            this();
        }

        public static /* synthetic */ androidx.navigation.p b(c cVar, String str, String str2, String str3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "タイトル";
            }
            if ((i10 & 8) != 0) {
                str4 = null;
            }
            return cVar.a(str, str2, str3, str4);
        }

        public final androidx.navigation.p a(String str, String str2, String str3, String str4) {
            jo.p.h(str, "title");
            jo.p.h(str2, "singerId");
            jo.p.h(str3, "referer");
            return new a(str, str2, str3, str4);
        }

        public final androidx.navigation.p c(String str, String str2) {
            jo.p.h(str, "title");
            jo.p.h(str2, "genreId");
            return new b(str, str2);
        }

        public final androidx.navigation.p d() {
            return new androidx.navigation.a(xb.o.action_search);
        }
    }
}
