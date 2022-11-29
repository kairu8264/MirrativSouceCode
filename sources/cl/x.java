package cl;

import cl.c0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class x extends c0.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f19989a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19990b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19991c;

    /* renamed from: d  reason: collision with root package name */
    public final String f19992d;

    /* renamed from: e  reason: collision with root package name */
    public final int f19993e;

    /* renamed from: f  reason: collision with root package name */
    public final xk.e f19994f;

    public x(String str, String str2, String str3, String str4, int i10, xk.e eVar) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.f19989a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.f19990b = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.f19991c = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.f19992d = str4;
        this.f19993e = i10;
        Objects.requireNonNull(eVar, "Null developmentPlatformProvider");
        this.f19994f = eVar;
    }

    @Override // cl.c0.a
    public String a() {
        return this.f19989a;
    }

    @Override // cl.c0.a
    public int c() {
        return this.f19993e;
    }

    @Override // cl.c0.a
    public xk.e d() {
        return this.f19994f;
    }

    @Override // cl.c0.a
    public String e() {
        return this.f19992d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0.a) {
            c0.a aVar = (c0.a) obj;
            return this.f19989a.equals(aVar.a()) && this.f19990b.equals(aVar.f()) && this.f19991c.equals(aVar.g()) && this.f19992d.equals(aVar.e()) && this.f19993e == aVar.c() && this.f19994f.equals(aVar.d());
        }
        return false;
    }

    @Override // cl.c0.a
    public String f() {
        return this.f19990b;
    }

    @Override // cl.c0.a
    public String g() {
        return this.f19991c;
    }

    public int hashCode() {
        return ((((((((((this.f19989a.hashCode() ^ 1000003) * 1000003) ^ this.f19990b.hashCode()) * 1000003) ^ this.f19991c.hashCode()) * 1000003) ^ this.f19992d.hashCode()) * 1000003) ^ this.f19993e) * 1000003) ^ this.f19994f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f19989a + ", versionCode=" + this.f19990b + ", versionName=" + this.f19991c + ", installUuid=" + this.f19992d + ", deliveryMechanism=" + this.f19993e + ", developmentPlatformProvider=" + this.f19994f + "}";
    }
}
