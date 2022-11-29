package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class j<TranscodeType> extends e8.a<j<TranscodeType>> {
    public static final e8.h DOWNLOAD_ONLY_OPTIONS = new e8.h().diskCacheStrategy(o7.j.f44187c).priority(h.LOW).skipMemoryCache(true);
    private final Context context;
    private j<TranscodeType> errorBuilder;
    private final c glide;
    private final e glideContext;
    private boolean isDefaultTransitionOptionsSet;
    private boolean isModelSet;
    private boolean isThumbnailBuilt;
    private Object model;
    private List<e8.g<TranscodeType>> requestListeners;
    private final k requestManager;
    private Float thumbSizeMultiplier;
    private j<TranscodeType> thumbnailBuilder;
    private final Class<TranscodeType> transcodeClass;
    private l<?, ? super TranscodeType> transitionOptions;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20108a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f20109b;

        static {
            int[] iArr = new int[h.values().length];
            f20109b = iArr;
            try {
                iArr[h.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20109b[h.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20109b[h.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20109b[h.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f20108a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20108a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20108a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20108a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20108a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20108a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20108a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f20108a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    public j(c cVar, k kVar, Class<TranscodeType> cls, Context context) {
        this.isDefaultTransitionOptionsSet = true;
        this.glide = cVar;
        this.requestManager = kVar;
        this.transcodeClass = cls;
        this.context = context;
        this.transitionOptions = kVar.getDefaultTransitionOptions(cls);
        this.glideContext = cVar.j();
        initRequestListeners(kVar.getDefaultRequestListeners());
        apply((e8.a<?>) kVar.getDefaultRequestOptions());
    }

    private e8.d buildRequest(f8.j<TranscodeType> jVar, e8.g<TranscodeType> gVar, e8.a<?> aVar, Executor executor) {
        return buildRequestRecursive(new Object(), jVar, gVar, null, this.transitionOptions, aVar.getPriority(), aVar.getOverrideWidth(), aVar.getOverrideHeight(), aVar, executor);
    }

    private e8.d buildRequestRecursive(Object obj, f8.j<TranscodeType> jVar, e8.g<TranscodeType> gVar, e8.e eVar, l<?, ? super TranscodeType> lVar, h hVar, int i10, int i11, e8.a<?> aVar, Executor executor) {
        e8.b bVar;
        e8.b bVar2;
        if (this.errorBuilder != null) {
            bVar2 = new e8.b(obj, eVar);
            bVar = bVar2;
        } else {
            bVar = null;
            bVar2 = eVar;
        }
        e8.d buildThumbnailRequestRecursive = buildThumbnailRequestRecursive(obj, jVar, gVar, bVar2, lVar, hVar, i10, i11, aVar, executor);
        if (bVar == null) {
            return buildThumbnailRequestRecursive;
        }
        int overrideWidth = this.errorBuilder.getOverrideWidth();
        int overrideHeight = this.errorBuilder.getOverrideHeight();
        if (i8.k.u(i10, i11) && !this.errorBuilder.isValidOverride()) {
            overrideWidth = aVar.getOverrideWidth();
            overrideHeight = aVar.getOverrideHeight();
        }
        j<TranscodeType> jVar2 = this.errorBuilder;
        e8.b bVar3 = bVar;
        bVar3.o(buildThumbnailRequestRecursive, jVar2.buildRequestRecursive(obj, jVar, gVar, bVar3, jVar2.transitionOptions, jVar2.getPriority(), overrideWidth, overrideHeight, this.errorBuilder, executor));
        return bVar3;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [e8.a] */
    private e8.d buildThumbnailRequestRecursive(Object obj, f8.j<TranscodeType> jVar, e8.g<TranscodeType> gVar, e8.e eVar, l<?, ? super TranscodeType> lVar, h hVar, int i10, int i11, e8.a<?> aVar, Executor executor) {
        h thumbnailPriority;
        j<TranscodeType> jVar2 = this.thumbnailBuilder;
        if (jVar2 != null) {
            if (!this.isThumbnailBuilt) {
                l<?, ? super TranscodeType> lVar2 = jVar2.isDefaultTransitionOptionsSet ? lVar : jVar2.transitionOptions;
                if (jVar2.isPrioritySet()) {
                    thumbnailPriority = this.thumbnailBuilder.getPriority();
                } else {
                    thumbnailPriority = getThumbnailPriority(hVar);
                }
                h hVar2 = thumbnailPriority;
                int overrideWidth = this.thumbnailBuilder.getOverrideWidth();
                int overrideHeight = this.thumbnailBuilder.getOverrideHeight();
                if (i8.k.u(i10, i11) && !this.thumbnailBuilder.isValidOverride()) {
                    overrideWidth = aVar.getOverrideWidth();
                    overrideHeight = aVar.getOverrideHeight();
                }
                e8.k kVar = new e8.k(obj, eVar);
                e8.d obtainRequest = obtainRequest(obj, jVar, gVar, aVar, kVar, lVar, hVar, i10, i11, executor);
                this.isThumbnailBuilt = true;
                j<TranscodeType> jVar3 = this.thumbnailBuilder;
                e8.d buildRequestRecursive = jVar3.buildRequestRecursive(obj, jVar, gVar, kVar, lVar2, hVar2, overrideWidth, overrideHeight, jVar3, executor);
                this.isThumbnailBuilt = false;
                kVar.n(obtainRequest, buildRequestRecursive);
                return kVar;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.thumbSizeMultiplier != null) {
            e8.k kVar2 = new e8.k(obj, eVar);
            kVar2.n(obtainRequest(obj, jVar, gVar, aVar, kVar2, lVar, hVar, i10, i11, executor), obtainRequest(obj, jVar, gVar, aVar.m30clone().sizeMultiplier(this.thumbSizeMultiplier.floatValue()), kVar2, lVar, getThumbnailPriority(hVar), i10, i11, executor));
            return kVar2;
        } else {
            return obtainRequest(obj, jVar, gVar, aVar, eVar, lVar, hVar, i10, i11, executor);
        }
    }

    private j<TranscodeType> cloneWithNullErrorAndThumbnail() {
        return clone().error((j) null).thumbnail((j) null);
    }

    private h getThumbnailPriority(h hVar) {
        int i10 = a.f20109b[hVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3 && i10 != 4) {
                    throw new IllegalArgumentException("unknown priority: " + getPriority());
                }
                return h.IMMEDIATE;
            }
            return h.HIGH;
        }
        return h.NORMAL;
    }

    @SuppressLint({"CheckResult"})
    private void initRequestListeners(List<e8.g<Object>> list) {
        for (e8.g<Object> gVar : list) {
            addListener(gVar);
        }
    }

    private boolean isSkipMemoryCacheWithCompletePreviousRequest(e8.a<?> aVar, e8.d dVar) {
        return !aVar.isMemoryCacheable() && dVar.g();
    }

    private j<TranscodeType> loadGeneric(Object obj) {
        if (isAutoCloneEnabled()) {
            return clone().loadGeneric(obj);
        }
        this.model = obj;
        this.isModelSet = true;
        return selfOrThrowIfLocked();
    }

    private e8.d obtainRequest(Object obj, f8.j<TranscodeType> jVar, e8.g<TranscodeType> gVar, e8.a<?> aVar, e8.e eVar, l<?, ? super TranscodeType> lVar, h hVar, int i10, int i11, Executor executor) {
        Context context = this.context;
        e eVar2 = this.glideContext;
        return e8.j.x(context, eVar2, obj, this.model, this.transcodeClass, aVar, i10, i11, hVar, jVar, gVar, this.requestListeners, eVar, eVar2.f(), lVar.c(), executor);
    }

    public j<TranscodeType> addListener(e8.g<TranscodeType> gVar) {
        if (isAutoCloneEnabled()) {
            return clone().addListener(gVar);
        }
        if (gVar != null) {
            if (this.requestListeners == null) {
                this.requestListeners = new ArrayList();
            }
            this.requestListeners.add(gVar);
        }
        return selfOrThrowIfLocked();
    }

    @Override // e8.a
    public /* bridge */ /* synthetic */ e8.a apply(e8.a aVar) {
        return apply((e8.a<?>) aVar);
    }

    @Deprecated
    public <Y extends f8.j<File>> Y downloadOnly(Y y10) {
        return (Y) getDownloadOnlyRequest().into((j<File>) y10);
    }

    public j<TranscodeType> error(j<TranscodeType> jVar) {
        if (isAutoCloneEnabled()) {
            return clone().error((j) jVar);
        }
        this.errorBuilder = jVar;
        return selfOrThrowIfLocked();
    }

    public j<File> getDownloadOnlyRequest() {
        return new j(File.class, this).apply((e8.a<?>) DOWNLOAD_ONLY_OPTIONS);
    }

    public <Y extends f8.j<TranscodeType>> Y into(Y y10) {
        return (Y) into(y10, null, i8.e.b());
    }

    public j<TranscodeType> listener(e8.g<TranscodeType> gVar) {
        if (isAutoCloneEnabled()) {
            return clone().listener(gVar);
        }
        this.requestListeners = null;
        return addListener(gVar);
    }

    public f8.j<TranscodeType> preload(int i10, int i11) {
        return into((j<TranscodeType>) f8.h.c(this.requestManager, i10, i11));
    }

    public e8.c<TranscodeType> submit() {
        return submit(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public j<TranscodeType> thumbnail(j<TranscodeType> jVar) {
        if (isAutoCloneEnabled()) {
            return clone().thumbnail(jVar);
        }
        this.thumbnailBuilder = jVar;
        return selfOrThrowIfLocked();
    }

    public j<TranscodeType> transition(l<?, ? super TranscodeType> lVar) {
        if (isAutoCloneEnabled()) {
            return clone().transition(lVar);
        }
        this.transitionOptions = (l) i8.j.d(lVar);
        this.isDefaultTransitionOptionsSet = false;
        return selfOrThrowIfLocked();
    }

    @Override // e8.a
    public j<TranscodeType> apply(e8.a<?> aVar) {
        i8.j.d(aVar);
        return (j) super.apply(aVar);
    }

    @Deprecated
    public e8.c<File> downloadOnly(int i10, int i11) {
        return getDownloadOnlyRequest().submit(i10, i11);
    }

    public <Y extends f8.j<TranscodeType>> Y into(Y y10, e8.g<TranscodeType> gVar, Executor executor) {
        return (Y) into(y10, gVar, this, executor);
    }

    public e8.c<TranscodeType> submit(int i10, int i11) {
        e8.f fVar = new e8.f(i10, i11);
        return (e8.c) into(fVar, fVar, i8.e.a());
    }

    private <Y extends f8.j<TranscodeType>> Y into(Y y10, e8.g<TranscodeType> gVar, e8.a<?> aVar, Executor executor) {
        i8.j.d(y10);
        if (this.isModelSet) {
            e8.d buildRequest = buildRequest(y10, gVar, aVar, executor);
            e8.d b10 = y10.b();
            if (buildRequest.h(b10) && !isSkipMemoryCacheWithCompletePreviousRequest(aVar, b10)) {
                if (!((e8.d) i8.j.d(b10)).isRunning()) {
                    b10.i();
                }
                return y10;
            }
            this.requestManager.clear((f8.j<?>) y10);
            y10.j(buildRequest);
            this.requestManager.track(y10, buildRequest);
            return y10;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    @Override // e8.a
    public j<TranscodeType> clone() {
        j<TranscodeType> jVar = (j) super.m30clone();
        jVar.transitionOptions = (l<?, ? super TranscodeType>) jVar.transitionOptions.clone();
        if (jVar.requestListeners != null) {
            jVar.requestListeners = new ArrayList(jVar.requestListeners);
        }
        j<TranscodeType> jVar2 = jVar.thumbnailBuilder;
        if (jVar2 != null) {
            jVar.thumbnailBuilder = jVar2.clone();
        }
        j<TranscodeType> jVar3 = jVar.errorBuilder;
        if (jVar3 != null) {
            jVar.errorBuilder = jVar3.clone();
        }
        return jVar;
    }

    public f8.j<TranscodeType> preload() {
        return preload(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public j<TranscodeType> error(Object obj) {
        if (obj == null) {
            return error((j) null);
        }
        return error((j) cloneWithNullErrorAndThumbnail().m5load(obj));
    }

    public j<TranscodeType> thumbnail(j<TranscodeType>... jVarArr) {
        if (jVarArr != null && jVarArr.length != 0) {
            return thumbnail(Arrays.asList(jVarArr));
        }
        return thumbnail((j) null);
    }

    public j<TranscodeType> thumbnail(List<j<TranscodeType>> list) {
        j<TranscodeType> jVar = null;
        if (list != null && !list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                j<TranscodeType> jVar2 = list.get(size);
                if (jVar2 != null) {
                    jVar = jVar == null ? jVar2 : jVar2.thumbnail(jVar);
                }
            }
            return thumbnail(jVar);
        }
        return thumbnail((j) null);
    }

    /* renamed from: load */
    public j<TranscodeType> m5load(Object obj) {
        return loadGeneric(obj);
    }

    @SuppressLint({"CheckResult"})
    public j(Class<TranscodeType> cls, j<?> jVar) {
        this(jVar.glide, jVar.requestManager, cls, jVar.context);
        this.model = jVar.model;
        this.isModelSet = jVar.isModelSet;
        apply((e8.a<?>) jVar);
    }

    /* renamed from: load */
    public j<TranscodeType> m0load(Bitmap bitmap) {
        return loadGeneric(bitmap).apply((e8.a<?>) e8.h.diskCacheStrategyOf(o7.j.f44186b));
    }

    /* renamed from: load */
    public j<TranscodeType> m1load(Drawable drawable) {
        return loadGeneric(drawable).apply((e8.a<?>) e8.h.diskCacheStrategyOf(o7.j.f44186b));
    }

    /* renamed from: load */
    public j<TranscodeType> m6load(String str) {
        return loadGeneric(str);
    }

    /* renamed from: load */
    public j<TranscodeType> m2load(Uri uri) {
        return loadGeneric(uri);
    }

    public j<TranscodeType> thumbnail(float f10) {
        if (isAutoCloneEnabled()) {
            return clone().thumbnail(f10);
        }
        if (f10 >= 0.0f && f10 <= 1.0f) {
            this.thumbSizeMultiplier = Float.valueOf(f10);
            return selfOrThrowIfLocked();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    public f8.k<ImageView, TranscodeType> into(ImageView imageView) {
        j<TranscodeType> jVar;
        i8.k.b();
        i8.j.d(imageView);
        if (!isTransformationSet() && isTransformationAllowed() && imageView.getScaleType() != null) {
            switch (a.f20108a[imageView.getScaleType().ordinal()]) {
                case 1:
                    jVar = m30clone().optionalCenterCrop();
                    break;
                case 2:
                    jVar = m30clone().optionalCenterInside();
                    break;
                case 3:
                case 4:
                case 5:
                    jVar = m30clone().optionalFitCenter();
                    break;
                case 6:
                    jVar = m30clone().optionalCenterInside();
                    break;
            }
            return (f8.k) into(this.glideContext.a(imageView, this.transcodeClass), null, jVar, i8.e.b());
        }
        jVar = this;
        return (f8.k) into(this.glideContext.a(imageView, this.transcodeClass), null, jVar, i8.e.b());
    }

    /* renamed from: load */
    public j<TranscodeType> m3load(File file) {
        return loadGeneric(file);
    }

    /* renamed from: load */
    public j<TranscodeType> m4load(Integer num) {
        return loadGeneric(num).apply((e8.a<?>) e8.h.signatureOf(h8.a.c(this.context)));
    }

    @Deprecated
    /* renamed from: load */
    public j<TranscodeType> m7load(URL url) {
        return loadGeneric(url);
    }

    /* renamed from: load */
    public j<TranscodeType> m8load(byte[] bArr) {
        j<TranscodeType> loadGeneric = loadGeneric(bArr);
        if (!loadGeneric.isDiskCacheStrategySet()) {
            loadGeneric = loadGeneric.apply((e8.a<?>) e8.h.diskCacheStrategyOf(o7.j.f44186b));
        }
        return !loadGeneric.isSkipMemoryCacheSet() ? loadGeneric.apply((e8.a<?>) e8.h.skipMemoryCacheOf(true)) : loadGeneric;
    }

    @Deprecated
    public e8.c<TranscodeType> into(int i10, int i11) {
        return submit(i10, i11);
    }
}
