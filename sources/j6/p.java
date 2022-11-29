package j6;

import android.graphics.drawable.Drawable;
import h6.c;

/* loaded from: classes.dex */
public final class p extends j {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f37229a;

    /* renamed from: b  reason: collision with root package name */
    public final i f37230b;

    /* renamed from: c  reason: collision with root package name */
    public final a6.d f37231c;

    /* renamed from: d  reason: collision with root package name */
    public final c.b f37232d;

    /* renamed from: e  reason: collision with root package name */
    public final String f37233e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f37234f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f37235g;

    public p(Drawable drawable, i iVar, a6.d dVar, c.b bVar, String str, boolean z10, boolean z11) {
        super(null);
        this.f37229a = drawable;
        this.f37230b = iVar;
        this.f37231c = dVar;
        this.f37232d = bVar;
        this.f37233e = str;
        this.f37234f = z10;
        this.f37235g = z11;
    }

    @Override // j6.j
    public Drawable a() {
        return this.f37229a;
    }

    @Override // j6.j
    public i b() {
        return this.f37230b;
    }

    public final a6.d c() {
        return this.f37231c;
    }

    public final boolean d() {
        return this.f37235g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (jo.p.c(a(), pVar.a()) && jo.p.c(b(), pVar.b()) && this.f37231c == pVar.f37231c && jo.p.c(this.f37232d, pVar.f37232d) && jo.p.c(this.f37233e, pVar.f37233e) && this.f37234f == pVar.f37234f && this.f37235g == pVar.f37235g) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((a().hashCode() * 31) + b().hashCode()) * 31) + this.f37231c.hashCode()) * 31;
        c.b bVar = this.f37232d;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f37233e;
        return ((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f37234f)) * 31) + Boolean.hashCode(this.f37235g);
    }
}
