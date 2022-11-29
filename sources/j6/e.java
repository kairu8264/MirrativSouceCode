package j6;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class e extends j {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f37145a;

    /* renamed from: b  reason: collision with root package name */
    public final i f37146b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f37147c;

    public e(Drawable drawable, i iVar, Throwable th2) {
        super(null);
        this.f37145a = drawable;
        this.f37146b = iVar;
        this.f37147c = th2;
    }

    @Override // j6.j
    public Drawable a() {
        return this.f37145a;
    }

    @Override // j6.j
    public i b() {
        return this.f37146b;
    }

    public final Throwable c() {
        return this.f37147c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (jo.p.c(a(), eVar.a()) && jo.p.c(b(), eVar.b()) && jo.p.c(this.f37147c, eVar.f37147c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Drawable a10 = a();
        return ((((a10 == null ? 0 : a10.hashCode()) * 31) + b().hashCode()) * 31) + this.f37147c.hashCode();
    }
}
