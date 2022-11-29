package com.dena.mirrorman.customview;

import android.app.PictureInPictureParams;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.TextureView;
import android.view.View;
import jo.p;
import po.n;

/* loaded from: classes2.dex */
public final class VideoTextureView extends TextureView {
    public RectF A;
    public RectF B;
    public Matrix C;

    /* renamed from: w  reason: collision with root package name */
    public boolean f25628w;

    /* renamed from: x  reason: collision with root package name */
    public String f25629x;

    /* renamed from: y  reason: collision with root package name */
    public Size f25630y;

    /* renamed from: z  reason: collision with root package name */
    public RectF f25631z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p.h(context, "context");
    }

    public final PictureInPictureParams a(Size size) {
        p.h(size, "defaultSize");
        if (this.f25630y.getWidth() != 0 && this.f25630y.getHeight() != 0) {
            size = this.f25630y;
        }
        PictureInPictureParams.Builder aspectRatio = new PictureInPictureParams.Builder().setAspectRatio(c(d(size, p.c(this.f25629x, "6") || p.c(this.f25629x, "8"))));
        if (Build.VERSION.SDK_INT >= 31) {
            Rect rect = new Rect();
            getLocalVisibleRect(rect);
            aspectRatio.setSeamlessResizeEnabled(false).setSourceRectHint(rect);
        }
        PictureInPictureParams build = aspectRatio.build();
        p.g(build, "builder.build()");
        return build;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009d, code lost:
        if (r15.getWidth() < r15.getHeight()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c1, code lost:
        if (r15.getWidth() < r15.getHeight()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cc, code lost:
        if (r15.getWidth() < r15.getHeight()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f1, code lost:
        if (r15.getWidth() < r15.getHeight()) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float b(android.util.Size r15) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.customview.VideoTextureView.b(android.util.Size):float");
    }

    public final Rational c(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final Size d(Size size, boolean z10) {
        return z10 ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public final String getVideoOrientation() {
        return this.f25629x;
    }

    public final Size getVideoSize() {
        return this.f25630y;
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f25630y.getWidth() == 0 && this.f25630y.getHeight() == 0) {
            setTransform(null);
            return;
        }
        float b10 = b(this.f25630y);
        this.B.set(0.0f, 0.0f, this.f25630y.getWidth(), this.f25630y.getHeight());
        this.f25631z.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        Matrix matrix = this.C;
        this.A.set(this.f25631z);
        matrix.reset();
        matrix.postRotate(b10, this.A.centerX(), this.A.centerY());
        matrix.mapRect(this.f25631z);
        matrix.setRectToRect(this.B, this.f25631z, Matrix.ScaleToFit.CENTER);
        matrix.mapRect(this.B);
        matrix.setRectToRect(this.A, this.B, Matrix.ScaleToFit.FILL);
        matrix.postRotate(b10, this.A.centerX(), this.A.centerY());
        setTransform(matrix);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f25628w) {
            super.onMeasure(i10, i11);
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int d10 = n.d(size, size2);
        int i12 = n.i(size, size2);
        float f10 = d10;
        float f11 = i12;
        float d11 = n.d(this.f25630y.getWidth(), this.f25630y.getHeight()) / n.i(this.f25630y.getWidth(), this.f25630y.getHeight());
        if (f10 / f11 < d11) {
            i12 = (int) (f10 / d11);
        } else {
            d10 = (int) (f11 * d11);
        }
        if (getDisplay().getRotation() != 0 && getDisplay().getRotation() != 2) {
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(d10, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        } else {
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(d10, 1073741824));
        }
    }

    public final void setInPictureInPictureMode(boolean z10) {
        this.f25628w = z10;
        requestLayout();
    }

    public final void setVideoOrientation(String str) {
        this.f25629x = str;
        requestLayout();
    }

    public final void setVideoSize(Size size) {
        p.h(size, "value");
        this.f25630y = size;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTextureView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f25630y = new Size(0, 0);
        this.f25631z = new RectF();
        this.A = new RectF();
        this.B = new RectF();
        this.C = new Matrix();
    }
}
