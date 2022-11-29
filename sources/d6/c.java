package d6;

import a6.r;
import d6.h;
import j6.m;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f29198a;

    /* renamed from: b  reason: collision with root package name */
    public final m f29199b;

    /* loaded from: classes.dex */
    public static final class a implements h.a<ByteBuffer> {
        @Override // d6.h.a
        /* renamed from: b */
        public h a(ByteBuffer byteBuffer, m mVar, x5.e eVar) {
            return new c(byteBuffer, mVar);
        }
    }

    public c(ByteBuffer byteBuffer, m mVar) {
        this.f29198a = byteBuffer;
        this.f29199b = mVar;
    }

    @Override // d6.h
    public Object a(ao.d<? super g> dVar) {
        try {
            rp.c cVar = new rp.c();
            cVar.write(this.f29198a);
            this.f29198a.position(0);
            return new l(r.a(cVar, this.f29199b.g()), null, a6.d.MEMORY);
        } catch (Throwable th2) {
            this.f29198a.position(0);
            throw th2;
        }
    }
}
