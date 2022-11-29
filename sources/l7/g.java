package l7;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o7.u;

/* loaded from: classes.dex */
public class g implements m7.j<InputStream, k> {

    /* renamed from: c  reason: collision with root package name */
    public static final m7.g<Boolean> f39619c = m7.g.f("com.bumptech.glide.integration.webp.decoder.StreamWebpDecoder.DisableAnimation", Boolean.FALSE);

    /* renamed from: a  reason: collision with root package name */
    public final m7.j<ByteBuffer, k> f39620a;

    /* renamed from: b  reason: collision with root package name */
    public final p7.b f39621b;

    public g(m7.j<ByteBuffer, k> jVar, p7.b bVar) {
        this.f39620a = jVar;
        this.f39621b = bVar;
    }

    @Override // m7.j
    /* renamed from: c */
    public u<k> b(InputStream inputStream, int i10, int i11, m7.h hVar) throws IOException {
        byte[] b10 = h.b(inputStream);
        if (b10 == null) {
            return null;
        }
        return this.f39620a.b(ByteBuffer.wrap(b10), i10, i11, hVar);
    }

    @Override // m7.j
    /* renamed from: d */
    public boolean a(InputStream inputStream, m7.h hVar) throws IOException {
        if (((Boolean) hVar.c(f39619c)).booleanValue()) {
            return false;
        }
        return com.bumptech.glide.integration.webp.a.e(com.bumptech.glide.integration.webp.a.b(inputStream, this.f39621b));
    }
}
