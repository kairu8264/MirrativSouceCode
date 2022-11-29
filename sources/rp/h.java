package rp;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f51688a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f51689b;

    /* renamed from: c  reason: collision with root package name */
    public final y f51690c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f51691d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f51692e;

    /* renamed from: f  reason: collision with root package name */
    public final Long f51693f;

    /* renamed from: g  reason: collision with root package name */
    public final Long f51694g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<qo.b<?>, Object> f51695h;

    public h(boolean z10, boolean z11, y yVar, Long l10, Long l11, Long l12, Long l13, Map<qo.b<?>, ? extends Object> map) {
        jo.p.h(map, "extras");
        this.f51688a = z10;
        this.f51689b = z11;
        this.f51690c = yVar;
        this.f51691d = l10;
        this.f51692e = l11;
        this.f51693f = l12;
        this.f51694g = l13;
        this.f51695h = xn.n0.n(map);
    }

    public final h a(boolean z10, boolean z11, y yVar, Long l10, Long l11, Long l12, Long l13, Map<qo.b<?>, ? extends Object> map) {
        jo.p.h(map, "extras");
        return new h(z10, z11, yVar, l10, l11, l12, l13, map);
    }

    public final Long c() {
        return this.f51693f;
    }

    public final Long d() {
        return this.f51691d;
    }

    public final y e() {
        return this.f51690c;
    }

    public final boolean f() {
        return this.f51689b;
    }

    public final boolean g() {
        return this.f51688a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f51688a) {
            arrayList.add("isRegularFile");
        }
        if (this.f51689b) {
            arrayList.add("isDirectory");
        }
        Long l10 = this.f51691d;
        if (l10 != null) {
            arrayList.add(jo.p.o("byteCount=", l10));
        }
        Long l11 = this.f51692e;
        if (l11 != null) {
            arrayList.add(jo.p.o("createdAt=", l11));
        }
        Long l12 = this.f51693f;
        if (l12 != null) {
            arrayList.add(jo.p.o("lastModifiedAt=", l12));
        }
        Long l13 = this.f51694g;
        if (l13 != null) {
            arrayList.add(jo.p.o("lastAccessedAt=", l13));
        }
        if (!this.f51695h.isEmpty()) {
            arrayList.add(jo.p.o("extras=", this.f51695h));
        }
        return xn.a0.g0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ h(boolean z10, boolean z11, y yVar, Long l10, Long l11, Long l12, Long l13, Map map, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) == 0 ? z11 : false, (i10 & 4) != 0 ? null : yVar, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : l12, (i10 & 64) == 0 ? l13 : null, (i10 & 128) != 0 ? xn.n0.e() : map);
    }
}
