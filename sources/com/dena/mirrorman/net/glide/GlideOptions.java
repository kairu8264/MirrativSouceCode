package com.dena.mirrorman.net.glide;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import e8.a;
import e8.h;
import m7.b;
import m7.e;
import m7.g;
import m7.l;
import o7.j;

/* loaded from: classes2.dex */
public final class GlideOptions extends h {
    private static GlideOptions centerCropTransform2;
    private static GlideOptions centerInsideTransform1;
    private static GlideOptions circleCropTransform3;
    private static GlideOptions fitCenterTransform0;
    private static GlideOptions noAnimation5;
    private static GlideOptions noTransformation4;

    public static GlideOptions bitmapTransform(l<Bitmap> lVar) {
        return new GlideOptions().transform(lVar);
    }

    public static GlideOptions centerCropTransform() {
        if (centerCropTransform2 == null) {
            centerCropTransform2 = new GlideOptions().centerCrop2().autoClone2();
        }
        return centerCropTransform2;
    }

    public static GlideOptions centerInsideTransform() {
        if (centerInsideTransform1 == null) {
            centerInsideTransform1 = new GlideOptions().centerInside2().autoClone2();
        }
        return centerInsideTransform1;
    }

    public static GlideOptions circleCropTransform() {
        if (circleCropTransform3 == null) {
            circleCropTransform3 = new GlideOptions().circleCrop2().autoClone2();
        }
        return circleCropTransform3;
    }

    public static GlideOptions decodeTypeOf(Class<?> cls) {
        return new GlideOptions().decode(cls);
    }

    public static GlideOptions diskCacheStrategyOf(j jVar) {
        return new GlideOptions().diskCacheStrategy2(jVar);
    }

    public static GlideOptions downsampleOf(v7.l lVar) {
        return new GlideOptions().downsample2(lVar);
    }

    public static GlideOptions encodeFormatOf(Bitmap.CompressFormat compressFormat) {
        return new GlideOptions().encodeFormat2(compressFormat);
    }

    public static GlideOptions encodeQualityOf(int i10) {
        return new GlideOptions().encodeQuality2(i10);
    }

    public static GlideOptions errorOf(Drawable drawable) {
        return new GlideOptions().error2(drawable);
    }

    public static GlideOptions fitCenterTransform() {
        if (fitCenterTransform0 == null) {
            fitCenterTransform0 = new GlideOptions().fitCenter2().autoClone2();
        }
        return fitCenterTransform0;
    }

    public static GlideOptions formatOf(b bVar) {
        return new GlideOptions().format2(bVar);
    }

    public static GlideOptions frameOf(long j10) {
        return new GlideOptions().frame2(j10);
    }

    public static GlideOptions noAnimation() {
        if (noAnimation5 == null) {
            noAnimation5 = new GlideOptions().dontAnimate2().autoClone2();
        }
        return noAnimation5;
    }

    public static GlideOptions noTransformation() {
        if (noTransformation4 == null) {
            noTransformation4 = new GlideOptions().dontTransform2().autoClone2();
        }
        return noTransformation4;
    }

    public static <T> GlideOptions option(g<T> gVar, T t10) {
        return new GlideOptions().set((g<g<T>>) gVar, (g<T>) t10);
    }

    public static GlideOptions overrideOf(int i10, int i11) {
        return new GlideOptions().override2(i10, i11);
    }

    public static GlideOptions placeholderOf(Drawable drawable) {
        return new GlideOptions().placeholder2(drawable);
    }

    public static GlideOptions priorityOf(com.bumptech.glide.h hVar) {
        return new GlideOptions().priority2(hVar);
    }

    public static GlideOptions signatureOf(e eVar) {
        return new GlideOptions().signature2(eVar);
    }

    public static GlideOptions sizeMultiplierOf(float f10) {
        return new GlideOptions().sizeMultiplier2(f10);
    }

    public static GlideOptions skipMemoryCacheOf(boolean z10) {
        return new GlideOptions().skipMemoryCache2(z10);
    }

    public static GlideOptions timeoutOf(int i10) {
        return new GlideOptions().timeout2(i10);
    }

    @Override // e8.a
    /* renamed from: apply  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ h apply2(a aVar) {
        return apply((a<?>) aVar);
    }

    @Override // e8.a
    /* renamed from: decode  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ h decode2(Class cls) {
        return decode((Class<?>) cls);
    }

    @Override // e8.a
    public /* bridge */ /* synthetic */ h set(g gVar, Object obj) {
        return set((g<g>) gVar, (g) obj);
    }

