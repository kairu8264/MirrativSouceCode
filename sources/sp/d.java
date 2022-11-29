package sp;

import java.util.ArrayList;
import java.util.List;
import jo.p;
import rp.y;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final y f52808a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f52809b;

    /* renamed from: c  reason: collision with root package name */
    public final String f52810c;

    /* renamed from: d  reason: collision with root package name */
    public final long f52811d;

    /* renamed from: e  reason: collision with root package name */
    public final long f52812e;

    /* renamed from: f  reason: collision with root package name */
    public final long f52813f;

    /* renamed from: g  reason: collision with root package name */
    public final int f52814g;

    /* renamed from: h  reason: collision with root package name */
    public final Long f52815h;

    /* renamed from: i  reason: collision with root package name */
    public final long f52816i;

    /* renamed from: j  reason: collision with root package name */
    public final List<y> f52817j;

    public d(y yVar, boolean z10, String str, long j10, long j11, long j12, int i10, Long l10, long j13) {
        p.h(yVar, "canonicalPath");
        p.h(str, "comment");
        this.f52808a = yVar;
        this.f52809b = z10;
        this.f52810c = str;
        this.f52811d = j10;
        this.f52812e = j11;
        this.f52813f = j12;
        this.f52814g = i10;
        this.f52815h = l10;
        this.f52816i = j13;
        this.f52817j = new ArrayList();
    }

    public final y a() {
        return this.f52808a;
    }

    public final List<y> b() {
        return this.f52817j;
    }

    public final long c() {
        return this.f52812e;
    }

    public final int d() {
        return this.f52814g;
    }

    public final Long e() {
        return this.f52815h;
    }

    public final long f() {
        return this.f52816i;
    }

    public final long g() {
        return this.f52813f;
    }

    public final boolean h() {
        return this.f52809b;
    }

    public /* synthetic */ d(y yVar, boolean z10, String str, long j10, long j11, long j12, int i10, Long l10, long j13, int i11, jo.h hVar) {
        this(yVar, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? "" : str, (i11 & 8) != 0 ? -1L : j10, (i11 & 16) != 0 ? -1L : j11, (i11 & 32) != 0 ? -1L : j12, (i11 & 64) != 0 ? -1 : i10, (i11 & 128) != 0 ? null : l10, (i11 & 256) == 0 ? j13 : -1L);
    }
}
