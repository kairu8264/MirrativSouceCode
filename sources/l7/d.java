package l7;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.integration.webp.WebpImage;
import java.io.IOException;
import java.nio.ByteBuffer;
import o7.u;

/* loaded from: classes.dex */
public class d implements m7.j<ByteBuffer, k> {

    /* renamed from: d  reason: collision with root package name */
    public static final m7.g<Boolean> f39612d = m7.g.f("com.bumptech.glide.integration.webp.decoder.ByteBufferWebpDecoder.DisableAnimation", Boolean.FALSE);

    /* renamed from: a  reason: collision with root package name */
    public final Context f39613a;

    /* renamed from: b  reason: collision with root package name */
    public final p7.e f39614b;

    /* renamed from: c  reason: collision with root package name */
    public final z7.b f39615c;

    public d(Context context, p7.b bVar, p7.e eVar) {
        this.f39613a = context.getApplicationContext();
        this.f39614b = eVar;
        this.f39615c = new z7.b(eVar, bVar);
    }

    @Override // m7.j
    /* renamed from: c */
    public u<k> b(ByteBuffer byteBuffer, int i10, int i11, m7.h hVar) throws IOException {
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr, 0, remaining);
        WebpImage create = WebpImage.create(bArr);
        i iVar = new i(this.f39615c, create, byteBuffer, h.a(create.getWidth(), create.getHeight(), i10, i11), (o) hVar.c(p.f39657t));
        iVar.a();
        Bitmap nextFrame = iVar.getNextFrame();
        if (nextFrame == null) {
            return null;
        }
        return new m(new k(this.f39613a, iVar, this.f39614b, u7.c.c(), i10, i11, nextFrame));
    }

    @Override // m7.j
    /* renamed from: d */
    public boolean a(ByteBuffer byteBuffer, m7.h hVar) throws IOException {
        if (((Boolean) hVar.c(f39612d)).booleanValue()) {
            return false;
        }
        return com.bumptech.glide.integration.webp.a.e(com.bumptech.glide.integration.webp.a.c(byteBuffer));
    }
}
