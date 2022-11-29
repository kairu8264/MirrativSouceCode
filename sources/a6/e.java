package a6;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f482a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f483b;

    public e(Drawable drawable, boolean z10) {
        this.f482a = drawable;
        this.f483b = z10;
    }

    public final Drawable a() {
        return this.f482a;
    }

    public final boolean b() {
        return this.f483b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (jo.p.c(this.f482a, eVar.f482a) && this.f483b == eVar.f483b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f482a.hashCode() * 31) + Boolean.hashCode(this.f483b);
    }
}
