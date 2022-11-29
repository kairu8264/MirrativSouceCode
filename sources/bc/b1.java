package bc;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f17267a = new b(null);

    /* loaded from: classes2.dex */
    public static final class a implements androidx.navigation.p {

        /* renamed from: a  reason: collision with root package name */
        public final String f17268a;

        /* renamed from: b  reason: collision with root package name */
        public final String f17269b;

        /* renamed from: c  reason: collision with root package name */
        public final String f17270c;

        /* renamed from: d  reason: collision with root package name */
        public final String f17271d;

        public a(String str, String str2, String str3, String str4) {
            jo.p.h(str, "title");
            jo.p.h(str2, "singerId");
            jo.p.h(str3, "referer");
            this.f17268a = str;
            this.f17269b = str2;
            this.f17270c = str3;
            this.f17271d = str4;
        }

        @Override // androidx.navigation.p
        public int a() {
            return xb.o.action_refine_artist_from_search;
        }

        @Override // androidx.navigation.p
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString("title", this.f17268a);
            bundle.putString("singer_id", this.f17269b);
            bundle.putString("referer", this.f17270c);
            bundle.putString("referer_singer_id", this.f17271d);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return jo.p.c(this.f17268a, aVar.f17268a) && jo.p.c(this.f17269b, aVar.f17269b) && jo.p.c(this.f17270c, aVar.f17270c) && jo.p.c(this.f17271d, aVar.f17271d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((((this.f17268a.hashCode() * 31) + this.f17269b.hashCode()) * 31) + this.f17270c.hashCode()) * 31;
            String str = this.f17271d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ActionRefineArtistFromSearch(title=" + this.f17268a + ", singerId=" + this.f17269b + ", referer=" + this.f17270c + ", refererSingerId=" + this.f17271d + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }

        public static /* synthetic */ androidx.navigation.p b(b bVar, String str, String str2, String str3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "タイトル";
            }
            if ((i10 & 8) != 0) {
                str4 = null;
            }
            return bVar.a(str, str2, str3, str4);
        }

        public final androidx.navigation.p a(String str, String str2, String str3, String str4) {
            jo.p.h(str, "title");
            jo.p.h(str2, "singerId");
            jo.p.h(str3, "referer");
            return new a(str, str2, str3, str4);
        }
    }
}
