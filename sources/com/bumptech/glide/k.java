package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import b8.c;
import b8.m;
import b8.q;
import b8.r;
import b8.t;
import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class k implements ComponentCallbacks2, m {
    private static final e8.h DECODE_TYPE_BITMAP = e8.h.decodeTypeOf(Bitmap.class).lock();
    private static final e8.h DECODE_TYPE_GIF = e8.h.decodeTypeOf(z7.c.class).lock();
    private static final e8.h DOWNLOAD_ONLY_OPTIONS = e8.h.diskCacheStrategyOf(o7.j.f44187c).priority(h.LOW).skipMemoryCache(true);
    private final Runnable addSelfToLifecycle;
    private final b8.c connectivityMonitor;
    public final Context context;
    private final CopyOnWriteArrayList<e8.g<Object>> defaultRequestListeners;
    public final com.bumptech.glide.c glide;
    public final b8.l lifecycle;
    private boolean pauseAllRequestsOnTrimMemoryModerate;
    private e8.h requestOptions;
    private final r requestTracker;
    private final t targetTracker;
    private final q treeNode;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            kVar.lifecycle.b(kVar);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends f8.d<View, Object> {
        public b(View view) {
            super(view);
        }

        @Override // f8.j
        public void e(Object obj, g8.b<? super Object> bVar) {
        }

        @Override // f8.d
        public void i(Drawable drawable) {
        }

        @Override // f8.j
        public void k(Drawable drawable) {
        }
    }

    /* loaded from: classes.dex */
    public class c implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public final r f20111a;

        public c(r rVar) {
            this.f20111a = rVar;
        }

        @Override // b8.c.a
        public void a(boolean z10) {
            if (z10) {
                synchronized (k.this) {
                    this.f20111a.f();
                }
            }
        }
    }

    public k(com.bumptech.glide.c cVar, b8.l lVar, q qVar, Context context) {
        this(cVar, lVar, qVar, new r(), cVar.h(), context);
    }

    private void untrackOrDelegate(f8.j<?> jVar) {
        boolean untrack = untrack(jVar);
        e8.d b10 = jVar.b();
        if (untrack || this.glide.u(jVar) || b10 == null) {
            return;
        }
        jVar.j(null);
        b10.clear();
    }

    private synchronized void updateRequestOptions(e8.h hVar) {
        this.requestOptions = this.requestOptions.apply(hVar);
    }

    public k addDefaultRequestListener(e8.g<Object> gVar) {
        this.defaultRequestListeners.add(gVar);
        return this;
    }

    public synchronized k applyDefaultRequestOptions(e8.h hVar) {
        updateRequestOptions(hVar);
        return this;
    }

    public <ResourceType> j<ResourceType> as(Class<ResourceType> cls) {
        return new j<>(this.glide, this, cls, this.context);
    }

    public j<Bitmap> asBitmap() {
        return as(Bitmap.class).apply((e8.a<?>) DECODE_TYPE_BITMAP);
    }

    public j<Drawable> asDrawable() {
        return as(Drawable.class);
    }

    public j<File> asFile() {
        return as(File.class).apply((e8.a<?>) e8.h.skipMemoryCacheOf(true));
    }

    public j<z7.c> asGif() {
        return as(z7.c.class).apply((e8.a<?>) DECODE_TYPE_GIF);
    }

    public void clear(View view) {
        clear(new b(view));
    }

    public j<File> download(Object obj) {
        return downloadOnly().m5load(obj);
    }

    public j<File> downloadOnly() {
        return as(File.class).apply((e8.a<?>) DOWNLOAD_ONLY_OPTIONS);
    }

    public List<e8.g<Object>> getDefaultRequestListeners() {
        return this.defaultRequestListeners;
    }

    public synchronized e8.h getDefaultRequestOptions() {
        return this.requestOptions;
    }

    public <T> l<?, T> getDefaultTransitionOptions(Class<T> cls) {
        return this.glide.j().e(cls);
    }

    public synchronized boolean isPaused() {
        return this.requestTracker.c();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // b8.m
    public synchronized void onDestroy() {
        this.targetTracker.onDestroy();
        for (f8.j<?> jVar : this.targetTracker.c()) {
            clear(jVar);
        }
        this.targetTracker.a();
        this.requestTracker.b();
        this.lifecycle.a(this);
        this.lifecycle.a(this.connectivityMonitor);
        i8.k.w(this.addSelfToLifecycle);
        this.glide.y(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // b8.m
    public synchronized void onStart() {
        resumeRequests();
        this.targetTracker.onStart();
    }

    @Override // b8.m
    public synchronized void onStop() {
        pauseRequests();
        this.targetTracker.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.pauseAllRequestsOnTrimMemoryModerate) {
            pauseAllRequestsRecursive();
        }
    }

    public synchronized void pauseAllRequests() {
        this.requestTracker.d();
    }

    public synchronized void pauseAllRequestsRecursive() {
        pauseAllRequests();
        for (k kVar : this.treeNode.a()) {
            kVar.pauseAllRequests();
        }
    }

    public synchronized void pauseRequests() {
        this.requestTracker.e();
    }

    public synchronized void pauseRequestsRecursive() {
        pauseRequests();
        for (k kVar : this.treeNode.a()) {
            kVar.pauseRequests();
        }
    }

    public synchronized void resumeRequests() {
        this.requestTracker.g();
    }

    public synchronized void resumeRequestsRecursive() {
        i8.k.b();
        resumeRequests();
        for (k kVar : this.treeNode.a()) {
            kVar.resumeRequests();
        }
    }

    public synchronized k setDefaultRequestOptions(e8.h hVar) {
        setRequestOptions(hVar);
        return this;
    }

    public void setPauseAllRequestsOnTrimMemoryModerate(boolean z10) {
        this.pauseAllRequestsOnTrimMemoryModerate = z10;
    }

    public synchronized void setRequestOptions(e8.h hVar) {
        this.requestOptions = hVar.m30clone().autoClone();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.requestTracker + ", treeNode=" + this.treeNode + "}";
    }

    public synchronized void track(f8.j<?> jVar, e8.d dVar) {
        this.targetTracker.h(jVar);
        this.requestTracker.h(dVar);
    }

    public synchronized boolean untrack(f8.j<?> jVar) {
        e8.d b10 = jVar.b();
        if (b10 == null) {
            return true;
        }
        if (this.requestTracker.a(b10)) {
            this.targetTracker.i(jVar);
            jVar.j(null);
            return true;
        }
        return false;
    }

    public void clear(f8.j<?> jVar) {
        if (jVar == null) {
            return;
        }
        untrackOrDelegate(jVar);
    }

    public k(com.bumptech.glide.c cVar, b8.l lVar, q qVar, r rVar, b8.d dVar, Context context) {
        this.targetTracker = new t();
        a aVar = new a();
        this.addSelfToLifecycle = aVar;
        this.glide = cVar;
        this.lifecycle = lVar;
        this.treeNode = qVar;
        this.requestTracker = rVar;
        this.context = context;
        b8.c a10 = dVar.a(context.getApplicationContext(), new c(rVar));
        this.connectivityMonitor = a10;
        if (i8.k.r()) {
            i8.k.v(aVar);
        } else {
            lVar.b(this);
        }
        lVar.b(a10);
        this.defaultRequestListeners = new CopyOnWriteArrayList<>(cVar.j().c());
        setRequestOptions(cVar.j().d());
        cVar.t(this);
    }

    /* renamed from: load */
    public j<Drawable> m9load(Bitmap bitmap) {
        return asDrawable().m0load(bitmap);
    }

    /* renamed from: load */
    public j<Drawable> m10load(Drawable drawable) {
        return asDrawable().m1load(drawable);
    }

    /* renamed from: load */
    public j<Drawable> m15load(String str) {
        return asDrawable().m6load(str);
    }

    /* renamed from: load */
    public j<Drawable> m11load(Uri uri) {
        return asDrawable().m2load(uri);
    }

    /* renamed from: load */
    public j<Drawable> m12load(File file) {
        return asDrawable().m3load(file);
    }

    /* renamed from: load */
    public j<Drawable> m13load(Integer num) {
        return asDrawable().m4load(num);
    }

    @Deprecated
    /* renamed from: load */
    public j<Drawable> m16load(URL url) {
        return asDrawable().m7load(url);
    }

    /* renamed from: load */
    public j<Drawable> m17load(byte[] bArr) {
        return asDrawable().m8load(bArr);
    }

    /* renamed from: load */
    public j<Drawable> m14load(Object obj) {
        return asDrawable().m5load(obj);
    }
}
