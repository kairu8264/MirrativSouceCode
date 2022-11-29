package com.bumptech.glide.integration.webp;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import i8.j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import v7.w;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f20101a = f();

    /* renamed from: com.bumptech.glide.integration.webp.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0175a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f20102a;

        /* renamed from: b  reason: collision with root package name */
        public final int f20103b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20104c;

        /* renamed from: d  reason: collision with root package name */
        public int f20105d;

        public C0175a(byte[] bArr, int i10, int i11) {
            this.f20102a = bArr;
            this.f20103b = i10;
            this.f20104c = i11;
            this.f20105d = i10;
        }

        @Override // com.bumptech.glide.integration.webp.a.c
        public long k(long j10) throws IOException {
            int min = (int) Math.min((this.f20103b + this.f20104c) - this.f20105d, j10);
            this.f20105d += min;
            return min;
        }

        @Override // com.bumptech.glide.integration.webp.a.c
        public int l() throws IOException {
            return ((m() << 8) & 65280) | (m() & 255);
        }

        @Override // com.bumptech.glide.integration.webp.a.c
        public int m() throws IOException {
            int i10 = this.f20105d;
            if (i10 >= this.f20103b + this.f20104c) {
                return -1;
            }
            byte[] bArr = this.f20102a;
            this.f20105d = i10 + 1;
            return bArr[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f20106a;

        public b(ByteBuffer byteBuffer) {
            this.f20106a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.integration.webp.a.c
        public long k(long j10) throws IOException {
            int min = (int) Math.min(this.f20106a.remaining(), j10);
            ByteBuffer byteBuffer = this.f20106a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }

        @Override // com.bumptech.glide.integration.webp.a.c
        public int l() throws IOException {
            return ((m() << 8) & 65280) | (m() & 255);
        }

        @Override // com.bumptech.glide.integration.webp.a.c
        public int m() throws IOException {
            if (this.f20106a.remaining() < 1) {
                return -1;
            }
            return this.f20106a.get();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        long k(long j10) throws IOException;

        int l() throws IOException;

        int m() throws IOException;
    }

    /* loaded from: classes.dex */
    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f20107a;

        public d(InputStream inputStream) {
            this.f20107a = inputStream;
        }

        @Override // com.bumptech.glide.integration.webp.a.c
        public long k(long j10) throws IOException {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f20107a.skip(j11);
                if (skip <= 0) {
                    if (this.f20107a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }

        @Override // com.bumptech.glide.integration.webp.a.c
        public int l() throws IOException {
            return ((this.f20107a.read() << 8) & 65280) | (this.f20107a.read() & 255);
        }

        @Override // com.bumptech.glide.integration.webp.a.c
        public int m() throws IOException {
            return this.f20107a.read();
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        WEBP_SIMPLE(false, false),
        WEBP_LOSSLESS(false, false),
        WEBP_LOSSLESS_WITH_ALPHA(true, false),
        WEBP_EXTENDED(false, false),
        WEBP_EXTENDED_WITH_ALPHA(true, false),
        WEBP_EXTENDED_ANIMATED(false, true),
        NONE_WEBP(false, false);
        
        private final boolean hasAlpha;
        private final boolean hasAnimation;

        e(boolean z10, boolean z11) {
            this.hasAlpha = z10;
            this.hasAnimation = z11;
        }
    }

    public static e a(c cVar) throws IOException {
        if ((((cVar.l() << 16) & (-65536)) | (cVar.l() & 65535)) != 1380533830) {
            return e.NONE_WEBP;
        }
        cVar.k(4L);
        if ((((cVar.l() << 16) & (-65536)) | (cVar.l() & 65535)) != 1464156752) {
            return e.NONE_WEBP;
        }
        int l10 = ((cVar.l() << 16) & (-65536)) | (cVar.l() & 65535);
        if (l10 == 1448097824) {
            return e.WEBP_SIMPLE;
        }
        if (l10 == 1448097868) {
            cVar.k(4L);
            return (cVar.m() & 8) != 0 ? e.WEBP_LOSSLESS_WITH_ALPHA : e.WEBP_LOSSLESS;
        } else if (l10 == 1448097880) {
            cVar.k(4L);
            int m10 = cVar.m();
            if ((m10 & 2) != 0) {
                return e.WEBP_EXTENDED_ANIMATED;
            }
            if ((m10 & 16) != 0) {
                return e.WEBP_EXTENDED_WITH_ALPHA;
            }
            return e.WEBP_EXTENDED;
        } else {
            return e.NONE_WEBP;
        }
    }

    public static e b(InputStream inputStream, p7.b bVar) throws IOException {
        if (inputStream == null) {
            return e.NONE_WEBP;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(21);
        try {
            return a(new d((InputStream) j.d(inputStream)));
        } finally {
            inputStream.reset();
        }
    }

    public static e c(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return e.NONE_WEBP;
        }
        return a(new b((ByteBuffer) j.d(byteBuffer)));
    }

    public static e d(byte[] bArr, int i10, int i11) throws IOException {
        return a(new C0175a(bArr, i10, i11));
    }

    public static boolean e(e eVar) {
        return eVar == e.WEBP_EXTENDED_ANIMATED;
    }

    public static boolean f() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 17) {
            return false;
        }
        if (i10 == 17) {
            byte[] decode = Base64.decode("UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==", 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            if (options.outHeight != 1 || options.outWidth != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean g(e eVar) {
        return (eVar == e.NONE_WEBP || eVar == e.WEBP_SIMPLE) ? false : true;
    }

    public static boolean h(e eVar) {
        return eVar == e.WEBP_SIMPLE || eVar == e.WEBP_LOSSLESS || eVar == e.WEBP_LOSSLESS_WITH_ALPHA || eVar == e.WEBP_EXTENDED || eVar == e.WEBP_EXTENDED_WITH_ALPHA;
    }
}
