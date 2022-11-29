package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import b8.p;
import com.bumptech.glide.d;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s7.a;
import s7.b;
import s7.d;
import s7.e;
import s7.f;
import s7.k;
import s7.s;
import s7.u;
import s7.v;
import s7.w;
import s7.x;
import t7.a;
import t7.b;
import t7.c;
import t7.d;
import t7.e;
import v7.b0;
import v7.c0;
import v7.m;
import v7.r;
import v7.t;
import v7.v;
import v7.x;
import v7.z;
import w7.a;

/* loaded from: classes.dex */
public class c implements ComponentCallbacks2 {
    public static volatile c H;
    public static volatile boolean I;
    public final Registry A;
    public final p7.b B;
    public final p C;
    public final b8.d D;
    public final a F;

    /* renamed from: w  reason: collision with root package name */
    public final o7.k f20062w;

    /* renamed from: x  reason: collision with root package name */
    public final p7.e f20063x;

    /* renamed from: y  reason: collision with root package name */
    public final q7.h f20064y;

    /* renamed from: z  reason: collision with root package name */
    public final e f20065z;
    public final List<k> E = new ArrayList();
    public g G = g.NORMAL;

    /* loaded from: classes.dex */
    public interface a {
        e8.h a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [v7.h] */
    public c(Context context, o7.k kVar, q7.h hVar, p7.e eVar, p7.b bVar, p pVar, b8.d dVar, int i10, a aVar, Map<Class<?>, l<?, ?>> map, List<e8.g<Object>> list, f fVar) {
        m7.j zVar;
        v7.g gVar;
        this.f20062w = kVar;
        this.f20063x = eVar;
        this.B = bVar;
        this.f20064y = hVar;
        this.C = pVar;
        this.D = dVar;
        this.F = aVar;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.A = registry;
        registry.r(new DefaultImageHeaderParser());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 27) {
            registry.r(new v7.p());
        }
        List<ImageHeaderParser> g10 = registry.g();
        z7.a aVar2 = new z7.a(context, g10, eVar, bVar);
        m7.j<ParcelFileDescriptor, Bitmap> h10 = c0.h(eVar);
        m mVar = new m(registry.g(), resources.getDisplayMetrics(), eVar, bVar);
        if (fVar.a(d.b.class) && i11 >= 28) {
            zVar = new t();
            gVar = new v7.h();
        } else {
            v7.g gVar2 = new v7.g(mVar);
            zVar = new z(mVar, bVar);
            gVar = gVar2;
        }
        x7.d dVar2 = new x7.d(context);
        s.c cVar = new s.c(resources);
        s.d dVar3 = new s.d(resources);
        s.b bVar2 = new s.b(resources);
        s.a aVar3 = new s.a(resources);
        v7.c cVar2 = new v7.c(bVar);
        a8.a aVar4 = new a8.a();
        a8.d dVar4 = new a8.d();
        ContentResolver contentResolver = context.getContentResolver();
        registry.c(ByteBuffer.class, new s7.c()).c(InputStream.class, new s7.t(bVar)).e("Bitmap", ByteBuffer.class, Bitmap.class, gVar).e("Bitmap", InputStream.class, Bitmap.class, zVar);
        if (ParcelFileDescriptorRewinder.c()) {
            registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new v(mVar));
        }
        registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, h10).e("Bitmap", AssetFileDescriptor.class, Bitmap.class, c0.c(eVar)).b(Bitmap.class, Bitmap.class, v.a.b()).e("Bitmap", Bitmap.class, Bitmap.class, new b0()).d(Bitmap.class, cVar2).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new v7.a(resources, gVar)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new v7.a(resources, zVar)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new v7.a(resources, h10)).d(BitmapDrawable.class, new v7.b(eVar, cVar2)).e("Gif", InputStream.class, z7.c.class, new z7.j(g10, aVar2, bVar)).e("Gif", ByteBuffer.class, z7.c.class, aVar2).d(z7.c.class, new z7.d()).b(i7.a.class, i7.a.class, v.a.b()).e("Bitmap", i7.a.class, Bitmap.class, new z7.h(eVar)).a(Uri.class, Drawable.class, dVar2).a(Uri.class, Bitmap.class, new x(dVar2, eVar)).s(new a.C0956a()).b(File.class, ByteBuffer.class, new d.b()).b(File.class, InputStream.class, new f.e()).a(File.class, File.class, new y7.a()).b(File.class, ParcelFileDescriptor.class, new f.b()).b(File.class, File.class, v.a.b()).s(new k.a(bVar));
        if (ParcelFileDescriptorRewinder.c()) {
            registry.s(new ParcelFileDescriptorRewinder.a());
        }
        Class cls = Integer.TYPE;
        registry.b(cls, InputStream.class, cVar).b(cls, ParcelFileDescriptor.class, bVar2).b(Integer.class, InputStream.class, cVar).b(Integer.class, ParcelFileDescriptor.class, bVar2).b(Integer.class, Uri.class, dVar3).b(cls, AssetFileDescriptor.class, aVar3).b(Integer.class, AssetFileDescriptor.class, aVar3).b(cls, Uri.class, dVar3).b(String.class, InputStream.class, new e.c()).b(Uri.class, InputStream.class, new e.c()).b(String.class, InputStream.class, new u.c()).b(String.class, ParcelFileDescriptor.class, new u.b()).b(String.class, AssetFileDescriptor.class, new u.a()).b(Uri.class, InputStream.class, new a.c(context.getAssets())).b(Uri.class, ParcelFileDescriptor.class, new a.b(context.getAssets())).b(Uri.class, InputStream.class, new b.a(context)).b(Uri.class, InputStream.class, new c.a(context));
        if (i11 >= 29) {
            registry.b(Uri.class, InputStream.class, new d.c(context));
            registry.b(Uri.class, ParcelFileDescriptor.class, new d.b(context));
        }
        registry.b(Uri.class, InputStream.class, new w.d(contentResolver)).b(Uri.class, ParcelFileDescriptor.class, new w.b(contentResolver)).b(Uri.class, AssetFileDescriptor.class, new w.a(contentResolver)).b(Uri.class, InputStream.class, new x.a()).b(URL.class, InputStream.class, new e.a()).b(Uri.class, File.class, new k.a(context)).b(s7.g.class, InputStream.class, new a.C0821a()).b(byte[].class, ByteBuffer.class, new b.a()).b(byte[].class, InputStream.class, new b.d()).b(Uri.class, Uri.class, v.a.b()).b(Drawable.class, Drawable.class, v.a.b()).a(Drawable.class, Drawable.class, new x7.e()).t(Bitmap.class, BitmapDrawable.class, new a8.b(resources)).t(Bitmap.class, byte[].class, aVar4).t(Drawable.class, byte[].class, new a8.c(eVar, aVar4, dVar4)).t(z7.c.class, byte[].class, dVar4);
        if (i11 >= 23) {
            m7.j<ByteBuffer, Bitmap> d10 = c0.d(eVar);
            registry.a(ByteBuffer.class, Bitmap.class, d10);
            registry.a(ByteBuffer.class, BitmapDrawable.class, new v7.a(resources, d10));
        }
        this.f20065z = new e(context, bVar, registry, new f8.g(), aVar, map, list, kVar, fVar, i10);
    }

    @Deprecated
    public static k A(Fragment fragment) {
        return o(fragment.getActivity()).k(fragment);
    }

    public static k B(Context context) {
        return o(context).l(context);
    }

    public static k C(View view) {
        return o(view.getContext()).m(view);
    }

    public static k D(androidx.fragment.app.Fragment fragment) {
        return o(fragment.q0()).n(fragment);
    }

    public static k E(androidx.fragment.app.h hVar) {
        return o(hVar).o(hVar);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!I) {
            I = true;
            r(context, generatedAppGlideModule);
            I = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    public static void c() {
        r.b().j();
    }

    public static c d(Context context) {
        if (H == null) {
            GeneratedAppGlideModule e10 = e(context.getApplicationContext());
            synchronized (c.class) {
                if (H == null) {
                    a(context, e10);
                }
            }
        }
        return H;
    }

    public static GeneratedAppGlideModule e(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e10) {
            w(e10);
            return null;
        } catch (InstantiationException e11) {
            w(e11);
            return null;
        } catch (NoSuchMethodException e12) {
            w(e12);
            return null;
        } catch (InvocationTargetException e13) {
            w(e13);
            return null;
        }
    }

    public static File k(Context context) {
        return l(context, "image_manager_disk_cache");
    }

    public static File l(Context context, String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, str);
            if (file.isDirectory() || file.mkdirs()) {
                return file;
            }
            return null;
        }
        if (Log.isLoggable("Glide", 6)) {
            Log.e("Glide", "default disk cache dir is null");
        }
        return null;
    }

    public static p o(Context context) {
        i8.j.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return d(context).n();
    }

    public static void p(Context context, d dVar) {
        GeneratedAppGlideModule e10 = e(context);
        synchronized (c.class) {
            if (H != null) {
                v();
            }
            s(context, dVar, e10);
        }
    }

    @Deprecated
    public static synchronized void q(c cVar) {
        synchronized (c.class) {
            if (H != null) {
                v();
            }
            H = cVar;
        }
    }

    public static void r(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        s(context, new d(), generatedAppGlideModule);
    }

    public static void s(Context context, d dVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<c8.c> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.isManifestParsingEnabled()) {
            emptyList = new c8.e(applicationContext).a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.a().isEmpty()) {
            Set<Class<?>> a10 = generatedAppGlideModule.a();
            Iterator<c8.c> it = emptyList.iterator();
            while (it.hasNext()) {
                c8.c next = it.next();
                if (a10.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<c8.c> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        dVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.b() : null);
        for (c8.c cVar : emptyList) {
            cVar.applyOptions(applicationContext, dVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.applyOptions(applicationContext, dVar);
        }
        c a11 = dVar.a(applicationContext);
        for (c8.c cVar2 : emptyList) {
            try {
                cVar2.registerComponents(applicationContext, a11, a11.A);
            } catch (AbstractMethodError e10) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + cVar2.getClass().getName(), e10);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.registerComponents(applicationContext, a11, a11.A);
        }
        applicationContext.registerComponentCallbacks(a11);
        H = a11;
    }

    public static void v() {
        synchronized (c.class) {
            if (H != null) {
                H.i().getApplicationContext().unregisterComponentCallbacks(H);
                H.f20062w.l();
            }
            H = null;
        }
    }

    public static void w(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static k z(Activity activity) {
        return o(activity).j(activity);
    }

    public void b() {
        i8.k.b();
        this.f20064y.b();
        this.f20063x.b();
        this.B.b();
    }

    public p7.b f() {
        return this.B;
    }

    public p7.e g() {
        return this.f20063x;
    }

    public b8.d h() {
        return this.D;
    }

    public Context i() {
        return this.f20065z.getBaseContext();
    }

    public e j() {
        return this.f20065z;
    }

    public Registry m() {
        return this.A;
    }

    public p n() {
        return this.C;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        x(i10);
    }

    public void t(k kVar) {
        synchronized (this.E) {
            if (!this.E.contains(kVar)) {
                this.E.add(kVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public boolean u(f8.j<?> jVar) {
        synchronized (this.E) {
            for (k kVar : this.E) {
                if (kVar.untrack(jVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void x(int i10) {
        i8.k.b();
        synchronized (this.E) {
            for (k kVar : this.E) {
                kVar.onTrimMemory(i10);
            }
        }
        this.f20064y.a(i10);
        this.f20063x.a(i10);
        this.B.a(i10);
    }

    public void y(k kVar) {
        synchronized (this.E) {
            if (this.E.contains(kVar)) {
                this.E.remove(kVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }
}