    @Override // e8.a
    @SafeVarargs
    @Deprecated
    /* renamed from: transforms  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ h transforms2(l[] lVarArr) {
        return transforms((l<Bitmap>[]) lVarArr);
    }

    public static GlideOptions errorOf(int i10) {
        return new GlideOptions().error2(i10);
    }

    public static GlideOptions overrideOf(int i10) {
        return new GlideOptions().override2(i10);
    }

    public static GlideOptions placeholderOf(int i10) {
        return new GlideOptions().placeholder2(i10);
    }

    @Override // e8.a
    public h apply(a<?> aVar) {
        return (GlideOptions) super.apply(aVar);
    }

    @Override // e8.a
    /* renamed from: autoClone */
    public h autoClone2() {
        return (GlideOptions) super.autoClone();
    }

    @Override // e8.a
    /* renamed from: centerCrop */
    public h centerCrop2() {
        return (GlideOptions) super.centerCrop();
    }

    @Override // e8.a
    /* renamed from: centerInside */
    public h centerInside2() {
        return (GlideOptions) super.centerInside();
    }

    @Override // e8.a
    /* renamed from: circleCrop */
    public h circleCrop2() {
        return (GlideOptions) super.circleCrop();
    }

    @Override // e8.a
    public h decode(Class<?> cls) {
        return (GlideOptions) super.decode(cls);
    }

    @Override // e8.a
    /* renamed from: disallowHardwareConfig */
    public h disallowHardwareConfig2() {
        return (GlideOptions) super.disallowHardwareConfig();
    }

    @Override // e8.a
    /* renamed from: diskCacheStrategy */
    public h diskCacheStrategy2(j jVar) {
        return (GlideOptions) super.diskCacheStrategy(jVar);
    }

    @Override // e8.a
    /* renamed from: dontAnimate */
    public h dontAnimate2() {
        return (GlideOptions) super.dontAnimate();
    }

    @Override // e8.a
    /* renamed from: dontTransform */
    public h dontTransform2() {
        return (GlideOptions) super.dontTransform();
    }

    @Override // e8.a
    /* renamed from: downsample */
    public h downsample2(v7.l lVar) {
        return (GlideOptions) super.downsample(lVar);
    }

    @Override // e8.a
    /* renamed from: encodeFormat */
    public h encodeFormat2(Bitmap.CompressFormat compressFormat) {
        return (GlideOptions) super.encodeFormat(compressFormat);
    }

    @Override // e8.a
    /* renamed from: encodeQuality */
    public h encodeQuality2(int i10) {
        return (GlideOptions) super.encodeQuality(i10);
    }

    @Override // e8.a
    /* renamed from: fitCenter */
    public h fitCenter2() {
        return (GlideOptions) super.fitCenter();
    }

    @Override // e8.a
    /* renamed from: format */
    public h format2(b bVar) {
        return (GlideOptions) super.format(bVar);
    }

    @Override // e8.a
    /* renamed from: frame */
    public h frame2(long j10) {
        return (GlideOptions) super.frame(j10);
    }

    @Override // e8.a
    /* renamed from: lock */
    public h lock2() {
        return (GlideOptions) super.lock();
    }

    @Override // e8.a
    /* renamed from: onlyRetrieveFromCache */
    public h onlyRetrieveFromCache2(boolean z10) {
        return (GlideOptions) super.onlyRetrieveFromCache(z10);
    }

    @Override // e8.a
    /* renamed from: optionalCenterCrop */
    public h optionalCenterCrop2() {
        return (GlideOptions) super.optionalCenterCrop();
    }

    @Override // e8.a
    /* renamed from: optionalCenterInside */
    public h optionalCenterInside2() {
        return (GlideOptions) super.optionalCenterInside();
    }

    @Override // e8.a
    /* renamed from: optionalCircleCrop */
    public h optionalCircleCrop2() {
        return (GlideOptions) super.optionalCircleCrop();
    }

    @Override // e8.a
    /* renamed from: optionalFitCenter */
    public h optionalFitCenter2() {
        return (GlideOptions) super.optionalFitCenter();
    }

