package s7;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import s7.n;

/* loaded from: classes.dex */
public class a<Data> implements n<Uri, Data> {

    /* renamed from: c  reason: collision with root package name */
    public static final int f52214c = 22;

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f52215a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0797a<Data> f52216b;

    /* renamed from: s7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0797a<Data> {
        com.bumptech.glide.load.data.d<Data> b(AssetManager assetManager, String str);
    }

    /* loaded from: classes.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, InterfaceC0797a<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f52217a;

        public b(AssetManager assetManager) {
            this.f52217a = assetManager;
        }

        @Override // s7.o
        public void a() {
        }

        @Override // s7.a.InterfaceC0797a
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> b(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // s7.o
        public n<Uri, ParcelFileDescriptor> c(r rVar) {
            return new a(this.f52217a, this);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements o<Uri, InputStream>, InterfaceC0797a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f52218a;

        public c(AssetManager assetManager) {
            this.f52218a = assetManager;
        }

        @Override // s7.o
        public void a() {
        }

        @Override // s7.a.InterfaceC0797a
        public com.bumptech.glide.load.data.d<InputStream> b(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // s7.o
        public n<Uri, InputStream> c(r rVar) {
            return new a(this.f52218a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0797a<Data> interfaceC0797a) {
        this.f52215a = assetManager;
        this.f52216b = interfaceC0797a;
    }

    @Override // s7.n
    /* renamed from: c */
    public n.a<Data> b(Uri uri, int i10, int i11, m7.h hVar) {
        return new n.a<>(new h8.d(uri), this.f52216b.b(this.f52215a, uri.toString().substring(f52214c)));
    }

    @Override // s7.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
