package sn;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.exoplayer2.audio.AacUtil;
import java.security.MessageDigest;
import m7.e;

/* loaded from: classes4.dex */
public class b extends sn.a {

    /* renamed from: b  reason: collision with root package name */
    public int f52762b;

    /* renamed from: c  reason: collision with root package name */
    public int f52763c;

    /* renamed from: d  reason: collision with root package name */
    public EnumC0806b f52764d;

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f52765a;

        static {
            int[] iArr = new int[EnumC0806b.values().length];
            f52765a = iArr;
            try {
                iArr[EnumC0806b.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52765a[EnumC0806b.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52765a[EnumC0806b.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: sn.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0806b {
        TOP,
        CENTER,
        BOTTOM
    }

    public b(int i10, int i11, EnumC0806b enumC0806b) {
        this.f52764d = EnumC0806b.CENTER;
        this.f52762b = i10;
        this.f52763c = i11;
        this.f52764d = enumC0806b;
    }

    @Override // m7.e
    public void a(MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.CropTransformation.1" + this.f52762b + this.f52763c + this.f52764d).getBytes(e.f40610a));
    }

    @Override // sn.a
    public Bitmap d(Context context, p7.e eVar, Bitmap bitmap, int i10, int i11) {
        int i12 = this.f52762b;
        if (i12 == 0) {
            i12 = bitmap.getWidth();
        }
        this.f52762b = i12;
        int i13 = this.f52763c;
        if (i13 == 0) {
            i13 = bitmap.getHeight();
        }
        this.f52763c = i13;
        Bitmap d10 = eVar.d(this.f52762b, this.f52763c, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        d10.setHasAlpha(true);
        float max = Math.max(this.f52762b / bitmap.getWidth(), this.f52763c / bitmap.getHeight());
        float width = bitmap.getWidth() * max;
        float height = max * bitmap.getHeight();
        float f10 = (this.f52762b - width) / 2.0f;
        float e10 = e(height);
        RectF rectF = new RectF(f10, e10, width + f10, height + e10);
        c(bitmap, d10);
        new Canvas(d10).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
        return d10;
    }

    public final float e(float f10) {
        int i10 = a.f52765a[this.f52764d.ordinal()];
        if (i10 != 2) {
            if (i10 != 3) {
                return 0.0f;
            }
            return this.f52763c - f10;
        }
        return (this.f52763c - f10) / 2.0f;
    }

    @Override // m7.e
    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.f52762b == this.f52762b && bVar.f52763c == this.f52763c && bVar.f52764d == this.f52764d) {
                return true;
            }
        }
        return false;
    }

    @Override // m7.e
    public int hashCode() {
        return (-1462327117) + (this.f52762b * AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND) + (this.f52763c * 1000) + (this.f52764d.ordinal() * 10);
    }

    public String toString() {
        return "CropTransformation(width=" + this.f52762b + ", height=" + this.f52763c + ", cropType=" + this.f52764d + ")";
    }
}
