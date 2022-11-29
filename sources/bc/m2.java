package bc;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class m2 implements androidx.navigation.f {

    /* renamed from: e  reason: collision with root package name */
    public static final a f17383e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f17384a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17385b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17386c;

    /* renamed from: d  reason: collision with root package name */
    public final String f17387d;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final m2 a(Bundle bundle) {
            String str;
            jo.p.h(bundle, "bundle");
            bundle.setClassLoader(m2.class.getClassLoader());
            if (bundle.containsKey("title")) {
                str = bundle.getString("title");
                if (str == null) {
                    throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
                }
            } else {
                str = "タイトル";
            }
            if (bundle.containsKey("singer_id")) {
                String string = bundle.getString("singer_id");
                if (string != null) {
                    if (bundle.containsKey("referer")) {
                        String string2 = bundle.getString("referer");
                        if (string2 != null) {
                            return new m2(str, string, string2, bundle.containsKey("referer_singer_id") ? bundle.getString("referer_singer_id") : null);
                        }
                        throw new IllegalArgumentException("Argument \"referer\" is marked as non-null but was passed a null value.");
                    }
                    throw new IllegalArgumentException("Required argument \"referer\" is missing and does not have an android:defaultValue");
                }
                throw new IllegalArgumentException("Argument \"singer_id\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"singer_id\" is missing and does not have an android:defaultValue");
        }
    }

    public m2(String str, String str2, String str3, String str4) {
        jo.p.h(str, "title");
        jo.p.h(str2, "singerId");
        jo.p.h(str3, "referer");
        this.f17384a = str;
        this.f17385b = str2;
        this.f17386c = str3;
        this.f17387d = str4;
    }

    public static final m2 fromBundle(Bundle bundle) {
        return f17383e.a(bundle);
    }

    public final String a() {
        return this.f17386c;
    }

    public final String b() {
        return this.f17387d;
    }

    public final String c() {
        return this.f17385b;
    }

    public final String d() {
        return this.f17384a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m2) {
            m2 m2Var = (m2) obj;
            return jo.p.c(this.f17384a, m2Var.f17384a) && jo.p.c(this.f17385b, m2Var.f17385b) && jo.p.c(this.f17386c, m2Var.f17386c) && jo.p.c(this.f17387d, m2Var.f17387d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f17384a.hashCode() * 31) + this.f17385b.hashCode()) * 31) + this.f17386c.hashCode()) * 31;
        String str = this.f17387d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "EmokaraSongsByArtistFragmentArgs(title=" + this.f17384a + ", singerId=" + this.f17385b + ", referer=" + this.f17386c + ", refererSingerId=" + this.f17387d + ')';
    }
}
