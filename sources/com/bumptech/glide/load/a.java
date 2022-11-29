package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import v7.w;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: com.bumptech.glide.load.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0176a implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ InputStream f20115a;

        public C0176a(InputStream inputStream) {
            this.f20115a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.f20115a);
            } finally {
                this.f20115a.reset();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f20116a;

        public b(ByteBuffer byteBuffer) {
            this.f20116a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.b(this.f20116a);
        }
    }

    /* loaded from: classes.dex */
    public class c implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptorRewinder f20117a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p7.b f20118b;

        public c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, p7.b bVar) {
            this.f20117a = parcelFileDescriptorRewinder;
            this.f20118b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            w wVar;
            w wVar2 = null;
            try {
                wVar = new w(new FileInputStream(this.f20117a.a().getFileDescriptor()), this.f20118b);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                ImageHeaderParser.ImageType c10 = imageHeaderParser.c(wVar);
                try {
                    wVar.close();
                } catch (IOException unused) {
                }
                this.f20117a.a();
                return c10;
            } catch (Throwable th3) {
                th = th3;
                wVar2 = wVar;
                if (wVar2 != null) {
                    try {
                        wVar2.close();
                    } catch (IOException unused2) {
                    }
                }
                this.f20117a.a();
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ InputStream f20119a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p7.b f20120b;

        public d(InputStream inputStream, p7.b bVar) {
            this.f20119a = inputStream;
            this.f20120b = bVar;
        }

        @Override // com.bumptech.glide.load.a.f
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.a(this.f20119a, this.f20120b);
            } finally {
                this.f20119a.reset();
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptorRewinder f20121a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p7.b f20122b;

        public e(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, p7.b bVar) {
            this.f20121a = parcelFileDescriptorRewinder;
            this.f20122b = bVar;
        }

        @Override // com.bumptech.glide.load.a.f
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            w wVar;
            w wVar2 = null;
            try {
                wVar = new w(new FileInputStream(this.f20121a.a().getFileDescriptor()), this.f20122b);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                int a10 = imageHeaderParser.a(wVar, this.f20122b);
                try {
                    wVar.close();
                } catch (IOException unused) {
                }
                this.f20121a.a();
                return a10;
            } catch (Throwable th3) {
                th = th3;
                wVar2 = wVar;
                if (wVar2 != null) {
                    try {
                        wVar2.close();
                    } catch (IOException unused2) {
                    }
                }
                this.f20121a.a();
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* loaded from: classes.dex */
    public interface g {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    public static int a(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, p7.b bVar) throws IOException {
        return c(list, new e(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(List<ImageHeaderParser> list, InputStream inputStream, p7.b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return c(list, new d(inputStream, bVar));
    }

    public static int c(List<ImageHeaderParser> list, f fVar) throws IOException {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int a10 = fVar.a(list.get(i10));
            if (a10 != -1) {
                return a10;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType d(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, p7.b bVar) throws IOException {
        return g(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType e(List<ImageHeaderParser> list, InputStream inputStream, p7.b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return g(list, new C0176a(inputStream));
    }

    public static ImageHeaderParser.ImageType f(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return g(list, new b(byteBuffer));
    }

    public static ImageHeaderParser.ImageType g(List<ImageHeaderParser> list, g gVar) throws IOException {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType a10 = gVar.a(list.get(i10));
            if (a10 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a10;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
