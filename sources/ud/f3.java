package ud;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class f3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f54929a;

    /* renamed from: b  reason: collision with root package name */
    public final Drawable f54930b;

    public f3(String str, Drawable drawable) {
        jo.p.h(str, "imageUrl");
        this.f54929a = str;
        this.f54930b = drawable;
    }

    public final Drawable a() {
        return this.f54930b;
    }

    public final String b() {
        return this.f54929a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f3) {
            f3 f3Var = (f3) obj;
            return jo.p.c(this.f54929a, f3Var.f54929a) && jo.p.c(this.f54930b, f3Var.f54930b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f54929a.hashCode() * 31;
        Drawable drawable = this.f54930b;
        return hashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    public String toString() {
        return "ProfileImageBindModel(imageUrl=" + this.f54929a + ", frameImageDrawable=" + this.f54930b + ')';
    }
}
