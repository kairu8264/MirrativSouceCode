package a6;

import rp.f;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final rp.f f502a;

    /* renamed from: b  reason: collision with root package name */
    public static final rp.f f503b;

    /* renamed from: c  reason: collision with root package name */
    public static final rp.f f504c;

    /* renamed from: d  reason: collision with root package name */
    public static final rp.f f505d;

    /* renamed from: e  reason: collision with root package name */
    public static final rp.f f506e;

    /* renamed from: f  reason: collision with root package name */
    public static final rp.f f507f;

    /* renamed from: g  reason: collision with root package name */
    public static final rp.f f508g;

    /* renamed from: h  reason: collision with root package name */
    public static final rp.f f509h;

    /* renamed from: i  reason: collision with root package name */
    public static final rp.f f510i;

    static {
        f.a aVar = rp.f.f51677z;
        f502a = aVar.d("GIF87a");
        f503b = aVar.d("GIF89a");
        f504c = aVar.d("RIFF");
        f505d = aVar.d("WEBP");
        f506e = aVar.d("VP8X");
        f507f = aVar.d("ftyp");
        f508g = aVar.d("msf1");
        f509h = aVar.d("hevc");
        f510i = aVar.d("hevx");
    }

    public static final boolean a(f fVar, rp.e eVar) {
        return d(fVar, eVar) && (eVar.c1(8L, f508g) || eVar.c1(8L, f509h) || eVar.c1(8L, f510i));
    }

    public static final boolean b(f fVar, rp.e eVar) {
        return e(fVar, eVar) && eVar.c1(12L, f506e) && eVar.n0(17L) && ((byte) (eVar.l().n(16L) & 2)) > 0;
    }

    public static final boolean c(f fVar, rp.e eVar) {
        return eVar.c1(0L, f503b) || eVar.c1(0L, f502a);
    }

    public static final boolean d(f fVar, rp.e eVar) {
        return eVar.c1(4L, f507f);
    }

    public static final boolean e(f fVar, rp.e eVar) {
        return eVar.c1(0L, f504c) && eVar.c1(8L, f505d);
    }
}
