package n7;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class c implements com.bumptech.glide.load.data.d<InputStream> {

    /* renamed from: w  reason: collision with root package name */
    public final Uri f41594w;

    /* renamed from: x  reason: collision with root package name */
    public final e f41595x;

    /* renamed from: y  reason: collision with root package name */
    public InputStream f41596y;

    /* loaded from: classes.dex */
    public static class a implements d {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f41597b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f41598a;

        public a(ContentResolver contentResolver) {
            this.f41598a = contentResolver;
        }

        @Override // n7.d
        public Cursor a(Uri uri) {
            return this.f41598a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f41597b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements d {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f41599b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f41600a;

        public b(ContentResolver contentResolver) {
            this.f41600a = contentResolver;
        }

        @Override // n7.d
        public Cursor a(Uri uri) {
            return this.f41600a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f41599b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public c(Uri uri, e eVar) {
        this.f41594w = uri;
        this.f41595x = eVar;
    }

    public static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.c.d(context).m().g(), dVar, com.bumptech.glide.c.d(context).f(), context.getContentResolver()));
    }

    public static c e(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f41596y;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public m7.a d() {
        return m7.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void f(h hVar, d.a<? super InputStream> aVar) {
        try {
            InputStream h10 = h();
            this.f41596y = h10;
            aVar.e(h10);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.c(e10);
        }
    }

    public final InputStream h() throws FileNotFoundException {
        InputStream d10 = this.f41595x.d(this.f41594w);
        int a10 = d10 != null ? this.f41595x.a(this.f41594w) : -1;
        return a10 != -1 ? new g(d10, a10) : d10;
    }
}
