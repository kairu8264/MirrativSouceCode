package s7;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import s7.n;

/* loaded from: classes.dex */
public class w<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f52297b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a  reason: collision with root package name */
    public final c<Data> f52298a;

    /* loaded from: classes.dex */
    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f52299a;

        public a(ContentResolver contentResolver) {
            this.f52299a = contentResolver;
        }

        @Override // s7.o
        public void a() {
        }

        @Override // s7.w.c
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> b(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f52299a, uri);
        }

        @Override // s7.o
        public n<Uri, AssetFileDescriptor> c(r rVar) {
            return new w(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f52300a;

        public b(ContentResolver contentResolver) {
            this.f52300a = contentResolver;
        }

        @Override // s7.o
        public void a() {
        }

        @Override // s7.w.c
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> b(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f52300a, uri);
        }

        @Override // s7.o
        public n<Uri, ParcelFileDescriptor> c(r rVar) {
            return new w(this);
        }
    }

    /* loaded from: classes.dex */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> b(Uri uri);
    }

    /* loaded from: classes.dex */
    public static class d implements o<Uri, InputStream>, c<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f52301a;

        public d(ContentResolver contentResolver) {
            this.f52301a = contentResolver;
        }

        @Override // s7.o
        public void a() {
        }

        @Override // s7.w.c
        public com.bumptech.glide.load.data.d<InputStream> b(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f52301a, uri);
        }

        @Override // s7.o
        public n<Uri, InputStream> c(r rVar) {
            return new w(this);
        }
    }

    public w(c<Data> cVar) {
        this.f52298a = cVar;
    }

    @Override // s7.n
    /* renamed from: c */
    public n.a<Data> b(Uri uri, int i10, int i11, m7.h hVar) {
        return new n.a<>(new h8.d(uri), this.f52298a.b(uri));
    }

    @Override // s7.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return f52297b.contains(uri.getScheme());
    }
}
