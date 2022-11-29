package v7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public interface s {

    /* loaded from: classes.dex */
    public static final class a implements s {

        /* renamed from: a  reason: collision with root package name */
        public final com.bumptech.glide.load.data.k f56896a;

        /* renamed from: b  reason: collision with root package name */
        public final p7.b f56897b;

        /* renamed from: c  reason: collision with root package name */
        public final List<ImageHeaderParser> f56898c;

        public a(InputStream inputStream, List<ImageHeaderParser> list, p7.b bVar) {
            this.f56897b = (p7.b) i8.j.d(bVar);
            this.f56898c = (List) i8.j.d(list);
            this.f56896a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // v7.s
        public Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f56896a.a(), null, options);
        }

        @Override // v7.s
        public void b() {
            this.f56896a.c();
        }

        @Override // v7.s
        public int c() throws IOException {
            return com.bumptech.glide.load.a.b(this.f56898c, this.f56896a.a(), this.f56897b);
        }

        @Override // v7.s
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.e(this.f56898c, this.f56896a.a(), this.f56897b);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements s {

        /* renamed from: a  reason: collision with root package name */
        public final p7.b f56899a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ImageHeaderParser> f56900b;

        /* renamed from: c  reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f56901c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, p7.b bVar) {
            this.f56899a = (p7.b) i8.j.d(bVar);
            this.f56900b = (List) i8.j.d(list);
            this.f56901c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // v7.s
        public Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f56901c.a().getFileDescriptor(), null, options);
        }

        @Override // v7.s
        public void b() {
        }

        @Override // v7.s
        public int c() throws IOException {
            return com.bumptech.glide.load.a.a(this.f56900b, this.f56901c, this.f56899a);
        }

        @Override // v7.s
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.d(this.f56900b, this.f56901c, this.f56899a);
        }
    }

    Bitmap a(BitmapFactory.Options options) throws IOException;

    void b();

    int c() throws IOException;

    ImageHeaderParser.ImageType d() throws IOException;
}
