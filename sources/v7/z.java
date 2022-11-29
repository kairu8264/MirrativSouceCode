package v7;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import v7.m;

/* loaded from: classes.dex */
public class z implements m7.j<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final m f56914a;

    /* renamed from: b  reason: collision with root package name */
    public final p7.b f56915b;

    /* loaded from: classes.dex */
    public static class a implements m.b {

        /* renamed from: a  reason: collision with root package name */
        public final w f56916a;

        /* renamed from: b  reason: collision with root package name */
        public final i8.d f56917b;

        public a(w wVar, i8.d dVar) {
            this.f56916a = wVar;
            this.f56917b = dVar;
        }

        @Override // v7.m.b
        public void a() {
            this.f56916a.c();
        }

        @Override // v7.m.b
        public void b(p7.e eVar, Bitmap bitmap) throws IOException {
            IOException a10 = this.f56917b.a();
            if (a10 != null) {
                if (bitmap != null) {
                    eVar.c(bitmap);
                }
                throw a10;
            }
        }
    }

    public z(m mVar, p7.b bVar) {
        this.f56914a = mVar;
        this.f56915b = bVar;
    }

    @Override // m7.j
    /* renamed from: c */
    public o7.u<Bitmap> b(InputStream inputStream, int i10, int i11, m7.h hVar) throws IOException {
        boolean z10;
        w wVar;
        if (inputStream instanceof w) {
            wVar = (w) inputStream;
            z10 = false;
        } else {
            z10 = true;
            wVar = new w(inputStream, this.f56915b);
        }
        i8.d c10 = i8.d.c(wVar);
        try {
            return this.f56914a.f(new i8.h(c10), i10, i11, hVar, new a(wVar, c10));
        } finally {
            c10.d();
            if (z10) {
                wVar.d();
            }
        }
    }

    @Override // m7.j
    /* renamed from: d */
    public boolean a(InputStream inputStream, m7.h hVar) {
        return this.f56914a.p(inputStream);
    }
}
