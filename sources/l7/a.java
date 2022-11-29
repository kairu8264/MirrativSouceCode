package l7;

import android.graphics.Bitmap;
import com.bumptech.glide.integration.webp.WebpImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o7.u;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d  reason: collision with root package name */
    public static final m7.g<Boolean> f39606d = m7.g.f("com.bumptech.glide.integration.webp.decoder.AnimatedWebpBitmapDecoder.DisableBitmap", Boolean.FALSE);

    /* renamed from: a  reason: collision with root package name */
    public final p7.b f39607a;

    /* renamed from: b  reason: collision with root package name */
    public final p7.e f39608b;

    /* renamed from: c  reason: collision with root package name */
    public final z7.b f39609c;

    public a(p7.b bVar, p7.e eVar) {
        this.f39607a = bVar;
        this.f39608b = eVar;
        this.f39609c = new z7.b(eVar, bVar);
    }

    public u<Bitmap> a(InputStream inputStream, int i10, int i11, m7.h hVar) throws IOException {
        byte[] b10 = h.b(inputStream);
        if (b10 == null) {
            return null;
        }
        return b(ByteBuffer.wrap(b10), i10, i11, hVar);
    }

    public u<Bitmap> b(ByteBuffer byteBuffer, int i10, int i11, m7.h hVar) throws IOException {
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr, 0, remaining);
        WebpImage create = WebpImage.create(bArr);
        i iVar = new i(this.f39609c, create, byteBuffer, h.a(create.getWidth(), create.getHeight(), i10, i11));
        try {
            iVar.a();
            return v7.e.f(iVar.getNextFrame(), this.f39608b);
        } finally {
            iVar.clear();
        }
    }

    public boolean c(InputStream inputStream, m7.h hVar) throws IOException {
        if (((Boolean) hVar.c(f39606d)).booleanValue()) {
            return false;
        }
        return com.bumptech.glide.integration.webp.a.e(com.bumptech.glide.integration.webp.a.b(inputStream, this.f39607a));
    }

    public boolean d(ByteBuffer byteBuffer, m7.h hVar) throws IOException {
        if (((Boolean) hVar.c(f39606d)).booleanValue()) {
            return false;
        }
        return com.bumptech.glide.integration.webp.a.e(com.bumptech.glide.integration.webp.a.c(byteBuffer));
    }
}
