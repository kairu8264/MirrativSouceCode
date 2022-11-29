package com.dena.mirrativ.otherfeature.cropimage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import cb.c;
import go.e;
import io.l;
import java.io.IOException;
import java.io.OutputStream;
import jo.h;
import jo.p;
import jo.q;
import l0.i;
import of.n;
import wn.v;

/* loaded from: classes2.dex */
public final class CropImageActivity extends e.b {
    public static final a O = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(Context context, Uri uri, float f10, float f11, boolean z10) {
            p.h(context, "context");
            p.h(uri, "source");
            Intent intent = new Intent(context, CropImageActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_CROP_IMAGE_SOURCE", uri);
            bundle.putFloat("EXTRA_CROP_IMAGE_WIDTH", f10);
            bundle.putFloat("EXTRA_CROP_IMAGE_HEIGHT", f11);
            bundle.putBoolean("EXTRA_CROP_IMAGE_IS_SELECTABLE_ASPECT_RATIO", z10);
            intent.putExtra("EXTRA_CROP_IMAGE_BUNDLE", bundle);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.p<i, Integer, v> {
        public final /* synthetic */ CropImageActivity A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Bitmap f21728w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ float f21729x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ float f21730y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f21731z;

        /* loaded from: classes2.dex */
        public static final class a extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ CropImageActivity f21732w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(CropImageActivity cropImageActivity) {
                super(0);
                this.f21732w = cropImageActivity;
            }

            public final void a() {
                CropImageActivity cropImageActivity = this.f21732w;
                cropImageActivity.setResult(0, cropImageActivity.getIntent());
                this.f21732w.finishAndRemoveTask();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* renamed from: com.dena.mirrativ.otherfeature.cropimage.CropImageActivity$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0189b extends q implements l<Bitmap, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ CropImageActivity f21733w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0189b(CropImageActivity cropImageActivity) {
                super(1);
                this.f21733w = cropImageActivity;
            }

            public final void a(Bitmap bitmap) {
                p.h(bitmap, "it");
                this.f21733w.getIntent().putExtra("EXTRA_CROPPED_IMAGE_SOURCE", this.f21733w.y3(bitmap));
                CropImageActivity cropImageActivity = this.f21733w;
                cropImageActivity.setResult(-1, cropImageActivity.getIntent());
                this.f21733w.finishAndRemoveTask();
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(Bitmap bitmap) {
                a(bitmap);
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Bitmap bitmap, float f10, float f11, boolean z10, CropImageActivity cropImageActivity) {
            super(2);
            this.f21728w = bitmap;
            this.f21729x = f10;
            this.f21730y = f11;
            this.f21731z = z10;
            this.A = cropImageActivity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v5 */
        /* JADX WARN: Type inference failed for: r9v0, types: [l0.i] */
        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            Bitmap bitmap = this.f21728w;
            cb.a a10 = cb.a.Companion.a(this.f21729x, this.f21730y);
            boolean z10 = this.f21731z;
            CropImageActivity cropImageActivity = this.A;
            iVar.x(1157296644);
            boolean P = iVar.P(cropImageActivity);
            Object y10 = iVar.y();
            if (P || y10 == i.f39065a.a()) {
                y10 = new a(cropImageActivity);
                iVar.q(y10);
            }
            iVar.O();
            io.a aVar = y10;
            CropImageActivity cropImageActivity2 = this.A;
            iVar.x(1157296644);
            boolean P2 = iVar.P(cropImageActivity2);
            Object y11 = iVar.y();
            if (P2 || y11 == i.f39065a.a()) {
                y11 = new C0189b(cropImageActivity2);
                iVar.q(y11);
            }
            iVar.O();
            c.a(bitmap, a10, z10, aVar, y11, iVar, 8, 0);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public final void A3(Bitmap bitmap, Uri uri) {
        try {
            OutputStream openOutputStream = getContentResolver().openOutputStream(uri);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, openOutputStream);
            if (openOutputStream != null) {
                openOutputStream.flush();
            }
            if (openOutputStream != null) {
                openOutputStream.close();
            }
        } catch (IOException e10) {
            g9.a.c(e10);
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("EXTRA_CROP_IMAGE_BUNDLE");
        if (bundleExtra == null) {
            return;
        }
        Uri uri = (Uri) bundleExtra.getParcelable("EXTRA_CROP_IMAGE_SOURCE");
        float f10 = bundleExtra.getFloat("EXTRA_CROP_IMAGE_WIDTH");
        float f11 = bundleExtra.getFloat("EXTRA_CROP_IMAGE_HEIGHT");
        boolean z10 = bundleExtra.getBoolean("EXTRA_CROP_IMAGE_IS_SELECTABLE_ASPECT_RATIO");
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
            p.g(bitmap, "getBitmap(this.contentResolver, uri)");
            a.a.b(this, null, s0.c.c(776170438, true, new b(bitmap, f10, f11, z10, this)), 1, null);
        } catch (Exception e10) {
            g9.a.c(e10);
            n.A(this, da.i.text_loading_error, false);
            finish();
        }
    }

    public final Uri y3(Bitmap bitmap) {
        Uri z32 = z3();
        try {
            A3(bitmap, z32);
        } catch (IllegalArgumentException e10) {
            g9.a.c(e10);
        }
        return z32;
    }

    public final Uri z3() {
        try {
            Uri fromFile = Uri.fromFile(e.c("cropped", ".jpg", getCacheDir()));
            p.g(fromFile, "fromFile(createTempFile(\"cropped\", ext, cacheDir))");
            return fromFile;
        } catch (IOException e10) {
            throw new RuntimeException("Failed to create temp file for output image", e10);
        }
    }
}
