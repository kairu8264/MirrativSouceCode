package d6;

import android.graphics.drawable.Drawable;
import jo.p;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f29204a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f29205b;

    /* renamed from: c  reason: collision with root package name */
    public final a6.d f29206c;

    public f(Drawable drawable, boolean z10, a6.d dVar) {
        super(null);
        this.f29204a = drawable;
        this.f29205b = z10;
        this.f29206c = dVar;
    }

    public final a6.d a() {
        return this.f29206c;
    }

    public final Drawable b() {
        return this.f29204a;
    }

    public final boolean c() {
        return this.f29205b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (p.c(this.f29204a, fVar.f29204a) && this.f29205b == fVar.f29205b && this.f29206c == fVar.f29206c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f29204a.hashCode() * 31) + Boolean.hashCode(this.f29205b)) * 31) + this.f29206c.hashCode();
    }
}
