package v7;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import m7.g;

/* loaded from: classes.dex */
public class c0<T> implements m7.j<T, Bitmap> {

    /* renamed from: d  reason: collision with root package name */
    public static final m7.g<Long> f56840d = m7.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e  reason: collision with root package name */
    public static final m7.g<Integer> f56841e = m7.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f  reason: collision with root package name */
    public static final e f56842f = new e();

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f56843a;

    /* renamed from: b  reason: collision with root package name */
    public final p7.e f56844b;

    /* renamed from: c  reason: collision with root package name */
    public final e f56845c;

    /* loaded from: classes.dex */
    public class a implements g.b<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f56846a = ByteBuffer.allocate(8);

        @Override // m7.g.b
        /* renamed from: b */
        public void a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f56846a) {
                this.f56846a.position(0);
                messageDigest.update(this.f56846a.putLong(l10.longValue()).array());
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements g.b<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f56847a = ByteBuffer.allocate(4);

        @Override // m7.g.b
        /* renamed from: b */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f56847a) {
                this.f56847a.position(0);
                messageDigest.update(this.f56847a.putInt(num.intValue()).array());
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements f<AssetFileDescriptor> {
        public c() {
        }

        @Override // v7.c0.f
        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements f<ByteBuffer> {

        /* loaded from: classes.dex */
        public class a extends MediaDataSource {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ByteBuffer f56848w;

            public a(ByteBuffer byteBuffer) {
                this.f56848w = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f56848w.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= this.f56848w.limit()) {
                    return -1;
                }
                this.f56848w.position((int) j10);
                int min = Math.min(i11, this.f56848w.remaining());
                this.f56848w.get(bArr, i10, min);
                return min;
            }
        }

        @Override // v7.c0.f
        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new a(byteBuffer));
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    /* loaded from: classes.dex */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    /* loaded from: classes.dex */
    public static final class g implements f<ParcelFileDescriptor> {
        @Override // v7.c0.f
        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends RuntimeException {
        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public c0(p7.e eVar, f<T> fVar) {
        this(eVar, fVar, f56842f);
    }

    public static m7.j<AssetFileDescriptor, Bitmap> c(p7.e eVar) {
        return new c0(eVar, new c(null));
    }

    public static m7.j<ByteBuffer, Bitmap> d(p7.e eVar) {
        return new c0(eVar, new d());
    }

    public static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, l lVar) {
        Bitmap g10 = (Build.VERSION.SDK_INT < 27 || i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || lVar == l.f56863f) ? null : g(mediaMetadataRetriever, j10, i10, i11, i12, lVar);
        if (g10 == null) {
            g10 = f(mediaMetadataRetriever, j10, i10);
        }
        if (g10 != null) {
            return g10;
        }
        throw new h();
    }

    public static Bitmap f(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }

    @TargetApi(27)
    public static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, l lVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float b10 = lVar.b(parseInt, parseInt2, i11, i12);
            return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(parseInt * b10), Math.round(b10 * parseInt2));
        } catch (Throwable th2) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th2);
                return null;
            }
            return null;
        }
    }

    public static m7.j<ParcelFileDescriptor, Bitmap> h(p7.e eVar) {
        return new c0(eVar, new g());
    }

    @Override // m7.j
    public boolean a(T t10, m7.h hVar) {
        return true;
    }

    @Override // m7.j
    public o7.u<Bitmap> b(T t10, int i10, int i11, m7.h hVar) throws IOException {
        long longValue = ((Long) hVar.c(f56840d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) hVar.c(f56841e);
        if (num == null) {
            num = 2;
        }
        l lVar = (l) hVar.c(l.f56865h);
        if (lVar == null) {
            lVar = l.f56864g;
        }
        l lVar2 = lVar;
        MediaMetadataRetriever a10 = this.f56845c.a();
        try {
            this.f56843a.a(a10, t10);
            Bitmap e10 = e(a10, longValue, num.intValue(), i10, i11, lVar2);
            a10.release();
            return v7.e.f(e10, this.f56844b);
        } catch (Throwable th2) {
            a10.release();
            throw th2;
        }
    }

    public c0(p7.e eVar, f<T> fVar, e eVar2) {
        this.f56844b = eVar;
        this.f56843a = fVar;
        this.f56845c = eVar2;
    }
}
