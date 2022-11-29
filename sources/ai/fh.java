package ai;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class fh implements cj {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f4026a;

    /* renamed from: b  reason: collision with root package name */
    public final ui f4027b;

    /* renamed from: c  reason: collision with root package name */
    public final gh f4028c;

    /* renamed from: d  reason: collision with root package name */
    public final hj f4029d;

    /* renamed from: e  reason: collision with root package name */
    public final re f4030e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f4031f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4032g;

    /* renamed from: h  reason: collision with root package name */
    public long f4033h;

    /* renamed from: i  reason: collision with root package name */
    public long f4034i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ih f4035j;

    public fh(ih ihVar, Uri uri, ui uiVar, gh ghVar, hj hjVar) {
        this.f4035j = ihVar;
        Objects.requireNonNull(uri);
        this.f4026a = uri;
        Objects.requireNonNull(uiVar);
        this.f4027b = uiVar;
        Objects.requireNonNull(ghVar);
        this.f4028c = ghVar;
        this.f4029d = hjVar;
        this.f4030e = new re();
        this.f4032g = true;
        this.f4034i = -1L;
    }

    @Override // ai.cj
    public final void b() {
        this.f4031f = true;
    }

    @Override // ai.cj
    public final void c() throws IOException, InterruptedException {
        le leVar;
        long j10;
        while (!this.f4031f) {
            int i10 = 0;
            try {
                long j11 = this.f4030e.f9411a;
                long f10 = this.f4027b.f(new vi(this.f4026a, null, j11, j11, -1L, null, 0));
                this.f4034i = f10;
                if (f10 != -1) {
                    j10 = j11;
                    f10 += j10;
                    this.f4034i = f10;
                } else {
                    j10 = j11;
                }
                leVar = new le(this.f4027b, j10, f10);
                try {
                    me b10 = this.f4028c.b(leVar, this.f4027b.b());
                    if (this.f4032g) {
                        b10.g(j10, this.f4033h);
                        this.f4032g = false;
                    }
                    int i11 = 0;
                    long j12 = j10;
                    while (true) {
                        if (i11 != 0) {
                            break;
                        }
                        try {
                            if (this.f4031f) {
                                i11 = 0;
                                break;
                            }
                            this.f4029d.c();
                            i11 = b10.j(leVar, this.f4030e);
                            if (leVar.h() > ih.w(this.f4035j) + j12) {
                                j12 = leVar.h();
                                this.f4029d.b();
                                ih.y(this.f4035j).post(ih.x(this.f4035j));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i10 = i11;
                            if (i10 != 1 && leVar != null) {
                                this.f4030e.f9411a = leVar.h();
                            }
                            vj.c(this.f4027b);
                            throw th;
                        }
                    }
                    if (i11 != 1) {
                        this.f4030e.f9411a = leVar.h();
                        i10 = i11;
                    }
                    vj.c(this.f4027b);
                    if (i10 != 0) {
                        return;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                leVar = null;
            }
        }
    }

    @Override // ai.cj
    public final boolean d() {
        return this.f4031f;
    }

    public final void e(long j10, long j11) {
        this.f4030e.f9411a = j10;
        this.f4033h = j11;
        this.f4032g = true;
    }
}
