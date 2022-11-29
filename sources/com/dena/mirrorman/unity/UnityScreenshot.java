package com.dena.mirrorman.unity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.io.FileOutputStream;
import java.io.Serializable;
import jo.p;
import uo.g1;
import uo.g2;
import uo.j;
import uo.r0;
import wn.v;

/* loaded from: classes3.dex */
public final class UnityScreenshot implements Serializable {
    public static final int $stable = 0;
    private final int facePositionCenterX;
    private final int facePositionCenterY;
    private final int faceSize;
    private final String imagePath;
    private final String key;
    private final String name;
    private final int pixelHeight;
    private final int pixelWidth;
    private final int screenHeight;
    private final int screenWidth;

    public UnityScreenshot(String str, String str2, String str3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        p.h(str2, "name");
        p.h(str3, "imagePath");
        this.key = str;
        this.name = str2;
        this.imagePath = str3;
        this.pixelWidth = i10;
        this.pixelHeight = i11;
        this.screenWidth = i12;
        this.screenHeight = i13;
        this.facePositionCenterX = i14;
        this.facePositionCenterY = i15;
        this.faceSize = i16;
    }

    private final Bitmap createBitmap(int i10, Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(this.pixelWidth, this.pixelHeight, Bitmap.Config.ARGB_8888);
        Bitmap decodeFile = BitmapFactory.decodeFile(this.imagePath);
        Canvas canvas = new Canvas(createBitmap);
        if (bitmap != null) {
            Matrix matrix = new Matrix();
            matrix.postScale(this.pixelWidth / bitmap.getWidth(), this.pixelHeight / bitmap.getHeight());
            canvas.drawBitmap(bitmap, matrix, null);
        }
        canvas.drawBitmap(decodeFile, 0.0f, 0.0f, (Paint) null);
        int i11 = i10 / 2;
        int max = Math.max(0, this.facePositionCenterX - i11);
        int max2 = Math.max(0, this.facePositionCenterY - i11);
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, max, max2, Math.min(i10, this.pixelWidth - max), Math.min(i10, this.pixelHeight - max2));
        p.g(createBitmap2, "createBitmap(\n          …- cropTopPoint)\n        )");
        return createBitmap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap createClosetBodyBitmap() {
        Bitmap decodeFile = BitmapFactory.decodeFile(this.imagePath);
        p.g(decodeFile, "decodeFile(imagePath)");
        return decodeFile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap createClosetFaceBitmap(Bitmap bitmap) {
        return createBitmap(getBreastUpSize(), bitmap);
    }

    private final int getBreastUpSize() {
        return (int) (this.faceSize * 2.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveBitmap(String str, Bitmap bitmap) {
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(str));
    }

    public final String component1() {
        return this.key;
    }

    public final int component10() {
        return this.faceSize;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.imagePath;
    }

    public final int component4() {
        return this.pixelWidth;
    }

    public final int component5() {
        return this.pixelHeight;
    }

    public final int component6() {
        return this.screenWidth;
    }

    public final int component7() {
        return this.screenHeight;
    }

    public final int component8() {
        return this.facePositionCenterX;
    }

    public final int component9() {
        return this.facePositionCenterY;
    }

    public final UnityScreenshot copy(String str, String str2, String str3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        p.h(str2, "name");
        p.h(str3, "imagePath");
        return new UnityScreenshot(str, str2, str3, i10, i11, i12, i13, i14, i15, i16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnityScreenshot) {
            UnityScreenshot unityScreenshot = (UnityScreenshot) obj;
            return p.c(this.key, unityScreenshot.key) && p.c(this.name, unityScreenshot.name) && p.c(this.imagePath, unityScreenshot.imagePath) && this.pixelWidth == unityScreenshot.pixelWidth && this.pixelHeight == unityScreenshot.pixelHeight && this.screenWidth == unityScreenshot.screenWidth && this.screenHeight == unityScreenshot.screenHeight && this.facePositionCenterX == unityScreenshot.facePositionCenterX && this.facePositionCenterY == unityScreenshot.facePositionCenterY && this.faceSize == unityScreenshot.faceSize;
        }
        return false;
    }

    public final int getFacePositionCenterX() {
        return this.facePositionCenterX;
    }

    public final int getFacePositionCenterY() {
        return this.facePositionCenterY;
    }

    public final int getFaceSize() {
        return this.faceSize;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPixelHeight() {
        return this.pixelHeight;
    }

    public final int getPixelWidth() {
        return this.pixelWidth;
    }

    public final int getScreenHeight() {
        return this.screenHeight;
    }

    public final int getScreenWidth() {
        return this.screenWidth;
    }

    public int hashCode() {
        String str = this.key;
        return ((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.name.hashCode()) * 31) + this.imagePath.hashCode()) * 31) + Integer.hashCode(this.pixelWidth)) * 31) + Integer.hashCode(this.pixelHeight)) * 31) + Integer.hashCode(this.screenWidth)) * 31) + Integer.hashCode(this.screenHeight)) * 31) + Integer.hashCode(this.facePositionCenterX)) * 31) + Integer.hashCode(this.facePositionCenterY)) * 31) + Integer.hashCode(this.faceSize);
    }

    public final void saveAvatarImages(Context context, io.p<? super String, ? super String, v> pVar, Bitmap bitmap) {
        p.h(context, "context");
        p.h(pVar, "onSavedListener");
        p.h(bitmap, "backgroundImage");
        j.d(r0.a(g1.c().plus(g2.b(null, 1, null))), null, null, new UnityScreenshot$saveAvatarImages$1(this, bitmap, context, pVar, null), 3, null);
    }

    public String toString() {
        return "UnityScreenshot(key=" + this.key + ", name=" + this.name + ", imagePath=" + this.imagePath + ", pixelWidth=" + this.pixelWidth + ", pixelHeight=" + this.pixelHeight + ", screenWidth=" + this.screenWidth + ", screenHeight=" + this.screenHeight + ", facePositionCenterX=" + this.facePositionCenterX + ", facePositionCenterY=" + this.facePositionCenterY + ", faceSize=" + this.faceSize + ')';
    }
}