    @Override // e8.a
    /* renamed from: optionalTransform  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ h optionalTransform2(l lVar) {
        return optionalTransform((l<Bitmap>) lVar);
    }

    @Override // e8.a
    /* renamed from: priority */
    public h priority2(com.bumptech.glide.h hVar) {
        return (GlideOptions) super.priority(hVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e8.a
    public <Y> h set(g<Y> gVar, Y y10) {
        return (GlideOptions) super.set((g<g<Y>>) gVar, (g<Y>) y10);
    }

    @Override // e8.a
    /* renamed from: signature */
    public h signature2(e eVar) {
        return (GlideOptions) super.signature(eVar);
    }

    @Override // e8.a
    /* renamed from: sizeMultiplier */
    public h sizeMultiplier2(float f10) {
        return (GlideOptions) super.sizeMultiplier(f10);
    }

    @Override // e8.a
    /* renamed from: skipMemoryCache */
    public h skipMemoryCache2(boolean z10) {
        return (GlideOptions) super.skipMemoryCache(z10);
    }

    @Override // e8.a
    /* renamed from: theme */
    public h theme2(Resources.Theme theme) {
        return (GlideOptions) super.theme(theme);
    }

    @Override // e8.a
    /* renamed from: timeout */
    public h timeout2(int i10) {
        return (GlideOptions) super.timeout(i10);
    }

    @Override // e8.a
    /* renamed from: transform  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ h transform2(l lVar) {
        return transform((l<Bitmap>) lVar);
    }

    @Override // e8.a
    @SafeVarargs
    @Deprecated
    public final h transforms(l<Bitmap>... lVarArr) {
        return (GlideOptions) super.transforms(lVarArr);
    }

    @Override // e8.a
    /* renamed from: useAnimationPool */
    public h useAnimationPool2(boolean z10) {
        return (GlideOptions) super.useAnimationPool(z10);
    }

    @Override // e8.a
    /* renamed from: useUnlimitedSourceGeneratorsPool */
    public h useUnlimitedSourceGeneratorsPool2(boolean z10) {
        return (GlideOptions) super.useUnlimitedSourceGeneratorsPool(z10);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e8.a
    public h clone() {
        return (GlideOptions) super.m30clone();
    }

    @Override // e8.a
    /* renamed from: error */
    public h error2(Drawable drawable) {
        return (GlideOptions) super.error(drawable);
    }

    @Override // e8.a
    /* renamed from: fallback */
    public h fallback2(Drawable drawable) {
        return (GlideOptions) super.fallback(drawable);
    }

    @Override // e8.a
    public h optionalTransform(l<Bitmap> lVar) {
        return (GlideOptions) super.optionalTransform(lVar);
    }

    @Override // e8.a
    /* renamed from: override */
    public h override2(int i10, int i11) {
        return (GlideOptions) super.override(i10, i11);
    }

    @Override // e8.a
    /* renamed from: placeholder */
    public h placeholder2(Drawable drawable) {
        return (GlideOptions) super.placeholder(drawable);
    }

    @Override // e8.a
    @SafeVarargs
    /* renamed from: transform  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ h transform2(l[] lVarArr) {
        return transform((l<Bitmap>[]) lVarArr);
    }

    @Override // e8.a
    /* renamed from: error */
    public h error2(int i10) {
        return (GlideOptions) super.error(i10);
    }

    @Override // e8.a
    /* renamed from: fallback */
    public h fallback2(int i10) {
        return (GlideOptions) super.fallback(i10);
    }

    @Override // e8.a
    /* renamed from: optionalTransform */
    public <Y> h optionalTransform2(Class<Y> cls, l<Y> lVar) {
        return (GlideOptions) super.optionalTransform((Class) cls, (l) lVar);
    }

    @Override // e8.a
    /* renamed from: override */
    public h override2(int i10) {
        return (GlideOptions) super.override(i10);
    }

    @Override // e8.a
    /* renamed from: placeholder */
    public h placeholder2(int i10) {
        return (GlideOptions) super.placeholder(i10);
    }

    @Override // e8.a
    public h transform(l<Bitmap> lVar) {
        return (GlideOptions) super.transform(lVar);
    }

    @Override // e8.a
    @SafeVarargs
    public final h transform(l<Bitmap>... lVarArr) {
        return (GlideOptions) super.transform(lVarArr);
    }

    @Override // e8.a
    /* renamed from: transform */
    public <Y> h transform2(Class<Y> cls, l<Y> lVar) {
        return (GlideOptions) super.transform((Class) cls, (l) lVar);
    }
}
