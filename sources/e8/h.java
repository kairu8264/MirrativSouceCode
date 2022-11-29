package e8;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import m7.l;

/* loaded from: classes.dex */
public class h extends a<h> {
    private static h centerCropOptions;
    private static h centerInsideOptions;
    private static h circleCropOptions;
    private static h fitCenterOptions;
    private static h noAnimationOptions;
    private static h noTransformOptions;
    private static h skipMemoryCacheFalseOptions;
    private static h skipMemoryCacheTrueOptions;

    public static h bitmapTransform(l<Bitmap> lVar) {
        return new h().transform(lVar);
    }

    public static h centerCropTransform() {
        if (centerCropOptions == null) {
            centerCropOptions = new h().centerCrop().autoClone();
        }
        return centerCropOptions;
    }

    public static h centerInsideTransform() {
        if (centerInsideOptions == null) {
            centerInsideOptions = new h().centerInside().autoClone();
        }
        return centerInsideOptions;
    }

    public static h circleCropTransform() {
        if (circleCropOptions == null) {
            circleCropOptions = new h().circleCrop().autoClone();
        }
        return circleCropOptions;
    }

    public static h decodeTypeOf(Class<?> cls) {
        return new h().decode(cls);
    }

    public static h diskCacheStrategyOf(o7.j jVar) {
        return new h().diskCacheStrategy(jVar);
    }

    public static h downsampleOf(v7.l lVar) {
        return new h().downsample(lVar);
    }

    public static h encodeFormatOf(Bitmap.CompressFormat compressFormat) {
        return new h().encodeFormat(compressFormat);
    }

    public static h encodeQualityOf(int i10) {
        return new h().encodeQuality(i10);
    }

    public static h errorOf(Drawable drawable) {
        return new h().error(drawable);
    }

    public static h fitCenterTransform() {
        if (fitCenterOptions == null) {
            fitCenterOptions = new h().fitCenter().autoClone();
        }
        return fitCenterOptions;
    }

    public static h formatOf(m7.b bVar) {
        return new h().format(bVar);
    }

    public static h frameOf(long j10) {
        return new h().frame(j10);
    }

    public static h noAnimation() {
        if (noAnimationOptions == null) {
            noAnimationOptions = new h().dontAnimate().autoClone();
        }
        return noAnimationOptions;
    }

    public static h noTransformation() {
        if (noTransformOptions == null) {
            noTransformOptions = new h().dontTransform().autoClone();
        }
        return noTransformOptions;
    }

    public static <T> h option(m7.g<T> gVar, T t10) {
        return new h().set(gVar, t10);
    }

    public static h overrideOf(int i10, int i11) {
        return new h().override(i10, i11);
    }

    public static h placeholderOf(Drawable drawable) {
        return new h().placeholder(drawable);
    }

    public static h priorityOf(com.bumptech.glide.h hVar) {
        return new h().priority(hVar);
    }

    public static h signatureOf(m7.e eVar) {
        return new h().signature(eVar);
    }

    public static h sizeMultiplierOf(float f10) {
        return new h().sizeMultiplier(f10);
    }

    public static h skipMemoryCacheOf(boolean z10) {
        if (z10) {
            if (skipMemoryCacheTrueOptions == null) {
                skipMemoryCacheTrueOptions = new h().skipMemoryCache(true).autoClone();
            }
            return skipMemoryCacheTrueOptions;
        }
        if (skipMemoryCacheFalseOptions == null) {
            skipMemoryCacheFalseOptions = new h().skipMemoryCache(false).autoClone();
        }
        return skipMemoryCacheFalseOptions;
    }

    public static h timeoutOf(int i10) {
        return new h().timeout(i10);
    }

    public static h errorOf(int i10) {
        return new h().error(i10);
    }

    public static h overrideOf(int i10) {
        return overrideOf(i10, i10);
    }

    public static h placeholderOf(int i10) {
        return new h().placeholder(i10);
    }
}
