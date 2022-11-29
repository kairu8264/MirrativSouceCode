package t7;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import m7.h;
import s7.n;
import s7.o;
import s7.r;

/* loaded from: classes.dex */
public final class d<DataT> implements n<Uri, DataT> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f53253a;

    /* renamed from: b  reason: collision with root package name */
    public final n<File, DataT> f53254b;

    /* renamed from: c  reason: collision with root package name */
    public final n<Uri, DataT> f53255c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<DataT> f53256d;

    /* loaded from: classes.dex */
    public static abstract class a<DataT> implements o<Uri, DataT> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f53257a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<DataT> f53258b;

        public a(Context context, Class<DataT> cls) {
            this.f53257a = context;
            this.f53258b = cls;
        }

        @Override // s7.o
        public final void a() {
        }

        @Override // s7.o
        public final n<Uri, DataT> c(r rVar) {
            return new d(this.f53257a, rVar.d(File.class, this.f53258b), rVar.d(Uri.class, this.f53258b), this.f53258b);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: t7.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0822d<DataT> implements com.bumptech.glide.load.data.d<DataT> {
        public static final String[] G = {"_data"};
        public final int A;
        public final int B;
        public final h C;
        public final Class<DataT> D;
        public volatile boolean E;
        public volatile com.bumptech.glide.load.data.d<DataT> F;

        /* renamed from: w  reason: collision with root package name */
        public final Context f53259w;

        /* renamed from: x  reason: collision with root package name */
        public final n<File, DataT> f53260x;

        /* renamed from: y  reason: collision with root package name */
        public final n<Uri, DataT> f53261y;

        /* renamed from: z  reason: collision with root package name */
        public final Uri f53262z;

        public C0822d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i10, int i11, h hVar, Class<DataT> cls) {
            this.f53259w = context.getApplicationContext();
            this.f53260x = nVar;
            this.f53261y = nVar2;
            this.f53262z = uri;
            this.A = i10;
            this.B = i11;
            this.C = hVar;
            this.D = cls;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<DataT> a() {
            return this.D;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.F;
            if (dVar != null) {
                dVar.b();
            }
        }

        public final n.a<DataT> c() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.f53260x.b(h(this.f53262z), this.A, this.B, this.C);
            }
            return this.f53261y.b(g() ? MediaStore.setRequireOriginal(this.f53262z) : this.f53262z, this.A, this.B, this.C);
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.E = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.F;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public m7.a d() {
            return m7.a.LOCAL;
        }

        public final com.bumptech.glide.load.data.d<DataT> e() throws FileNotFoundException {
            n.a<DataT> c10 = c();
            if (c10 != null) {
                return c10.f52266c;
            }
            return null;
        }

        @Override // com.bumptech.glide.load.data.d
        public void f(com.bumptech.glide.h hVar, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> e10 = e();
                if (e10 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f53262z));
                    return;
                }
                this.F = e10;
                if (this.E) {
                    cancel();
                } else {
                    e10.f(hVar, aVar);
                }
            } catch (FileNotFoundException e11) {
                aVar.c(e11);
            }
        }

        public final boolean g() {
            return this.f53259w.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        public final File h(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor query = this.f53259w.getContentResolver().query(uri, G, null, null, null);
                if (query != null && query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndexOrThrow("_data"));
                    if (!TextUtils.isEmpty(string)) {
                        File file = new File(string);
                        query.close();
                        return file;
                    }
                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th2;
            }
        }
    }

    public d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f53253a = context.getApplicationContext();
        this.f53254b = nVar;
        this.f53255c = nVar2;
        this.f53256d = cls;
    }

    @Override // s7.n
    /* renamed from: c */
    public n.a<DataT> b(Uri uri, int i10, int i11, h hVar) {
        return new n.a<>(new h8.d(uri), new C0822d(this.f53253a, this.f53254b, this.f53255c, uri, i10, i11, hVar, this.f53256d));
    }

    @Override // s7.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && n7.b.b(uri);
    }
}
