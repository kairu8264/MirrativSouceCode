package e8;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import e8.a;
import java.util.Map;
import m7.l;
import v7.c0;
import v7.m;
import v7.o;
import v7.q;

/* loaded from: classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    private static final int DISK_CACHE_STRATEGY = 4;
    private static final int ERROR_ID = 32;
    private static final int ERROR_PLACEHOLDER = 16;
    private static final int FALLBACK = 8192;
    private static final int FALLBACK_ID = 16384;
    private static final int IS_CACHEABLE = 256;
    private static final int ONLY_RETRIEVE_FROM_CACHE = 524288;
    private static final int OVERRIDE = 512;
    private static final int PLACEHOLDER = 64;
    private static final int PLACEHOLDER_ID = 128;
    private static final int PRIORITY = 8;
    private static final int RESOURCE_CLASS = 4096;
    private static final int SIGNATURE = 1024;
    private static final int SIZE_MULTIPLIER = 2;
    private static final int THEME = 32768;
    private static final int TRANSFORMATION = 2048;
    private static final int TRANSFORMATION_ALLOWED = 65536;
    private static final int TRANSFORMATION_REQUIRED = 131072;
    private static final int UNSET = -1;
    private static final int USE_ANIMATION_POOL = 1048576;
    private static final int USE_UNLIMITED_SOURCE_GENERATORS_POOL = 262144;
    private int errorId;
    private Drawable errorPlaceholder;
    private Drawable fallbackDrawable;
    private int fallbackId;
    private int fields;
    private boolean isAutoCloneEnabled;
    private boolean isLocked;
    private boolean isTransformationRequired;
    private boolean onlyRetrieveFromCache;
    private Drawable placeholderDrawable;
    private int placeholderId;
    private Resources.Theme theme;
    private boolean useAnimationPool;
    private boolean useUnlimitedSourceGeneratorsPool;
    private float sizeMultiplier = 1.0f;
    private o7.j diskCacheStrategy = o7.j.f44189e;
    private com.bumptech.glide.h priority = com.bumptech.glide.h.NORMAL;
    private boolean isCacheable = true;
    private int overrideHeight = -1;
    private int overrideWidth = -1;
    private m7.e signature = h8.c.c();
    private boolean isTransformationAllowed = true;
    private m7.h options = new m7.h();
    private Map<Class<?>, l<?>> transformations = new i8.b();
    private Class<?> resourceClass = Object.class;
    private boolean isScaleOnlyOrNoTransform = true;

    private boolean isSet(int i10) {
        return isSet(this.fields, i10);
    }

    private static boolean isSet(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    private T optionalScaleOnlyTransform(v7.l lVar, l<Bitmap> lVar2) {
        return scaleOnlyTransform(lVar, lVar2, false);
    }

    private T scaleOnlyTransform(v7.l lVar, l<Bitmap> lVar2) {
        return scaleOnlyTransform(lVar, lVar2, true);
    }

    private T self() {
        return this;
    }

    public T apply(a<?> aVar) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().apply(aVar);
        }
        if (isSet(aVar.fields, 2)) {
            this.sizeMultiplier = aVar.sizeMultiplier;
        }
        if (isSet(aVar.fields, USE_UNLIMITED_SOURCE_GENERATORS_POOL)) {
            this.useUnlimitedSourceGeneratorsPool = aVar.useUnlimitedSourceGeneratorsPool;
        }
        if (isSet(aVar.fields, 1048576)) {
            this.useAnimationPool = aVar.useAnimationPool;
        }
        if (isSet(aVar.fields, 4)) {
            this.diskCacheStrategy = aVar.diskCacheStrategy;
        }
        if (isSet(aVar.fields, 8)) {
            this.priority = aVar.priority;
        }
        if (isSet(aVar.fields, 16)) {
            this.errorPlaceholder = aVar.errorPlaceholder;
            this.errorId = 0;
            this.fields &= -33;
        }
        if (isSet(aVar.fields, 32)) {
            this.errorId = aVar.errorId;
            this.errorPlaceholder = null;
            this.fields &= -17;
        }
        if (isSet(aVar.fields, 64)) {
            this.placeholderDrawable = aVar.placeholderDrawable;
            this.placeholderId = 0;
            this.fields &= -129;
        }
        if (isSet(aVar.fields, 128)) {
            this.placeholderId = aVar.placeholderId;
            this.placeholderDrawable = null;
            this.fields &= -65;
        }
        if (isSet(aVar.fields, 256)) {
            this.isCacheable = aVar.isCacheable;
        }
        if (isSet(aVar.fields, 512)) {
            this.overrideWidth = aVar.overrideWidth;
            this.overrideHeight = aVar.overrideHeight;
        }
        if (isSet(aVar.fields, 1024)) {
            this.signature = aVar.signature;
        }
        if (isSet(aVar.fields, 4096)) {
            this.resourceClass = aVar.resourceClass;
        }
        if (isSet(aVar.fields, 8192)) {
            this.fallbackDrawable = aVar.fallbackDrawable;
            this.fallbackId = 0;
            this.fields &= -16385;
        }
        if (isSet(aVar.fields, 16384)) {
            this.fallbackId = aVar.fallbackId;
            this.fallbackDrawable = null;
            this.fields &= -8193;
        }
        if (isSet(aVar.fields, THEME)) {
            this.theme = aVar.theme;
        }
        if (isSet(aVar.fields, 65536)) {
            this.isTransformationAllowed = aVar.isTransformationAllowed;
        }
        if (isSet(aVar.fields, 131072)) {
            this.isTransformationRequired = aVar.isTransformationRequired;
        }
        if (isSet(aVar.fields, 2048)) {
            this.transformations.putAll(aVar.transformations);
            this.isScaleOnlyOrNoTransform = aVar.isScaleOnlyOrNoTransform;
        }
        if (isSet(aVar.fields, ONLY_RETRIEVE_FROM_CACHE)) {
            this.onlyRetrieveFromCache = aVar.onlyRetrieveFromCache;
        }
        if (!this.isTransformationAllowed) {
            this.transformations.clear();
            int i10 = this.fields & (-2049);
            this.fields = i10;
            this.isTransformationRequired = false;
            this.fields = i10 & (-131073);
            this.isScaleOnlyOrNoTransform = true;
        }
        this.fields |= aVar.fields;
        this.options.d(aVar.options);
        return selfOrThrowIfLocked();
    }

    public T autoClone() {
        if (this.isLocked && !this.isAutoCloneEnabled) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.isAutoCloneEnabled = true;
        return lock();
    }

    public T centerCrop() {
        return transform(v7.l.f56862e, new v7.i());
    }

    public T centerInside() {
        return scaleOnlyTransform(v7.l.f56861d, new v7.j());
    }

    public T circleCrop() {
        return transform(v7.l.f56861d, new v7.k());
    }

    public T decode(Class<?> cls) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().decode(cls);
        }
        this.resourceClass = (Class) i8.j.d(cls);
        this.fields |= 4096;
        return selfOrThrowIfLocked();
    }

    public T disallowHardwareConfig() {
        return set(m.f56871j, Boolean.FALSE);
    }

    public T diskCacheStrategy(o7.j jVar) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().diskCacheStrategy(jVar);
        }
        this.diskCacheStrategy = (o7.j) i8.j.d(jVar);
        this.fields |= 4;
        return selfOrThrowIfLocked();
    }

    public T dontAnimate() {
        return set(z7.i.f62636b, Boolean.TRUE);
    }

    public T dontTransform() {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().dontTransform();
        }
        this.transformations.clear();
        int i10 = this.fields & (-2049);
        this.fields = i10;
        this.isTransformationRequired = false;
        int i11 = i10 & (-131073);
        this.fields = i11;
        this.isTransformationAllowed = false;
        this.fields = i11 | 65536;
        this.isScaleOnlyOrNoTransform = true;
        return selfOrThrowIfLocked();
    }

    public T downsample(v7.l lVar) {
        return set(v7.l.f56865h, i8.j.d(lVar));
    }

    public T encodeFormat(Bitmap.CompressFormat compressFormat) {
        return set(v7.c.f56838c, i8.j.d(compressFormat));
    }

    public T encodeQuality(int i10) {
        return set(v7.c.f56837b, Integer.valueOf(i10));
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return Float.compare(aVar.sizeMultiplier, this.sizeMultiplier) == 0 && this.errorId == aVar.errorId && i8.k.d(this.errorPlaceholder, aVar.errorPlaceholder) && this.placeholderId == aVar.placeholderId && i8.k.d(this.placeholderDrawable, aVar.placeholderDrawable) && this.fallbackId == aVar.fallbackId && i8.k.d(this.fallbackDrawable, aVar.fallbackDrawable) && this.isCacheable == aVar.isCacheable && this.overrideHeight == aVar.overrideHeight && this.overrideWidth == aVar.overrideWidth && this.isTransformationRequired == aVar.isTransformationRequired && this.isTransformationAllowed == aVar.isTransformationAllowed && this.useUnlimitedSourceGeneratorsPool == aVar.useUnlimitedSourceGeneratorsPool && this.onlyRetrieveFromCache == aVar.onlyRetrieveFromCache && this.diskCacheStrategy.equals(aVar.diskCacheStrategy) && this.priority == aVar.priority && this.options.equals(aVar.options) && this.transformations.equals(aVar.transformations) && this.resourceClass.equals(aVar.resourceClass) && i8.k.d(this.signature, aVar.signature) && i8.k.d(this.theme, aVar.theme);
        }
        return false;
    }

    public T error(Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().error(drawable);
        }
        this.errorPlaceholder = drawable;
        int i10 = this.fields | 16;
        this.fields = i10;
        this.errorId = 0;
        this.fields = i10 & (-33);
        return selfOrThrowIfLocked();
    }

    public T fallback(Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().fallback(drawable);
        }
        this.fallbackDrawable = drawable;
        int i10 = this.fields | 8192;
        this.fields = i10;
        this.fallbackId = 0;
        this.fields = i10 & (-16385);
        return selfOrThrowIfLocked();
    }

    public T fitCenter() {
        return scaleOnlyTransform(v7.l.f56860c, new q());
    }

    public T format(m7.b bVar) {
        i8.j.d(bVar);
        return (T) set(m.f56867f, bVar).set(z7.i.f62635a, bVar);
    }

    public T frame(long j10) {
        return set(c0.f56840d, Long.valueOf(j10));
    }

    public final o7.j getDiskCacheStrategy() {
        return this.diskCacheStrategy;
    }

    public final int getErrorId() {
        return this.errorId;
    }

    public final Drawable getErrorPlaceholder() {
        return this.errorPlaceholder;
    }

    public final Drawable getFallbackDrawable() {
        return this.fallbackDrawable;
    }

    public final int getFallbackId() {
        return this.fallbackId;
    }

    public final boolean getOnlyRetrieveFromCache() {
        return this.onlyRetrieveFromCache;
    }

    public final m7.h getOptions() {
        return this.options;
    }

    public final int getOverrideHeight() {
        return this.overrideHeight;
    }

    public final int getOverrideWidth() {
        return this.overrideWidth;
    }

    public final Drawable getPlaceholderDrawable() {
        return this.placeholderDrawable;
    }

    public final int getPlaceholderId() {
        return this.placeholderId;
    }

    public final com.bumptech.glide.h getPriority() {
        return this.priority;
    }

    public final Class<?> getResourceClass() {
        return this.resourceClass;
    }

    public final m7.e getSignature() {
        return this.signature;
    }

    public final float getSizeMultiplier() {
        return this.sizeMultiplier;
    }

    public final Resources.Theme getTheme() {
        return this.theme;
    }

    public final Map<Class<?>, l<?>> getTransformations() {
        return this.transformations;
    }

    public final boolean getUseAnimationPool() {
        return this.useAnimationPool;
    }

    public final boolean getUseUnlimitedSourceGeneratorsPool() {
        return this.useUnlimitedSourceGeneratorsPool;
    }

    public int hashCode() {
        return i8.k.p(this.theme, i8.k.p(this.signature, i8.k.p(this.resourceClass, i8.k.p(this.transformations, i8.k.p(this.options, i8.k.p(this.priority, i8.k.p(this.diskCacheStrategy, i8.k.q(this.onlyRetrieveFromCache, i8.k.q(this.useUnlimitedSourceGeneratorsPool, i8.k.q(this.isTransformationAllowed, i8.k.q(this.isTransformationRequired, i8.k.o(this.overrideWidth, i8.k.o(this.overrideHeight, i8.k.q(this.isCacheable, i8.k.p(this.fallbackDrawable, i8.k.o(this.fallbackId, i8.k.p(this.placeholderDrawable, i8.k.o(this.placeholderId, i8.k.p(this.errorPlaceholder, i8.k.o(this.errorId, i8.k.l(this.sizeMultiplier)))))))))))))))))))));
    }

    public final boolean isAutoCloneEnabled() {
        return this.isAutoCloneEnabled;
    }

    public final boolean isDiskCacheStrategySet() {
        return isSet(4);
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final boolean isMemoryCacheable() {
        return this.isCacheable;
    }

    public final boolean isPrioritySet() {
        return isSet(8);
    }

    public boolean isScaleOnlyOrNoTransform() {
        return this.isScaleOnlyOrNoTransform;
    }

    public final boolean isSkipMemoryCacheSet() {
        return isSet(256);
    }

    public final boolean isTransformationAllowed() {
        return this.isTransformationAllowed;
    }

    public final boolean isTransformationRequired() {
        return this.isTransformationRequired;
    }

    public final boolean isTransformationSet() {
        return isSet(2048);
    }

    public final boolean isValidOverride() {
        return i8.k.u(this.overrideWidth, this.overrideHeight);
    }

    public T lock() {
        this.isLocked = true;
        return self();
    }

    public T onlyRetrieveFromCache(boolean z10) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().onlyRetrieveFromCache(z10);
        }
        this.onlyRetrieveFromCache = z10;
        this.fields |= ONLY_RETRIEVE_FROM_CACHE;
        return selfOrThrowIfLocked();
    }

    public T optionalCenterCrop() {
        return optionalTransform(v7.l.f56862e, new v7.i());
    }

    public T optionalCenterInside() {
        return optionalScaleOnlyTransform(v7.l.f56861d, new v7.j());
    }

    public T optionalCircleCrop() {
        return optionalTransform(v7.l.f56862e, new v7.k());
    }

    public T optionalFitCenter() {
        return optionalScaleOnlyTransform(v7.l.f56860c, new q());
    }

    public final T optionalTransform(v7.l lVar, l<Bitmap> lVar2) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().optionalTransform(lVar, lVar2);
        }
        downsample(lVar);
        return transform(lVar2, false);
    }

    public T override(int i10, int i11) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().override(i10, i11);
        }
        this.overrideWidth = i10;
        this.overrideHeight = i11;
        this.fields |= 512;
        return selfOrThrowIfLocked();
    }

    public T placeholder(Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().placeholder(drawable);
        }
        this.placeholderDrawable = drawable;
        int i10 = this.fields | 64;
        this.fields = i10;
        this.placeholderId = 0;
        this.fields = i10 & (-129);
        return selfOrThrowIfLocked();
    }

    public T priority(com.bumptech.glide.h hVar) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().priority(hVar);
        }
        this.priority = (com.bumptech.glide.h) i8.j.d(hVar);
        this.fields |= 8;
        return selfOrThrowIfLocked();
    }

    public final T selfOrThrowIfLocked() {
        if (!this.isLocked) {
            return self();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public <Y> T set(m7.g<Y> gVar, Y y10) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().set(gVar, y10);
        }
        i8.j.d(gVar);
        i8.j.d(y10);
        this.options.e(gVar, y10);
        return selfOrThrowIfLocked();
    }

    public T signature(m7.e eVar) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().signature(eVar);
        }
        this.signature = (m7.e) i8.j.d(eVar);
        this.fields |= 1024;
        return selfOrThrowIfLocked();
    }

    public T sizeMultiplier(float f10) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().sizeMultiplier(f10);
        }
        if (f10 >= 0.0f && f10 <= 1.0f) {
            this.sizeMultiplier = f10;
            this.fields |= 2;
            return selfOrThrowIfLocked();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    public T skipMemoryCache(boolean z10) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().skipMemoryCache(true);
        }
        this.isCacheable = !z10;
        this.fields |= 256;
        return selfOrThrowIfLocked();
    }

    public T theme(Resources.Theme theme) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().theme(theme);
        }
        this.theme = theme;
        this.fields |= THEME;
        return selfOrThrowIfLocked();
    }

    public T timeout(int i10) {
        return set(t7.a.f53246b, Integer.valueOf(i10));
    }

    public final T transform(v7.l lVar, l<Bitmap> lVar2) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().transform(lVar, lVar2);
        }
        downsample(lVar);
        return transform(lVar2);
    }

    @Deprecated
    public T transforms(l<Bitmap>... lVarArr) {
        return transform((l<Bitmap>) new m7.f(lVarArr), true);
    }

    public T useAnimationPool(boolean z10) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().useAnimationPool(z10);
        }
        this.useAnimationPool = z10;
        this.fields |= 1048576;
        return selfOrThrowIfLocked();
    }

    public T useUnlimitedSourceGeneratorsPool(boolean z10) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().useUnlimitedSourceGeneratorsPool(z10);
        }
        this.useUnlimitedSourceGeneratorsPool = z10;
        this.fields |= USE_UNLIMITED_SOURCE_GENERATORS_POOL;
        return selfOrThrowIfLocked();
    }

    private T scaleOnlyTransform(v7.l lVar, l<Bitmap> lVar2, boolean z10) {
        T optionalTransform;
        if (z10) {
            optionalTransform = transform(lVar, lVar2);
        } else {
            optionalTransform = optionalTransform(lVar, lVar2);
        }
        optionalTransform.isScaleOnlyOrNoTransform = true;
        return optionalTransform;
    }

    /* renamed from: clone */
    public T m30clone() {
        try {
            T t10 = (T) super.clone();
            m7.h hVar = new m7.h();
            t10.options = hVar;
            hVar.d(this.options);
            i8.b bVar = new i8.b();
            t10.transformations = bVar;
            bVar.putAll(this.transformations);
            t10.isLocked = false;
            t10.isAutoCloneEnabled = false;
            return t10;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public T optionalTransform(l<Bitmap> lVar) {
        return transform(lVar, false);
    }

    public T transform(l<Bitmap> lVar) {
        return transform(lVar, true);
    }

    public <Y> T optionalTransform(Class<Y> cls, l<Y> lVar) {
        return transform(cls, lVar, false);
    }

    public T transform(l<Bitmap>... lVarArr) {
        if (lVarArr.length > 1) {
            return transform((l<Bitmap>) new m7.f(lVarArr), true);
        }
        if (lVarArr.length == 1) {
            return transform(lVarArr[0]);
        }
        return selfOrThrowIfLocked();
    }

    public T override(int i10) {
        return override(i10, i10);
    }

    public T error(int i10) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().error(i10);
        }
        this.errorId = i10;
        int i11 = this.fields | 32;
        this.fields = i11;
        this.errorPlaceholder = null;
        this.fields = i11 & (-17);
        return selfOrThrowIfLocked();
    }

    public T fallback(int i10) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().fallback(i10);
        }
        this.fallbackId = i10;
        int i11 = this.fields | 16384;
        this.fields = i11;
        this.fallbackDrawable = null;
        this.fields = i11 & (-8193);
        return selfOrThrowIfLocked();
    }

    public T placeholder(int i10) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().placeholder(i10);
        }
        this.placeholderId = i10;
        int i11 = this.fields | 128;
        this.fields = i11;
        this.placeholderDrawable = null;
        this.fields = i11 & (-65);
        return selfOrThrowIfLocked();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T transform(l<Bitmap> lVar, boolean z10) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().transform(lVar, z10);
        }
        o oVar = new o(lVar, z10);
        transform(Bitmap.class, lVar, z10);
        transform(Drawable.class, oVar, z10);
        transform(BitmapDrawable.class, oVar.c(), z10);
        transform(z7.c.class, new z7.f(lVar), z10);
        return selfOrThrowIfLocked();
    }

    public <Y> T transform(Class<Y> cls, l<Y> lVar, boolean z10) {
        if (this.isAutoCloneEnabled) {
            return (T) m30clone().transform(cls, lVar, z10);
        }
        i8.j.d(cls);
        i8.j.d(lVar);
        this.transformations.put(cls, lVar);
        int i10 = this.fields | 2048;
        this.fields = i10;
        this.isTransformationAllowed = true;
        int i11 = i10 | 65536;
        this.fields = i11;
        this.isScaleOnlyOrNoTransform = false;
        if (z10) {
            this.fields = i11 | 131072;
            this.isTransformationRequired = true;
        }
        return selfOrThrowIfLocked();
    }

    public <Y> T transform(Class<Y> cls, l<Y> lVar) {
        return transform(cls, lVar, true);
    }
}
