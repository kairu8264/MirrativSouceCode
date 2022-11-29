package bc;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class w2 implements androidx.navigation.f {

    /* renamed from: c  reason: collision with root package name */
    public static final a f17507c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f17508a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17509b;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final w2 a(Bundle bundle) {
            String str;
            jo.p.h(bundle, "bundle");
            bundle.setClassLoader(w2.class.getClassLoader());
            if (bundle.containsKey("title")) {
                str = bundle.getString("title");
                if (str == null) {
                    throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
                }
            } else {
                str = "タイトル";
            }
            if (bundle.containsKey("genre_id")) {
                String string = bundle.getString("genre_id");
                if (string != null) {
                    return new w2(str, string);
                }
                throw new IllegalArgumentException("Argument \"genre_id\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"genre_id\" is missing and does not have an android:defaultValue");
        }
    }

    public w2(String str, String str2) {
        jo.p.h(str, "title");
        jo.p.h(str2, "genreId");
        this.f17508a = str;
        this.f17509b = str2;
    }

    public static final w2 fromBundle(Bundle bundle) {
        return f17507c.a(bundle);
    }

    public final String a() {
        return this.f17509b;
    }

    public final String b() {
        return this.f17508a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w2) {
            w2 w2Var = (w2) obj;
            return jo.p.c(this.f17508a, w2Var.f17508a) && jo.p.c(this.f17509b, w2Var.f17509b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f17508a.hashCode() * 31) + this.f17509b.hashCode();
    }

    public String toString() {
        return "EmokaraSongsByGenreFragmentArgs(title=" + this.f17508a + ", genreId=" + this.f17509b + ')';
    }
}
