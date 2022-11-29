package ai;

import android.location.Location;
import java.util.Date;
import java.util.Set;

/* loaded from: classes3.dex */
public final class q90 implements ah.e {

    /* renamed from: a  reason: collision with root package name */
    public final Date f8851a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8852b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<String> f8853c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8854d;

    /* renamed from: e  reason: collision with root package name */
    public final Location f8855e;

    /* renamed from: f  reason: collision with root package name */
    public final int f8856f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8857g;

    /* renamed from: h  reason: collision with root package name */
    public final String f8858h;

    public q90(Date date, int i10, Set<String> set, Location location, boolean z10, int i11, boolean z11, int i12, String str) {
        this.f8851a = date;
        this.f8852b = i10;
        this.f8853c = set;
        this.f8855e = location;
        this.f8854d = z10;
        this.f8856f = i11;
        this.f8857g = z11;
        this.f8858h = str;
    }

    @Override // ah.e
    @Deprecated
    public final Date a() {
        return this.f8851a;
    }

    @Override // ah.e
    public final int c() {
        return this.f8856f;
    }

    @Override // ah.e
    @Deprecated
    public final boolean d() {
        return this.f8857g;
    }

    @Override // ah.e
    public final boolean e() {
        return this.f8854d;
    }

    @Override // ah.e
    @Deprecated
    public final int g() {
        return this.f8852b;
    }

    @Override // ah.e
    public final Set<String> i() {
        return this.f8853c;
    }

    @Override // ah.e
    public final Location j() {
        return this.f8855e;
    }
}
