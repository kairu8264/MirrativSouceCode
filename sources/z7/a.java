package z7;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import i7.a;
import i8.k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public class a implements m7.j<ByteBuffer, c> {

    /* renamed from: f  reason: collision with root package name */
    public static final C1082a f62597f = new C1082a();

    /* renamed from: g  reason: collision with root package name */
    public static final b f62598g = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Context f62599a;

    /* renamed from: b  reason: collision with root package name */
    public final List<ImageHeaderParser> f62600b;

    /* renamed from: c  reason: collision with root package name */
    public final b f62601c;

    /* renamed from: d  reason: collision with root package name */
    public final C1082a f62602d;

    /* renamed from: e  reason: collision with root package name */
    public final z7.b f62603e;

    /* renamed from: z7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C1082a {
        public i7.a a(a.InterfaceC0463a interfaceC0463a, i7.c cVar, ByteBuffer byteBuffer, int i10) {
            return new i7.e(interfaceC0463a, cVar, byteBuffer, i10);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Queue<i7.d> f62604a = k.f(0);

        public synchronized i7.d a(ByteBuffer byteBuffer) {
            i7.d poll;
            poll = this.f62604a.poll();
            if (poll == null) {
                poll = new i7.d();
            }
            return poll.p(byteBuffer);
        }

        public synchronized void b(i7.d dVar) {
            dVar.a();
            this.f62604a.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, p7.e eVar, p7.b bVar) {
        this(context, list, eVar, bVar, f62598g, f62597f);
    }

    public static int e(i7.c cVar, int i10, int i11) {
        int min = Math.min(cVar.a() / i11, cVar.d() / i10);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i10 + "x" + i11 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return max;
    }

    public final e c(ByteBuffer byteBuffer, int i10, int i11, i7.d dVar, m7.h hVar) {
        Bitmap.Config config;
        long b10 = i8.f.b();
        try {
            i7.c c10 = dVar.c();
            if (c10.b() > 0 && c10.c() == 0) {
                if (hVar.c(i.f62635a) == m7.b.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                i7.a a10 = this.f62602d.a(this.f62603e, c10, byteBuffer, e(c10, i10, i11));
                a10.c(config);
                a10.a();
                Bitmap nextFrame = a10.getNextFrame();
                if (nextFrame == null) {
                    return null;
                }
                e eVar = new e(new c(this.f62599a, a10, u7.c.c(), i10, i11, nextFrame));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + i8.f.a(b10));
                }
                return eVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + i8.f.a(b10));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + i8.f.a(b10));
            }
        }
    }

    @Override // m7.j
    /* renamed from: d */
    public e b(ByteBuffer byteBuffer, int i10, int i11, m7.h hVar) {
        i7.d a10 = this.f62601c.a(byteBuffer);
        try {
            return c(byteBuffer, i10, i11, a10, hVar);
        } finally {
            this.f62601c.b(a10);
        }
    }

    @Override // m7.j
    /* renamed from: f */
    public boolean a(ByteBuffer byteBuffer, m7.h hVar) throws IOException {
        return !((Boolean) hVar.c(i.f62636b)).booleanValue() && com.bumptech.glide.load.a.f(this.f62600b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public a(Context context, List<ImageHeaderParser> list, p7.e eVar, p7.b bVar, b bVar2, C1082a c1082a) {
        this.f62599a = context.getApplicationContext();
        this.f62600b = list;
        this.f62602d = c1082a;
        this.f62603e = new z7.b(eVar, bVar);
        this.f62601c = bVar2;
    }
}
